//N школярів ділять K яблук порівну, залишок, що не ділиться, залишається в кошику.
//Скільки яблук дістанеться кожному школяреві?
//Програма отримує вхід числа N і K.
//Програма повинна вивести кількість яблук.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.print("Введіть дітей:");
		int N = src.nextInt();
		System.out.print("Введіть яблука:");
        int K = src.nextInt();
        int dil = K/N;
        int kosh = K%N;
        System.out.println("яблук дістанеться кожному школяреві:" + dil);
        System.out.println("яблук залишиться у кошику:" + kosh);
	}
}