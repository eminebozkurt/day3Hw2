public class Main {

    public static void main(String[] args) {

        User user1 = new User(1,"xyz@gmail.com");
        User user2 = new User(2,"wxyz@gmail.com");

        Student student1 = new Student(3,"asdf@gmail.com","asd","asd","asd");

        Instructor instructor1 = new Instructor(4,"sds@gmail.com","asda","adsa","adas");

        UserManager userManager = new UserManager();
        userManager.add(new Student(1111,"asd@gmail.com","asd","Emine","aasd"));
        userManager.add(user1);
        userManager.add(user2);
        userManager.add(student1);
        userManager.add(instructor1);

        System.out.println("***************");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(user1);
        instructorManager.add(instructor1);
        instructorManager.register(instructor1);
        instructorManager.login(instructor1);
        instructorManager.logout(instructor1);

        System.out.println("*****************");

        StudentManager studentManager = new StudentManager();
        studentManager.add(new User(15,"dsns@gmail.com"));
        studentManager.add(new Student(17,"dmnds@gmail.com","dfews","dfsd","xvdsf"));
        studentManager.add(student1);
        studentManager.register(student1);
        studentManager.login(student1);
        studentManager.logout(student1);

        System.out.println("*****************");

        User[] users = new User[]{user1,user2,student1,instructor1};

        for (User user: users) {
            System.out.println("Id: " + user.getId() + ", email: " + user.getEmail() );
        }

        System.out.println("*****************");




    }
}
