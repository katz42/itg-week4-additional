public class Student implements Present, Major{
    @Override
    public void present() {
        System.out.println("The student presents his final project.");
    }

    public void major() {
        System.out.println("A student majors in linguistics.");
    }
}
