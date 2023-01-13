package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class test {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Z obj= new Z(); 
		//System.out.println(getPercentage(0,0));
		System.out.println(getPercentage(4,2, obj));
		//System.out.println(getPercentage(4,2));
		System.out.println(obj.getX());
	}
	
	public static Object getPercentage(long total, long percentageFor, Z obj) {
		Object rsPct = 0;
		if(total>0 && percentageFor>0) {
			Float pct =   (float) (((double)percentageFor*100)/total);
			BigDecimal bd = new BigDecimal(String.valueOf(pct));
			int scale = bd.scale();
			BigDecimal roundOff = bd.setScale(2, BigDecimal.ROUND_HALF_EVEN);
			if(scale>1) {
				
				rsPct = roundOff.doubleValue();
			}
			else {
				rsPct = bd.intValueExact();
			}
			obj.setX((double) rsPct);
		}
		else
		{
			rsPct = (int)rsPct;
		}
		return rsPct;
	}
	
	public static String fmt(double d)
	{
	    if(d == (long) d)
	        return String.format("%d",(long)d);
	    else
	        return String.format("%s",d);
	}
	

}

class Z {
	
	double x;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
}
