package pckg_calculator;

public class MultStrat implements CalcStrat{
    @Override
    public Double performCalculation(Double fst, Double snd) {
        return fst * snd;
    }
}
