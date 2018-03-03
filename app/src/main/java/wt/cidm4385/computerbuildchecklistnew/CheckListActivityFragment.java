package wt.cidm4385.computerbuildchecklistnew;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckListActivityFragment extends Fragment {

    ArrayAdapter<String> mTaskAdapter;

    public CheckListActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_check_list, container, false);

        //Create the fake data
        String[] fakeData = {
                "Revise for exam",
                "Buy milk",
                "Do laundry",
                "Call Melissa",
                "Buy stamps",
        };
        List<String> tasks = new ArrayList<String>(Arrays.asList(fakeData));

        //Create the ArrayAdapter by specifying context, "how" (layout),"where" (textview), and " what" (data)
        mTaskAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item,
                R.id.list_item_task_textview,
                tasks);

        //Still need to bind adapter to the ListView
        ListView listView = (ListView) view.findViewById(R.id.list_item_task_textview);
        listView.setAdapter(mTaskAdapter);

        return view;
    }
}
