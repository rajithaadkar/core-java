class AmazonPrime
{
	
static	String kannadaSeries[] = {"Humble Politician Nograj","HIT","Kudi Yedamaithe","Bicchugatti","Mathagam","Family Man Kannada","Love Mocktail Series","Mayamruga","Gaalipata Series",
		"Hoysala","Inspector Vikram","Sixer Kannada","Auto Shankar","Parampara","Avane Srimannarayana Series","Shiva 143","Aaptha Rakshaka Series","Katheyondu Shuruvagide",
		"Garuda Gamana","Dia Series","Shakhahaari","Raajakumara Series","Kavaludaari Series","Tagaru Series","Popcorn Monkey Tiger","Birbal Series","Salaga Series","Vedha Series",
		"Ugramm Series","Ulidavaru Kandanthe Series" };
			
static	String malayalamSeries[] = {"Kerala Crime Files","Suzhal Malayalam","Modern Love Kochi","Vadhandhi Malayalam","Perilloor Premier League","Karikku Series","Thuramukham Series",
	"Oru Thekkan Thallu Case Series","Minnal Murali Series","Pathonpatham Noottandu Series","Cold Case Series","Kooman Series","Ela Veezha Poonchira Series",	
	"Anchu Sundarikal Series","Kuttavum Shikshayum Series",	"Dear Friend Series","Uyare Series","Malik Series","Joji Series","Bheeshma Parvam Series",	"Drishyam Series",	
	"Kuruthi Series","CU Soon Series","Pada Series","Virus Series","Take Off Series","Jallikattu Series","Nayattu Series","Ayyappanum Koshiyum Series","Android Kunjappan Series" };
			
		
static	String englishSeries[] = {"The Boys","Reacher","Jack Ryan","The Wheel of Time","Upload","Good Omens","Hunters","Bosch","The Expanse","Citadel",
	"Fallout","Carnival Row","The Man in the High Castle","Goliath","Modern Love","Sneaky Pete","Night Sky","Paper Girls","Outer Range","The Terminal List",
	"Daisy Jones & The Six","Undone","Tales from the Loop","Hanna","Patriot","Homecoming","Utopia","The Rig","Them","Alex Rider"};
		
		
static	String hindiSeries[] = {"Mirzapur","The Family Man","Paatal Lok","Made in Heaven","Farzi","Panchayat","Breathe","Inside Edge","Mumbai Diaries","Four More Shots Please",
	"Hostel Daze","Bandish Bandits","Guilty Minds","Jubilee","Modern Love Mumbai","Unpaused","Cartel","Hush Hush","Masoom","Afsos",		
	"Comicstaan","Suzhal","Rudra","Crash Course","Tandav","Toothpari","Pushpavalli","Mind the Malhotras","The Forgotten Army","Kaala" };		
		
		
static	String tamilSeries[] = {"Vadhandhi","Suzhal","The Village","Mathagam","Modern Love Chennai","Auto Shankar","November Story","Vella Raja","Iru Dhuruvam","Asura",
	"Navarasa","Live Telecast","Time Enna Boss","Queen","Triples","Paper Rocket","Sweet Kaaram Coffee","Ayali","Dhootha","Label","Udanpaal","Sengalam",
	"Thalaimai Seyalagam","Vilangu","Kuthiraivaal","Snakes and Ladders","The Hunt","Kaarmegam","Locker Room","Story of Things" };
			

static	String teluguSeries[] = {"Modern Love Hyderabad","Sivarapalli","Vadhuvu","Save The Tigers","Kudi Yedamaithe","Unstoppable","Aha Naa Pellanta","Hostel Days Telugu",
	"Sixer Telugu","ATM","Anya's Tutorial","Bhamakalapam","Yakshini","Newsense","Maya Bazaar For Sale","Meet Cute","Puli Meka","Kotha Poradu","The Baker and The Beauty",
	"3 Roses","College Kumar","Alludu Garu","Commit Mental","Manu","Suryasaturday","Chadarangam","Chakravyuham","Oka Chinna Family Story","Locked","Parampara"};
	
	public static void main(String args[])
	{
		String platformName = "Amazon Prime Video";
        getKannadaSeries();
		getMalayalamSeries();
		getEnglishSeries();
		getHindiSeries();
		getTamilSeries();
		getTeluguSeries();
	}
	
	public static void getKannadaSeries(){
	System.out.println(" List of Different kannada Series Names are:");
	 for(String seriesname : kannadaSeries)
	System.out.println(seriesname);
    }
	
	public static void getMalayalamSeries(){
	System.out.println(" List of Different malayalamSeries Names are: ");
	for(String malayalamseries : malayalamSeries)
		System.out.println(malayalamseries);
	}
	
	public static void getEnglishSeries(){
	System.out.println(" List of Different englishSeries Names are: ");
	for(String englishseries : englishSeries)
		System.out.println(englishseries);
	}	
	
	public static void getHindiSeries(){
	System.out.println(" List of Different hindiSeries Names are: ");
	for(String hindiseries : hindiSeries)
		System.out.println(hindiseries);
	}
	
	public static void getTamilSeries(){
	System.out.println(" List of Different tamilSeries Names are: ");
	for(String tamilseries : tamilSeries)
		System.out.println(tamilseries);
	}
	
	public static void getTeluguSeries(){
	System.out.println(" List of Different teluguSeries Names are: ");
	for(String teluguseries : teluguSeries)
		System.out.println(teluguseries);
	
	}
	
	
	}
	