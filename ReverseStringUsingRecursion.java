public class ReverseStringUsingRecursion {
    //StringBuffer sb = new StringBuffer();
    static String sb = "";
    public static void main(String[] args) {
        String temp = "reverse";//esrever//7
        int len = temp.length();
        System.out.println(printReverseString(temp,len-1));

    }

    private static String printReverseString(String temp, int len) {

        if(len >= 0){
            sb =  sb + temp.charAt(len);//re
            len--;//5,4,3,2,1,0
            printReverseString(temp,len);
        }else{
            return sb;
        }

        return sb;
    }
}
