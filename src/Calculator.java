public class Calculator {


    public Calculator(){
        //
    }

    public double squareRoot(double x){

            double result;

            try{
                if(x < 0) throw  new Exception("invalid parameter");
                result = Math.sqrt(x);
                return result;


            } catch (Exception e ){
                e.printStackTrace();
            }
            return 0;
    }

    public double logarithm (double x ){
        try {

            if (x <= 0) throw new Exception("invalid parameter");

            return Math.log(x) / Math.log(10);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }




}
