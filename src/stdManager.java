public class stdManager extends userManager{
    public void editStdNo(Student student){
        System.out.println("Öğrenci numaranız güncellenmiştir sayın: "+ Student.name +" Hanım");
    }
    public void chooseCourse(Student student){
        System.out.println(Student.Course + " Kursunuz seçilmiştir!");
    }

    @Override
    public void List() {
        super.List();
        System.out.println("Bu metot UserManager sınıfından override edilmiş olup stdManager sınıfında yeniden tanımlanmıştır.");
    }
}
