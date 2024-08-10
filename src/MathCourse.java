public class MathCourse extends Course implements Onsite{
    public MathCourse() {
    }

    public MathCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }
    @Override
    public void conductClass() {
        System.out.println("Провидение урока математики ");
    }
    @Override
    public void arrangeClassroom() {
        System.out.println("Организация класса для урока математики ");
    }
}
