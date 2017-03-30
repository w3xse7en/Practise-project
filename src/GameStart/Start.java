package GameStart;

import java.util.Scanner;
import GameMap.*;

public class Start {

	public static void main(String[] args) throws Exception {
		GameMessage message = new GameMessage();
		BuildRoom build = new BuildRoom();
		message.gamestratmessage();
		Scanner in = new Scanner(System.in);
		String info =in.nextLine();
		if(info.equals("help")){
			System.out.println("11");
		}
		if(info.equals("build")){
			while(true){
				boolean flag = false;
				String broom = in.nextLine();
				if(broom.equals("end")){
					break;
				}
				else if(broom.equals("delete")){
					String delbroom = in.nextLine();
					build.deleteRoom(delbroom);
					flag = true;
				}
				else if(broom.equals("show")){
					build.showRoom();
					flag = true;
				}
				else if(broom.equals("addexit")){
					System.out.println("choose one room");
					build.showRoom();
					String croom = in.nextLine();
					if(build.check(croom)){
						System.out.println("please enter directrion and next room");
						String dir = in.nextLine();
						String nextroom =in.nextLine();
							if(build.check(nextroom)){
								build.setRoomExit(croom, dir, nextroom);
							}
							else{
								System.out.println("next room NO room");
							}
					}
					else{
						System.out.println("NO room");
					}
					flag = true;
				}
				if(!flag)
					build.setRoom(broom);
			}
		}
		
		in.close();

	}

}
