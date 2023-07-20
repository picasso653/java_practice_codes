public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        if (l == w){
          return l *l;
        }
      else{
        return (2*l) + (2*w);
      }
    }
}