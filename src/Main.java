//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //1
        int[] nums = new int[3];
        double[] doubles = {1.57, 7.654, 9.9};
        boolean[] bools = {true, false, true};

        //2

        for (int i = 0;
             i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i < doubles.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < bools.length; i++) {
            System.out.print(bools[i]);
            if (i < bools.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        //3
        for (int i = nums.length - 1;
             i >= 0; i--) {
            System.out.print(nums[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = doubles.length - 1;
             i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = bools.length - 1;
             i >= 0; i--) {
            System.out.print(bools[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }

        //4

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i]++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(",");
            }
        }
    }
}
