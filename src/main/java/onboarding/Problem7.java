package onboarding;

import java.util.*;
import java.util.stream.Collectors;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {

        LinkedHashMap<String, Integer> countingMap = new LinkedHashMap<String, Integer>();
        List<String> notToCountName = new ArrayList<>();


        /**
         * friends 점수 카운팅 기능
         */
        for (int i = 0; i < friends.size(); i++) {
            List friendsList = friends.get(i);

            for (int j = 0; j < 2; j++) {
                String friendName = (String) friendsList.get(j);
                String pairName = getPairName(friendsList, j);

                for (int k = 0; k < friends.size(); k++) {
                    if (k == i) {
                    } else {
                        List otherFriendsList = friends.get(k);
                        if (otherFriendsList.contains(friendName) == true && otherFriendsList.contains(user) == true) {
                            notToCountName.add(friendName);
                            break;
                        } else if (pairName == user) {
                            notToCountName.add(pairName);
                            break;
                        } else if (otherFriendsList.contains(pairName) == true && otherFriendsList.contains(user) == true) {
                            countingMap.merge(friendName, 10, (integer, integer2) -> integer + integer2);
                        }
                    }
                }
            }
        }


        notToCountName = removeDuplication(notToCountName);


        /**
         * visitors 점수 카운팅 기능
         */

        for (int i = 0; i < visitors.size(); i++) {
            String visitorsName = visitors.get(i);
            if (notToCountName.contains(visitorsName)) {
                System.out.println("pass");
            } else {
                countingMap.merge(visitorsName, 1, (integer, integer2) -> integer + integer2);
            }
        }

        List<String> answer = Collections.emptyList();
        return answer;
    }


    private static String getPairName(List friendsList, int j) {

        if (j == 0) {
            j = 1;
        } else if (j == 1) {
            j = 0;
        }
        String pairName = (String) friendsList.get(j);

        return pairName;
    }

    private static List<String> removeDuplication(List<String> selectedList) {
        List<String> answer = new ArrayList<String>();
        answer = selectedList.stream().distinct().collect(Collectors.toList());
        return answer;
    }
}