package View;

import javax.swing.*;

public class CarroView {

    private String placa;
    private String modelo;
    private Integer ano;

    public void render() {

        placa = JOptionPane.showInputDialog("Digite a Placa:");
        modelo = JOptionPane.showInputDialog("Digite o Modelo:");
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano: "));
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }
}
