import view.View;
import model.Model_1;
import model.Model_2;
import controller.Controller;

/*** 64050067 ฐิติกร รักวิทย์ ***/
public class App {
    public static void main(String[] args) {
        View view = new View();
        Model_1 model_1 = new Model_1();
        Model_2 model_2 = new Model_2();
        new Controller(view, model_1, model_2);

        view.display();
    }
}