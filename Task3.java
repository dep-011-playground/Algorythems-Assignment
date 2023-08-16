public class Task3 {
   
    public static void main(String[] args) throws Exception {
        int[] nums = {10, 20, 30, 40, 50};

        int[] reverse = new int[nums.length];
        int i =0;

        for( i=0;i<nums.length;i++){
        (reverse[nums.length -1 -i])= (nums[(i)]);
        }

        nums = reverse;
        System.out.println("");
          System.out.print("[");
        for (i=0;i<nums.length;i++){
      
        System.out.print(nums[i]+ ",");
        
        }System.out.println("\b]");
    }
}
