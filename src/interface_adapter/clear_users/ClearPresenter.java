package interface_adapter.clear_users;

// TODO Complete me
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import javax.swing.*;
import java.util.ArrayList;

public class ClearPresenter implements ClearOutputBoundary{

    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public StringBuilder prepareSuccessView(ClearOutputData clearOutputData) {
        StringBuilder deletedStr = new StringBuilder();
        for (String user : clearOutputData.getDeletedUsers()) {
            deletedStr.append(user + "\n");
        }
        return deletedStr;
    }

}
