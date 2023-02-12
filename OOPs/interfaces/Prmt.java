//package interfaces;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Prmt {
//    public static void main(String[] args) {
//
//    }
//
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> result = new ArrayList();
////        generateSubsets(1,nums.length,new ArrayList(),result);
//        return result;
//    }
//
//    void generateSubsets( int length, ArrayList arrayList, List<List<Integer>> result,int[] p,int[] up) {
//        if(up.length == 0){
//            arrayList.add(p);
//            return;
//        }
//
//        int x =up[0];
//        for(int j = 0 ; j <p.length;j++){
////            int f = Arrays.copyOfRange(p,0,j);
////            int s = Arrays.copyOfRange(p,j,p.length);
////            generateSubsets(arrayList,result,f+x+s,);
//        }
//    }
//}
