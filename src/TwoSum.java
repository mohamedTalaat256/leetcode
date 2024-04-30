public class TwoSum {

    public static void main(String[] args) {


        int arr[] = [2,7,11,15];
        int target = 9;

        System.out.println(twoSum1(arr, target));
        System.out.println(twoSum1(arr, target));
    }



    /*
    * prut force
    * */
    public static int[] twoSum1(int[] nums, int target) {

        for(int i=0; i< nums.length ; i++){
            for (int j=i+1; j< nums.length; j++){
                if(nums[i]+ nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("asd");

    }


    /*
    * using hash table
    * */
    public static int[] twoSum2(int[] nums, int target) {

       HashMap map = new HashMap<Integer, Integer>();

       for(int i=0; i<nums.length ; i++ ){
           if(map.contains(nums[i], target-nums[i])){
               return new int[]{i, map.get(target-nums[i])}
           }else{
               map.put(nums[i], i)
           }
       }

        throw new IllegalArgumentException("asd");

    }
}