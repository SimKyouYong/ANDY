package co.kr.sky.andy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.btn1).setOnClickListener(btnListener);

	}
	//버튼 리스너 구현 부분 
	View.OnClickListener btnListener = new View.OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {

			case R.id.btn1:	
				Log.e("SKY"  , "--btn1--");
				Intent it = new Intent(MainActivity.this, Button1Activity.class);
				startActivity(it);
				break;
			}
		}
	};
}
