import java.util.*;
class PrintAllStrings{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> a = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        solve(arr, a, set);
        System.out.println(set.toString());
    }
    public static void solve(ArrayList<Integer> arr, ArrayList<Integer> a, HashSet<String> set){
        if(arr.size()  == 0){
            return;
        }
        set.add(a.toString());
        for(int i = 0; i < arr.size(); i++){
            ArrayList<Integer> brr = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            brr.addAll(arr);
            b.addAll(a);
            int k = brr.get(i);
            brr.remove(i);
            b.add(k);
            solve(brr, b, set);
        }
        
    }
}