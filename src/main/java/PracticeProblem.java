import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		System.out.println(Math.abs(in.nextDouble()));
		in.nextLine();
		in.close();
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double a = in.nextDouble();
		System.out.print("Input another number: ");
		double num = a/in.nextDouble();
		System.out.println(Math.floor(num));
		System.out.println(Math.ceil(num));
		in.nextLine();
		in.close();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double a = in.nextDouble();
		System.out.println(Math.round(Math.sqrt(a)));
		in.nextLine();
		in.close();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double a = in.nextDouble();
		System.out.print("Input another number: ");
		double b = in.nextDouble();
		System.out.println(Math.pow(a, b));
		in.nextLine();
		in.close();
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double a = in.nextDouble();
		System.out.print("Input another number: ");
		double b = in.nextDouble();
		System.out.print("Input one more number: ");
		double c = in.nextDouble();
		System.out.println(Math.max(Math.max(a, b),c));
		System.out.println(Math.min(Math.min(a, b),c));
		in.nextLine();
		in.close();
	}
	public static void q6() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String a = in.nextLine();
		System.out.println(a.contains("on"));
		in.close();
	}
	public static void q7() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String a = in.nextLine();
		System.out.println(a.equalsIgnoreCase("mango"));
		in.close();
	}
	public static void q8() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String a = in.nextLine();
		System.out.print("Input a letter: ");
		String b = in.nextLine();
		System.out.println(a.indexOf(b));
		System.out.println(a.lastIndexOf(b));
		in.close();
	}

	public static void q9() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String a = in.nextLine();
		System.out.println("Your sentence is " + a.length() + " characters long");
		in.close();
	}
	public static void q10() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String a = in.nextLine();
		System.out.print("Input a word to replace: ");
		String b = in.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String c = in.nextLine();
		System.out.println(a.replaceAll(b, c));
		in.close();
	}

	public static void q11() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String a = in.nextLine().trim();
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		in.close();
	}

	public static void q12() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String a = in.nextLine();
		System.out.println(a.substring(0, 4));
		System.out.println(a.substring(a.length()-4, a.length()));
		in.close();
	}
	

}
