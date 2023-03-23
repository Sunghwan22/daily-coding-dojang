// H-index 구하기 

H 인덱스는 과학자의 생산성과 영향력을 나타내는 지표이다.

어떤 과학자가 발표한 논문 n편 중 h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하
인용되었다면 h의 최댓값이 이 과학자의 h index이

입 출력 예를 보면

3,0,6,1,5가 들어왔는데 리턴이 3이 됬다.

이유는 5편의 논문 중 3편의 논문은 3회이상 인용되었고 나머지 2편의 논문은 3회 이하 인용되었기 떄문에

어떻게 찾을 것인가? 

평균값인가? 아님

배열을 오름차순으로 정렬하면 0,1,4,5,6 인데
여기서 각 값보다 인용횟수가 크거나 같은 논문 편수를 h로 잡고 h -index 조건을 체크해보면 조건에 부합하는 
값 중 최대값인 h-index는 3?

0  1  3  5  6  0회 이상 인용된 논문이 5편
0  1  3  5  6  1회 이상 인용된 논문이 4편
0  1  3  5  6  3회 이상 인용된 논문이 3편   O 이거 떄문에 그런 거 같은데 
0  1  3  5  6  5회 이상 인용된 논문이 2편
0  1  3  5  6  6회 이상 인용된 논문이 1편