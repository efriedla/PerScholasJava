package JavaQuickRecap;

import java.util.Scanner;

/**
 * https://www.youtube.com/watch?v=WPvGqX-TXP0
 */
public class Banas30minuteJAva {
	public static void main(String[] args) {

		//animal
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		Animal pig = new Animal();


		if(sc.hasNextLine())
		{
			pig.setName(sc.nextLine());
		}
		System.out.println(pig.getName());
		System.out.println("Enter age ");
		if(sc.hasNextByte()){
			pig.setAge(sc.nextByte());
		}
		System.out.println( pig.getName() + " is " +pig.getAge());

		sc.close();

	}
}
