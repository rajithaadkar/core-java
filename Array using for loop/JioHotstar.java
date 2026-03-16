class JioHotstar
{
	
static	String englishCartoons[] = {
			"Mickey Mouse","Tom and Jerry","Donald Duck","Scooby Doo","Ben 10","Powerpuff Girls","Teen Titans","Looney Tunes","Justice League","Batman",
			"Superman","Spiderman","Avengers Assemble","DuckTales","Chip n Dale","Winnie the Pooh","Kung Fu Panda","Cars Toon","Toy Story","Frozen",
			"Finding Nemo","Monsters Inc","Lion King","Aladdin","Moana","Inside Out","Ratatouille","Up","Big Hero 6","Zootopia" };

static	String hindiCartoons[] = {
			"Doraemon","Shinchan","Chhota Bheem","Motu Patlu","Ninja Hattori","Little Singham","Bal Hanuman","Roll No 21","Bandbudh Aur Budbak","Pakdam Pakdai","Keymon Ache",
			"Mighty Raju","Selfie With Bajrangi","Titoo","Chorr Police","Krishna","Bajrangi","Bhoot Bandhus","Guru Aur Bhole","Lamput","Super V","Vir The Robot Boy",
			"Ekans","Smashing Simmba","Chacha Bhatija","Chikoo Aur Bunty","Little Krishna","Gattu Battu","Simple Samosa"};

static	String kannadaCartoons[] = {
			"Doraemon Kannada","Shinchan Kannada","Chhota Bheem Kannada","Motu Patlu Kannada","Ninja Hattori Kannada","Little Singham Kannada","Ben 10 Kannada",
			"Tom and Jerry Kannada","Mickey Mouse Kannada","Scooby Doo Kannada","Pokemon Kannada","Oggy Kannada","Jackie Chan Adventures Kannada",
			"Power Rangers Kannada","Heidi Kannada","Aladdin Kannada","Jungle Book Kannada","Popeye Kannada","Teen Titans Kannada","Finding Nemo Kannada",
			"Justice League Kannada","Batman Kannada","Superman Kannada","Spiderman Kannada","Avengers Kannada","Kung Fu Panda Kannada","Lion King Kannada",
			"Cars Kannada","Toy Story Kannada","Frozen Kannada"};

static	String tamilCartoons[] = {
			"Doraemon Tamil","Shinchan Tamil","Chhota Bheem Tamil","Motu Patlu Tamil","Ninja Hattori Tamil","Ben 10 Tamil","Tom and Jerry Tamil",
			"Oggy Tamil","Pokemon Tamil","Jackie Chan Tamil","Mickey Mouse Tamil","Scooby Doo Tamil","Powerpuff Girls Tamil","Teen Titans Tamil","Justice League Tamil",
			"Batman Tamil","Superman Tamil","Spiderman Tamil","Avengers Tamil","Kung Fu Panda Tamil","Cars Tamil","Toy Story Tamil","Frozen Tamil","Finding Nemo Tamil",
			"Lion King Tamil","Aladdin Tamil","Moana Tamil","Up Tamil","Big Hero 6 Tamil","Zootopia Tamil" };

static	String teluguCartoons[] = {
			"Doraemon Telugu","Shinchan Telugu","Chhota Bheem Telugu","Motu Patlu Telugu","Ninja Hattori Telugu","Ben 10 Telugu","Tom and Jerry Telugu",
			"Oggy Telugu","Pokemon Telugu","Jackie Chan Telugu","Mickey Mouse Telugu","Scooby Doo Telugu","Powerpuff Girls Telugu","Zootopia Telugu",
			"Teen Titans Telugu","Justice League Telugu","Batman Telugu","Superman Telugu","Spiderman Telugu","Avengers Telugu","Big Hero 6 Telugu",
			"Kung Fu Panda Telugu","Cars Telugu","Toy Story Telugu","Frozen Telugu","Finding Nemo Telugu","Lion King Telugu","Aladdin Telugu","Moana Telugu","Up Telugu",};

static	String malayalamCartoons[] = {
			"Doraemon Malayalam","Shinchan Malayalam","Chhota Bheem Malayalam","Motu Patlu Malayalam","Ninja Hattori Malayalam","Ben 10 Malayalam",
			"Tom and Jerry Malayalam","Oggy Malayalam","Pokemon Malayalam","Jackie Chan Malayalam","Mickey Mouse Malayalam","Scooby Doo Malayalam",
			"Powerpuff Girls Malayalam","Teen Titans Malayalam","Justice League Malayalam","Batman Malayalam","Superman Malayalam",
			"Spiderman Malayalam","Avengers Malayalam","Kung Fu Panda Malayalam","Cars Malayalam","Toy Story Malayalam","Frozen Malayalam",
			"Finding Nemo Malayalam","Lion King Malayalam","Aladdin Malayalam","Moana Malayalam","Up Malayalam","Big Hero 6 Malayalam","Zootopia Malayalam" };
	
	public static void main(String args[])
	{
		String platformName = "Jio Hotstar";
		getEnglishCartoon();
		getHindiCartoon();
		getKannadaCartoon();
		getTeluguCartoon();
		getTamilCartoon();
		getMalayalamCartoon();
	}	
	
	public static void getEnglishCartoon(){
	System.out.println(" List of Different englishCartoons Names are: ");
	for(String englishcartoon : englishCartoons)
		System.out.println(englishcartoon);
	}	
		
	public static void getHindiCartoon(){
	System.out.println(" List of Different hindiCartoons Names are: ");
	for(String hindicortoon : hindiCartoons)
		System.out.println(hindicortoon);
	}
	
	public static void getKannadaCartoon(){
	System.out.println(" List of Different kannada cartoons Names are:");
	 for(String kannadacartoon : kannadaCartoons)
	System.out.println(kannadacartoon);
    }
	
	public static void getTeluguCartoon(){
	System.out.println(" List of Different teluguCartoons Names are: ");
	for(String telugucartoon : teluguCartoons)
		System.out.println(telugucartoon);
	}
	
	public static void getTamilCartoon(){
	System.out.println(" List of Different tamilCartoons Names are: ");
	for(String tamilcartoon : tamilCartoons)
		System.out.println(tamilcartoon);
	}
	
	public static void getMalayalamCartoon(){
	System.out.println(" List of Different malayalamCartoons Names are: ");
	for(String malayalamcartoon : malayalamCartoons)
		System.out.println(malayalamcartoon);
		
	}
		
	}	
