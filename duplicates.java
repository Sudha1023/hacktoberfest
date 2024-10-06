import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums)
    {
        int n = nums.length;
      
        int[] arr = new int[n];
        List<Integer> list
            = new ArrayList<>();
        for (int i : nums) {
            if (++arr[i] > 1)
              
                list.add(i);
        }

        return list; 
    }
}

   

