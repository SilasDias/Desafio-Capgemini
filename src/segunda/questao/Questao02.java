package segunda.questao;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int j;
        String num = "0123456789";
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String espec = "@#$%^&*()-+";
        boolean numeros = false;
        boolean alfabeto = false;
        boolean alfabetoAta = false;
        boolean especial = false;

        String senha = scan.nextLine();
        int maxSize = senha.length();

        if (maxSize < 6) {
            System.out.println(maxSize);
        } else {

            for (int i = 0; i < maxSize; i++) {
                j = 0;
                while (j < alpha.length()) {
                    if (senha.charAt(i) == alpha.charAt(j)) {
                        alfabeto = true;
                    }
                    j++;
                }
                j = 0;
                while (j < alpha.length()) {
                    if (senha.charAt(i) == Character.toLowerCase(alpha.charAt(j))) {
                        alfabetoAta = true;
                    }
                    j++;
                }
                j = 0;
                while (j < num.length()) {
                    if (senha.charAt(i) == num.charAt(j)) {
                        numeros = true; //.add(senha.substring(i));
                    }
                    j++;
                }
                j = 0;
                while (j < espec.length()) {
                    if (senha.charAt(i) == espec.charAt(j)) {
                        especial = true;
                    }
                    j++;
                }

            }

            if (alfabeto && numeros && especial && alfabetoAta) {
                System.out.println("Senha no padrao");
            } else {
                System.out.println("Senha fora do padrao");
            }

        }

    }
}
