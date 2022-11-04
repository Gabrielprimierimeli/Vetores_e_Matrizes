
public class ExercicioMatriz {

	public static void main(String[] args) {
		int i = 0;
        int j = 2;
        int soma = 0;
        String diagonalPrin="", diagonalSec ="";
        int[][] numeros = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        while (i < 3)
        {
            diagonalPrin += numeros[i][i]+" ";
            soma = soma + numeros[i][i];
            i = i + 1;
        }
        System.out.println("Lista de números diagonal principal :"+diagonalPrin+" \n");
        System.out.println("A soma de diagonal principal :"+ soma+ "\n");

        i=0;
        soma = 0;
        while (j > -1)
        {
            diagonalSec += numeros[i][j]+" ";
            soma = soma + numeros[i][i];
            i = i + 1;
            j = j - 1;
        }
        System.out.println("Lista de números diagonal secundaria:"+diagonalSec+" \n");
        System.out.println("A soma de diagonal principal :"+ soma+ "\n");

	}

}
