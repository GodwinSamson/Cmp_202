public class Person {

    private String  schoolName = "BHU";
    
    private String name;

    private String password;

    private String matricNo;
    private String staffNo;


    Person(){}

    public Person(String schoolName, String name, String password, String matricNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.matricNo = matricNo;
    }
        System.out.println("Object created");









    String getName(){
        return name;
    

    

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "schoolName='" + schoolName + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", matricNo='" + matricNo + '\'' +
                ", staffNo='" + staffNo + '\'' +
                '}';
    }
}