public class Main {
    public static void main(String[] args) {
        long amount = 5000;
        boolean registered = true;
        BonusService service = new BonusService();
        long bonus = service.calculate(5_000, true);

        System.out.println(bonus);
    }
}
