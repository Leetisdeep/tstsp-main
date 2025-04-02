import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int [] nums = new int [3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        double [] doubles = {1.57, 7.654, 9.986};

        int [] array = {1,1,2,3,5,8};

        System.out.println(Arrays.toString(nums).replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(doubles).replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(array).replace("[", "").replace("]", ""));
        System.out.println();

        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }

        for (int i = 0; i < doubles.length/2; i++) {
            double temp = doubles[i];
            doubles[i] = doubles[doubles.length - i - 1];
            doubles[doubles.length - i - 1] = temp;
        }

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(nums).replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(doubles).replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(array).replace("[", "").replace("]", ""));
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i] += 1;
            }
        }
        System.out.println(Arrays.toString(nums).replace("[", "").replace("]", ""));
    }
}