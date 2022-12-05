class Student {
    int studentNumber;
    String studentName;
}

public class ArraysDemo2 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        nums[0] = 8;
        nums[1] = 12;
        nums[2] = 76;
        nums[3] = 54;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Creating array based on class
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        // or different way:
        Student s[] = { s1, s2, s3, s4 };
        System.out.println(s[0]); // Student@6b95977

    }
}
