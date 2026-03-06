import java.util.List;

public class IfStatement implements Statement {

    private String conditionVar;
    private String conditionValue;
    private List<Statement> trueBlock;
    private List<Statement> falseBlock;

    public IfStatement(String var, String value,
                       List<Statement> trueBlock,
                       List<Statement> falseBlock) {

        this.conditionVar = var;
        this.conditionValue = value;
        this.trueBlock = trueBlock;
        this.falseBlock = falseBlock;
    }

    @Override
    public void execute(Environment env) {

        Object val = env.get(conditionVar);

        if(val != null && val.toString().equals(conditionValue)) {

            for(Statement s : trueBlock)
                s.execute(env);

        } else {

            for(Statement s : falseBlock)
                s.execute(env);
        }
    }
}