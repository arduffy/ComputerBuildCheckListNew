package wt.cidm4385.computerbuildchecklistnew;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ad939564 on 2/28/2018.
 */

public class CheckListActivityFragment extends ListFragment implements AdapterView.OnItemClickListener {
    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_check_list, container,false);

        return view;
    }

    @Override
    public void onActivityCreated (@Nullable Bundle savedInstanceState){
            super.onActivityCreated(savedInstanceState);

            ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.build_list,android.R.layout.simple_list_item_1);
            setListAdapter(arrayAdapter);
            getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        String[] buildList = getActivity().getResources().getStringArray(R.array.build_list);
        Toast toast = Toast.makeText(getActivity(), "Done" + buildList[position], Toast.LENGTH_SHORT.show());
    }
}



