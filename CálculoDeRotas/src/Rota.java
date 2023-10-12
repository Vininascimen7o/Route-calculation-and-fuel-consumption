/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vininascimen7o
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Rota {

    public void planejarDia() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a quantidade de rotas de hoje: ");
        int quantidadeRotas = teclado.nextInt();

        double kmTotal = 0;

        for (int i = 1; i <= quantidadeRotas; i++) {
            System.out.println("Qual a quilometragem a ser percorrida na rota " + i + "? ");
            double kmRota = teclado.nextDouble();

            kmTotal += kmRota;
        }
        
        System.out.println("Quantos km por litro seu veículo faz?");
        double kmPorLitro = teclado.nextDouble();

        double qntLitros = (kmTotal / kmPorLitro);

        System.out.println("Qual o valor do combustível por litro? ");
        double valorDiesel = teclado.nextDouble();

        double valorGasto = (qntLitros * valorDiesel);

        System.out.println("A distância total à ser percorrida é de " + kmTotal + "km");
        System.out.print("Será necessário o uso de " + qntLitros + " litros de combustível \n");
        System.out.printf("e um valor de %.2f", valorGasto);
        System.out.println(" Reais para completar o percurso. ");
    }
}
