import java.util.*;
public class Genetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();
        int sizeOfBank = scanner.nextInt();
        scanner.nextLine();
        String[] bank = new String[sizeOfBank];
        for (int i = 0; i < sizeOfBank; i++) {
            bank[i] = scanner.nextLine();
        }
        
       
        System.out.print(minMutation(start, end, bank)); // change it to Main.minMutation() if this does not work
            
        
    }
    public static int minMutation(String startGene, String endGene, String[] bank) {
        Map<String, Integer> map = new HashMap<>();
        Queue<Integer> iter = new LinkedList<>();
        Queue<String> q = new LinkedList<>();
        for (String s : bank) {
            map.put(s, 0);
        }
        q.offer(startGene);
        iter.offer(0);
        while (!q.isEmpty()) {
            String gene = q.poll();
            int count = iter.poll();
            if (endGene.equals(gene))
                return count;
            for (String b : bank) {
                if (mutates(gene, b) && map.get(b) == 0) {
                    q.offer(b);
                    iter.offer(count + 1);
                    map.put(b, 1);
                }
            }
        }

        return -1;
    }
    public static boolean mutates(String a, String b) {
        int c = 0;
        for (int i = 0; i < 8; i++) {
            if (a.charAt(i) != b.charAt(i))
                c++;
        }
        return c == 1;
    }
}