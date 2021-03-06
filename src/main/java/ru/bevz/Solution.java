package ru.bevz;

public class Solution {

    public boolean isStrobogrammatic(String num) {
        String result = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            char curDig = num.charAt(i);
            // возможно, если убрать условие ниже, то можно будет сэкономить ресурсы
            if ("01896".indexOf(Character.toString(curDig)) == -1) {
                return false;
            }
            if (curDig == '6') {
                result += "9";
            } else if (curDig == '9') {
                result += "6";
            } else {
                result += curDig;
            }
        }
        return result.equals(num);
    }

    public boolean isPowerOfFour(double n) {
        return Math.log(n) / Math.log(4) % 1 == 0;
    }
}
