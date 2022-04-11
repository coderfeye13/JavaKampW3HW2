public class InstructorManager extends userManager{
    public void reqSalary(Instructor instructor){
        System.out.println("Güncel maaşınız: " + Instructor.salary);
        System.out.println("Maaş talebiniz alınmıştır sayın: " + Instructor.name + " Bey");
    }

    @Override
    public void List() {
        //super.List();
        System.out.println("Bu metot userManager sınıfından override edilmiştir. Hocamız sisteme eklenmiştir.");
    }

}
