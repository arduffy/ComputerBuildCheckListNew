package edu.wtamu.cis.cidm4385.aduffy.computerbuildchecklist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.

import java.util.List;

/**
 * Created by Amanda on 3/5/2018.
 */

public class CheckListFragment extends Fragment {
    private RecyclerView mItemRecyclerView;
    private Adapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.list_fragment, container, false);

        mItemRecyclerView = (RecyclerView) view
                .findViewById(R.id.item_recycler_view);
        mItemRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;

    }

    private void updateUI() {
        CheckListRepo checkListRepo = CheckListRepo.get(getActivity());
        List<Item> items = checkListRepo.getItems();

//        if (mAdapter == null) {
//            mAdapter = new Adapter(items);
//            mItemRecyclerView.setAdapter(mAdapter);
//        } else {
//            mAdapter.notifyDataSetChanged();
//        }

        updateUI();
    }

    private class ListHolder extends RecyclerView.ViewHolder {

        private TextView mItem;
        private CheckBox mcheck;

        public ListHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item, parent, false));

            mItem = (TextView) itemView.findViewById(R.id.item);
            mcheck = (ImageView) itemView.findViewById(R.id.check);
        }

//        public void bind(Item item) {
//            mItem = item;
//            mItem.setText(mItem.getItem());
//            mcheck.setVisibility(item.isSolved() ? View.VISIBLE : View.GONE);
//        }
    }

    private class Adapter extends RecyclerView.Adapter<ListHolder> {

        private List<Item> mItem;

        public Adapter(List<Item> items) {
            mItem = items;
        }

        @Override
        public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new ListHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(ListHolder holder, int position) {
            Item item = mItem.get(position);
//            holder.bind(item);
        }

        @Override
        public int getItemCount() {
            return mItem.size();
        }
    }


    }


}