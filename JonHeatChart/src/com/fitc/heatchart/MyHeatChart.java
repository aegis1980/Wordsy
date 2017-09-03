package com.fitc.heatchart;



import java.awt.*;

public class MyHeatChart extends HeatChart{

    boolean mIgnoreZeroValue = false;

    public MyHeatChart(double[][] zValues){
        super(zValues);
    }

	/*
	 * Determines what colour a heat map cell should be based upon the cell
	 * values.
	 */
	@Override
    protected Color getCellColour(double data, double min, double max) {
        if (mIgnoreZeroValue){

        }
 return null;
    }
}
