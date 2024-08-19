import javax.swing.*;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int resposta = 0;
        do {
            System.out.println("1 - Cadastro de Carros");
            System.out.println("2 - Excluir Carros");
            System.out.println("3 - Listar Carros");
            System.out.println("0 - Sair");

            resposta = Integer.parseInt(JOptionPane.showInputDialog("Escolha sua Opção "));

        } while(resposta != 0);

        switch (resposta) {
            case 1:{

                break;
            }

        }

    }
}