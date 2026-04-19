public class MaxSum {
    public static void main(String[] args) {
        int [] myArr ={10,50,20,80};
        int max = myArr[0];

        for (int i = 1; i <myArr.length;i++){
            if(myArr[i] > max){
                max=myArr[i];
            }
        }
        System.out.println("Max element in array is:"+ max);

    }
}
