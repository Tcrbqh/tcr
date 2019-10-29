
public class RegularPolygon {
	//定义多边形的边数，默认值为3
	private int n=3;
	//定义存储边的长度，默认为1
	private double side=1;
	//定义 多边形中点的x坐标，默认值为0
	private double x=0;
	//定义 多边形中点的y坐标，默认值为0
	private double y=0;
	//一个创建具有默认值的正多边形的无参构造方法
	public RegularPolygon(){
		
	}
	//一个能创建带有带指定边数和边长度、中心在（0,0）的正多边形的构造方法
	public RegularPolygon(int n,double side){
		this.n=n;
		this.side=side;
	}
	//一个能创建带有带指定边数和边长度、中心在（x,y）的正多边形的构造方法
	public RegularPolygon(int n,double side,double x,double y){
		this.n=n;
		this.side=side;	
		this.x=x;
		this.y=y;
	}	
	
	public int getN(){
		return n;
	}
	
	public double getSide(){
		return side;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	double getPerimeter(){
		return n*side;
	}
	double getArea(){
		return n*side*side/(4*Math.tan(Math.PI/n));
	}
}
