import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int result = service.sqrCountIfLimited(100, 700);
        System.out.println("Сколько квадратов попало в диапазон: " + result);


    }

}