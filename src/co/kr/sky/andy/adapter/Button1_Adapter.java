package co.kr.sky.andy.adapter;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.kr.sky.andy.R;
import co.kr.sky.andy.common.CommonUtil;
import co.kr.sky.andy.obj.Button1obj;

public class Button1_Adapter extends BaseAdapter {

	private Activity activity;
	//    private String[] data;
	private static LayoutInflater inflater=null;
	ArrayList<Button1obj> items;
	private Typeface ttf;
	CommonUtil dataSet = CommonUtil.getInstance();

	public Button1_Adapter(Activity a, ArrayList<Button1obj> m_board) {
		activity = a;

		inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		items = m_board;
		ttf = Typeface.createFromAsset(activity.getAssets(), "HANYGO230.TTF");

	}

	public int getCount() {
		return items.size();
	}

	public Object getItem(int position) {
		return position;
	}

	public long getItemId(int position) {
		return position;
	}

	static class ViewHolder {
		LinearLayout first_view;
		RelativeLayout rel;
		ImageView second_view;
		TextView round_txt , time_txt;
		
	}
	public View getView(final int position, View convertView, ViewGroup parent) {
		final Button1obj board = items.get(position);
		ViewHolder vh = new ViewHolder();
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.button1_detail_item,null);
			vh.first_view = (LinearLayout) convertView.findViewById(R.id.first_view); 
			vh.second_view = (ImageView) convertView.findViewById(R.id.second_view); 
			vh.round_txt = (TextView) convertView.findViewById(R.id.round_txt); 
			vh.time_txt = (TextView) convertView.findViewById(R.id.time_txt); 
			vh.rel = (RelativeLayout)convertView.findViewById(R.id.rel);

			convertView.setTag(vh);
		}else {
			vh = (ViewHolder) convertView.getTag();
		}

		vh.round_txt.setTypeface(ttf);
		vh.time_txt.setTypeface(ttf);

		if (board.getRESULT().equals("false")) {
			vh.first_view.setVisibility(View.GONE);
			vh.second_view.setVisibility(View.VISIBLE);

		}
		
		if (dataSet.width < 500) {
			//글씨 줄이기
			vh.round_txt.setTextSize(13);
			vh.time_txt.setTextSize(20);
			vh.rel.setPaddingRelative(0, 0, 0, 15);

		}
		return convertView;
	}

}