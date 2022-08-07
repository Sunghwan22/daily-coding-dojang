import java.util.HashSet;

public class Solution {
  public int solution(int[] nums) {
    int answer = 0;


    HashSet<Integer> noSamePhonekemonSets = new HashSet<>();
    for(Integer phonekemonNumber : nums) {
      noSamePhonekemonSets.add(phonekemonNumber);
    }

    if(noSamePhonekemonSets.size() >= nums.length / 2) {
      answer = nums.length / 2 ;
    }
    if(noSamePhonekemonSets.size() < nums.length / 2) {
      answer = noSamePhonekemonSets.size();
    }
    return answer;
  }
}
