package fr.stackr.android.ffreboot;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Reboot extends Activity implements View.OnClickListener {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);

		((ImageButton) findViewById(R.id.restartButton))
				.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		try {
			Runtime.getRuntime().exec(
					new String[] { "/system/bin/su", "-c", "reboot now" });
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}