package com.example.ady.helloworldfragment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ady.helloworldfragment.Fragments.DetailsFragment;
import com.example.ady.helloworldfragment.Fragments.ListFragment;

public class MainActivity extends AppCompatActivity implements ListFragment.OnFragmentInteractionListener {
    private String TAG_list = "list them all";
    private String TAG_Details ="Show who they are";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListFragment listofcelebs = new ListFragment();


        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.mainlayoutFragList,listofcelebs,TAG_list)
                .commit();



    }


    @Override
    public void onFragmentInteraction(String sttr) {
        showthemall(sttr);


    }
    public void showthemall (String strg){
        DetailsFragment detailsFragment = DetailsFragment.newInstance(strg);

        getSupportFragmentManager()
             .beginTransaction()
            .add(R.id.mainlayoutfragDetail,detailsFragment,TAG_Details).commit();

    }
}
