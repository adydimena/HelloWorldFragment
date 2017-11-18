package com.example.ady.helloworldfragment.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ady.helloworldfragment.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static  String ARG_PARAM1 = "param1";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private TextView tvTitle, tvdescr;
    private ImageView ivimage;



    public DetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     *
     * @return A new instance of fragment DetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailsFragment newInstance(String param1) {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);

        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
           // mParam1 = savedInstanceState.get(ARG_PARAM1).toString();

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        tvTitle = view.findViewById(R.id.tvTitle);
        tvdescr = view.findViewById(R.id.tvdescription);
        ivimage = view.findViewById(R.id.ivimage);
        String clicked = " ";
        // Inflate the layout for this fragment

         Bundle bundle = getArguments();
         if (bundle != null){
            if (bundle.getString("magic") != null){
                clicked = bundle.getString("magic");
         }
    }

        switch (clicked){
            case "Cristiano Ronaldo":
                tvTitle.setText(clicked);
                tvdescr.setText("He plays for Real Madrid, in Spain");
                ivimage.setImageDrawable(getResources().getDrawable(R.drawable.cristiano_ronaldo));

                break;
            case "Deco":
                tvTitle.setText(clicked);
                tvdescr.setText("He used to play for Porto, in Portugal");
                ivimage.setImageDrawable(getResources().getDrawable(R.drawable.deco));

                break;
            case "Messi":
                tvTitle.setText(clicked);
                tvdescr.setText("He plays for Barcelona, in Spain");
                ivimage.setImageDrawable(getResources().getDrawable(R.drawable.messi));

                break;
            case "Abobakar":
                tvTitle.setText(clicked);
                tvdescr.setText("He plays for Porto, in Portugal");
                ivimage.setImageDrawable(getResources().getDrawable(R.drawable.abobakar));

                break;
            case "Joao Moutinho":
                tvTitle.setText(clicked);
                tvdescr.setText("He plays for Monaco, in France");
                ivimage.setImageDrawable(getResources().getDrawable(R.drawable.joao_moutinho));

                break;
            case "Pogba":
                tvTitle.setText(clicked);
                tvdescr.setText("He plays for Man United, in England");
                ivimage.setImageDrawable(getResources().getDrawable(R.drawable.pogba1));

                break;
            case "Danilo":
                tvTitle.setText(clicked);
                tvdescr.setText("He plays for Porto, in Portugal");
                ivimage.setImageDrawable(getResources().getDrawable(R.drawable.danilo));

                break;
            case "Corona":
                tvTitle.setText(clicked);
                tvdescr.setText("He plays for Porto, in Portugal");
                ivimage.setImageDrawable(getResources().getDrawable(R.drawable.corona));

                break;


        }


        return view;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);




    }

}
