package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Program {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter ftm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter ftm4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter ftm5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//DateTimeFormatter ftm6 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter ftm6 = DateTimeFormatter.ISO_INSTANT;
		
		Instant d03 = Instant.now();
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
				
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", ftm1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", ftm2);
		
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		System.out.println("d04 = " + d04.format(ftm3));
		System.out.println("d04 = " + ftm3.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("d05 = " + ftm4.format(d05));
		System.out.println("d06 = " + ftm5.format(d06));
		//System.out.println("d05 = " + ftm6.format(d05));
		System.out.println("d06 = " + ftm6.format(d06));
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("r1 = " + r1);
		
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("r2 = " + r2);
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("r3 = " + r3);
		
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("r4 = " + r4);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		
		LocalDate pastWeeLocalDate = d04.minusDays(7);
		LocalDate nextWeeLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeeLocalDate = " + pastWeeLocalDate);
		System.out.println("nextWeeLocalDate = " + nextWeeLocalDate);
		
		
		LocalDateTime pastWeeLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeeLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeeLocalDateTime = " + pastWeeLocalDateTime);
		System.out.println("nextWeeLocalDateTime = " + nextWeeLocalDateTime);
		
		Instant pastWeeInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeeInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeeLocalInstant = " + pastWeeInstant);
		System.out.println("nextWeeLocalInstant = " + nextWeeInstant);
		
				
		for (String s: ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		
		Duration t1 = Duration.between(pastWeeLocalDate.atTime(0, 0), d04.atTime(0, 0));
		Duration t3 = Duration.between(pastWeeLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeeLocalDateTime, d05);
		Duration t4 = Duration.between(pastWeeInstant, d06);
		Duration t5 = Duration.between(d06, pastWeeInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
		System.out.println("t5 dias = " + t5.toDays());
		
		
	}

}
