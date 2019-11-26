
public class CastingDemo {
	/**Main method*/
	public static void main(String[] args) {
		//Create and initialize two objects
		Object object1= new Circle(1);
		Object object2= new Rectangle(1,1);
		
		//Display circle and rectangle
		diaplayObject(object1);
		displayObject(object2);
	}
	
	/** A method for diaplaying an object*/
	public static void diaplayObject(Object object){
		if(object instanceof Circle){
			System.out.println("The circle area is "+((Circle)object).getArea());
			System.out.println("The circle diameter is "+((Circle)object).getDiameter());
		}
		else if(object instanceof Rectangle){
			System.out.println("The rectangle area is "+((Rectangle)object).getArea());
		}
	}
	
}