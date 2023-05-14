public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int expected = 150;
        long actual = (int) service.calculate(1000, true);
        System.out.println("1. " + actual + " == ? == " + expected);

        expected = 50;
        actual = service.calculate(5000, false);
        System.out.println("2. " + actual + " == ? == " + expected);
    }
}
