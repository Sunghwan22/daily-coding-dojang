import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public long solution(int w, int h) {
        long totalCount  = (long) w * (long) h;
        long diagonalCount = w + h - BigInteger.valueOf(w).gcd(BigInteger.valueOf(h))
            .longValue();

        // BigInteger함수에 gdc가 있다 지금 그러니까 높이 + 가로 - 최대공약수를 하면 패턴 블록수가 나옴
       return totalCount - diagonalCount;
    }
}
