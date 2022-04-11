public class Instructor extends User{
    private String eMail;
    static int salary;

    public String geteMail() {
        return this.eMail;
    }

    public void seteMail(String eMail) {

        this.eMail = eMail;
    }
    public void printEmail(){
        System.out.println("Eğitmen mail adresi: "+ eMail);
    }
}
