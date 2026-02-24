
public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.distance=0;
		car1.make="Audi";
		car1.speed=0;
		car1.year="2026";
		car1.model="A6";
		
		Car car2 = new Car();
		car2.distance=0;
		car2.make="Fiat";
		car2.speed=0;
		car2.year="2023";
		car2.model="Egea";
		
		car1.accelerate(120);
		car2.accelerate(100);
		
		System.out.println(car1.go(1000));
		System.out.println(car2.go(1000));
		

	}

}
