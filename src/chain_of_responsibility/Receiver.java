package chain_of_responsibility;

/**
 * Created by Vladok on 20.11.2016.
 */
public class Receiver {
    private boolean gmail;
    private boolean yahoomail;
    private boolean mailru;

    public Receiver(boolean gmail, boolean yahoomail, boolean mailru) {
        this.gmail = gmail;
        this.yahoomail = yahoomail;
        this.mailru = mailru;
    }

    public boolean isGmail() {
        return gmail;
    }

    public boolean isYahoomail() {
        return yahoomail;
    }

    public boolean isMailru() {
        return mailru;
    }
}
