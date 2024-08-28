// public class inheritence2 {   //single inheritwnce
//    void showA(){
//         System.out.println("a class method");
//     }
// }
// class b extends inheritence2{
//     void showB(){
//         System.out.println("b class");
//     }
//     public static void main(String[] args) {
//         b c=new b();
//         c.showB();
//         c.showA();
//     }
// }



//multilevel inheritence


// public class inheritence2 { 
//     void showA(){
//          System.out.println("a class method");
//      }
//  }
//  class b extends inheritence2{
//      void showB(){
//          System.out.println("b class");
//      }

//      }
// class c extends b{
//     void showC(){
//         System.out.println("c class");
//     }
//     public static void main(String[] args) {
//         c d=new c();
//         d.showA();
//         d.showB();
//         d.showC();
//         System.out.println("------------------------------------");
        // b k=new b();
        // k.showA();
        // k.showB();
       // k.showC();//b ke obj se c kp nhi kar sakte hai
    //    System.out.println("------------------------------------");
    //    inheritence2 l=new inheritence2();
    //    l.showA();
//}
//}

//heirarchial

class a { 
    void showA(){
         System.out.println("a class method");
     }
 }
 class b extends a{
     void showB(){
         System.out.println("b class");
     }

     }
class c extends a{
    void showC(){
        System.out.println("c class");
    }

    }
    public class inheritence2{
        public static void main(String[] args) {
            c a=new c();
            a.showC();
            a.showA();
    System.out.println("----------------------------------");
            b k= new b();
            k.showB();
            k.showA();
            
        }
    }
