
package javaapplication16;
class PlusNos
{
    int a,b,c;
    PlusNos()
    {
        a=10;
        b=20;
        c=a+b;
    }
    PlusNos(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.print(c);
    }
    void add()
    {
        c=a+b;
        
    }
}


public class JavaApplication16 {

   
    public static void main(String[] args) {
        PlusNos obj=new PlusNos();
        obj.add();
        obj.display();
    }
    
}
