package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SymbolTable {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    final List<Context> mContextList = new ArrayList<>();

    SymbolTable() {
        this.addContext();
    }

    public void addContext() {
        mContextList.add(new Context());
    }
    
    public void removeContext() {
        int size = mContextList.size();
        mContextList.remove(size-1);
    }

    private Context getContext() {
        return mContextList.get(mContextList.size()-1);
    }

    public void addSymbol(String symbolName, Symbol symbol) {
        if (this.isSymbolAlreadyDeclared(symbolName, symbol)) Error.warnAlreadyDeclaredSymbol(symbolName);
        if (!this.isSymbolDeclared(symbolName) && symbol.getType()==null) Error.warnNotDeclaredSymbol(symbolName);
        this.getContext().addSymbol(symbolName, symbol);
        System.out.println("addSymbol: " + symbolName + " " + symbol.type);
    }

    private boolean isSymbolAlreadyDeclared(String symbolName, Symbol symbol) {
        for (Context ctx : mContextList) {
            if (ctx.hasSymbol(symbolName) && symbol.getType() != null) return true; 
        }
        return false;
    }
    
    private boolean isSymbolDeclared(String symbolName) {
        for (Context ctx : mContextList) {
            if (ctx.hasSymbol(symbolName))
                return true;
        }
        return false;
    }

    class Context {
        final private HashMap<String,Symbol> mTokenSymbolMap = new HashMap<>();
        public void addSymbol(String symbolName,Symbol symbol) {
            mTokenSymbolMap.put(symbolName, symbol);
        }
        boolean hasSymbol(String symbol) {
            return (mTokenSymbolMap.containsKey(symbol) 
                && mTokenSymbolMap.get(symbol).type != null );
        }
    }


    static class Symbol {
        private Symbol(){}
        private String type;
        private boolean initialized;
        private boolean alreadyUsed;
        private List<String> args;

        public String getType() {
            return this.type;
        }

        static class Builder {
            private final Symbol symbol;
            Builder () {
                this.symbol = new Symbol();
            }

            public Builder isJustDeclaration(String type) {
                this.symbol.type = type;
                this.symbol.initialized = false;
                this.symbol.alreadyUsed = false;
                return this;
            }
            
            public Builder isJustAsignment() {
                this.symbol.initialized = false;
                this.symbol.alreadyUsed = true;
                return this;
            }

            public Builder isDeclarationAndAsignment(String type) {
                this.symbol.type = type;
                this.symbol.initialized = true;
                this.symbol.alreadyUsed = false;
                return this;
            }

            public Symbol build() {
                return this.symbol;
            }

            


        }
    }

    static class Error {
        static void warnAlreadyDeclaredSymbol(String symbolName) {
            System.err.println(ANSI_YELLOW + "Ya se ha declarado símbolo " + symbolName + ANSI_RESET);
        }
        static void warnNotDeclaredSymbol(String symbolName) {
            System.err.println(ANSI_YELLOW + "No se ha declarado símbolo " + symbolName + ANSI_RESET);
        }
    }

}