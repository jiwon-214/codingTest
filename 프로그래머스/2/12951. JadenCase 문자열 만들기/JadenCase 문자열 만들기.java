class Solution {
    public String solution(String s) {
        String answer = "";

        String[] array = s.split(" ", -1);

        for (int i = 0; i < array.length; i++) {
            if(!array[i].isEmpty()) {
                array[i] = array[i].substring(0, 1).toUpperCase().concat(array[i].substring(1).toLowerCase());
            }
            answer += array[i];
            if (i != array.length - 1) {
                answer += " ";
            }
        }

        return answer;
    }
}