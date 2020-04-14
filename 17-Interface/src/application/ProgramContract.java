package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicio.contract.model.Contract;
import exercicio.contract.model.Installment;
import exercicio.contract.service.ContractService;
import exercicio.contract.service.PaypalService;

public class ProgramContract {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data:");
		System.out.print("Number: ");
		int number = scan.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(scan.next());
		System.out.print("Contract value: ");
		double totalValue = scan.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Enter number of installments: ");
		int n = scan.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, n);
		
		System.out.println("Installments:");
		for (Installment inst : contract.getInstallments()) {
			System.out.println(inst);
		}

		scan.close();
	}

}
