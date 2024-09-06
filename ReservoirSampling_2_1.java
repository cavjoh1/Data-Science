import java.io.*;
import java.util.*;
public class GFG {
    //2.1
    public static void main(String[] args) throws Exception {
        String st;
        List<Integer> elist = new ArrayList<Integer>();
        int k = 70;
        List<Integer> list = new ArrayList<Integer>();
        File file = new File("/Users/johanson/Desktop/NJIT/FIFTH SEM/cs 301/hw3b.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        while ((st = br.readLine()) != null) {
            int x = Integer.parseInt(st);
            list.add(x);
        }
        
        for(int i = 0; i < k; i++) {
            Random number = new Random();
            int x = number.nextInt(list.size());
            int y = list.get(x);
            elist.add(y);
            list.remove(x);
        }
        
        System.out.print(elist);
    }
}
