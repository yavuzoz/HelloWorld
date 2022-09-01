public class Welcomer {

    private String user;
    public Welcomer(String string) {
        user = string;
    }

    public void sayHello() {
        System.out.println("Good morning, Sir! How are you today?");

    }

    public void sayHello(String string) {

        System.out.println("Good morning, " + string +  "How are you today?");

    }










    public String getGreetings() {


        return "Good morning," +   user + "  How are you today?";

    }

    public String getName() {
        return user;
    }

}