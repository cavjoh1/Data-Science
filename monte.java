import java.util.*;
public class monte
{
   public static void main (String []args)
   {

      Random random = new Random();
      //length of the array to see if there is duplicates
      for (int N = 1; N <= 100; N++)
      {
      
      
      //how many time to run program
      int M = 1000;
      double htp = 0;
      int [] arr = new int [M];
      // repeats for M times
      for (int k=0;k< M;k++)
      {
         
         
     
         int [] randomarray = new int [N];
         for (int i = 0; i< randomarray.length; i++)
         {
            int x = random.nextInt(365)+1;
            randomarray[i] = x;
         }
         //prints array
       /*  for (int boo : randomarray)
         {System.out.println(boo);} 
        */
        
          for (int i = 0; i < N-1; i++)
           {
           int u = 0;
               for (int j = i + 1; j < N; j++)
               {
                 
                   if (randomarray[i] == randomarray[j])
                     {
                    
                     htp = htp + 1.0;
                     u = u + 1;
                    
                     break;
                    
                    
                     }
                  else if (randomarray[i] != randomarray[j])
                     {
                        u = 0;
                     }
                    
                 
        
               }
               if(u == 0)
                     {
                     arr[k] = u;
                    
                    
                      }
               if(u == 1)
                     {
                     arr[k] = u;
                    
                     break;
                      }
                 
           }
          
      }
      double fin = htp / M  ;
     
     
    
    //  System.out.println("pn (M'/M) two of the same values in the group: ");
   //   System.out.println(htp);
    
     // System.out.println("---");
     // System.out.println(M);
     // System.out.println("=");
     System.out.println(N);
     System.out.print(":");
      System.out.println(fin);
      }

/*System.out.println("1 is there is a duplicate; 0 is no duplicate");
     for (int boo : arr)
         {System.out.println( boo);}
  */
   }
}
