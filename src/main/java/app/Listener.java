package app;

import app.llavesParser.Asign_stmContext;
import app.llavesParser.BloqueContext;
import app.llavesParser.DeclaracionContext;
import app.llavesParser.Declare_stmContext;
import app.llavesParser.For_stmContext;
import app.llavesParser.InstruccionesContext;
import app.llavesParser.TerminacionContext;

public class Listener extends llavesBaseListener {
    private int cantidad = 0 ;

    final SymbolTable symbolTable = new SymbolTable();


    public void incrementarCant() {
        cantidad++;
    }

    @Override
    public String toString() {
        return "Cantidad: " + cantidad;
    }



    @Override
    public void enterBloque(BloqueContext ctx) {
        symbolTable.addContext();
    }

    @Override
    public void exitBloque(BloqueContext ctx) {
        symbolTable.removeContext();
    }

    @Override
    public void exitDeclare_stm(Declare_stmContext ctx) {
        String type = ctx.declaracion().tipos().getText();
        SymbolTable.Symbol.Builder symbolBuilder = new SymbolTable.Symbol.Builder();
        symbolBuilder.isDeclarationAndAsignment(type);
    
        symbolTable.addSymbol(ctx.declaracion().asignacion().IDS().get(0).toString(), symbolBuilder.build() );
    }
    
    @Override
    public void exitAsign_stm(Asign_stmContext ctx) {
        SymbolTable.Symbol.Builder symbolBuilder = new SymbolTable.Symbol.Builder();
        symbolBuilder.isJustAsignment();

        symbolTable.addSymbol(ctx.asignacion().IDS().get(0).toString(), symbolBuilder.build());
        
    }

    @Override
    public void exitFor_stm(For_stmContext ctx) {
        SymbolTable.Symbol.Builder symbolBuilder = new SymbolTable.Symbol.Builder();
        symbolBuilder.isJustAsignment();

        symbolTable.addSymbol(ctx.asignacion().IDS().get(0).toString(), symbolBuilder.build());
    }

    @Override
    public void exitTerminacion(TerminacionContext ctx) {
        ctx.IDS().forEach(symbol -> {
            SymbolTable.Symbol.Builder symbolBuilder = new SymbolTable.Symbol.Builder();
            symbolBuilder.isJustAsignment();
            symbolTable.addSymbol(symbol.toString(), symbolBuilder.build());
        });
    }


}