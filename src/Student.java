public class Student implements Present{
    @Override
    public void present() {
        major();
        System.out.println("The student presents his final project.");
    }

    private void major() {
        System.out.println("A student majors in linguistics.");
    }
}
