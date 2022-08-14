package org.example.algorithms;

public class IsPalindromeSolution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            System.out.println("false");
            return false;
        }

        int revertedNumber = 0;

        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + (x % 10);
            x /= 10;
        }

        System.out.println("true");
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
