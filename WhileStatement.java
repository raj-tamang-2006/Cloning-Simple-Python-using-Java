import java.util.List;

public class WhileStatement implements Statement {

    private String var;
    private String value;
    private List<Statement> block;

    public WhileStatement(String var, String value, List<Statement> block) {
        this.var = var;
        this.value = value;
        this.block = block;
    }

    @Override
    public void execute(Environment env) {

        while(env.get(var) != null &&
              env.get(var).toString().equals(value)) {

            for(Statement s : block)
                s.execute(env);
        }
    }
}