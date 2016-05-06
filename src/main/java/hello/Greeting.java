package hello;

import org.joda.time.DateTime;

public class Greeting {

    private final String cameraid;
    private final DateTime datetime;
    private final String filename;

    public Greeting(String cameraid, DateTime datetime, String filename) {
        this.cameraid = cameraid;
        this.datetime = datetime;
        this.filename = filename;
    }

    public String getid() {
        return cameraid;
    }

    public DateTime getdate() {
        return datetime;
    }
    
    public String getfile() {
        return filename;
    }
}
