package com.pws.schools.SD;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class mapsdalamal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String latitude="-6.254180";
        String longitude="107.007872";

        openLocation(latitude,longitude);

    }
    private void openLocation(String latitude, String longitude) {
        Intent gotomap = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" +latitude+","+
                longitude+"?z=17&q="+latitude+","+longitude));
        startActivity (gotomap);
    }
}
