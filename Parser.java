import java.util.*;

public class Parser {

    public List<Statement> parse(List<String> lines) {

        List<Statement> program = new ArrayList<>();

        for(String line : lines) {

            line = line.trim();

            if(line.startsWith("print")) {

                String value = line.substring(6).trim();
                program.add(new PrintStatement(value));

            }

            else if(line.contains("=")) {

                String[] parts = line.split("=");

                String name = parts[0].trim();
                String value = parts[1].trim();

                program.add(new AssignStatement(name, value));
            }
        }

        return program;
    }
}