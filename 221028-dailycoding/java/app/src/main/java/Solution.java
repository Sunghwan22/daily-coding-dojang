class Solution {
  public int solution(int n) {
    int nextNumber = n + 1;

    int oneCount = binaryCount(n);

    while(true) {
      int count = binaryCount(nextNumber);

      if(count == oneCount) {
        break;
      }

      nextNumber += 1;
    }

    return nextNumber;
  }

  public int binaryCount(int n) {
    int count = 0;

    String binaryNumber = Integer.toBinaryString(n);

    for(int i = 0; i<binaryNumber.length(); i += 1) {
      if(binaryNumber.charAt(i) == '1') {
        count += 1;
      }
    }
    return count;
  }
}
