package SOLID.ISP;

public interface IPrintTasks {
    boolean printContent(String content);
    boolean scanContent(String content);
    //boolean faxContent(String content);
    boolean photoCopyContent(String content);
    //boolean duplexContent(String content);

}

interface faxTask{
    boolean faxContent(String content);
}

interface duplexTask{
    boolean duplexContent(String content);
}
