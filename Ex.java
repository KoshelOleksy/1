//Дано два числа a та b. Знайдіть гіпотенузу трикутника із заданими катетами.
//У двох рядках вводяться два числа (числа цілі, позитивні, не перевищують 1000).
//Виведіть відповідь на завдання.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.print("Введіть перший катет:");
		int a = src.nextInt();
		System.out.print("Введіть другий катет:");
		int b = src.nextInt();
		System.out.println(Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
	}
}