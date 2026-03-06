//Variable
import java.util.*;
class Environment{
    private Map<String, Object> variables = new HashMap<>();
    public void set(String name, Object value){
        variables.put(name,value);
    }

    public Object get(String name){
        return variables.get(name);
    }

}

//Main class
class Main{
    public static void main(String[] args) {
    }
}