import java.io.*;
import java.util.*;
public class solution {
    //1.1
    public static void main(String[] args) throws Exception {
        String st;
        Integer[] boxes = new Integer[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Integer[] counter = new Integer[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        List<Integer> intboxes = new ArrayList<>(Arrays.asList(boxes));
        List<Integer> intcounter = new ArrayList<>(Arrays.asList(counter));
        int a = 0;
        int initialindex = 0;
        int test [];
        List<Integer> list = new ArrayList<Integer>();
        File file = new File("/Users/johanson/Desktop/NJIT/FIFTH SEM/cs 301/hw3a.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((st = br.readLine()) != null) {
            int x = Integer.parseInt(st);
            list.add(x);
        }
        int fj = list.size()/40;
        for(int i = 0; i < list.size(); i++) {
            if (intboxes.contains(list.get(i))) {
                int x = intboxes.indexOf(list.get(i));
                int y = intcounter.get(x);
                int z = y + 1;
                intcounter.set(x,z);
            } else if (intboxes.contains(0)) {
                int x = intboxes.indexOf(0);
                int y = intcounter.get(x);
                int z = y + 1 ;
                intboxes.set(x,list.get(i));
                intcounter.set(x,z);
            } else {
                for (int j = 0; j < intcounter.size(); j++) {
                    int y = intcounter.get(j);
                    int z = y - 1;
                    intcounter.set(j,z);
                    int yy = intcounter.get(j);
                    if (yy == 0) {
                        intboxes.set(j,0);
                    }
                }
            }
        }
        System.out.println("Boxes:");
        for (Integer number : intboxes) {
            if (number != 0) {
                System.out.print(number+" ");
            }
        }
    }
}
