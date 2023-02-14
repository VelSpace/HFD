package SOLID.ISP;

public class Canon implements IPrintTasks{
// It doesn't have faxservice still we are seeing the method forcefully so instead of one interface we will 
//seperate that into multile interfaces 
    @Override
    public boolean printContent(String content) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean scanContent(String content) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean photoCopyContent(String content) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
