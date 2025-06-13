// Question 3
package Problem_12_06_25;

class Profit_loss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        float profit = sellingPrice - costPrice;
        float profitPercentage = (profit/costPrice) * 100;

        System.out.println(
            "The Cost Price is INR " + costPrice + " and the Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%"
        );
    }
}
