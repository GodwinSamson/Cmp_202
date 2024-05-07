
public class Student extends User {
    
        String matricNumber;
        String addmissionNumber;
        String courseRegistration() {
            if (matricNumber.equals("") || addmissionNumber.equals("")){

                return "You are not allowed to register";
            }else {
                return "You have successfully register your course.";
            }
        }
        String checkResults(){
            if (matricNumber.equals("") || addmissionNumber.equals("")){
                return "Nothing to show. Register!";
            }else {
                return "You passed all your course";
            }

        }
        
        public static void main(String[] args) {
            Student Stud_1 = new Student();
            Stud_1.name = "Sam";
            Stud_1.password  = "NoJoke";
            
            System.out.println(Stud_1.name);
            System.out.println(Stud_1.matricNumber);
            System.out.println(Stud_1.Register());
            
        }

                
        
        
        
    }
    

