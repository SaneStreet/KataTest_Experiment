public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        for (int i = 0; i < 6; i++){
            Die die = new Die();
            die.roll();
        }

        Calculator calc = new Calculator();
        System.out.println(calc.add(18,45));
        System.out.println(calc.subtract(52,32));
    }
}
