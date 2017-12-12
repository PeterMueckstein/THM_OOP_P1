public class Operation extends Expr {
    Expr[] exprs;
    Operator operator;
    Operation(Operator operator,Expr... exprs){
        if (operator.arity != exprs.length) throw new IllegalArgumentException("oder dosen't match mumber of args");
        this.operator = operator;
        this.exprs = exprs;
        order = operator.order;
    }
}
