import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> code = new ArrayList<>();

        System.out.println("Mini Python (type 'run' to execute)");

        while(true) {

            String line = sc.nextLine();

            if(line.equals("run"))
                break;

            code.add(line);
        }

        Parser parser = new Parser();
        Interpreter interpreter = new Interpreter();

        List<Statement> program = parser.parse(code);

        interpreter.run(program);
    }
}