import ru.netology.java5.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println("Количество квадратов попавшых в диапозон чисел:  " + service.squaring(100, 200));
    }
}
