public class Calc {
    public int add(int... x){
        int sum=0;
        for(int i: x){
            sum+=i;
        }
        return sum; 
    }
    public int mul(int... y){
        int product=1;
        for(int i: y){
            product*=i;
        }
        return product; 
    }
}
