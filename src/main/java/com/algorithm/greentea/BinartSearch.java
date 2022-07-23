package com.algorithm.greentea;
/*
给定一个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums 中的 target，如果目标值存在返回下标，否则返回 -1

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/binary-search
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class BinartSearch {
    public int getIndex(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int mid = high+low/2;
        if (low==high&&nums[mid]==target){
            return 0;
        }
        if (target==nums[mid]){
            return mid;
        }
        while (low<high){
            while (nums[mid]<target){
                mid++;
                low = mid;
                if (nums[low]==target){
                    return low;
                }
                mid=high+low/2;
            }
            while (nums[mid]>=target){
                high=mid;
                high--;
                if (nums[high]==target){
                    return high;
                }
                mid = high+low/2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinartSearch binartSearch = new BinartSearch();
        int[] arr = {1,2,3,4,5};
        int index = binartSearch.getIndex(arr, 3);
        System.out.println(index);
    }
}
