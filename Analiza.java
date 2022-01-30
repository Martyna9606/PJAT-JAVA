package Kolokwium;
public class Analiza {
    public static void main(String[] args) {

    A a = new A(50);
    A b = new B(10,40);
    A c = new C(40,30,40);

        System.out.println("Ai "+ a.i);
        System.out.println("Bi " + b.i);
        System.out.println("Ci " + c.i);

    A[] t = {a,b,c};
    for(int i=t.length-1 ; i >= 0 ; i--) {
        try {
            t[i].show();
        } catch (E2 e2) {
            System.out.println(e2.getCause() + " " + e2.getMessage());
            ;
        } catch (E e) {
            System.out.println(e.getMessage() + " " + e.getCause());
            ;
        }
    }

        a.setI(-10);
        ((B) b).setJ(-13);
        ((C) c).setK(-14);

        System.out.println("Ai "+ a.i);
        System.out.println("Bi " + b.i);
        System.out.println("Ci " + c.i);

        for(int i=t.length-1; i>=0; i--){
            try{
                t[i].show();
            }
            catch(Exception ex){
                System.out.println(ex.getCause() + " " + ex.getMessage());
            }
        }

    }


    }


