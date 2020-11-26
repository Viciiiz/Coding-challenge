import java.util.*;
  
public class Solution {

  public int solution(int number) {
    //TODO: Code stuff here
    ArrayList<Integer> numbers = new ArrayList();
    for (int i = 1; i < number; i++){
      if(!numbers.contains(i)){
        if(i%3==0 || i%5==0){
          numbers.add(i);
        }
      }
    }
    int sum = 0;
    for(int i = 0; i < numbers.size(); i++){
      sum += numbers.get(i);
    }
    return sum;
  }
}
