package GameMap;

import java.util.ArrayList;
import java.util.HashMap;

public class BuildRoom {
	private ArrayList<String> room = new ArrayList<String>();
	private HashMap<String, RoomExit> roomInfo = new HashMap<String, RoomExit>();
	
	public boolean check(String broom){
		for(int i=0; i<room.size(); i++){
			if(room.get(i).equals(broom)){
				return true;
			}
		}
		return false;
	}
	public void showRoom() {
		System.out.println(room);
		for(String str : room){
			getRoomExit(str);
		}
	}
	public void setRoom(String broom){
		this.room.add(broom);
		roomInfo.put(broom, new RoomExit());
	}
	public void deleteRoom(String delroom) {
		for(int i=0; i<room.size(); i++){
			if(room.get(i).equals(delroom)){
				room.remove(i);
				break;
			}
		}
	}
	public void setRoomExit(String oriroom, String dir, String nextroom){
		RoomExit orm = roomInfo.get(oriroom);
		RoomExit nrm = roomInfo.get(nextroom);
		orm.setExit(dir,nrm);
	}
	public void getRoomExit(String oriroom){
		RoomExit orm = roomInfo.get(oriroom);
		System.out.println(orm.getExit());
	}
	public static void main(String[] args) {
		
	}

}
