public class _Main {

    public static void main(String[] args) {
        Professor professor = new Professor();
        Student student = new Student();
        University university = new University();

        ToFound toFound  = new ToFound();
        ToPresent toPresent = new ToPresent();

        toFound.toFound(university);
        toPresent.toPresent(professor);
        toPresent.toPresent(student);
    }
}