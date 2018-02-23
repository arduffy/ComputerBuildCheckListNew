package edu.wtamu.cis.cidm4385.aduffy.computerbuildchecklist;

import android.support.v4.app.Fragment;

public class BuildListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
