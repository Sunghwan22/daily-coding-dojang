멀리 뛰기


한 칸에 1칸 또는 2칸을 뛸 수 있다.

이때 주어진 n개 만큼의 칸에 도달하는 모든 경우의 수를 구해야한다.

n = 4칸

1,1,1,1
1,2,1
1,1,2
2,1,1
2,2

마지막 정답을 1234567로 나눈 나머지를 구해야함
4칸이 주어지면 5를 리턴한다.

경우의 수를 어떻게 구할 수 있을까? 
1. 1칸씩 뒤는 방법이 있음 => 모든 숫자에 대해 가능함
2. n이 짝수이면 => 1가지 경우 추가
3. 2칸아니면 1칸만 뛸 수 있음
4. for문을 돌린다? => 범위는 어떻게 정하지? 최대가 2천이니까 2천 보다는 클 수가 없다?

5. 1 = 1
6. 2 = 2
7. 3 = 3
8. 4 = 5
9. 5 = 8
10. 6 = 12

점프한 거리는 점프하고자 하는 위치에서 1칸 전인 위치랑 2칸전인 위치에서 점프하여 오는 경우로 나누어서 볼 수 있다.?

1칸 전인 구간
