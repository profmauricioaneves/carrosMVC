package Controller;
import Model.Carro;
import View.CarroView;
public class CarroController {

    Carro carro;
    CarroView view;
    public void index() {

        view = new CarroView();
        view.render();
        carro = new Carro();
        carro.setPlaca(view.getPlaca());
        carro.setModelo(view.getModelo());
        carro.setAno(view.getAno());
    }

    public Carro getCarro() {
        return carro;
    }
}
