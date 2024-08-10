public class ProgrammingCourse extends Course implements Online {
    public ProgrammingCourse() {
    }

    public ProgrammingCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }
    @Override
    public void conductClass() {
        System.out.println("Провидение урока программирование ");
    }
    @Override
    public void provideOnlineAccess() {
        System.out.println("Предоставление отлайн - доступа к курсу программирование ");
    }


}
