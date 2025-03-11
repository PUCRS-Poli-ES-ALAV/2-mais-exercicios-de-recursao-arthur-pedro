import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exerc {
    //1.Modele e implemente um método recursivo que calcule o fatorial de um número n passado como parâmetro.
    public static int fatorial(int n) {
        if(n <= 2){
            return n;
        } else return n * fatorial(n - 1);
    }

    //2.Modele e implemente um método recursivo que calcule o somatório de um número n (passado como parâmetro) até 0.
    public static int somatorio(int n) {
        if(n == 0) {
            return 0;
        }
        else return n + somatorio(n - 1);
    }

    //3.Modele e implemente um método recursivo que calcule o n-ésimo número da sequência de fibonacci.
    public static int fibonacci(int n) {
        if(n < 0) {
            return -1;
        }
        else if (n < 2) {
            return n;
        }
        else return fibonacci(n-1) + fibonacci(n - 2);
    }

    //4.Modele e implemente um método recursivo que calcule o somatório dos números inteiros entre os números k e j, passados como parâmetro.
    public static int somatorioDois(int k, int j) {
        if(k > j) {
            return somatorioDois(j, k);
        }
        else if(k == j) {
            return k;
        }
        else return k + somatorioDois(k + 1, j);
    }

    //5.Modele e implemente um método recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário.
    public static boolean isPal(String s) {
        if(s.length() <= 1){
            return true;
        }
        else return (isPal(s.substring(1, s.length()-1)) && s.charAt(0) == s.charAt(s.length()-1));
    }
    
    //6.Modele e implemente um método recursivo que recebe um inteiro zero ou positivo e retorna um String com o número em binário.
    public static String convBase2(int n) {
        if (n == 0) return "0";
        else if ((n & 1) == 0) return convBase2(n >> 1) + "0";
        else return convBase2(n >> 1) + "1";
    }

    //7.Modele e implemente um método recursivo que calcule o somatório dos números contidos em um ArrayList de inteiros, passado como parâmetro.
    public static int somatorioLista(List<Integer> n) {
        if(n.size() == 0) {
            return 0;
        }
        else return n.get(0) + somatorioLista(n.subList(1, n.size()));
    }

    //8.Modele e implemente um método recursivo para encontrar o maior elemento de um ArrayList.
    public static int findBiggest(List<Integer> ar) {
        if(ar.size() == 0) return -1;
        else if(ar.size() == 1) return ar.get(0);
        //else if (ar.size() == 2) return Math.max(ar.get(0), ar.get(1));
        else if (ar.get(0) > ar.get(1)) {
            ar.set(1, ar.get(0));
            return findBiggest(ar.subList(1, ar.size()));
        } else return findBiggest(ar.subList(1, ar.size())); 
    }

    //9.Implemente um método recursivo para determinar se um string ocorre dentro de outro.
    

   public static void main(String args[]) {
    System.out.println(fatorial(4)); // 1
    System.out.println(somatorio(5)); // 2
    System.out.println(fibonacci(0)); // 3
    System.out.println(somatorioDois(1, 3)); // 4
    System.out.println(isPal("asasa")); // 5
    System.out.println(convBase2(4)); // 6
    System.out.println(somatorioLista(Arrays.asList(1,2,3,4))); // 7
    System.out.println(findBiggest(new ArrayList<Integer>(Arrays.asList(5,4,3,7,2)))); // 8

}
}
