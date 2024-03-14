package HashMap_Set;

public class UniqueNumberOfOccururences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        List<Integer> valueList = new ArrayList<>();
        for (int i : hm.values()) {
            if (valueList.contains(i))
                return false;
            else
                valueList.add(i);
        }
        return true;
    }
}
