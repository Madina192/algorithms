import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(intersectionOfTwoArrays(new int[]{1,2,2,1}, new int[]{2,2})));
        //System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
//        System.out.println(fizzBuzz(10));
        System.out.println(findSmallest());
    }

//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if(nums[i] + nums[j] == target) {
//                    return new int[] {i, j};
//                }
//            }
//        }
//        return new int[] {};
//    }

//    public static int[] intersectionOfTwoArrays(int[] nums1, int[] nums2) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if(nums1[i] == nums2[j]) {
//                    numbers.add(nums1[i]);
//                }
//            }
//        }
//        int[] arrayOfNumbers = new int[numbers.size()];
//        for (int k = 0; k < numbers.size(); k++) {
//            arrayOfNumbers[k] = numbers.get(k);
//        }
//        return arrayOfNumbers;
//    }
//
//    public static int[] intersection(int[] nums1, int[] nums2) {
//            Set<Integer> set1 = new HashSet<>();
//            for (int i : nums1) {
//                set1.add(i);
//            }
//            Set<Integer> set2 = new HashSet<>();
//            for (int i : nums2) {
//                set2.add(i);
//            }
//            //Removed Duplicates using Hashset
//            Set<Integer> Main_Set = new HashSet<>();
//            for (Integer var : set1) {
//                if (set2.contains(var)) {
//                    Main_Set.add(var);
//                }
//            }
//            int[] arr = new int[Main_Set.size()];
//            int j = 0;
//            for (Integer val : Main_Set) {
//                arr[j] = val.intValue();
//                j++;
//            }
//            return arr;
//        }
//    static List<String> fizzBuzz(int n) {
//        List<String> arrayList = new ArrayList();
//        for (Integer i = 1; i < n + 1; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                arrayList.add("FizzBuzz");
//            } else if(i % 3 == 0) {
//                arrayList.add("Fizz");
//            } else if(i % 5 == 0) {
//                arrayList.add("Buzz");
//            } else {
//                arrayList.add(String.valueOf(i));
//            }
//        }
//        return arrayList;
//    }
//    static List<Integer> selfDividingNumbers(int left, int right){ //0; 10
//        List<Integer> list = new ArrayList<>();
//        for (int i = left; i < right; i++) {
//            //code
//        }
//        return list;
//    }

    static int findSmallest() {
        int[] numbers = {3, 6, 2, 7, 8, 4, 1, 5};
        int smallest = numbers[0];
        int smallest_index = 0;

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < smallest) {
                smallest = numbers[i];
                smallest_index = i;
            }
        }
        return smallest_index;
    }


}