class Mxplayer {
	
static String kannadaRealityShows[] = {
            "BiggBossKannada","ComedyKhiladigalu","DanceKarnatakaDance","KannadadaKotyadhipati","DramaJuniors","MasterChefKannada","SaregamapaKannada","SuperSingerKannada",
            "WeekendWithRamesh","HosaComedyTime","MajaaTalkies","ComedyRajaKalakararu", "KitchenKhiladigalu","PatreLovers","GenesKannada","Kick",
            "Takadhimita","HejjeGeetham","BangaraPatagalu","LifeGuru","MahaJodi","Maharani","ComedyUtsava","StarSingerKannada", "GicchiGiliGili","KannadaGottilla","CookkuKannada",
            "GameOfTheStars","SuperStarKannada","DancingChampionKannada" };

static  String teluguRealityShows[] = {
            "BiggBossTelugu","Dhee","Jabardasth","ExtraJabardasth","PaduthaTheeyaga", "SuperSingerTelugu","SaregamapaTelugu","MasterChefTelugu","AataJunior",
            "Cash","BoomBoom","StarMahila","Rangoli","BharthiCanCook","DramaJuniorsTelugu","CookWithComaliTelugu","TheVoiceTelugu", "Wow","FamilyCircus","ChampionOfTheYear",
            "SumaAdda","TeluguGotTalent","ComedyStars","DancePlusTelugu","SuperChef","GenesTelugu", "BigCelebrityChallenge","AhaBhojanambu",
            "StarSingerTelugu","FoodFactoryTelugu" };

static  String hindiRealityShows[] = {
            "BiggBossHindi","KhatronKeKhiladi","IndianIdol","DanceIndiaDance","SaReGaMaPa","Roadies","Splitsvilla","MTVHustle", "MasterChefIndia","SuperDancer","IndiaGotTalent",
			"ComedyCircus", "TheKapilSharmaShow","NachBaliye","SmartJodi","LockUpp", "SharkTankIndia","TemptationIsland","FearFactor", "IndiaBestDancer","KitchenChampion",
			"DilHaiHindustani", "SurvivorIndia","MTVRoadiesRising","MTVRoadiesXtreme","BiggBossOTT","JhalakDikhhlaJaa","Hunarbaz","DancePlus","TheVoiceIndia" };

static  String tamilRealityShows[] = {
            "BiggBossTamil","CookWithComali","SuperSingerTamil","SaregamapaTamil", "DanceJodiDance","KingsOfComedy","KalakkaPovathuYaaru","StartMusic",
            "MasterChefTamil","TheWallTamil","JodiNo1","NeeyaNaana","DramaJuniorsTamil","ReadySteadyPo","SuperMom","OruKodi",  "JuniorSuperSinger","TamizhaTamizha","SurvivorTamil",
            "ComedyRajaKalakarargal","Aarambikkalama","StarSingerTamil", "TamilGotTalent","KitchenSuperStar","RamarVeedu", "NammaVeetuKalyanam","BhakthiThiruvizha","Vaanavil",
            "MrAndMrsTamil","SuperChefTamil" };

static String englishRealityShows[] = {
            "AmericaGotTalent","BritainsGotTalent","TheVoice","TheVoiceUS", "TheVoiceUK","MasterChefUS","MasterChefAustralia","Survivor","BigBrother","XFactor","AmericasNextTopModel",
			"FearFactorUS", "TheAmazingRace","LoveIsland","TooHotToHandle", "HellKitchen","TopChef","NailedIt","QueerEye",  "RuPaulsDragRace","TheCircle","SharkTankUS",
            "ProjectRunway","DancingWithTheStars","SoYouThinkYouCanDance","KitchenNightmares","InkMaster","GlowUp","NextInFashion","MasterChefCanada"  };

static  String malayalamRealityShows[] = {
            "BiggBossMalayalam","ComedyStars","FlowersComedy","StarSingerMalayalam", "UgramUjjwalam","MusicIndiaMalayalam","Super4","SellMeTheAnswer",
            "ComedyUtsavam","KitchenMagic","BumperChiri","DareTheFear", "LetsRock","Midukki","OnnumOnnumMoonnu","NingalkkumAakamKodeswaran","D4Dance","ComedyThammil",
            "MalayalamGotTalent","CookeryShow","BestSinger","ComedyFestival","StarChallenge","SuperChefMalayalam","ChillOut","LaughingVilla","TalkShowMalayalam",
            "VerumOruAlbhutham","MazhavilManoramaQuiz","MusicCorner"};
			
    public static void main(String[] args) {
    getKannadaShows();
    getTeluguShows();
	getHindiShows();
    getTamilShows();
	getEnglishShows();
	getMalayalamShows();
	}
	
	public static void getKannadaShows(){
	System.out.println(" List of Different kannadaRealityShows Names are:");
	 for(String kannadaRealityShow : kannadaRealityShows)
	System.out.println(kannadaRealityShow);
    }
	
	public static void getTeluguShows(){
	System.out.println(" List of Different teluguRealityShows Names are: ");
	for(String teluguRealityShow : teluguRealityShows)
		System.out.println(teluguRealityShow);
	}
	
	public static void getHindiShows(){
	System.out.println(" List of Different hindiRealityShows Names are: ");
	for(String hindiRealityShow : hindiRealityShows)
		System.out.println(hindiRealityShow);
	}
	
	public static void getTamilShows(){
	System.out.println(" List of Different tamilRealityShows Names are: ");
	for(String tamilRealityShow : tamilRealityShows)
		System.out.println(tamilRealityShow);
	}
	
	public static void getEnglishShows(){
	System.out.println(" List of Different englishRealityShows Names are: ");
	for(String englishRealityShow : englishRealityShows)
		System.out.println(englishRealityShow);
	}
	
	public static void getMalayalamShows(){
	System.out.println(" List of Different malayalamRealityShows Names are: ");
	for(String malayalamRealityShow : malayalamRealityShows)
		System.out.println(malayalamRealityShow);
	}	
		
	
	
}