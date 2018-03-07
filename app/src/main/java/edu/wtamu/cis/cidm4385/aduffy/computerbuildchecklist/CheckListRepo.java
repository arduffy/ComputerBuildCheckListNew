package edu.wtamu.cis.cidm4385.aduffy.computerbuildchecklist;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by ad939564 on 3/7/2018.
 */

public class CheckListRepo {
    private static CheckListRepo sCheckListRepo;

    private List<Item> mItems;

    public static CheckListRepo get(Context context) {
        if (sCheckListRepo == null) {
            sCheckListRepo = new CheckListRepo(context);
        }

        return sCheckListRepo;
}

private CheckListRepo(Context context){
        mItems = new ArrayList<Item>();

}

    public List<Item> getItems() {
        return mItems;
    }

}


