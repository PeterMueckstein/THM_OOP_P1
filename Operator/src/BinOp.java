public class BinOp extends Operation {
    BinOp(Operator operator,Expr e1,Expr e2){
        super(operator,e1,e2);
    }

    @Override
    public String toString() {
        String repr = "";
        if (exprs[0].order > order){
            repr += "(" + exprs[0] + ")";
        }
        else {
            repr += exprs[0];
        }
        if(exprs[1].order > order){
            repr += "(" + exprs[1] + ")";
        }
        else {
            repr += exprs[1];
        }
        return repr;
    }
}
