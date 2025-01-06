import java.util.*;
class wearable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the temperature");
			int temp = sc.nextInt();
			if(temp < 0) {
				System.out.println("Wear Warm clothes.\nDon't forget yor gloves.");
			}
			else if(temp >= 0 && temp <= 10) {
				System.out.println("Wear Winter clothes.\nLight jacket would be helpful.");
			}
			else if(temp >= 11 && temp <= 20) {
				System.out.println("Wear Light clothes.\nSunglasses would be a good idea.");
			}
			else if(temp > 20) {
				System.out.println("Wear Summer clothes.\nSunscreens must be used inorder to protect your skin.");
			}
		} 
		catch(Exception e) {
			System.out.println("Invalid");
		}
		sc.close();
	}
}
