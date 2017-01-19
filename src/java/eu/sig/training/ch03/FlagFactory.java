package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {
	private static final Map<Nationality, Flag> FLAGS =
			new HashMap<Nationality, Flag>();
	
	private static Nationality DUTCH;
	private static Nationality GERMAN;
	private static Nationality BELGIAN;
	
	static {
		FLAGS.put(DUTCH, new DutchFlag()); 
		FLAGS.put(GERMAN, new GermanFlag()); 
		FLAGS.put(BELGIAN, new BelgianFlag()); 
	}
	
	public List<Color> getFlagColors(Nationality nationality) { 
		Flag flag = FLAGS.get(nationality);
		flag = (Flag) (flag != null ? flag : new DefaultFlag());
		return flag.getColors();
	}
    
    public class DefaultFlag { 
    	public List<Color> getColors() {
    	return Arrays.asList(Color.RED, Color.WHITE); }
	}

}