package de.schildbach.wallet.faircoin.addons;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent();
        intent.putExtra("source", "Free Vision");
        intent.putExtra("url", "https://exchange.faircoin.co/data/ticker");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
