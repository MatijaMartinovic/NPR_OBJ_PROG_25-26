package pckg_VJ_1_ZB;

import javax.swing.*;

public class DivisionStrategy implements CalculationStrategy{
    @Override
    public Double performCalculation(Double fst, Double snd) {
        if (snd == 0){
            JOptionPane.showMessageDialog(null, "Division with 0 is not defined!", "Error divisioon", JOptionPane.ERROR_MESSAGE);
        }else{
            return fst / snd;
        }
        return null;
    }
}
