public class Main {
    public static void main(String[] args) {
        System.out.println(mirorString("hello "));

    }
    public static String mirorString (String str){
        String ans = "";
        for(int i = str.length()-1; i >= 0; i--){
            char c = str.charAt(i);
            ans += c;
        }
        return ans;
    }
}