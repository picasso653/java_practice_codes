import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language) {
        Map<String, String> langMap = new HashMap<>();
        langMap.put("english", "Welcome");
        langMap.put("czech", "Vitejte");
        langMap.put("danish", "Velkomst");
        langMap.put("dutch", "Welkom");
        langMap.put("estonian", "Tere tulemast");
        langMap.put("finnish", "Tervetuloa");
        langMap.put("flemish", "Welgekomen");
        langMap.put("french", "Bienvenue");
        langMap.put("german", "Willkommen");
        langMap.put("irish", "Failte");
        langMap.put("italian", "Benvenuto");
        langMap.put("latvian", "Gaidits");
        langMap.put("lithuanian", "Laukiamas");
        langMap.put("polish", "Witamy");
        langMap.put("spanish", "Bienvenido");
        langMap.put("swedish", "Valkommen");
        langMap.put("welsh", "Croeso");

        if (language != null && langMap.containsKey(language.toLowerCase())) {
            return langMap.get(language.toLowerCase());
        } else {
            return "Welcome"; // Default greeting in case of invalid input or language not found
        }
    }
}