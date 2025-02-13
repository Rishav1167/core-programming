package java_programming_elements.level1;

public class university_fee {
    public static void main(String[] args) {
        double fee = 125000, discountPercent = 10;
        double discount = (fee * discountPercent) / 100;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
    }
}
