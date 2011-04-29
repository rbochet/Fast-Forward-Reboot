package fr.stackr.android.ffreboot;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;

public class Reboot extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        /*
        try {
			Runtime.getRuntime().exec(new String[]{"/system/bin/su","-c","reboot now"});
		} catch (IOException e) {
			e.printStackTrace();
		} */

    }
    

}