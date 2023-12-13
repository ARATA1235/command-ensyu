import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        System.out.println("身長(m)、体重(㎏)を表記してください。");
        Scanner sc = new Scanner(System.in);
        double height = Double.parseDouble(sc.nextLine());
        double weight = Double.parseDouble(sc.nextLine());
    	
    	double height2 = Double.parseDouble(sc.nextLine());
        double weight2 = Double.parseDouble(sc.nextLine());

        double BMI = weight / (height * height);
        String bmi = String.format("%.2f", BMI);
    	
    	double BMI2 = weight2 / (height2 * height2);
        String bmi = String.format("%.2f", BMI2);

        System.out.println("一人目のBMIは" + bmi + "です。");
    	
    	System.out.println("二人目のBMIは" + bmi + "です。");
    }
}