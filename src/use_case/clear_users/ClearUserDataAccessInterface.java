package use_case.clear_users;

// TODO Complete me
import java.util.ArrayList;

public interface ClearUserDataAccessInterface {
    boolean existsByName(String identifier);
    public ArrayList<String> clearallusers();
}
