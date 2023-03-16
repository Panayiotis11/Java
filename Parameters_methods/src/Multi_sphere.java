
public class Multi_sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Multi_sphere sc = new Multi_sphere();
		
	}
	
	// Create a driver class (main class) called MultiSphere, whose main method instantiates and updates several Sphere objects.
	
	public Multi_sphere() {
		
	Sphere obj = new Sphere();
	obj.setter(4);
	System.out.println(obj.getter());
	System.out.println(obj.volume());
	
	System.out.println(obj.description());
	
	obj.set_color("green");
	
	System.out.println(obj.get_color());
	
		
	}

}
