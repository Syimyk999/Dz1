public class DesignCourse extends Course{
    public DesignCourse() {
    }

    public DesignCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }
    @Override
    public void conductClass() {
        System.out.println("Провидение урока дизайна ");
    }
}
