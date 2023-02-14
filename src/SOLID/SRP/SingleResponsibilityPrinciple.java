package SOLID.SRP;

public class SingleResponsibilityPrinciple {
    interface Iuser{
        boolean login(String username,String password);
        boolean register(String username,String password);
    }

    public interface  error {
        void logerror(String message);
    }

    public interface sendEmail{
        boolean sendEmail(String email);
    }
}
