public class Complex {
    int x;
    int y;
    public Complex(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public Complex(){
        
    }
    public void add(Complex c){
        this.x+=c.x;
        this.y+=c.y;
    }
    public Complex add(Complex c1,Complex c2){
        int newreal=c1.x+c2.x;
        int newimaginary=c1.y+c2.y;
        return new Complex(newreal, newimaginary);
    }
    public void display(){
        if(y>=0){
            System.out.println(x+"+"+y+"i");
        }
        else{
            System.out.println(x+"-"+(-y)+"i");
        }
    }
}
