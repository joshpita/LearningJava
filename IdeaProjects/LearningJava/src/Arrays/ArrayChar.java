package Arrays;

public class ArrayChar {
    public static void main(String[] args) {
        String str = "JoshuaPita2019";
        //creating array of string length
        char[] ch = new char[str.length()];
        for (int i=0; i < str.length(); i++){
            ch[i] = str.charAt(i);
        }
        //printing content of array
        for(char c : ch){
            System.out.println(c);
        }
    }
}
