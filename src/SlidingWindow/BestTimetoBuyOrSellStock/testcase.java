package SlidingWindow.BestTimetoBuyOrSellStock;

public class testcase {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = { 4, 5, 6, 8, 7, 9, 31, 1};
        System.out.println(solution.maxProfit(prices));
    }
}
