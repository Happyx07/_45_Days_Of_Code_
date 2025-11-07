package _38_Day;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        for (char digit : num.toCharArray()) {
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > digit) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(digit);
        }
        // If k > 0, remove from the end
        sb.setLength(sb.length() - k);

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
