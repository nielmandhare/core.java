package streams;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapStreamDemo {
	public static void main(String[] args) {
		Map<String,String>people = new HashMap();
		people.put("Polo","Pune");
		people.values().stream().forEach(S);
	}

}
