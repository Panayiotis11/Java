import java.util.Scanner;
import java.lang.Math;
public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere obj = new Sphere();
		obj.setter(3.60);
		System.out.println("The diameter that was set was " + obj.getter());
		System.out.println("The volume of the sphere is " + obj.volume());
		System.out.println(obj.description());
		obj.set_color("blue");
		System.out.println(obj.get_color());
		
	}

	public double _diameter; //this._diameter will tell that it's this diameter
	public double calculation;
	public String description;
	public String color;
	
	
	public Sphere() {
		_diameter = 0;
	}
	
	
	public void setter (double diam) {
		
		this._diameter = diam;
		
	}
	
	
	public double getter() {
		
		
		return _diameter;
		
	}
	
	public double volume() {
		
		double r = _diameter;
		return ((double)4 / 3) * Math.PI * Math.pow(r,3);
	}
	
	public String description() {
		return "The sphere has a diameter of " + getter() + " and volume " + volume();
	}
	
	public void set_color(String color) {
		this.color = color;
	}
	
	public String get_color() {
		return color;
	}
	
}
