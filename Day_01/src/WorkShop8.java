
public class WorkShop8 {
	public static void main(String[] args) {
		String player[] = {"조장1", "조장2", "조장3", "조장4", "조장5", "아무개1","아무개2","아무개3","아무개4","아무개5","아무개6","아무개7","아무개8","아무개9","아무개10","아무개11","아무개12","아무개13","아무개14","아무개15","아무개16","아무개17","아무개18","아무개19","아무개20","아무개21","아무개22","아무개23","아무개24","아무개25"};
		String team[][] = new String[5][6];
		
			//팀장배정
			for (int i = 0; i < team.length; i++) {
				int leaderIndex = (int)(Math.random()* 5);
				
				if(team[i][0] == null) {
					i--;
				}
				else {
					team[i][0] = player[leaderIndex];
					player[leaderIndex] = null;
				}
				
			}
			//각 팀의 팀원 배정
			for (int i = 0; i < team.length; i++) {
				for (int j = 1; j < team[i].length; j++) {
					int memberIndex = (int)(Math.random()*25) + 5;
					if(team[i][j] == null) {
						j--;
					}
					else {
						team[i][j] = player[memberIndex];
						player[memberIndex] = null;
					}
				}
			}
		
			//출력
			for (int i = 0; i < team.length; i++) {
				System.out.println(i+1 + "팀장 : " + team[i][0]);
				System.out.println("팀원 : ");
				for (int j = 1; j < team[i].length; j++) {
					System.out.print(team[i][j] + " ");
					
				}
				System.out.println();
			}
	}		
}