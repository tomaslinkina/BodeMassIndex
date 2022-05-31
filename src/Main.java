public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 55;
        double height = 1.65;
        double index = service.calculate(mass, height);
        System.out.println(index);
    }
}