public class Main {
    public static String getReverse (String word){
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=(word.charAt(i));
        }
        return reverse;
    }
    public static void main(String[] args) {
        String str="Hello We all are Working for Single Objective";
        String result="";
        String[] ss=str.split(" ");
        for (int i = 0; i < ss.length; i++) {
            result+=(getReverse(ss[i]));
            if(i!= ss.length-1){
                result+=(" ");
            }
        }
        System.out.println(result);
    }
}
