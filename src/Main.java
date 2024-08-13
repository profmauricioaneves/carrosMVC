import Controller.CarroController;
import Model.Carro;

public class Main {
    public static void main(String[] args) {

    CarroController controller = new CarroController();
    controller.index();

        System.out.println("Modelo: " + controller.getCarro().getModelo());


}
}