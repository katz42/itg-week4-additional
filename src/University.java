public class University implements Present, Foundation {
    @Override
    public void present() {
        System.out.println("University presents a research by its professors and students.");
    }

    @Override
    public void foundation() {
        System.out.println("University was founded in 1755.");
    }
}