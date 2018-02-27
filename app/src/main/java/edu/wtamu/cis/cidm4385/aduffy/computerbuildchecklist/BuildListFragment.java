package edu.wtamu.cis.cidm4385.aduffy.computerbuildchecklist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class BuildListFragment extends Fragment {
    private RecyclerView mListRecyclerView;
    private CheckListAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_check_list, container, false);

        mListRecyclerView = (RecyclerView) view
                .findViewById(R.id.crime_recycler_view);
        mListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI() {
        CheckListRepo checkListRepo = CheckListRepo.get(getActivity());
        List<CheckListItem> checkListItems = checkListRepo.getCheckListItems();

        mAdapter = new CheckListAdapter(checkListItems);
        mListRecyclerView.setAdapter(mAdapter);
    }

    private class CheckListHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        private CheckListItem mCheckListItem;

        private TextView mTitleTextView;
        private TextView mDateTextView;

        public CheckListHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.check_list_item, parent, false));
            itemView.setOnClickListener(this);

            mTitleTextView = (TextView) itemView.findViewById(R.id.crime_title);
            mDateTextView = (TextView) itemView.findViewById(R.id.crime_date);
        }

        public void bind(CheckListItem checkListItem) {
            mCheckListItem = checkListItem;
            mTitleTextView.setText(mCheckListItem.getQuestion());
//            mDateTextView.setText(mCrime.getDate().toString());
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(getActivity(),
                    mCheckListItem.getQuestion() + " clicked!", Toast.LENGTH_SHORT)
                    .show();
        }
    }


    private class CheckListAdapter extends RecyclerView.Adapter<CheckListHolder> {

        private List<CheckListItem> mCheckListItems;

        public CheckListAdapter(List<CheckListItem> checkListItems) {
            mCheckListItems = checkListItems;
        }

        @Override
        public CheckListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new CheckListHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(CheckListHolder holder, int position) {
            CheckListItem checkListItem = mCheckListItems.get(position);
            holder.bind(checkListItem);
        }

        @Override
        public int getItemCount() {
            return mCheckListItems.size();
        }
    }
}

