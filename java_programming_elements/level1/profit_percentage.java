package java_programming_elements.level1;

public class profit_percentage {
    public static void main(String[] args) {
        int costPrice = 129, sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double)costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                           "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}
