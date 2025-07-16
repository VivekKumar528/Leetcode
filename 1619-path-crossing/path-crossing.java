class Solution {
       public boolean isPathCrossing(String path) {
        HashSet<String> visSet = new HashSet<>();
        int x = 0;
        int y = 0;
        visSet.add(x + "," + y);
        for(int i=0;i<path.length();i++){
            char ch = path.charAt(i);
            if( ch == 'E') x++;
            else if(ch == 'S') y--;
            else if(ch == 'W') x--;
            else y++;
            if(visSet.contains(x +"," + y)) return true;
            visSet.add(x + "," + y);

        }
        return false;
    }
}