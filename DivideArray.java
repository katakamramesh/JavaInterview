public class DivideArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 11, 8, 5};//2 array --> diff should be minimal
        //29 -> 14
        //int currentDiff = 2 // 10
        //int previousDiff = 9
        splitArray(arr);//{1, 4, 5, 8 ,11}// 1, 5, 8
    }

    private static void splitArray(int[] arr) {
        int currentDiff = 1000;
        int previousDiff = 1000;
        int arraySum = 0;
        int mediumDiff = 0;
        for(int i : arr){
            arraySum = arraySum + i;
        }
        mediumDiff = arraySum / 2;//14

        int temp = 0;
        for(int y : arr){//{1, 4, 11, 8, 5}
            temp = temp + y;//1
            if((temp - mediumDiff) / 2 != 0){
                previousDiff = currentDiff;//1
                currentDiff = temp;//2
            }
        }
    }
}
