Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.Example 1:Input:nums = [1, 2, 3, 1]Output:   true Example 2:Input:nums = [1, 2, 3, 4]Output:   false Example 3:Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]Output:   true Constraints:•1 <= nums .  lengtth <= 105•-109 <= nums [ i ] <= 109
  
  
  OUTPUT:

public class Distinct {
    public static boolean Dis(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7, 7, 7 };
        boolean a = Dis(arr);
        if (a == true) {
            System.out.println("Same hai");
        } else {
            System.out.println("Nhi");
        }

    }
}
  
