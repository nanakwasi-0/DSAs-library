package TwoSumII_sortedArray;


    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            //create 2 pointers
            int start = 0;
            int end = numbers.length - 1;
            int [] results = new int[2];

            while (start < end ){
                int sum = numbers[start] + numbers[end];
                if(sum == target){
                    results[0] = start + 1;
                    results[1] = end + 1;
                    break;
                }
                else if (sum < target){
                    //shift the start pointer right
                    start++;
                }
                else if(sum > target){
                    //shift the end pointer to the left
                    end --;
                }
            }
            return results;
        }
    }
