import java.util.*;


public class Array_of_given_order{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums=new int[n];
        int[] index=new int[n];
        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }
        for(int i=0; i<n; i++){
            index[i] = in.nextInt();
        }
        // ArrayList<Integer> ans=new ArrayList<>();
        int ans[] = new int[n];
        ans = createTargetArray(nums,index);
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }

    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]= a.get(i);
        }
        return nums;
    
    }
}