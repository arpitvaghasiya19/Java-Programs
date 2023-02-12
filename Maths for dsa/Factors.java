import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors1(20);
    }

    static void factors1(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if( n  % i == 0){
                if(n/i == i){
                    System.out.println(i + " ");
                }
                else{
                    System.out.println(i + " ");
                    list.add(n / i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.println(list.get(i) + " "); 
        }
    }
}
