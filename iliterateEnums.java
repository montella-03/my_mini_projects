// Program that demonstrates iteration
// over enums using forEach()
import java.util.Arrays;
import java.util.EnumSet;

public class GFG {
	public enum seasons {
		Spring,
		Summer,
		Monsoon,
		Autumn,
		Winter
	}
	public static void main(String[] args)
	{

		// Convert enum to set and apply forEach()
		EnumSet.allOf(seasons.class)
			.forEach(season -> System.out.println(season));

		// Convert enum to set and apply forEach()
		Arrays.asList(seasons.values())
			.forEach(season -> System.out.println(season));
	}
}
