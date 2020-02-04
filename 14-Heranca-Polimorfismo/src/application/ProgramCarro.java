package application;

import java.util.Scanner;

import entities.Carro;

public class ProgramCarro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = scan.next();
        System.out.print("Modelo: ");
        String modelo = scan.next();
        System.out.print("Quantidade de pessoas dentro deo veículo: ");
        int qtdePessoas = scan.nextInt();


        Carro carro = new Carro(marca, modelo, qtdePessoas);
        System.out.println(carro);
        
        System.out.print("Quantas pessoas irão entrar no carro? ");
        int qtdeEmbarque = scan.nextInt();
        
        if (carro.getQtdePessoas() == 5) {
			System.out.println("Não há mais lugares disponíveis!");
		} else {
			carro.addPessoa(qtdeEmbarque);
			System.out.println(carro);
		}
        

        scan.close();

	}

}
