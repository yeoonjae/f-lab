package study.week02;

public class Lambda {
    //    int noLambda(int a, int b){
//        return a+b > 10 ? a : b;
//    }
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        Arrays.setAll(arr, (i) -> (int)(Math.random()*4)+1);
        Lambda ld = new Lambda();
//       ld.method();
//        System.out.println(Arrays.toString(arr));
        System.out.println(ld.method());
    }

    int method(){
        int[] arr = new int[5];
        return (int)(Math.random()*5)+1;
    }
}
