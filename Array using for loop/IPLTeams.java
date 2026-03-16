class IPLTeams {
    public static void main(String[] args) {

        String teams[] = { "Chennai Super Kings","Mumbai Indians","Royal Challengers Bangalore","Kolkata Knight Riders", "Rajasthan Royals","Sunrisers Hyderabad","Delhi Capitals",
                          "Punjab Kings", "Gujarat Titans","Lucknow Super Giants"};
            
       
        System.out.println("IPL Teams are :");
		
	System.out.println("No of IPLTeams added are:"  + teams.length);
	System.out.println(" List of Different teams Names are:");
	for(String teamname : teams)
	System.out.println(teamname);
	}
}