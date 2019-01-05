package example;

public class PersonResponse {
    private String greetings;

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public PersonResponse(String greetings) {
        this.greetings = greetings;
    }

    public PersonResponse() {
    }

}