package N6_15;
import java.lang.Math;
//6.15
public class HypotenuseCalculations {
    public static double Hypotenuse(double side1, double side2){
        double hypotenuse;
        return hypotenuse = Math.sqrt(Math.pow(side1,2.0) + Math.pow(side2,2.0));
    }


    public static void main(String[] args){
        double[] arraySide1 = {3.0, 4.0, 8.0};
        double[] arraySide2 = {4.0, 12.0, 15.0};
        System.out.println("Triangle\tSide 1\t\tSide 2\t\tHypotenuse");

        for(int i = 0; i < arraySide1.length; i++){
            System.out.println((i + 1) + "\t\t\t" + arraySide1[i] + "\t\t\t" + arraySide2[i] + "\t\t\t" +
                    Hypotenuse(arraySide1[i], arraySide2[i]));
        }
    }
}
