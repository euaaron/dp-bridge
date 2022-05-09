package Utils;

import java.text.DecimalFormat;

public class NumberUtil {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static float getFormattedNumber(float number) {
        return Float.parseFloat(df.format(number));
    }
}
