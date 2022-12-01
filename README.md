# 문자열 덧셈 계산기

## 기능 요구 사항

- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달한다.
- 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
- 앞의 기본 구분자 외에 커스텀 구분자를 지정할 수 있다.
- 커스텀 구분자는 문자열 앞부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
  - e.g. //;\n1;2;3;
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

## 프로그래밍 요구사항

- 인덴트 1단계 허용
- 메소드의 최대 10라인
- else 사용금지

# 자동자 경주 게임

## 기능 요구 사항

- 각 자동차에 이름을 부여하며 자동차 이름은 5자를 초과할 수 없다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 전진하는 조건은 0에서 9 사이에서 RANDOM한 값을 구한 후 RANDOM 값이 4 이상일 경우 이다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지 알려준다. 우승자는 한명 이상일 수 있다.

## 프로그래밍 요구사항

- 자바 코드 컨벤션 [Google java Style Guide](https://google.github.io/styleguide/javaguide.html) 지키기
- 인덴트 2까지 허용
- else 금지
- 3항 연산자 금지
- 모든 기능 TDD 구현 (단위 테스트 존재) (콘솔 로직은 제외)
- 모든 원시 값과 문자열 포장
- 일급 컬렉션

## 기능 목록 및 commit 로그 요구사항

- 기능 구현 전 구현할 기능 목록 정리 추가
- 커밋 메시지 컨벤션 [Angular JS Commit Message Conventions](https://gist.github.com/stephenparish/9941e89d80e2bc58a153) 지키기

## 역할

- RandomNumberGenerator
  - 0부터 9까지의 숫자 중 하나의 숫자를 반환한다.
  - util 패키지
  - [ ] 항상 0이상 9이하의 숫자를 생성한다.

- Car
  - 자동차 이름, 위치정보를 가지는 자 
  - 일급 컬렉션
  - [ ] 자동차의 이름은 5자를 초과할 수 없다.
    - [ ] 자동차의 이름은 1자 이상 5자 이하이다.
  - [ ] 자동차를 이동 시킨다.
    - [ ] 위치정보를 업데이트한다.
  - [ ] 현재 자동차의 위치(실행결과)를 확인할 수있는 반환값이 있다.

- RacingGame
  - 자동차를 이동시키고 관리, 검사를 하는 자
  - [ ] 시도할 횟수만큼 실행 시킨다.
    - [ ] 실행 한번에 Random한 번호가 각 자동차마다 생성된다.
    - [ ] 번호는 4이상일 경우에만 자동차를 이동시킨다.
  - [ ] 우승자를 반환한다.
    - [ ] 같은 횟수를 가진 자동차는 모두 반환한다.
    
- 콘솔
  - 도메인에서 직접 입력을 받거나, 출력을 하면 안된다.
    - InputView
      - [ ] 자동차 이름 입력 받기
        - [ ] 자동차의 이름은 쉼표를 기준으로 받는다.
        - [ ] 자동차의 이름은 1글자 이상 5글자 이하이다.
      - [ ] 시도할 횟수 입력 받기
        - [ ] 시도할 횟수는 1번 이상 10번 이하이다.
    - OutputView
      - [ ] 자동차 이름 입력 받는 코멘트 출력
      - [ ] 시도할 횟수 입력 받는 코멘트 출력
      - [ ] 각 실행마다 자동차의 결과 출력
      - [ ] 우승자를 출력