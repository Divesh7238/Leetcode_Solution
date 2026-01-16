class Solution {
    public String maskPII(String s) {
        if (s.contains("@")) {
            s = s.toLowerCase();
            int at = s.indexOf('@');
            return s.charAt(0) + "*****" + s.charAt(at - 1) + s.substring(at);
        } else {
            String digits = s.replaceAll("\\D", "");
            String local = "***-***-" + digits.substring(digits.length() - 4);

            int countryLen = digits.length() - 10;
            if (countryLen == 0) return local;

            return "+" + "*".repeat(countryLen) + "-" + local;
        }
    }
}
