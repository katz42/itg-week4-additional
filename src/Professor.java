public class Professor implements Present, Lead {
    @Override
    public void present() {
        System.out.println("The professor presents the curriculum.");
    }
    public void lead(){
        System.out.println("A professor leads the research.");
    }
}
