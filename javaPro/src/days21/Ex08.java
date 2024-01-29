package days21;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.TemporalAdjuster.*;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오후 12:22:11
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		//다음 달의 첫 날
		System.out.println(d.with(TemporalAdjusters.firstDayOfMonth()));
		

	} //main

} //class

class DayAfter3 implements TemporalAdjuster{

	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(3, ChronoUnit.DAYS);
	}
	
	
}







