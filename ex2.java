//Напишіть програму, яка зчитує ціле число та виводить текст, аналогічний наведеному у
//прикладі. Прогалини, розділові знаки, великі і малі літери важливі!
//Вводиться ціле число, за модулем, що не перевищує 10000.
//Виведіть спочатку фразу "The next number for the number", потім введене число, потім
//слово "is", оточене пробілами, потім формулу для наступного за введеним числом,
//нарешті, знак точки без пробілу. Аналогічно у наступному рядку для попереднього числа.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
        System.out.print("enter number:")
		int num = src.nestInt();
        int sum = num + 1;
        int dis = num - 1;
        System.out.println("The next number for the number" + num + "is" + sum);
        System.out.println("The previous number for the number" + num + "is" + dis);
	}
}