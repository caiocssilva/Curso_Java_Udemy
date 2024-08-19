import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {
			
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;


		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-08-19");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-19T09:30:55");
		Instant d06 = Instant.parse("2024-08-19T09:30:55Z");
		Instant d07 = Instant.parse("2024-08-19T09:30:55-03:00");

		LocalDate d08 = LocalDate.parse("20/08/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/08/2024 10:00", fmt2);
		
		LocalDate d10 = LocalDate.of(2024, 8, 19);
		LocalDateTime d11 = LocalDateTime.of(2024, 8, 20, 1, 30);
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println("");
		System.out.println(d04.format(fmt1));
		System.out.println(fmt1.format(d04));
		System.out.println(fmt2.format(d05));
		System.out.println(fmt3.format(d06));
		System.out.println(fmt4.format(d05));





		
	}
	
}
