package terceira.questao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String anagrama = scan.nextLine();

        pares(anagrama);
    }

    static void pares(String s1){
        HashMap<String, Integer> mp= new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            for(int j = i; j < s1.length(); j++){
                char[] valChar = s1.substring(i, j+1).toCharArray();
                Arrays.sort(valChar);
                String par = new String(valChar);
                if (mp.containsKey(par))
                    mp.put(par, mp.get(par)+1);
                else
                    mp.put(par, 1);
            }
        }
        int contaPar = 0;
        for(String key: mp.keySet()){
            int n = mp.get(key);
            contaPar += (n * (n-1))/2;
        }
        System.out.println(contaPar);
    }
}
