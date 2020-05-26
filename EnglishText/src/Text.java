import java.util.regex.Pattern;

public class Text
{
    public static void main(String[] args)
    {
        String englishText = "The price of a barrel of Brent Crude - the UK benchmark for oil - has slipped below $20, " +
                "its lowest level since 2002. The close to 20% slump follows negative prices being recorded for a barrel" +
                " of West Texas Intermediate (WTI), the benchmark for US oil. Negative oil prices on Monday were a quirk," +
                " says one market expert. The price of US oil - which slumped to minus $37 a barrel at one point -" +
                " was produced by a trading deadline and is now back to a positive figure. Yesterday's price action " +
                "is best understood as a quirk or peculiarity of futures trading, said analyst James Trafford of " +
                "Fidelity International. He reckons the unprecedented price movement confirms that near-term demand " +
                "is very weak. But it isn't cataclysmic, he said. We don't see negative oil prices as a new normal, " +
                "going forward. Oil prices have weakened sharply because of a combination of oversupply and " +
                "a collapse in global demand due to the decline in economic activity caused by coronavirus " +
                "lockdown measures. What happened? The price of oil that we see reported is actually the " +
                "future price of oil. Futures are essentially contracts to deliver the physical commodity at " +
                "a later date. So when we look at oil prices, we are actually seeing the market price " +
                "for future months.";

        Pattern pattern = Pattern.compile("[\\W]");
        String[] words = pattern.split(englishText);
        for(String word:words)
            System.out.println(word);
    }
}
