class Solution {

    public String intToRoman(int num) {
        String roman[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int value[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String ans = "";
        for (int i = 0; i < 13; i++) {
            while (num >= value[i]) {
                num -= value[i];
                ans = ans + roman[i];
            }
        }
        return ans;
    }
}
