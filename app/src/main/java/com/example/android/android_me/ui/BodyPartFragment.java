package com.example.android.android_me.ui;


import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BodyPartFragment extends Fragment {

    // Mandatory empty constructor for the fragment manager to instantiate the fragment
    public BodyPartFragment() {

    }

    // Inflates the fragment layout file and sets the correct resource for the image to display
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootview = inflater.inflate(R.layout.fragment_body_part, container, false);

        // Get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootview.findViewById(R.id.body_part_image_view);

        // Set the image to the first in our list of head images
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        // Return the rootView
        return rootview;
    }
}
