public class InstructorManager extends UserManager{

    public void add(Instructor instructor){
        System.out.println(instructor.getId()
                + " idli kullanici eklendi: Instructor: "
                + instructor.getEmail());
    }

    public void register(Instructor instructor){
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adli egitmen kayit oldu.");
    }

    public void login(Instructor instructor){
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adli egitmen " + instructor.getEmail() + " maili ile sisteme giris yapti.");
    }

    public void logout(Instructor instructor){
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adli egitmen " + instructor.getEmail() + " maili ile sistemden cikis yapti.");
    }


}
