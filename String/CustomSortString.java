package String;

public class CustomSortString {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            if (hm.containsKey(order.charAt(i))
                    && hm.get(order.charAt(i)) >= 1) {
                int count = hm.get(order.charAt(i));
                while (count >= 1) {
                    sb.append(order.charAt(i));
                    hm.put(order.charAt(i), hm.get(order.charAt(i)) - 1);
                    count--;
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            int count = entry.getValue();
            while (count >= 1) {
                sb.append(entry.getKey());
                //hm.put(order.charAt(i), hm.get(order.charAt(i)) - 1);
                count--;
            }

        }

        return sb.toString();
    }
}
