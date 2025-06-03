package day_07.car;

public class CarController {
	public static void aggiornocarburante(car car, double km) {
		double consumo = km * car.getConsumomedio();
		car.setSerbatoio(car.getSerbatoio() - consumo);
	}
}
