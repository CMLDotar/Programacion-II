package clase4;
public class QuintoVector {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int numeroAzar [] = new int [10];
		int noRepetir;
		for (noRepetir=0;noRepetir<=9;noRepetir++) {
			numeroAzar[noRepetir]=(int)(Math.random()*99+0);
		}
		int almacenar=0;
		for (int valorMostrado=0;valorMostrado<=9;valorMostrado++) {
			for (noRepetir=0;noRepetir<=8;noRepetir++) {
				
					if (valorMostrado!=noRepetir) {
						if (numeroAzar[valorMostrado]==numeroAzar[noRepetir]) {
							numeroAzar[noRepetir]=0;
					}
				}
			}
		}
		int mostrar =0;
		System.out.println("Numeros sin Repetir: ");
		while(mostrar<=9) {
			System.out.println(numeroAzar[mostrar]);
			mostrar++;
		}
	}
}
