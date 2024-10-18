package mavendemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 */
public class MavenDemo {
    public static void main(String[] args) {
        User user = new User("Mark","Ilnytskyy");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(user);
        System.out.println(json);
    }
}
