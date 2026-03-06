import java.util.List;

public class Interpreter {

    private Environment env = new Environment();

    public void run(List<Statement> program) {

        for(Statement stmt : program) {
            stmt.execute(env);
        }
    }
}