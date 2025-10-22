package pckg_calculator;

public class DivStrat implements CalcStrat{
    @Override
    public Double performCalculation(Double fst, Double snd) {
        if (snd == 0){
            System.out.println("ERROR - can't divide by zero!");
        }
        return fst / snd;
    }
}
