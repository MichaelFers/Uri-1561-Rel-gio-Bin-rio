
import java.util.Scanner;

public class RelogioBinario{

    static int h8, h4, h2, h1, m32, m16, m8, m4, m2, m1;

    public static void relogio(int h, int m) {
        h8 = h4 = h2 = h1 = m32 = m16 = m8 = m4 = m2 = m1 = 0;

        h8 = h / 8;
        h %= 8;
        h4 = h / 4;
        h %= 4;
        h2 = h / 2;
        h %= 2;

        m32 = m / 32;
        m %= 32;
        m16 = m / 16;
        m %= 16;
        m8 = m / 8;
        m %= 8;
        m4 = m / 4;
        m %= 4;
        m2 = m / 2;
        m %= 2;

        System.out.printf(" ____________________________________________\n");
        System.out.printf("|                                            |\n");
        System.out.printf("|    ____________________________________    |_\n");
        System.out.printf("|   |                                    |   |_)\n");
        System.out.printf("|   |   8         4         2         1  |   |\n");
        System.out.printf("|   |                                    |   |\n");

        System.out.printf("|   |   ");
        if (h8 == 1) {
            System.out.printf("o         ");
        } else {
            System.out.printf("          ");
        }
        if (h4 == 1) {
            System.out.printf("o         ");
        } else {
            System.out.printf("          ");
        }
        if (h2 == 1) {
            System.out.printf("o         ");
        } else {
            System.out.printf("          ");
        }
        if (h == 1) {
            System.out.printf("o  |   |\n");
        } else {
            System.out.printf("   |   |\n");
        }

        System.out.printf("|   |                                    |   |\n");
        System.out.printf("|   |                                    |   |\n");

        System.out.printf("|   |   ");
        if (m32 == 1) {
            System.out.printf("o     ");
        } else {
            System.out.printf("      ");
        }
        if (m16 == 1) {
            System.out.printf("o     ");
        } else {
            System.out.printf("      ");
        }
        if (m8 == 1) {
            System.out.printf("o     ");
        } else {
            System.out.printf("      ");
        }
        if (m4 == 1) {
            System.out.printf("o     ");
        } else {
           System.out.printf("      ");
        }
        if (m2 == 1) {
            System.out.printf("o     ");
        } else {
            System.out.printf("      ");
        }
        if (m == 1) {
            System.out.printf("o  |   |\n");
        } else {
            System.out.printf("   |   |\n");
        }

        System.out.printf("|   |                                    |   |\n");
        System.out.printf("|   |   32    16    8     4     2     1  |   |_\n");
        System.out.printf("|   |____________________________________|   |_)\n");
        System.out.printf("|                                            |\n");
        System.out.printf("|____________________________________________|\n");
        System.out.printf("\n");
    }

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
	int hora, minutos;
        char[] cont = new char[5];

	while (leitor.hasNext()) {
            
            String s = leitor.nextLine();
             cont = s.toCharArray();
             
             hora = ((cont[0] - '0') * 10) + (cont[1] - '0');
	     minutos = ((cont[3] - '0') * 10) + (cont[4] - '0');
             relogio(hora, minutos);
        }
    }
}
