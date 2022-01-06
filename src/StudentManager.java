public class StudentManager extends UserManager{
    public void add(Student student){
        System.out.println(student.getId()
                + " idli kullanici eklendi: Student: "
                + student.getEmail());
    }

    public void register(Student student){
        System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli ogrenci kayit oldu.");
    }

    public void login(Student student){
        System.out.println(student.getFirstName() + " " + student.getLastName() + " adli ogrenci " + student.getEmail() + " maili ile sisteme giris yapti.");
    }

    public void logout(Student student){
        System.out.println(student.getFirstName() + " " + student.getLastName() + " adli ogrenci " + student.getEmail() + " maili ile sistemden cikis yapti.");
    }





}
