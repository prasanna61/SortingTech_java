public class BubbleSort {
    public int[] Sorting(int[] arr) {
        int temp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 36, 33, 4, 34};
        BubbleSort obj = new BubbleSort();
        int[] res = obj.Sorting(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
