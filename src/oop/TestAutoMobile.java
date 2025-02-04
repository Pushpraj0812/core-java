package oop;

public class TestAutoMobile {

	public static void main(String[] args) {

		AutoMobile a = new AutoMobile();

		a.setcolour("Black");

		a.setspeed(150);

		a.setmake("BMW");

		System.out.println(a.getcolour());

		System.out.println(a.getspeed());

		System.out.println(a.getmake());

	}
}