public class GettingLoopy {
    //Aidan Oates
    public static void main(String[] args) {
        System.out.println("1. up by 1 0-30");
        for (int i = 0; i <= 30; i++) {
            System.out.println(i);
        }
        System.out.println("2.Loop counting till 30 from 0");
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("3. A loop that counts up by 3 from 0 to 18");
        for (int i = 0; i <= 18; i += 3) {
            System.out.println(i);
        }
        System.out.println("4. A loop that counts down by 2 from 10 to 0");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
        System.out.println("5.A nested loop that creates this figure ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("6.A nested loop that creates this figure ");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("7.A nested loop that creates this figure ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print('*');
            }
            System.out.print("\n");
        }
    }
}