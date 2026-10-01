class Solution {
    public boolean removeSenator(StringBuilder senate, char ch, int idx) {
        boolean checkRemovalLeftSide = false;
        while (true) {
            if (idx == 0)
                checkRemovalLeftSide = true;

            if (senate.charAt(idx) == ch) {
                senate = senate.deleteCharAt(idx); // shift
                break;
            }

            idx = (idx + 1) % senate.length();
        }
        // checkRemovalLeftSide = false;
        return checkRemovalLeftSide;
    }

    public String predictPartyVictory(String senate) {
        int RCount = 0;
        int DCount = 0;
        for (char ch : senate.toCharArray()) {
            if (ch == 'R')
                RCount++;
            else
                DCount++;
        }
        StringBuilder sb = new StringBuilder(senate);
        int idx = 0;
        while (RCount > 0 && DCount > 0) {
            if (sb.charAt(idx) == 'R') {
                boolean checkRemovalLeftSide = removeSenator(sb, 'D', (idx + 1) % sb.length());
                DCount--;
                if (checkRemovalLeftSide)
                    idx--;  
            } else {
                boolean checkRemovalLeftSide = removeSenator(sb, 'R', (idx + 1) % sb.length());
                RCount--;
                if (checkRemovalLeftSide)
                    idx--;
            }

            idx = (idx + 1) % sb.length();
        }

        return RCount == 0 ? "Dire" : "Radiant";
    }
}