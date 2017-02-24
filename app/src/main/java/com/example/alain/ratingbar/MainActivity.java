package com.example.alain.ratingbar;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.visit_rating, null);
        alertDialogBuilder.setView(dialogView);
        alertDialogBuilder.setTitle("Rating");
        alertDialogBuilder.setCancelable(false);

        final com.iarcuschin.simpleratingbar.SimpleRatingBar ratingBar = (com.iarcuschin.simpleratingbar.SimpleRatingBar) dialogView.findViewById(R.id.rbVisit);

        alertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface arg0, int arg1) {

                Toast.makeText(activity, "srb_rating : " + ratingBar.getRating(), Toast.LENGTH_LONG).show();
            }
        });

        alertDialogBuilder.show();

        Toast.makeText(this, "srb_starSize : " + ratingBar.getStarSize() +
                "\nsrb_starsSeparation : " + ratingBar.getStarsSeparation() +
                "\nsrb_numberOfStars : " + ratingBar.getNumberOfStars(), Toast.LENGTH_LONG).show();

    }
}
