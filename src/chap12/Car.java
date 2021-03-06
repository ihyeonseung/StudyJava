package chap12;


class Car{
	private String name;
	private int width;  //폭
	private int height;  //높이
	private int length;  //길이 
	private double x; // x좌표 
	private double y;  //y좌표
	private double fuel;  //남은 연료
	private Day purchaseDay;

	
	Car(String name, int width, int length, int height,  double fuel, Day purchaseDay){
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.x = 0; this.y = 0;
		this.fuel = fuel;
		this.purchaseDay = purchaseDay;
		x = y = 0.0;
	}  // Car 생성자 
	
	public double getX() {return this.x;} 
	public double getY() { return this.y;}
	public double getFuel() {return this.fuel;}
	public Day getPurchaseDay() { 
		return new Day(this.purchaseDay);
	}
	public void putSpec() {
		System.out.println("이름: "+ name);
		System.out.println("전폭: "+ width+"mm");
		System.out.println("전고: "+ height+"mm");
		System.out.println("전장: "+ length+"mm");
	}
	public void getSpec() {
		System.out.println("자동차명: "+ this.name);
		System.out.println("자동차넓이: "+ this.width);
		System.out.println("자동차높이: "+ this.height);
		System.out.println("자동차길이: "+ this.length);
	}  //getSpec 
	
	public boolean moveCar(double x, double y) {
		this.x += x; this.y += y; 
		double distance = Math.sqrt(x*x + y*y);
		if( distance > fuel) return false; 
		else {
			fuel -= distance;
			x += x;
			y += y;
			return true;  // 이동 완료 
		}
	}  //moveCar
	} //Car 본체 