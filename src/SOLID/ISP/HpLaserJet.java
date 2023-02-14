package SOLID.ISP;

public class HpLaserJet implements IPrintTasks,faxTask {

    @Override
    public boolean printContent(String content) {
        // TODO Auto-generated method stub
        System.out.println("content printed");
        return true;
    }

    @Override
    public boolean scanContent(String content) {
        System.out.println("content scanned");
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean faxContent(String content) {
        // TODO Auto-generated method stub
        System.out.println("content faxed");
        return true;
    }

    @Override
    public boolean photoCopyContent(String content) {
        // TODO Auto-generated method stub
        System.out.println("content photo copied");
        return true;
    }
    
}
