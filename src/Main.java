public class Main {
    public static void main (String[]args) {
        double StartAmount = 225.15;
        double Income = 1520;
        int Bonus;
        if (Income > 1000) {
            Bonus = (int) Income / 100;
        }   else {
            Bonus = 0;
        }
        double Result = StartAmount + Income + Bonus;
        System.out.println(Result);
    }
}
