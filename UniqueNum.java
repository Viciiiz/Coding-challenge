public class Kata {
    public static double findUniq(double arr[]) {

      double a;
      double b;
      double c;
      for(int i = 0; i<arr.length-2; i++){
        a = arr[i];
        b = arr[i+1];
        c = arr[i+2];
        if(a==b && a!=c){
          return c;
        } else if(a==c && a!=b){
          return b;
        } else if(b==c && a!=b){
          return a;
        }
      }
      return arr[0];
    }
}
