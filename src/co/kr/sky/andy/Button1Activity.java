package co.kr.sky.andy;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import co.kr.sky.andy.adapter.Button1_Adapter;
import co.kr.sky.andy.obj.Button1obj;

public class Button1Activity extends Activity {
	ArrayList<Button1obj> arr = new ArrayList<Button1obj>();
	private Button1_Adapter           m_Adapter;
	private ListView                m_ListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_button1);

		arr.add(new Button1obj("", "", "15 ROUND", "09 : 00", "true"));
		arr.add(new Button1obj("", "", "15 ROUND", "09 : 00", "true"));
		arr.add(new Button1obj("", "", "15 ROUND", "09 : 00", "false"));
		
		m_ListView = (ListView)findViewById(R.id.list_cummun);
		m_Adapter = new Button1_Adapter(this , arr);
		// Xml에서 추가한 ListView 연결
		// m_ListView.setOnItemClickListener(mItemClickListener);
		// ListView에 어댑터 연결
		m_ListView.setAdapter(m_Adapter);

	}
}
