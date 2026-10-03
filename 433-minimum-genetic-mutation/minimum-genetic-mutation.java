class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> vis = new HashSet<>();
        HashSet<String> bankset = new HashSet<>();
        for (String s : bank) {
            bankset.add(s);
        }

        Queue<String> q = new LinkedList<>();

        q.add(startGene);
        vis.add(startGene);

        int level = 0;
        char[] chars = {'A', 'C', 'G', 'T'};
        StringBuilder end = new StringBuilder(endGene);
        while (!q.isEmpty()) {
            int n = q.size();

            while (n-- > 0) {
                StringBuilder curr = new StringBuilder(q.remove());
                if(curr.toString().equals(end.toString()))
                    return level;

                for (char ch : chars) {
                    for (int i = 0; i < curr.length(); i++) {
                        StringBuilder neighbour = new StringBuilder(curr);
                        neighbour.setCharAt(i, ch);
                        if (!vis.contains(neighbour.toString()) && bankset.contains(neighbour.toString())) {
                            vis.add(neighbour.toString());
                            q.add(neighbour.toString());
                        }

                    }
                }

            }
            level++;
        }
        return -1;
    }
}