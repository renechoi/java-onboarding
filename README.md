# 미션 - 온보딩
---
## ⚒ 구현 기능 목록 
- 기능 구현 목록 detail은 개별 problem 구현시 업데이트 예정

### Problem 1
+ 제한 사항 만족 테스트 
    - 2조건 만족 확인 : 페이지 연속 여부 
+ 포비, 크롱의 최대값 확인
  - 자리수 확인 
  - 덧셈과 곱셈 
  - 각 숫자별 최대값 리턴 
+ 최대값을 비교하여 정답 리턴

<br>

### Problem 2
+ 중복 문자 판별
    - Regex 세팅 
    - patternMatcher 설정 
+ 중목 regex 패턴 매칭시 삭제
+ 최종 결과물을 출력할 때까지 반복

<br>

### Problem 3
+ 3,6,9 숫자를 스트링으로 변환 
+ 스트링에서 3,6,9 등장시 개수를 반환해주는 메소드
+ 반복문을 이용한 메소드간의 합계 

<br>

### Problem 4
+ 아스키 숫자 찾기 
+ 아스키 숫자에 대응되는 문자 변환하기
  - 대소문자 별로 대응 일치  
  - 빈칸 및 다른 문자 동일하게 처리 
+ 반복문을 통해 해독 문자 리턴 

<br>

### Problem 5 
+ 가장 큰 지폐를 계산하기 
+ 지폐 변환하기 (남는 돈 계산)

<br>

### Problem 6
+ 닉네임 비교 기능 
+ 이메일 추출 기능 

<br>

### Problem 7 
+ 친구 관계 파악
  - 유저와의 관계 파악 => 점수 부여 제외
  - 유저의 친구와의 관계 파악 => 10점 부여
+ 방문 관계 파악 
  - 유저와 친구인 경우 => 점수 부여 제외 
  - 방문 점수 부여 => 1점 부여 
+ 리턴 조건 설정
  - 점수 내림차순 정렬  
  - 5명 제한 
  - 동점시 이름순 정렬 

---

## 🔍 진행 방식

- 미션은 **기능 요구 사항, 프로그래밍 요구 사항, 과제 진행 요구 사항** 세 가지로 구성되어 있다.
- 세 개의 요구 사항을 만족하기 위해 노력한다. 특히 기능을 구현하기 전에 기능 목록을 만들고, 기능 단위로 커밋 하는 방식으로 진행한다.
- 기능 요구 사항에 기재되지 않은 내용은 스스로 판단하여 구현한다.

## 📮 미션 제출 방법

- 미션 구현을 완료한 후 GitHub을 통해 제출해야 한다.
    - GitHub을 활용한 제출 방법은 [프리코스 과제 제출](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 문서를 참고해
      제출한다.
- GitHub에 미션을 제출한 후 [우아한테크코스 지원](https://apply.techcourse.co.kr) 사이트에 접속하여 프리코스 과제를 제출한다.
    - 자세한 방법은 [제출 가이드](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse#제출-가이드) 참고
    - **Pull Request만 보내고 지원 플랫폼에서 과제를 제출하지 않으면 최종 제출하지 않은 것으로 처리되니 주의한다.**

## 🚨 과제 제출 전 체크 리스트 - 0점 방지

- 기능 구현을 모두 정상적으로 했더라도 **요구 사항에 명시된 출력값 형식을 지키지 않을 경우 0점으로 처리**한다.
- 기능 구현을 완료한 뒤 아래 가이드에 따라 테스트를 실행했을 때 모든 테스트가 성공하는지 확인한다.
- **테스트가 실패할 경우 0점으로 처리**되므로, 반드시 확인 후 제출한다.

### 테스트 실행 가이드

- 터미널에서 `java -version`을 실행하여 Java 버전이 11인지 확인한다. 또는 Eclipse 또는 IntelliJ IDEA와 같은 IDE에서 Java 11로 실행되는지 확인한다.
- 터미널에서 Mac 또는 Linux 사용자의 경우 `./gradlew clean test` 명령을 실행하고,   
  Windows 사용자의 경우  `gradlew.bat clean test` 명령을 실행할 때 모든 테스트가 아래와 같이 통과하는지 확인한다.

```
BUILD SUCCESSFUL in 0s
```

---

## 🚀 기능 요구 사항
아래의 7가지 기능 요구 사항을 모두 해결해야 한다.

1. [문제 1](./docs/PROBLEM1.md)
2. [문제 2](./docs/PROBLEM2.md)
3. [문제 3](./docs/PROBLEM3.md)
4. [문제 4](./docs/PROBLEM4.md)
5. [문제 5](./docs/PROBLEM5.md)
6. [문제 6](./docs/PROBLEM6.md)
7. [문제 7](./docs/PROBLEM7.md)

---

## 🎯 프로그래밍 요구 사항

- JDK 11 버전에서 실행 가능해야 한다. **JDK 11에서 정상적으로 동작하지 않을 경우 0점 처리한다.**
- `build.gradle`을 변경할 수 없고, 외부 라이브러리를 사용하지 않는다.
- 프로그램 종료 시 `System.exit()`를 호출하지 않는다.
- 프로그램 구현이 완료되면 `ApplicationTest`의 모든 테스트가 성공해야 한다. **테스트가 실패할 경우 0점 처리한다.**
- 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 이름을 수정하거나 이동하지 않는다.

---

## ✏️ 과제 진행 요구 사항

- 미션은 [java-onboarding](https://github.com/woowacourse-precourse/java-onboarding) 저장소를 Fork & Clone해 시작한다.
- 과제 진행 및 제출 방법은 [프리코스 과제 제출](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 문서를 참고한다.
