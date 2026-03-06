import java.util.Map;
import java.util.HashMap;

class Environment{
    private Map<String, Object> variables = new HashMap<>();
    public void set(String name, Object value){
        variables.put(name,value);
    }

    public Object get(String name){
        return variables.get(name);
    }

}
