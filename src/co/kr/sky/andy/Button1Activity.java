package co.kr.sky.andy;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.kr.sky.andy.adapter.Button1_Adapter;
import co.kr.sky.andy.common.CommonUtil;
import co.kr.sky.andy.obj.Button1obj;

public class Button1Activity extends Activity {
	ArrayList<Button1obj> arr = new ArrayList<Button1obj>();
	private Button1_Adapter           m_Adapter;
	private ListView                m_ListView;
	TextView bottom_txt;
	private Typeface ttf;
	RelativeLayout rel;
	CommonUtil dataSet = CommonUtil.getInstance();

	TextView in_left;
	TextView in_right;
	TextView txt__3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_button1);
		bottom_txt = (TextView)findViewById(R.id.bottom_txt);
		
		
		

			
			
		in_left = (TextView)findViewById(R.id.in_left);
		in_right = (TextView)findViewById(R.id.in_right);
		txt__3 = (TextView)findViewById(R.id.txt__3);

		if (dataSet.width < 500) {
			//글씨 줄이기
			txt__3.setTextSize(10);
		}
		ttf = Typeface.createFromAsset(getAssets(), "HANYGO230.TTF");
		bottom_txt.setTypeface(ttf);
		in_left.setTypeface(ttf);
		in_right.setTypeface(ttf);
		txt__3.setTypeface(ttf);

		arr.add(new Button1obj("", "", "15 ROUND", "04 : 27", "true"));
		arr.add(new Button1obj("", "", "7 ROUND", "02 : 03", "true"));
		arr.add(new Button1obj("", "", "15 ROUND", "09 : 00", "false"));

		m_ListView = (ListView)findViewById(R.id.list_cummun);
		m_Adapter = new Button1_Adapter(this , arr);
		// Xml에서 추가한 ListView 연결
		// m_ListView.setOnItemClickListener(mItemClickListener);
		// ListView에 어댑터 연결
		m_ListView.setAdapter(m_Adapter);

	}
}
