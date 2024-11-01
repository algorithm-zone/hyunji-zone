import java.util.Arrays;

public class Code_01 {
    public static int[] solution(int[] arr){
        // 오름차순 배열
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String args[]){
        int[] org = {4,2,3,1,2,4,5};
        int[] sorted = solution(org);
        System.out.println(Arrays.toString(sorted)); // 원본 배열 org를 변경
        // 원본 배열 org를 유지하고 싶다면 clone()을 통해 새로운 배열을 생성할 것
    }
    
}