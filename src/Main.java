public class Main {
    public static void main(String[] args) {
        System.out.println(mirorString("hello "));
        int[] arr = {1,2,3,4,5,6};
        printArr(arr);
        shuffleArr(arr);
        printArr(arr);
    }
    public static String mirorString (String str){
        String ans = "";
        for(int i = str.length()-1; i >= 0; i--){
            char c = str.charAt(i);
            ans += c;
        }
        return ans;
    }
    public static int[] copyArr(int[] arr){
        int[] ans = new int[arr.length];
        for(int i =0 ; i < arr.length; i++){
            ans[i] += arr[i];
        }
        return ans;
    }
    public static int[] shuffleArr(int[] arr){
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int r = i+ (int) Math.random()*arr.length -i;
            exchange(arr , i , r);
        }
        return ans;
    }
    public static void exchange(int[] arr , int currentPlace , int newPlace){
        int curPlace = arr[currentPlace];
        arr[currentPlace] = arr[newPlace];
        arr[newPlace] = curPlace;
    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    /*
        create a method that will get an array and will check what is the value where the number 'n' lies
     */
    /*
        If the array is null or has length of 1 it returns 0
        else
        sorts two arrays and then unifies them into one array
     */
    
}