import java.util.*;

public class Conversion {

    public String solution(int n) {
      String num = Integer.toString(n);
      
      // 4 chars per input
      while(num.length()!=4){
      num = "0" + num;
      }
      
      int count;
      String sub;
      String result = "";
      String current = "";
      
      for(int i = 0; i < 4; i++){
          sub = "";
          count = 0;
          if(num.charAt(i)!='0'){
              sub = num.substring(i);
              if(sub.length()==4){ // if thousand
                  current = "M".repeat((int)num.charAt(i)-48);
              }
              if(sub.length()==3){ // if hundreds
                  if(sub.charAt(0)=='9'){ // 900
                      current = "CM";
                  } else if ((int)sub.charAt(0)-48>=5){ // 800 to 500
                      current = "D" + "C".repeat((int)sub.charAt(0)-48-5);
                  } else if (sub.charAt(0)=='4'){ // 400
                      current = "CD";
                  } else if ((int)sub.charAt(0)-48>=1){ // 100 to 300
                      current = "C".repeat((int)sub.charAt(0)-48);
                  }
              } else if (sub.length()==2){ //if tens
                  if(sub.charAt(0)=='9'){ //90
                      current = "XC";
                  } else if ((int)sub.charAt(0)-48>=5){ // 80 to 50
                      current = "L" + "X".repeat((int)sub.charAt(0)-48-5);
                  } else if (sub.charAt(0)=='4'){ // 40
                      current = "XL";
                  } else if ((int)sub.charAt(0)-48>=1){ // 10 to 30
                      current = "X".repeat((int)sub.charAt(0)-48);
                  }
              } else if (sub.length()==1){ //if less than ten
                  if(sub.charAt(0)=='9'){ //9
                      current = "IX";
                  } else if ((int)sub.charAt(0)-48>=5){ // 8 to 5
                      current = "V" + "I".repeat((int)sub.charAt(0)-48-5);
                  } else if (sub.charAt(0)=='4'){ // 4
                      current = "IV";
                  } else if ((int)sub.charAt(0)-48>=1){ // 1 to 3
                      current = "I".repeat((int)sub.charAt(0)-48);
                  }
              }
              result = result.concat(current);
          }
      }
      
        return result;
    }
    
    public static void main(String[] args){
    Conversion conv = new conv();
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter an integer from 0 to 3999: ");
        int num = keyboard.nextInt();
        System.out.printf("\nIn Roman Numerals, %d is %s.", num, conv.solution(num));
    }
}
