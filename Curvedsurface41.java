//41

import java.util.Scanner;
public class Curvedsurface41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);

		System.out.println("enter the side lenght of the cube:");

		double sidelenght= Scanner.nextDouble();

		double curvedsurfacearea = 4*Math.pow(sidelenght,2);

		System.out.println("the curved surface area of the cube is:"+curvedsurfacearea);

		 Scanner.close();
	}

}
