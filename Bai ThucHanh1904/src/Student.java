public class Student extends Person {

  private String dob;
  private String gender;
  
    public Student( String masinhvien, String ten, String ngaysinh, String gioitinh, String diachi){
        this.dob=ngaysinh;
        this.PersonID=masinhvien;
        this.Address=diachi;
        this.PersonName=ten;
        this.gender=gioitinh;
    }
}
