import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList<Number> list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");

        for (int i=0; i<5; i++) {
            list.add(input.nextInt());
        }
        for (int i=0; i<5; i++) {
            list.add(input.nextDouble());
        }

        sort(list);

        for (int i=0; i<10; i++) {
            System.out.print(list.get(i) + " ");
        }

        input.close();
    }

    public static void sort(ArrayList<Number> list) {
        Number[] nums = list.toArray(new Number[list.size()]);

        for (int i=1; i < 10; i++) {
            for (int j=0; j < 10-i; j++) {
                if (nums[j].doubleValue() > nums[j + 1].doubleValue()) {
                    Number temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        list.clear();
        for (int i=0; i < 10; i++) {
            list.add(nums[i]);
        }
    }
}
