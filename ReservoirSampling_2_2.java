import java.io.*;
import java.util.*;
public class GFGG {
    //2.2
    public static void main(String[] args) throws Exception {
        String st;
        Integer[] elist = new Integer[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        List<Integer> intelist = new ArrayList<>(Arrays.asList(elist));
        List<Integer> newlist = new ArrayList<>(Arrays.asList());
        int k = intelist.size();
        List<Integer> list = new ArrayList<Integer>();
        int n = list.size();
        File file = new File("/Users/johanson/Desktop/NJIT/FIFTH SEM/cs 301/hw3b.txt");
        int total = 0;
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        while ((st = br.readLine()) != null) {
            int x = Integer.parseInt(st);
            list.add(x);
        }
        
        for(int i = 0; i < k; i++) {
            int j = list.get(i);
            intelist.set(i,j);
            Random number = new Random();
            for (; i < list.size(); i++) {
                int r = number.nextInt(i+1);
                if (r < k) {
                    int jj = list.get(i);
                    intelist.set(r,jj);
                }
            }
        }
        
        System.out.println(intelist);
    }
}
