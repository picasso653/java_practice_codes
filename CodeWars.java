public class CodeWars {
    public static int strCount(String str, char letter) {
      int count = 0;
      for (int i = 0; i < str.length(); i ++){
        if (str.charAt(i) == letter){
          count +=1;
        }
      }
      return count;
    }
    public static void main(String[] args) {
      System.out.println(strCount("Hello", 'o')); 
    }
  }