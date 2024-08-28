public class encapsulation {
   public static void main(String[] args) {
    employee e=new employee();
    e.setempid(101);
    System.out.println(e.getempid());
   } 
}
class employee{
    private int empid;
    public void setempid(int eid){
        empid=eid;
    }
    public int getempid(){
        return empid;
    }
}
