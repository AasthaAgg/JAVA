import java.io.*;
import java.util.*;
class quadraticEquationRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}


class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        
        ArrayList<Integer> roots = new ArrayList<Integer>();
        
        int determinant = (b*b) - (4*a*c);
        
        if(determinant>0){
            roots.add((int)Math.floor((-b + Math.sqrt(determinant))/(2*a)));
            roots.add((int)Math.floor((-b - Math.sqrt(determinant))/(2*a)));
        }
        else if(determinant==0){
            roots.add(-b/(2*a));
            roots.add(-b/(2*a));
        }
        else{
            roots.add(-1);
        }
        Collections.sort(roots,Collections.reverseOrder());
        return roots;
    }
}