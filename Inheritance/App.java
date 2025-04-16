public class App {
    public static class Animal{
        public void printWelcome(){
            System.out.println("Welcome Parent...");
        }
    }
    public static class Bird extends Animal{
        @Override
        public void printWelcome(){
            System.out.println("Welcome Child...");
        }
    }
    public static void main(String[] args) {
        Driver driver=new Driver();
        driver.name="Satya";
        driver.Adresss="Chennai";
        System.out.println("The driver name is "+driver.name+" from "+driver.Adresss);
        driver.drive();
        Pet pet=new Pet();
        pet.bark();
        Bird bird=new Bird();
        bird.printWelcome();
        



    }
    

    
}
