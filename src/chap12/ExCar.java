package chap12;


public class ExCar extends Car{
	private double totalMileage;  // 총 주행거리
	
	// --- 생성자 --- //
	public ExCar ( String name, int width, int height, int length, double fuel, Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
		totalMileage = 0.0;
	}
	
	public double getTotalMileage() {  // 총 주행거리 확인 
		return totalMileage;
	}
	public void putSpec() { //  사양 표시
		super.putSpec();
		System.out.printf("총 주행 거리: %.2fkm\n", totalMileage);
	}
	// Move
	public boolean moveCar(double x, double y) {
		double distance = Math.sqrt(x*x + y*y);
		if (!super.moveCar(x, y))
			return false;
		else {
			totalMileage += distance;
			return true;
		} // else
	}  //moveCar
}  // ExCar
