package francieudo.aluraone.conversor.principal;

import java.util.Scanner;

import francieudo.aluraone.conversor.modelos.Moeda;
import francieudo.aluraone.conversor.service.ConversorMoeda;
import francieudo.aluraone.conversor.ui.UI;

public class Principal {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ConversorMoeda conversion = new ConversorMoeda();
        boolean running  = true;

        while(running){

            double value = 0.0;
            UI.printTitle();
            UI.printOptionsMenu();

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    UI.printText("Digite o valor em Dólar americano: ");
                    value = input.nextDouble();
                    UI.printNewLine();
                    UI.printText("Aguarde...");
                    UI.printText("O valor " + value + " [USD] corresponde ao valor final de =>>> "
                                    + conversion.exchangeCurrency(Moeda.USD, Moeda.ARS, value) + " [ARS]" );   
                    break;
                case 2:
                    UI.printText("Digite o valor em Peso argentino: ");
                    value = input.nextDouble();
                    UI.printNewLine();
                    UI.printText("Aguarde...");
                    UI.printText("O valor " + value + " [ARS] corresponde ao valor final de =>>> "
                                    + conversion.exchangeCurrency(Moeda.ARS, Moeda.USD, value) + " [USD]" );
                    break;
                case 3:
                    UI.printText("Digite o valor em Dólar americano: ");
                    value = input.nextDouble();
                    UI.printNewLine();
                    UI.printText("Aguarde...");
                    UI.printText("O valor " + value + " [USD] corresponde ao valor final de =>>> "
                                    + conversion.exchangeCurrency(Moeda.USD, Moeda.BRL, value) + " [BRL]" );
                    break;
                case 4:
                    UI.printText("Digite o valor em Real brasileiro: ");
                    value = input.nextDouble();
                    UI.printNewLine();
                    UI.printText("Aguarde...");
                    UI.printText("O valor " + value + " [BRL] corresponde ao valor final de =>>> "
                                    + conversion.exchangeCurrency(Moeda.BRL, Moeda.USD, value) + " [USD]" );
                    break;
                case 5:
                    UI.printText("Digite o valor em Dólar americano: ");
                    value = input.nextDouble();
                    UI.printNewLine();
                    UI.printText("Aguarde...");
                    UI.printText("O valor " + value + " [USD] corresponde ao valor final de =>>> "
                                    + conversion.exchangeCurrency(Moeda.USD, Moeda.COP, value) + " [COP]" );
                    break;
                case 6:
                    UI.printText("Digite o valor em Peso colombiano: ");
                    value = input.nextDouble();
                    UI.printNewLine();
                    UI.printText("Aguarde...");
                    UI.printText("O valor " + value + " [COP] corresponde ao valor final de =>>> "
                                    + conversion.exchangeCurrency(Moeda.COP, Moeda.USD, value) + " [USD]" );
                    break;
                case 7:
                    UI.printText("Bye! Obrigado!");
                    running = false;
                    break;
                default:
                    UI.printText("Opção Inválida. Por favor, escolha novamente.");
                    break;
            }

            UI.printNewLine();
        }

        input.close();
    }
}
