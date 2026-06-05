import java.util.ArrayList;
import java.util.List;

class Solution {
    static int result = 0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        // backtracking(new ArrayList<>(), numbers, target);
        answer += back(0, 0, numbers, target);
        return answer;
    }
    
    public int back(int index, int currentSum, int[] numbers, int target) {
        if (index == numbers.length) {
            return currentSum == target ? 1 : 0;
        }
        return back(index + 1, currentSum + numbers[index], numbers, target)
             + back(index + 1, currentSum - numbers[index], numbers, target);
    }

    public void backtracking(List<Integer> numbers, int[] nums, int target) {
        for (int i = numbers.size(); i < nums.length; i++) {
            numbers.add(nums[i]);
            backtracking(new ArrayList<>(numbers), nums, target);
            numbers.removeLast();
            numbers.add(nums[i] * -1);
        }
        if (numbers.size() == nums.length) {
            if (numbers.stream().mapToInt(Integer::valueOf).sum() == target) {
                result++;
            }
        }
    }
}