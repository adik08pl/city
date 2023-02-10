import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        cityBuilder city = new cityBuilder("Gliwice", 21, 32);
        List<Object> miasta = new ArrayList<>();
        miasta.add(city);
    }
}