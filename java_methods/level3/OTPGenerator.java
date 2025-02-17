package java_methods.level3;

import java.util.*;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otpArray = new int[10];

        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        System.out.println("Are all OTPs unique? " + (areOTPsUnique(otpArray) ? "Yes" : "No"));
    }

    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000);
    }

    public static boolean areOTPsUnique(int[] otpArray) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otpArray) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }
}
