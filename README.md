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

## 예시

```
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

pobi : -----
crong : ----
honux : -----

pobi, honux가 최종 우승했습니다.
```

## 구현

- CarDTO
    - 객체지향은 행동이 상태를 결정해야한다.
    - 자동차에 대한 자료구조 DTO

- Car
    - 상태는 CarDTO의 자료구조에 기반한다.
    - [x] 유효성 검사
        - [x] 각 자동차의 이름은 5자를 초과할 수 없다.
        - [x] 자동차의 이름은 1자 이상이다.
    - [x] 자동차가 이동한다.
        - [x] OFFSET 만큼 이동한다. (OFFSET = 1)


- RandomNumberGenerator
    - [x] 0에서 9까지의 랜덤한 정수를 반환한다.

- RacingGame
    - 상태는 (현재유저가플레이하는여러개의)Car를 가지고 있다.
    - [x] 실행한다.
        - [x] 각 Car 마다 이동을 시도한다.
        - [x] 랜덤한 수 중에 4이상일때만 움직인다.
- Application
    - makeRacingGame
    - racingGameStart
    - racingGameResult

- ConsoleView
    - 경주할 자동차의 이름을 입력받는다.
        - OutputView
            - [x] 경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
        - InputView
            - [x] 혼자서는 경주를 할 수 없다.
    - 시도할 횟수를 입력받는다.
        - OutputView
            - [x] 시도할 회수는 몇회인가요?
        - InputView
            - [x] 시도할 횟수는 1회 이상이다.
    - 실행결과를 출력한다.
        - OutputView
            - [x] 각 실행에 그에 따른 실행 결과를 보여준다.
    - 우승자를 보여준다.
        - OutputView
            - [x] xxx, xxx가 최종 우승했습니다.
                - [x] 우승자는 한명 이상일 수 있다.
