package pl.edu.wszib.labjackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        // serializacja
        Person person = new Person("Paweł", "Pustelnik");
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
        System.out.println(json);

        // deserializacja
        String exampleJson = """
                {
                  "firstName" : "Paweł",
                  "lastName" : "Pustelnik"
                }
                """;
        Person deserializedPerson = objectMapper.readValue(exampleJson, Person.class);
        System.out.println("DeserializedPerson: " + deserializedPerson);

        // Zad: utwórz rekord Address, zawierający dane:
        // miasto
        // kod pocztowy
        // ulica
        // numer (String)
        // rozszerz klasę Person o adres i dostosuj powyższy przykład
    }
}
