package OddEvenCount;

public class OddEvenCount {
    public static void main(String[] args) {

       int []myArr={1,2,3,4,5,6,7,8,9,10};

       int evenCount=0;
       int oddCount=0;

       for (int i=0; i < myArr.length;i++){
           if (myArr[i]% 2==0){
               evenCount++;


           }else {
               oddCount++;

           }
       }
        System.out.println("In This Array Even Number Is :"+evenCount );
        System.out.println("In This Array Odd Number Is:"+oddCount);
    }
}
