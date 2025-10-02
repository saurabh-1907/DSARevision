import java.util.*;
class PrintAllPermuatations{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> a = new ArrayList<>();
        solve(arr, a);
    }
    public static void solve(ArrayList<Integer> arr, ArrayList<Integer> a){
        if(arr.size()  == 0){
            System.out.println(a.toString());
            return;
        }
        for(int i = 0; i < arr.size(); i++){
            ArrayList<Integer> brr = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            brr.addAll(arr);
            b.addAll(a);
            int k = brr.get(i);
            brr.remove(i);
            b.add(k);
            solve(brr, b);
        }
        
    }
}