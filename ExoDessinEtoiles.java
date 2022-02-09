import java.util.Scanner;

public class ExoDessinEtoiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int type, taille;
		Scanner monScanner = new Scanner(System.in);
		
		System.out.println("Tapez 1 pour carré, 2 pour triangle, 3 pour triangle inversé, 4 pour losange");
	
		type = monScanner.nextInt();
		System.out.println("Choisir la taille.");
		
		taille = monScanner.nextInt();
		
		switch(type) {
		case 1 :
			dessinCarre(taille);
			break;
		case 2 : 
			dessinTriangle(taille);
			break;
		case 3 : 
			dessinTriangleInv(taille);
			break;
		case 4 :
			dessinLosange(taille);
			break;
		default :
			System.out.println("erreur");
		}
	}
	
	public static void dessinCarre(int n) {
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void dessinTriangle(int n) {
		for (int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void dessinTriangleInv(int n) {
		for (int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void dessinLosange(int n) {
		dessinTriangle(n);
		dessinTriangleInv(n-1);
	}
}
