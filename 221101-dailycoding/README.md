- 모르는 것은 무엇인가?

갈색 격자의 수 brown 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 “가로 세로 크기”

- 주어진 것은 무엇인가?
    
    갈색 격자의 수 brown , 노란색 격자의 수 yellow 
    
- 자료는 무엇인가?
    
    brown과 yellow는 int return 값은 [가로 ,. 세로] 형식의 배열
    
- 조건은 무엇인가?

카펫의 가로 길이는 세로 길이와 같거나 세로 길이보다 길다.!!!!

가로길이는 세로길이보다 짧을 일이 없다.

가로가 더 긴 직사각형이거나 정사각형인 경우가 다 이다.

- 갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
- 노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
    
    
    테두리는 갈색으로 칠해져 있고 가운데는 노란색으로 칠해져 있다. 
    
    갈색이 노란색 타일을 둘러싸고 있는 구조이다.
    
    갈색 타일이 1칸씩은 감싸야 한다.
    
- 조건은 알아내야 하는 것을 찾는데 충분한가?
    
    놉
    

### 2. 계획

계획을 세우기 전에 아래와 같은 질문을 던지면 굉장히 유용합니다.

- 관련된 문제를 알고 있는가?
    
    관련된 문제잘 모르겠다.
    
- 모르는 부분이 유사한 다른 문제를 풀어 본 적이 있는가?

       없는 것 같다.

- 전에 풀어 본 문제를 활용하려면 어떤 보조 요소를 도입해야 되는가?
- 도움이 될 것 같은 어떤 사실이나 정리를 알고 있는가? (보통은 자료 구조나 수학적 공리 또는 정의가 해당될 겁니다.) 

계획을 세운 뒤 아래 질문을 통해 한번 더 점검합니다.

노란색과 갈색 타일을 합한 총 칸의 갯수가 12개라고 치면 가능한 카펫의 크기는 12의 약수인 [1,2,4,6,12]이다

 가로가 세로보다 같거나 더 크기 떔누에 2,6은 없다[6,2] [4,3]

- 자료와 조건은 모두 활용 했는가? (Edge case가 될 조건을 꼭 확인합니다. 보통은 이걸 놓쳐서 지옥에 빠지죠.)

### 3. 실행

코딩을 하는 단계입니다. 물론 Test case부터 먼저 작성 해야겠죠?

- 각 단계가 올바른지 명확히 알 수 있는가?


- 그것이 옳다는 것을 설명할 수 있는가?

질문을 보면 아시겠지만 이게 TDD를 같이 하는 이유입니다.

Test code를 통해 각 단계가 올바르게 동작하는 것을 증명할 수 있기 때문입니다.

사람의 머리로는 증명할 수 없습니다. 명심하세요! 증명은 코드를 통해 합니다.

### 4. 반성

반성이 제일 중요합니다. 반성한 부분을 다음날 훈련에 반영합니다.

- 다른 방법으로 해결할 수는 없었는가? (다른 사람의 풀이도 참고하면 좋습니다.)
- 결과나 방법을 다른 문제에 활용할 수 있는가? (유용한 패턴은 계속 써먹을 수 있죠.)