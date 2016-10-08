import java.util.Random;

public class Spielfeld {

	boolean[][] matrix;
	boolean[][] matrixAlt;
<<<<<<< HEAD
	int zufallszahl, breite, laenge;
	int [][] stelle;
=======
//<<<<<<< HEAD
	int zufallszahl, breite, laenge;
//=======
	int [][] stelle;
//>>>>>>> origin/master
>>>>>>> origin/master

	public Spielfeld(int breite, int laenge){
		this.breite=breite;
		this.laenge=laenge;
		matrix = new boolean [breite][laenge];
		matrixAlt = new boolean [breite][laenge];
		//while(true){
			System.out.println("Matrix:" +breite*laenge);
			matrixBefuellen();
			//zufallszahl();
		//}
		
	}
	
	public void matrixBefuellen(){
		for(int b = 0; b<breite; b++){
			for(int l = 0; l<laenge; l++){
				double random = Math.random();
				if(random >= 0.5){
					matrix[b][l] = true;
				}else{
					matrix[b][l] = false;
				}
			}
		}
		matrixAlt = matrix;
		ausgabe();
	}
	
	public void ausgabe(){
		for(int b = 0; b<breite; b++){
			for(int l = 0; l<laenge; l++){
				if(matrix[b][l] == true)
				System.out.print("| X ");
				else
					System.out.print("|   ");
			}
			System.out.println();
		}
	}
<<<<<<< HEAD

=======
//<<<<<<< HEAD
//	
////	public void zufallszahl(){
////		Random random = new Random();
////		zufallszahl = random.nextInt(breite*laenge);
////		System.out.println(zufallszahl);
////	}
//=======
//	 
//	
//>>>>>>> origin/master
>>>>>>> origin/master
}
