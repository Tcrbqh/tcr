
public class PolymorphismDemo {
	/** Main method*/
	public static void main(String[] args) {
		//Display circle and rectangle properties
		displayObject(new Circle(1,"red",false));
		diaplayObject(new Rectangle(1,1,"black",true));
	}
	
	/**Display geometric object properties*/
	public static void diaplayObject(GeometricObject object){
		System.out.println("Created on "+object.getDateCreated()+".color is "+object.getColor());
	}
}
