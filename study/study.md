### problem 1 

2022.10.26. 1800
리스트의 요소를 구하는 메소드로 컬렉션프레임워크로 주어지고 있기 때문에 size()를 사용해서 바로 알 수 있다. 

2022.10.26. 1900
리팩토링 해야 할 부분 : 제한사항으로 리턴 -1을 하도록 하는 if 절 기능을 어떻게 메소드로 뺄지 고민 

2022.10.26. 2200
작동은 되도록 하는 로직 완성
1. 최대값을 구할 때 리스트를 쓰지 않고 구할 수 없을까
2. 자리수를 나누고 각 숫자마다 반복문을 돌려서 덧셈과 곱셉의 최대값을 구하고
3. 그걸 또 리턴해와서 list를 만들어서 최대값을 구하는 것
뭔가 이래서는 안되는걸 알면서도 달리 방법을 모르겠다. 

어떻게 공부를 해야 이 코드를 뜯어고칠수 있을까 . . .
