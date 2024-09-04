public class LC_75 {
    public static int[] better_sortColors(int[] nums) {
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        // Pehle loop mein har color ka count karte hain
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                cnt1++; // Agar color 0 hai toh cnt1 badhao
            if (nums[i] == 1)
                cnt2++; // Agar color 1 hai toh cnt2 badhao
            if (nums[i] == 2)
                cnt3++; // Agar color 2 hai toh cnt3 badhao
        }
        // Ab nums array mein 0s ko place karte hain
        for (int i = 0; i < cnt1; i++) {
            nums[i] = 0;
        }
        // Ab nums array mein 1s ko place karte hain
        for (int i = cnt1; i < cnt1 + cnt2; i++) {
            nums[i] = 1;
        }
        // Ab nums array mein 2s ko place karte hain
        for (int i = cnt1 + cnt2; i < cnt1 + cnt2 + cnt3; i++) {
            nums[i] = 2;
        }
        return nums; // Sorted array wapas return karte hain
    }

    public static int[] optimal_sort_Colors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;

        // Loop chalayenge jab tak mid high se chhota ya barabar hai
        while (mid <= high){
            // Agar mid wale index par 0 hai, toh low aur mid ko swap karo
            if (nums[mid] == 0) {
                swap(nums, low, mid); // Swap function ko call karte hain
                low++; // low aur mid dono ko increment karte hain
                mid++;
            }
            // Agar mid wale index par 1 hai, toh sirf mid ko increment karo
            else if (nums[mid] == 1) {
                mid++;
            }
            // Agar mid wale index par 2 hai, toh mid aur high ko swap karo
            else if (nums[mid] == 2) {
                swap(nums, mid, high); // Swap function ko call karte hain
                high--; // high ko decrement karte hain
            }
        }
        return nums; // Sorted array wapas return karte hain
    }

    // Swap function jo do elements ko swap karta hai
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a]; // temp mein pehle element ko store karte hain
        nums[a] = nums[b]; // phir doosre element ko pehle wale mein daalte hain
        nums[b] = temp; // aur temp wale value ko doosre element mein daalte hain
    }

}
