package JavaQuickRecap;

import java.util.Scanner;

//public means anyone can access it
public class Animal {
	private String name;
	private int weight;
	private boolean hasOwner = false;
	private byte age;
	private long id;
	private char favoriteChar;
	private double speed;
	private float height;

	protected static int numberOfAnimals = 0;

	static Scanner sc = new Scanner(System.in);

	public Animal(){
		numberOfAnimals ++; //increase number of animals
		System.out.println(numberOfAnimals);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHasOwner() {
		return hasOwner;
	}

	public void setHasOwner(boolean hasOwner) {
		this.hasOwner = hasOwner;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		System.out.println("ID set to: "+ id);
		this.id = id;
	}
	public void setID(){
		System.out.print("ID set to: ");
		long min = 1;
		long max = 100000;
		this.id = min + (long) (Math.random() * ((max-min)+1)); //casting long
		System.out.print(this.id);

	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		this.favoriteChar = favoriteChar;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public static int getNumberOfAnimals() {
		return numberOfAnimals;
	}

	public static void setNumberOfAnimals(int numberOfAnimals) {
		Animal.numberOfAnimals = numberOfAnimals;
	}

	public static Scanner getSc() {
		return sc;
	}

	public static void setSc(Scanner sc) {
		Animal.sc = sc;
	}
}
