import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) throws ParseException {
		Format f = new SimpleDateFormat("M");
	    String output = f.format(new Date());
	    //debug.debug("XXXXXXXXXXXXXXXXXXXXXXXXXXXX"+output);
	    Integer strMonth = Integer.valueOf(Integer.parseInt(output));
	    System.out.println("Month Number = "+strMonth);

}
}

