import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Digital_Clock {
    private String newDatetime;
    private LocalDateTime dateTime;
    private DateTimeFormatter formatter;

    private void Clock_Update(){
        dateTime = LocalDateTime.now();
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        newDatetime = dateTime.format(formatter);
    }
    
    public void Display(){ 
        while (true) {
            Clock_Update();
            System.out.print("\r" + newDatetime);
            System.out.flush();
            try {Thread.sleep(1000);} catch (InterruptedException e) {break;}
        }
    }
}