import java.util.Arrays;

public class Ques {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 0, 1, 0, 1 };
        Arrays.sort(nums);
        int j = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[j++] = nums[i];

            }
        }

            nums[j++]=nums[nums.length-1];

            

        
        for (int i = 0; i < j; i++) {
            System.out.print(nums[i]+" ");//01
        }
    }
}
// set approach.
import java.util.HashSet;

import java.util.Set;

public class Ques {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 0, 1, 0, 1 };
        
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            set.add(nums[i]);
        }
        
        set.forEach(e-> System.out.print(e));
        
    }
}

// using hashmap.

Map<Integer, Integer> map = new HashMap<>();
for(int i=0;i<nums.length;i++){
    if(map.contains(nums[i]){
        map.put(nums[i],map.get(nums[i]+1);
     }
    else
        map.put(nums[i],1);
    }
    map.forEach((k,v)->sout(k+""));
                
