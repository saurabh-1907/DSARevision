import java.util.*;
class PrintAllSubsequence{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> a = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        solve(arr, a, 0, set, "");
        System.out.println(set.toString());
    }
    public static void solve(ArrayList<Integer> arr, ArrayList<Integer> a, int i, HashSet<String> set, String s){
        if(arr.size()  <= i){
            return;
        }
        set.add(s);
        String k = s;
        solve(arr, a, i + 1,set,  k);
         k = s +arr.get(i);
        solve(arr,  a, i + 1, set, k);
    }
}