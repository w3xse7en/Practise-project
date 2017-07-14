package GameMap;

import java.util.HashMap;

public class RoomExit {
	private HashMap<String, RoomExit> room = new HashMap<String, RoomExit>();
	
	public void setExit(String dir, RoomExit nextroom){
		room.put(dir, nextroom);
	}
	public String getExit(){
		StringBuffer sb = new StringBuffer();
		for(String dir : room.keySet()){
			sb.append(dir+" ");
		}
		return sb.toString();
	}
}
