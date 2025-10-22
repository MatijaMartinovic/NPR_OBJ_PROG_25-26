package pckg_VJ_1_ZB;

public class MultiplicationStrategy implements CalculationStrategy {
    @Override
    public Double performCalculation(Double fst, Double snd) {
        return fst * snd;
    }
}
