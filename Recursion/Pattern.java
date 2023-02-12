public class Pattern {
    public static void main(String[] args) {

    }

    static void recursion(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.println("*"+ " ");
            recursion(r,c-1);
        }else{
            System.out.println(" ");
            recursion(r-1, c);
        }
    }

    static void recursion1(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            recursion1(r,c-1);
            System.out.println("*"+ " ");
        }else{
            recursion1(r-1, c);
            System.out.println(" ");
        }
    }
}
