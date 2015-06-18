package com.greatmindsdev.android.beedium;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ematlea on 5/13/2015.
 */
public class GroupFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private ArrayAdapter<String> mGroupAdapter;
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static GroupFragment newInstance(int sectionNumber) {
        GroupFragment fragment = new GroupFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public GroupFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        String[] groupArray = {
                "Dive Bar",
                "Fancy Dinner",
                "Fast Food",
                "Family Friendly",
                "Work Lunch",
                "Alpharetta",
                "Atlanta - Downtown",
                "Burgers",
                "Steak",
                "Seafood"
        };

        List<String> groupList = new ArrayList<String>(Arrays.asList(groupArray));

        mGroupAdapter =
                new ArrayAdapter<String>(
                        getActivity(),
                        R.layout.list_item_groups,
                        R.id.list_item_groups_textview,
                        groupList
                );

        ListView groupListView = (ListView) rootView.findViewById(
                R.id.listview_groups);
        groupListView.setAdapter(mGroupAdapter);

        return rootView;
    }
}
