package simplecalculator;
import java.util.Scanner;

public class Main 
{
	public static void main (String[] args)
	{
	Calculator calc = new Calculator(); 
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Digite o primeiro valor: ");
	double num1 = sc.nextDouble();
	System.out.println("Digite o segundo valor: ");
	double num2 = sc.nextDouble();
	
	double resultadoSoma = calc.Somar(num1, num2);
	double resultadoSub = calc.Subtrair(num1, num2);
	double resultadoDiv = calc.Dividir(num1, num2);
	double resultadoMult = calc.Multiplicar(num1, num2);	
	
	System.out.println("\nescolha uma operação:\nsoma-1\nsubtração-2\nmultiplicação- 3\ndivisão- 4");
	int x = sc.nextInt();
	
	switch (x)
	{
	case 1:
		System.out.print(resultadoSoma);
		break;
	case 2:
		System.out.print(resultadoSub);
		break;
	case 3:
		System.out.print(resultadoMult);
		break;
	case 4:
		System.out.print(resultadoDiv);
		break;
	
	default:
		System.out.print("opção inválida");
		break;
	}
	sc.close();
	}
}
