import java.util.Arrays;
import java.util.Collections;
public class Code_02 {
    public static int[] solution(int[] arr){
        // 배열 길이가 2이상 1000이하 이므로 int 타입
        // arr 중복 제거 => 앞부터 훑으면서 중복된 걸 삭제하는? 이런식으로 반복문 돌리면 시간복잡도 효율성이 떨어짐
        // for(int i=0; arr.length; i++){
        //     if () {
        //     }
        // }
        // // 내림차순 정렬
        // Arrays.sort(arr);
        // return arr;
        // 자바 매서드 이용하기
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new); // 중복 값 제거
        Arrays.sort(result, Collections.reverseOrder()); // 내림차순 정렬
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args){
        int[] org = {1,6,4,3,6};
        System.out.println(Arrays.toString(org));
        int[] result = solution(org);
        System.out.println(Arrays.toString(result));
    
    }
}