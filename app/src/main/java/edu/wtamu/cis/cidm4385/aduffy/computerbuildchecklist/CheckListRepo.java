package edu.wtamu.cis.cidm4385.aduffy.computerbuildchecklist;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CheckListRepo {
    private static CheckListRepo sCheckListRepo;

    private List<CheckListItem> mCheckListItems;

    public static CheckListRepo get(Context context) {
        if (sCheckListRepo == null) {
            sCheckListRepo = new CheckListRepo(context);
        }

        return sCheckListRepo;
    }

    private CheckListRepo(Context context) {
        mCheckListItems = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            CheckListItem checkListItem = new CheckListItem();
            checkListItem.setQuestion("Is there a case?");
            mCheckListItems.add(checkListItem);
        }
    }

//    private CheckListRepo(Context context) {
//        mCheckListItems = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            CheckListItem checkListItem = new CheckListItem();
//            crime.setTitle("Crime #" + i);
//            crime.setSolved(i % 2 == 0);
//            mCheckListItems.add(checkListItem);
//        }
//    }

    public List<CheckListItem> getCheckListItems() {
        return mCheckListItems;
    }

//    public CheckListItem getCheckListItem(UUID id) {
//        for (CheckListItem checkListItem : mCheckListItems) {
//            if (checkListItem.getId().equals(id)) {
//                return checkListItem;
//            }
//        }
//
//        return null;
//    }
}
