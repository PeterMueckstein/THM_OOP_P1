 enum Operator {
    PLUS("+",2,5),
    TIMES("*",2,4),
    NEG("NEG:",1,3);

    final String symbol;
    final int arity;
    final int order;
    Operator(String symbol,int arity,int order){
        assert arity >= 0 && order >= 0;
        this.symbol = symbol;
        this.arity = arity;
        this.order = order;
    }

    @Override
    public String toString() {
        return symbol;
        }
    }
