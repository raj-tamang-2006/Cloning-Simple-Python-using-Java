import java.util.Scanner;

public class AssignStatement implements Statement {

    private String name;
    private String value;

    public AssignStatement(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void execute(Environment env) {

        if(value.equals("input")) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Input: ");
            String v = sc.nextLine();

            env.set(name, v);

        } else {
            env.set(name, value);
        }
    }
}