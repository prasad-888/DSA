// You are given an array prices where prices[i] is the price of a given stock on
// the i
// th day.
// Return the maximum profit you can achieve from this transaction. If you cannot
// achieve any profit, return 0.

import java.util.*;

public class q3{


    public static int max_profit(int prices[])
    {
        int buy = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(buy < prices[i]){
                profit = Math.max(prices[i] - buy, profit);
            }
            else{
                buy = prices[i];
            }
        }

        return profit;
            
    }
    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(max_profit(prices));
    }
}