package ru.job4j.max;

public class Reduce {

    private int[] array;

    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int[] ans = new int[nums.length * 2];
        int a = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (a > 2) {
                    a = 0;
                }
                ans[a + j] = nums[a + j];
                a += a;
            }

        }

    }
}
