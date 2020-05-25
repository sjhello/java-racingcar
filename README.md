# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

#Step3
##기능 요구사항
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다
* 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9사이에서 random값을 구한 후 random 값이 4이상일 경우이다.
* 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

##구현 기능 목록 정리
* 게임 판
    * 게임 진행
        * 입력 뷰 실행
        * 게임 셋팅 (입력 뷰에서 받은 게임 횟수와 차대수 셋팅)
        * 게임 진행
        * 출력 뷰 실행
* 자동차
    * 주사위 굴리기
    * 이동
        * 전진
        * 멈춤
* 주사위
    * 굴리기
* 뷰
    * 시작 뷰
        * 출력 메세지 지정
        * 메세지 출력
        * 입력 값 받기
    * 결과 뷰
        * 출력 메세지 지정
        * 메세지 출력
        * 자동차 위치 출력