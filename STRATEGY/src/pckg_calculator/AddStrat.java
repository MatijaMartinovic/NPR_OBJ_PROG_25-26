package pckg_calculator;

public class AddStrat implements CalcStrat{
    @Override
    public Double performCalculation(Double fst, Double snd) {
        return fst + snd;
    }
}
