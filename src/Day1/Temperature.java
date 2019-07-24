package Day1;

public class Temperature {

	public static void main(String[] args) {
		System.out.println(convertToCelcius(100));
		System.out.println(convertToFarenheit(20));
	}
 public static double convertToCelcius(double farenheit) {
	double result1 = (farenheit - 32) * 5 / 9;
	return result1;
 }
 public static double convertToFarenheit(double celcius) {
		double result2 = 9 * (celcius / 5) + 32;
		return result2;
 }
}
