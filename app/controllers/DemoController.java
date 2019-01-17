package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class DemoController extends Controller {

    public Result helloWorld() {
        return ok("Hello World!");
    }


    public Result namePrint(String name, int count) {

        final StringBuffer sb = new StringBuffer();

        for (int i = 0; i < count; i++) {
            sb.append("Hey " + name);
        }

        final String message = sb.toString();

        return ok(message);
    }

    public Result greet() {

        final JsonNode json = request().body().asJson();

        final String firstName = json.get("first_name").asText();
        final String lastName = json.get("last_name").asText();

        final Person person = Json.fromJson(json, Person.class);

        final String message = "Hey " + person.getFirst_name() + " " + person.getLast_name();

        return ok(message);
    }

    static class Person {
        String first_name;
        String last_name;

        public Person(String first_name, String last_name) {
            this.first_name = first_name;
            this.last_name = last_name;
        }

        public Person() {
        }

        public String getFirst_name() {
            return first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }
    }
}



