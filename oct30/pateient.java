public class pateient {
    static String hospitalname;
    String patientname;
    int age;
    public void printDetails(){
        System.out.println("hospital:"+hospitalname+"\n"+"pateintname"+patientname+"\n"+"age is" +age);
        System.out.println("--------------");
    }
    public static void main(String[] args) {
        hospitalname="city care hospital";
        pateient obj1= new pateient();
        obj1.patientname="john doe";
        obj1.age=45;
        pateient obj2 = new pateient();
        obj2.patientname="emma watson";
        obj2.age=30;
        obj1.printDetails();
        obj2.printDetails();
    }
    
    
}
