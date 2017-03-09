package co.kr.sky.andy.obj;

import android.os.Parcel;
import android.os.Parcelable;



public class Button1obj implements Parcelable{
				
	private String L_IMG , R_IMG , ROUND , TIME , RESULT;
	public static Parcelable.Creator<Button1obj> getCreator() {
		return CREATOR;
	}
	public Button1obj(String l_IMG, String r_IMG, String rOUND, String tIME, String rESULT) {
		super();
		L_IMG = l_IMG;
		R_IMG = r_IMG;
		ROUND = rOUND;
		TIME = tIME;
		RESULT = rESULT;
	}
	public String getL_IMG() {
		return L_IMG;
	}
	public void setL_IMG(String l_IMG) {
		L_IMG = l_IMG;
	}
	public String getR_IMG() {
		return R_IMG;
	}
	public void setR_IMG(String r_IMG) {
		R_IMG = r_IMG;
	}
	public String getROUND() {
		return ROUND;
	}
	public void setROUND(String rOUND) {
		ROUND = rOUND;
	}
	public String getTIME() {
		return TIME;
	}
	public void setTIME(String tIME) {
		TIME = tIME;
	}
	public String getRESULT() {
		return RESULT;
	}
	public void setRESULT(String rESULT) {
		RESULT = rESULT;
	}
	public Button1obj(Parcel in) {
	       readFromParcel(in);
	    }
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		
		dest.writeString(L_IMG);
		dest.writeString(R_IMG);
		dest.writeString(ROUND);
		dest.writeString(TIME);
		dest.writeString(RESULT);
	}
	private void readFromParcel(Parcel in){
		
		L_IMG = in.readString();
		R_IMG = in.readString();
		ROUND = in.readString();
		TIME = in.readString();
		RESULT = in.readString();
	}

	@SuppressWarnings("rawtypes")
	public static final Parcelable.Creator<Button1obj> CREATOR = new Parcelable.Creator() {
		public Object createFromParcel(Parcel in) {
			return new Button1obj(in);
		}

		public Object[] newArray(int size) {
			return new Button1obj[size];
		}
	};

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
}