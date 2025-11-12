public class faculty{
    static String universityname;
    String facultyname;
    String departmentname;
    public void printDetails(){
        System.out.println("university:"+universityname+"\n"+"faculty"+facultyname+"\n"+"department"+departmentname);
        System.out.println("--------------");
    }
    public static void main(String[] args) {
        universityname="standford";
        faculty obj1= new faculty();
        obj1.facultyname="robert brown";
        obj1.departmentname="cse";
        faculty obj2 = new faculty();
        obj2.facultyname="lisa green";
        obj2.departmentname="AIDS";
        obj1.printDetails();
        obj2.printDetails();
    }
    
    
}


