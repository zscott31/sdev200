import java.util.Scanner;

class apples {
	public static void main(String args[]){
		Scanner zach = new Scanner(System.in);
		double fnum, snum, answer;

		System.out.println("Enter your first number: ");
		fnum = zach.nextDouble();

		System.out.println("Enter your second number: ");
		snum = zach.nextDouble();

		answer = fnum + snum;
		System.out.println(answer);
	}
}