import Controller.CarroController;
import Model.Carro;
import Model.CarrosLista;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int resposta = 0;
        CarrosLista meusCarros = new CarrosLista();
        while (resposta == 0) {
            CarroController controller = new CarroController();
            controller.index();
            meusCarros.adicionar(controller.getCarro());
            resposta = Integer.parseInt(JOptionPane.showInputDialog("Continua? 0 - Continua | 1 - Sair"));
        }

        for (int i = 0; i < meusCarros.getCarros().size() -1 ; i++) {
            System.out.println(meusCarros.getCarros().get(i));
        }


}
}