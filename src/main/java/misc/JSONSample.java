package misc;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONSample {

	public static void main(String[] args) throws Exception {
		JSONObject obj = new JSONObject();
		JSONArray arr = new JSONArray();

		for (int i = 1; i <= 3; i++) {
			JSONObject data = new JSONObject();

			data.put("이름", "인간_" + i);
			data.put("나이", 20 + i);
			data.put("주소", "서울 중앙로" + i + "길");
			arr.add(data);
		}
		obj.put("사람들", arr);
		System.out.println(obj);

		JSONParser parser = new JSONParser();
		JSONObject persons = (JSONObject) parser.parse(obj.toString());
		JSONArray person_arr = (JSONArray) persons.get("사람들");
		JSONObject person = (JSONObject) person_arr.get(0);
		System.out.println(person.toString());
		String name = (String) person.get("이름");
		System.out.println(name);
		person = (JSONObject) person_arr.get(1);
		name = (String) person.get("이름");
		System.out.println(name);
	}

}
