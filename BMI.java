package lab4;

public class BMI {

	private double weight;
	private double height;
	private double bmi;
	
	public static final double CONVERT_POUNDS_TO_KG = 0.45359237;
	public static final double CONVERT_INCH_TO_METRE = 0.0254;

	public BMI(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public double getBMI() {
		return bmi = CONVERT_POUNDS_TO_KG * this.weight / Math.pow(CONVERT_INCH_TO_METRE * this.height, 2);
	}

	public String getHealthStatus() {
		if (this.bmi < 18.5) {
			return "Underweight";
		} else if (this.bmi < 25.0) {
			return "Normal";
		} else if (this.bmi < 30.0) {
			return "Overweight";
		}

		return "Obese";
	}
}
