package com.lindiso.assessment.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConverterUtil {

    public static BigDecimal roundDouble(BigDecimal value, int places) {

        //BigDecimal bigDecimal = new BigDecimal(d);
        value = value.setScale(places, RoundingMode.HALF_UP);
        return value;
    }
}
