public class Main {

    public static void main(String[] args) {


        /**
         *
         VERSION 1

         Welcomer welcomer = new Welcomer();
         welcomer.sayHello();
         welcomer.sayHello("Bean");
         welcomer.sayHello("Bond");

         */


        Welcomer beanWelcomer = new Welcomer("Bean");
        System.out.println(beanWelcomer.getGreetings());
        Welcomer bondWelcomer = new Welcomer("Bond");
        System.out.println(bondWelcomer.getGreetings());
        System.out.println("Hi! " + beanWelcomer.getName());
        System.out.println("Hi! " + bondWelcomer.getName());
    }

}