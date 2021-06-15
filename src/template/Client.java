package template;

public class Client {
    public static void main(String[] args){
        ADefiniteIntergral[] x=new ADefiniteIntergral[2];
        x[0]=new DefIntegralXX(1,20,100);
        x[1]=new DefIntegralLn(2.71,20,100);
        for(int i=0;i<2;i++){
            System.out.println(x[i].CalDefiniteIntegral());
        }
    }
}
