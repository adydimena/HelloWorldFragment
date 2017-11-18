package com.example.ady.helloworldfragment.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ady.helloworldfragment.GetitemClicked;
import com.example.ady.helloworldfragment.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class ListFragment extends Fragment {

    String getClicked;
    private ListView display;
    private ArrayAdapter<String> listviewadaptar;
    TextView itemSelected;
    String TAG_detail = "show them all";

    public String getGetClicked() {
        return getClicked;
    }

    private OnFragmentInteractionListener mListener;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);


        final String[] Celebs = {"Cristiano Ronaldo", "Deco", "Messi", "Abobakar", "Joao Moutinho", "Pogba", "Danilo", "Corona"};
        // Inflate the layout for this fragment

        display = view.findViewById(R.id.fraglist);
        listviewadaptar = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                Celebs
        );
        display.setAdapter(listviewadaptar);

        display.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                getClicked = Celebs[i];

                DetailsFragment detailsFragment = DetailsFragment.newInstance(getClicked);

               Bundle bundle = new Bundle();
               bundle.putString("magic",getClicked);
               detailsFragment.setArguments(bundle);
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .add(R.id.mainlayoutfragDetail,detailsFragment,TAG_detail)
                        .commit();


            }
        });
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String strg) {
        if (mListener != null) {
            mListener.onFragmentInteraction(strg);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String strg);
    }
}
