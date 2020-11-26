public class StringSplit {
    public static String[] solution(String s) {
      if(s.length()%2!=0){
        s = s.concat("_");
      }
      String[] ret = new String[s.length()/2];
      int index = 0;
      String current = "";
      for(int i =0 ; i<s.length(); i+=2){
        current = current.concat(Character.toString(s.charAt(i)));
        current = current.concat(Character.toString(s.charAt(i+1)));
        ret[index]=current;
        current = "";
        index ++;
      }
      return ret;
    }
}
