public class School {
    private String schoolName;
    private String address;

    public School(String schoolName, String address){
        this.schoolName=schoolName;
        this.address=address;
    }
    public String getSchoolName(){
        return schoolName;
    }
    public String getAddress(){
        return address;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void displaySchool(){
        System.out.println("School Name: "+schoolName);
        System.out.println("Address: "+address);
    }
}
