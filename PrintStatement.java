public class PrintStatement implements Statement {

    private String value;

    public PrintStatement(String value) {
        this.value = value;
    }

    @Override
    public void execute(Environment env) {

        Object var = env.get(value);

        if(var != null)
            System.out.println(var);
        else
            System.out.println(value);
    }
}