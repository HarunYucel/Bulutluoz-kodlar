package Ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class reverse_integer {
    public static void main(String[] args)
    {
        /*
        You are given an array nums consisting of positive integers.

You have to take each integer in the array, reverse its digits, and add it to the end of the array. You should apply this operation to the original integers in nums.

Return the number of distinct integers in the final array.
10 01     100 001


Example 1:

Input: nums = [1,13,130,12,1]
Output: 6
Explanation: After including the reverse of each number, the resulting array is [1,13,10,,3112,1,31,1,21,13].
The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
         */

        int[] nums = {1,13,130,12,1,1004,3456};

        List<Integer> a_list=new ArrayList<>();

        for (int i = 0; i <nums.length ; i++)
        {
            a_list.add(nums[i]);

        }

        System.out.println(a_list);

        for (int i = 0; i < nums.length; i++)
        {
            int last_digit=0;

            int sayı=nums[i];

            while (sayı!=0)
            {
                last_digit=last_digit*10;
                last_digit=last_digit+sayı%10;
                sayı/=10;
            }
            a_list.add(last_digit);
        }

        System.out.println(a_list);



    List<Integer> A_distict=new ArrayList<>();

    int count=0;

        for (int i = 0; i <a_list.size() ; i++)
        {
            if (!A_distict.contains(a_list.get(i)))
            {
                A_distict.add(a_list.get(i));
                count++;
            }

        }

        System.out.println("Listede "+ count +" adet farklı tamsayı vardır");



    }
}
