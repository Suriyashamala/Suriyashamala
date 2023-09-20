package day3;

public class Method {
    public void light()    //non return,wo parameter
    {
        System.out.println("burning");
    }
    public void fan(int i)  //non return,w parameter
    {
        System.out.println("3");
    }
    public String printer()  //return,wo parameter
    {
        return "printing";
    }
    public int count(int p, int q, int r)  //return,w parameter
    {
        System.out.println();
        System.out.println("apple");
        return p + q + r;
    }

    public static void main(String[] args) {
        Method m = new Method();
        m.light();
        m.fan(3);
        System.out.println(m.printer());
        System.out.println(m.count(1,2,3));
    }

}

