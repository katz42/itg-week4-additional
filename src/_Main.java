public class _Main {

    public static void main(String[] args) {
        Professor professor = new Professor();
        Student student = new Student();
        University university = new University();

        ToPresent toPresent = new ToPresent();
        ToMajor toMajor = new ToMajor();
        ToLead toLead = new ToLead();

        toPresent.toPresent(university);
        toLead.toLead(professor);
        toPresent.toPresent(professor);
        toMajor.toMajor(student);
        toPresent.toPresent(student);
    }
}