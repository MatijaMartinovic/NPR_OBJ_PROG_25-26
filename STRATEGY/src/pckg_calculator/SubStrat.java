package pckg_calculator;

public class SubStrat implements CalcStrat{
    @Override
    public Double performCalculation(Double fst, Double snd) {
        return fst - snd;
    }
}
