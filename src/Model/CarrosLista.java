package Model;

import java.util.ArrayList;
import java.util.List;

public class CarrosLista {

    private List<Carro> carros = new ArrayList<>();

    public void adicionar(Carro carro) {
        carros.add(carro);
    }

    public List<Carro> getCarros() {
        return carros;
    }
}
