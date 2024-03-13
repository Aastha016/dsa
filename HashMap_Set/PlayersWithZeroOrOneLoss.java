package HashMap_Set;

public class PlayersWithZeroOrOneLoss {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = matches.length;
        List<Integer> neverLost = new ArrayList<>();
        List<Integer> exactlyOne = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // int winner = matches[i][0];
            int loser = matches[i][1];

            hm.put(loser, hm.getOrDefault(loser, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            int winner = matches[i][0];
            int loser = matches[i][1];

            if (!hm.containsKey(winner)) {
                neverLost.add(winner);
                hm.put(winner, 2);
            }
            if (hm.containsKey(loser) && hm.get(loser) == 1) {
                exactlyOne.add(loser);
            }
        }
        Collections.sort(neverLost);
        Collections.sort(exactlyOne);

        return Arrays.asList(neverLost, exactlyOne);
    }
}
