public class SumOfArray {
    public static void main(String[] args) {

        int[] myArr={10,20,30,40,50};
            int sum = 0;

        for (int i = 0 ; i< myArr.length; i++){
               sum+=myArr[i];
        }
        System.out.println("Sum of array is : "+ sum);
    }
}
