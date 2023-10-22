package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;
import java.util.ArrayList;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary clearUseCaseInteractor;
    public ClearController(ClearInputBoundary clearUseCaseInteractor) {
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }
    public StringBuilder execute(){
        ClearInputData clearInputData = new ClearInputData();
        return clearUseCaseInteractor.execute(clearInputData);
    }

}
