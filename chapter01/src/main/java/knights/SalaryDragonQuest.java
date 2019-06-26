package knights;

import java.io.PrintStream;

public class SalaryDragonQuest implements Quest{
    private PrintStream stream;

    public SalaryDragonQuest(PrintStream stream){
        this.stream =stream;
    }

    public void embark(){
        stream.print("embarking on quest to salary dragon");
    }

}
