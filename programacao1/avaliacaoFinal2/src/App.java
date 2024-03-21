import useCase.Menu;
import useCase.SingletonScanner;

//https://stackoverflow.com/questions/29458676/how-to-avoid-instanceof-when-implementing-factory-design-pattern
public class App {
    public static void main(String[] args) {
        Menu.start(SingletonScanner.getScanner());
    }
}
