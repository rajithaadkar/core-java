class SuperMarket {

    public static String[] searchBrandByProduct(String productName) {

        if (productName == "Shampoo") {
            String[] shampooBrands = {
                "LOreal Paris","Head & Shoulders","Sunsilk","Pantene",
                "Dove","Clinic Plus","Tresemme","Herbal Essences",
                "WOW","Biotique","Khadi","Mamaearth",
                "Himalaya","Indulekha","Matrix","Schwarzkopf",
                "Garnier","Nyle","Meera","Vatika",
                "Chik","Rejoice","Loreal Elvive","Sebamed",
                "OGX","Moroccanoil","Bare Anatomy","Pilgrim",
                "Plum","Minimalist","St Botanica","Just Herbs",
                "Forest Essentials","Wow Skin Science","Ayush",
                "Set Wet","Park Avenue"
            };
            return shampooBrands;
        }

        if ( productName == "Soap") {
            String[] soapBrands = {
                "Lux","Dove","Pears","Lifebuoy",
                "Dettol","Santoor","Cinthol","Patanjali",
                "Medimix","Mysore Sandal","Vivel","Fiama",
                "Hamam","Rexona","Nivea","Palmolive",
                "Khadi","Himalaya","Biotique","Chandrika",
                "Godrej No.1","Neem","Ayush","Park Avenue",
                "Liril","BoroPlus","Margo","Soulflower",
                "Forest Essentials","Pears Soft",
                "Jo","Eva","Kojiesan","Sebamed",
                "Neko","Johnson’s Baby","Aveeno"
            };
            return soapBrands;
        }
		
		if (productName.equals("Toothpaste")) {
        String[] brands = {
            "Colgate","Pepsodent","Closeup","Sensodyne","Oral-B","Dabur Red",
            "Patanjali","Meswak","Vicco","Himalaya","Aquafresh","Babool",
            "Colgate Gel","Closeup Red","Sensodyne Repair","Oral-B Pro",
            "Dabur Meswak","Colgate Max","Pepsodent Germi","Colgate Kids",
            "Sensodyne Rapid","Oral-B Kids","Vicco Vajradanti","Neem",
            "Ayush","Himalaya Sparkling","Patanjali Dant","Dabur Babool",
            "Colgate Active","Closeup Blue","Sensodyne Cool",
            "Oral-B Sensitive","Dabur Salt","Himalaya Gum","Ayurvedic"
        };
        return brands;
    }
	
	if (productName.equals("Face Wash")) {
        String[] brands = {
            "Nivea","Garnier","Pond's","Clean & Clear","Himalaya","Mamaearth",
            "WOW","Biotique","Neutrogena","Plum","Cetaphil","Simple",
            "Minimalist","Lakme","Olay","Vaseline","Khadi","Aroma Magic",
            "Dot & Key","The Derma Co","MCaffeine","Good Vibes","Reequil",
            "Joy","Everyuth","VLCC","Mamaearth Neem","Garnier Acno",
            "Pond's Charcoal","WOW Aloe","Himalaya Neem","Biotique Bio Neem",
            "Nivea Men","Garnier Men","Plum Green Tea","Ayush","Ayur"
        };
        return brands;
    }

    if (productName.equals("Hair Oil")) {
        String[] brands = {
            "Parachute","Dabur Amla","Indulekha","Kesh King","Bajaj",
            "Navratna","Khadi","WOW","Mamaearth","Himalaya","Biotique",
            "Soulflower","WOW Onion","Parachute Advansed","Dabur Vatika",
            "Meera","Patanjali","Trichup","Khadi Natural","St Botanica",
            "Plum","Ayur","Ayush","Forest Essentials","Just Herbs",
            "WOW Castor","Indulekha Bringha","Biotique Bhringraj",
            "Himalaya Anti Hairfall","Mamaearth Onion","Kesh King Ayurvedic",
            "Dabur Almond","Navratna Cool","Bajaj Almond","Emami 7 Oils",
            "Anmol","Coconut Plus"
        };
        return brands;
    }
	
	if (productName.equals("Detergent")) {
        String[] brands = {
            "Surf Excel","Ariel","Tide","Rin","Wheel","Nirma","Ghadi",
            "Henko","Fena","Ujala","Surf Excel Easy","Ariel Matic",
            "Tide Plus","Rin Advanced","Wheel Active","Nirma Advance",
            "Ghadi Power","Henko Matic","Surf Excel Matic","Ariel Liquid",
            "Tide Naturals","Rin Liquid","Wheel Green","Surf Excel Quick",
            "Ujala Supreme","Fena Super","Nirma Shudh","Ghadi Detergent",
            "Surf Excel Bar","Ariel Bar","Tide Bar","Rin Bar",
            "Wheel Bar","Nirma Bar","Ujala Bar","Henko Bar","Ghadi Bar"
        };
        return brands;
    }

    if (productName.equals("Dish Wash")) {
        String[] brands = {
            "Vim","Pril","Exo","Giffy","Nirma","Patanjali","Axion",
            "Vim Gel","Pril Gel","Exo Bar","Vim Bar","Vim Liquid",
            "Exo Gel","Nirma Gel","Patanjali Gel","Giffy Gel","Vim Lemon",
            "Exo Lime","Pril Active","Axion Lime","Vim Power","Exo Touch",
            "Nirma Power","Vim Drop","Pril Bar","Vim Pink","Exo Steel",
            "Vim Green","Vim Blue","Exo Max","Pril Power","Vim Active",
            "Vim Advance","Exo Dish","Patanjali Dish","Nirma Dish"
        };
        return brands;
	}
	
	if (productName.equals("Perfume")) {
        String[] brands = {
            "Fogg","Park Avenue","Denver","Wild Stone","Engage","Skinn",
            "Bella Vita","Armaf","Ajmal","Layer'r","Axe","Villain",
            "Zara","Calvin Klein","Gucci","Dior","Versace","Jaguar",
            "Police","Davidoff","Hugo Boss","Tom Ford","Nautica",
            "Burberry","Guess","Mont Blanc","Bvlgari","Yardley",
            "Nike","UCB","Rasasi","Lattafa","Al Haramain","Afnan",
            "Swiss Arabian","Paris Corner","Al Rehab"
        };
        return brands;
    }

    if (productName.equals("Deodorant")) {
        String[] brands = {
            "Fogg","Park Avenue","Axe","Nivea","Engage","Denver","Wild Stone",
            "Set Wet","Layer'r","Yardley","Skinn","Bella Vita","Armaf",
            "Ajmal","Nike","Jaguar","Police","UCB","Zara","Villain",
            "He","Rexona","Adidas","Brut","Old Spice","Nivea Men",
            "Axe Dark","Park Avenue Neo","Fogg Black","Denver Hamilton",
            "Wild Stone Edge","Engage Mate","Set Wet Cool",
            "Layer'r Shot","Yardley Gold","Skinn Raw","Bella Vita CEO"
        };
        return brands;
    }
	
	 if (productName.equals("Face Cream")) {
        String[] brands = {
            "Pond's","Nivea","Fair & Lovely","Olay","Lakme","Himalaya","Biotique",
            "WOW","Mamaearth","Plum","Cetaphil","Simple","Minimalist","Dot & Key",
            "MCaffeine","Good Vibes","Forest Essentials","The Moms Co","Lotus",
            "VLCC","Joy","Everyuth","Aroma Magic","Khadi","Ayush","Ayur",
            "Patanjali","Himalaya Nourishing","Pond's Super Light","Nivea Soft",
            "Lakme Peach","Olay Total","Plum Vitamin C","WOW Vitamin C",
            "Biotique Morning","Mamaearth Ubtan","Reequil"
        };
        return brands;
    }

    if (productName.equals("Hand Wash")) {
        String[] brands = {
            "Dettol","Savlon","Lifebuoy","Godrej Protekt","Palmolive","Himalaya",
            "Patanjali","Biotique","Khadi","WOW","Mamaearth","Cinthol",
            "Lux","Fiama","Vivel","Pears","Medimix","Dove","Nivea",
            "Ayush","Ayur","Sanitizer Plus","Dettol Refill","Savlon Refill",
            "Lifebuoy Refill","Palmolive Foam","Dettol Foam","Savlon Foam",
            "Himalaya Neem","Patanjali Aloe","Khadi Neem","WOW Aloe",
            "Mamaearth Tea Tree","Godrej Lemon","Cinthol Lime","Fiama Gel","Vivel Gel"
        };
        return brands;
    }
	
	 if (productName.equals("Floor Cleaner")) {
        String[] brands = {
            "Lizol","Harpic","Domex","Phenyl","Dettol","Godrej Aer","Vim Floor",
            "Patanjali","Herbal Strategi","Aroma","Odonil","Sanifresh",
            "Colin Floor","Harpic Floral","Lizol Citrus","Domex Lemon",
            "Vim Lavender","Patanjali Herbal","Phenyl Black","Phenyl White",
            "Lizol Disinfectant","Domex Thick","Harpic Rose","Dettol Floor",
            "Odonil Floral","Godrej Protekt","Aroma Jasmine","Sanifresh Plus",
            "Colin Active","Lizol Pine","Domex Power","Vim Power","Harpic Power",
            "Patanjali Floor","Herbal Neem","Aroma Fresh","Dettol Citrus"
        };
        return brands;
    }

    if (productName.equals("Shaving Cream")) {
        String[] brands = {
            "Gillette","Park Avenue","Old Spice","Denver","Set Wet","Bombay Shaving",
            "Nivea Men","Lilium","Vi-John","Yardley","Palmolive","SuperMax",
            "Axe","Engage","Wild Stone","Dettol","Gillette Foam","Park Avenue Foam",
            "Old Spice Classic","Denver Hamilton","Set Wet Cool",
            "Bombay Shaving Foam","Nivea Sensitive","Lilium Herbal",
            "Vi-John Classic","Yardley Gold","Palmolive Cool",
            "SuperMax Deluxe","Axe Denim","Engage Amber","Wild Stone Edge",
            "Gillette Lime","Park Avenue Aloe","Old Spice Musk",
            "Denver Black","Set Wet Ice","Bombay Shaving Mint","Nivea Protect"
        };
        return brands;
	}
	
	if (productName.equals("Razor")) {
        String[] brands = {
            "Gillette","SuperMax","Laser","Topaz","Bic","Park Avenue",
            "Bombay Shaving","LetsShave","Zlade","Hajamat","Syska",
            "Gillette Fusion","Gillette Mach3","Gillette Guard",
            "SuperMax Platinum","Laser Ultra","Topaz Platinum","Bic Flex",
            "Park Avenue Premium","Bombay Shaving Defender","LetsShave Pro",
            "Zlade Flex","Hajamat Spade","Syska Ultra","Gillette Blue",
            "SuperMax Blue","Laser Twin","Topaz Classic","Bic Comfort",
            "Park Avenue Mach","Bombay Shaving Precision","LetsShave Legend",
            "Zlade Smooth","Hajamat Premium","Syska Glide","Gillette Sensor","SuperMax Edge"
        };
        return brands;
    }

    if (productName.equals("Sunscreen")) {
        String[] brands = {
            "Neutrogena","Lakme","Lotus","Biotique","Himalaya","Nivea",
            "Mamaearth","WOW","Plum","Cetaphil","Minimalist","Reequil",
            "Aqualogica","La Shield","UV Doux","Derma Co","Dot & Key",
            "MCaffeine","Good Vibes","Forest Essentials","VLCC",
            "Lakme SPF 50","Lotus Safe Sun","Biotique Aloe",
            "Himalaya SPF","Nivea Sun","Mamaearth Ultra","WOW SPF",
            "Plum Green Tea","Cetaphil Sun","Minimalist SPF","Reequil Ultra",
            "Aqualogica Glow","Derma Co SPF","Dot & Key Watermelon","La Shield Gel","UV Doux Matte"
        };
        return brands;
	}
	
	if (productName.equals("Baby Soap")) {
        String[] brands = {
            "Johnson's","Sebamed","Himalaya","Mamaearth","Mee Mee",
            "Chicco","Pigeon","Dove Baby","Cetaphil Baby","Biotique Baby",
            "Sebamed Baby","Johnson Milk","Johnson Blossoms","Himalaya Gentle",
            "Mamaearth Milky","Mee Mee Gentle","Chicco Soap","Pigeon Baby",
            "Dove Rich","Cetaphil Gentle","Biotique Almond","Sebamed Extra",
            "Johnson Aloe","Himalaya Creamy","Mamaearth Coco",
            "Mee Mee Aloe","Chicco Mild","Pigeon Creamy","Dove Baby Bar",
            "Cetaphil Mild","Biotique Honey","Sebamed Olive","Johnson Soft",
            "Himalaya Extra Mild","Mamaearth Oats","Mee Mee Neem","Chicco Extra"
        };
        return brands;
    }

    if (productName.equals("Baby Shampoo")) {
        String[] brands = {
            "Johnson's","Sebamed","Himalaya","Mamaearth","Mee Mee",
            "Chicco","Pigeon","Dove Baby","Cetaphil Baby","Biotique Baby",
            "Sebamed Extra","Johnson No Tears","Johnson Gold",
            "Himalaya Gentle","Mamaearth Milky","Mee Mee Soft",
            "Chicco No Tears","Pigeon Mild","Dove Rich Moisture",
            "Cetaphil Gentle","Biotique Almond","Sebamed Mild",
            "Johnson Aloe","Himalaya Extra","Mamaearth Coco",
            "Mee Mee Aloe","Chicco Gentle","Pigeon Smooth","Dove Baby Care",
            "Cetaphil Soft","Biotique Honey","Sebamed Olive",
            "Johnson Soft","Himalaya Nourish","Mamaearth Oats",
            "Mee Mee Neem","Chicco Extra Gentle"
        };
        return brands;
    }

    if (productName.equals("Wet Wipes")) {
        String[] brands = {
            "Johnson's","Huggies","Pampers","Mee Mee","Chicco",
            "Pigeon","Babyhug","Littles","Mothercare","Himalaya",
            "Mamaearth","WOW","Sebamed","Dettol","Savlon",
            "Johnson Aloe","Huggies Pure","Pampers Fresh",
            "Mee Mee Gentle","Chicco Mild","Pigeon Soft",
            "Babyhug Gentle","Littles Baby","Mothercare Soft",
            "Himalaya Gentle","Mamaearth Bamboo","WOW Aloe",
            "Sebamed Baby","Dettol Sensitive","Savlon Baby",
            "Johnson Pure","Huggies Natural","Pampers Aqua",
            "Mee Mee Aloe","Chicco Extra","Pigeon Gentle","Babyhug Aloe","Littles Pure"
        };
        return brands;
    }

    if (productName.equals("Sanitary Pads")) {
        String[] brands = {
            "Whisper","Stayfree","Sofy","Kotex","Bella",
            "Nua","Carmesi","Sirona","Stayfree Secure","Whisper Ultra",
            "Whisper Bindazzz","Sofy Antibacteria","Kotex Soft",
            "Bella Perfecta","Nua Ultra","Carmesi Rash Free",
            "Sirona Organic","Stayfree Dry Max","Whisper Choice",
            "Sofy Bodyfit","Kotex Active","Bella Maxi",
            "Nua Cotton","Carmesi Medium","Sirona Reusable",
            "Stayfree XL","Whisper XL","Sofy XL","Kotex XL",
            "Bella XL","Nua XL","Carmesi XL","Sirona XL",
            "Stayfree Overnight","Whisper Overnight","Sofy Overnight","Kotex Overnight"
        };
        return brands;
    }


    if (productName.equals("Tissues")) {
        String[] brands = {
            "Kleenex","Origami","Paseo","Presto","Bella",
            "Premier","Scott","Tork","Softy","Andrex",
            "Kleenex Ultra","Origami Soft","Paseo Deluxe",
            "Presto Premium","Bella Soft","Premier Soft",
            "Scott Comfort","Tork Advanced","Softy Plus",
            "Andrex Gentle","Kleenex Box","Origami Box",
            "Paseo Box","Presto Box","Bella Box",
            "Premier Box","Scott Box","Tork Box",
            "Softy Box","Andrex Box","Kleenex Pocket",
            "Origami Pocket","Paseo Pocket","Presto Pocket",
            "Bella Pocket","Premier Pocket","Softy Pocket"
        };
        return brands;
    }

    if (productName.equals("Room Freshener")) {
        String[] brands = {
            "Odonil","Godrej Aer","Ambi Pur","Air Wick","Patanjali",
            "Aroma","Good Scents","Glade","Spray Mint","All Out",
            "Odonil Gel","Godrej Aer Pocket","Ambi Pur Gold",
            "Air Wick Fresh","Patanjali Herbal","Aroma Jasmine",
            "Good Scents Lavender","Glade Vanilla","Spray Lemon",
            "All Out Fresh","Odonil Lavender","Godrej Citrus",
            "Ambi Pur Aqua","Air Wick Rose","Patanjali Rose",
            "Aroma Sandal","Good Scents Rose","Glade Lemon",
            "Spray Ocean","All Out Power","Odonil Jasmine",
            "Godrej Cool","Ambi Pur Blossom","Air Wick Aqua",
            "Patanjali Sandal","Aroma Floral","Glade Aqua"
        };
        return brands;
    }

    if (productName.equals("Candles")) {
        String[] brands = {
            "IKEA","Miniso","Yankee Candle","Bath & Body Works","Home Centre",
            "Archies","Chumbak","Decor Nation","Ugaoo","CraftVatika",
            "IKEA Vanilla","Miniso Rose","Yankee Lavender",
            "Bath Ocean","Home Centre Aroma","Archies Scented",
            "Chumbak Floral","Decor Nation Glass","Ugaoo Wax",
            "CraftVatika Diya","IKEA Jasmine","Miniso Lavender",
            "Yankee Vanilla","Bath Rose","Home Centre Pillar",
            "Archies Decor","Chumbak Pop","Decor Nation Jar",
            "Ugaoo Soy","CraftVatika Aroma","IKEA Tealight",
            "Miniso Tealight","Yankee Tealight","Bath Tealight",
            "Home Centre Tealight","Archies Tealight","Chumbak Tealight"
        };
        return brands;
    }

    if (productName.equals("Match Box")) {
        String[] brands = {
            "Ship","Camel","Lion","National","Three Star",
            "Ship Deluxe","Camel Gold","Lion Safety",
            "National Premium","Three Star Plus","Ship Safety",
            "Camel Safety","Lion Deluxe","National Safety",
            "Three Star Safety","Ship Long","Camel Long",
            "Lion Long","National Long","Three Star Long",
            "Ship Big","Camel Big","Lion Big",
            "National Big","Three Star Big","Ship Mini",
            "Camel Mini","Lion Mini","National Mini",
            "Three Star Mini","Ship Eco","Camel Eco",
            "Lion Eco","National Eco","Three Star Eco",
            "Ship Classic","Camel Classic"
        };
        return brands;
    }

    if (productName.equals("Bleach")) {
        String[] brands = {
            "Harpic","Domex","Lizol","Dettol","Vim",
            "Patanjali","Savlon","Colin","Phenyl",
            "Harpic White","Domex Thick","Lizol Citrus",
            "Dettol Power","Vim Bleach","Patanjali Herbal",
            "Savlon Disinfectant","Colin Floor","Phenyl White",
            "Harpic Power","Domex Lemon","Lizol Floral",
            "Dettol Multi","Vim Liquid","Patanjali Floor",
            "Savlon Power","Colin Active","Phenyl Black",
            "Harpic Lemon","Domex Power","Lizol Disinfectant",
            "Dettol Bleach","Vim Power","Patanjali Strong",
            "Savlon Bleach","Colin Fresh","Phenyl Extra"
        };
        return brands;
    }

    if (productName.equals("Glass Cleaner")) {
        String[] brands = {
            "Colin","Lizol","Vim","Dettol","Pitambari",
            "Patanjali","Pril","Colin Active","Lizol Shine",
            "Vim Glass","Dettol Glass","Pitambari Shining",
            "Patanjali Herbal","Pril Glass","Colin Lemon",
            "Lizol Crystal","Vim Crystal","Dettol Clear",
            "Pitambari Plus","Patanjali Plus","Pril Plus",
            "Colin Power","Lizol Power","Vim Power",
            "Dettol Power","Pitambari Power","Patanjali Power",
            "Pril Power","Colin Fresh","Lizol Fresh",
            "Vim Fresh","Dettol Fresh","Pitambari Fresh",
            "Patanjali Fresh","Pril Fresh","Colin Spray","Lizol Spray"
        };
        return brands;
    }

    if (productName.equals("Car Shampoo")) {
        String[] brands = {
            "3M","Formula 1","Wavex","Meguiar's","Bosch",
            "Shell","Sonax","Liqui Moly","Motomax","Waxpol",
            "3M Auto","Formula 1 Car","Wavex Foam",
            "Meguiar Gold","Bosch Clean","Shell Car",
            "Sonax Gloss","Liqui Shine","Motomax Wash",
            "Waxpol Foam","3M Shine","Formula 1 Shine",
            "Wavex Wash","Meguiar Ultimate","Bosch Auto",
            "Shell Premium","Sonax Foam","Liqui Auto",
            "Motomax Auto","Waxpol Auto","3M Foam",
            "Formula 1 Foam","Wavex Premium","Meguiar Foam",
            "Bosch Premium","Shell Foam","Sonax Premium"
        };
        return brands;
    }

    if (productName.equals("Car Wax")) {
        String[] brands = {
            "3M","Formula 1","Turtle Wax","Meguiar's","Sonax",
            "Liqui Moly","Bosch","Waxpol","Motomax","Armor All",
            "3M Wax","Formula 1 Wax","Turtle Liquid",
            "Meguiar Gold","Sonax Shine","Liqui Gloss",
            "Bosch Wax","Waxpol Cream","Motomax Shine",
            "Armor Liquid","3M Polish","Formula 1 Polish",
            "Turtle Polish","Meguiar Ultimate","Sonax Polish",
            "Liqui Polish","Bosch Polish","Waxpol Polish",
            "Motomax Polish","Armor Protect","3M Liquid",
            "Formula 1 Liquid","Turtle Spray","Meguiar Spray",
            "Sonax Spray","Liqui Spray","Bosch Spray"
        };
        return brands;
    }

    if (productName.equals("Bike Polish")) {
        String[] brands = {
            "Motomax","Formula 1","3M","Waxpol","Sonax",
            "Liqui Moly","Bosch","Armor All","WD-40","Shell",
            "Motomax Shine","Formula 1 Shine","3M Polish",
            "Waxpol Cream","Sonax Gloss","Liqui Gloss",
            "Bosch Shine","Armor Protect","WD-40 Bike",
            "Shell Polish","Motomax Liquid","Formula 1 Liquid",
            "3M Liquid","Waxpol Liquid","Sonax Liquid",
            "Liqui Liquid","Bosch Liquid","Armor Liquid",
            "WD-40 Liquid","Shell Liquid","Motomax Spray",
            "Formula 1 Spray","3M Spray","Waxpol Spray",
            "Sonax Spray","Liqui Spray","Bosch Spray"
        };
        return brands;
    }
	
	    if (productName.equals("Engine Oil")) {
        String[] brands = {
            "Castrol","Mobil","Shell","Servo","Total",
            "Valvoline","Motul","Gulf","HP","BP",
            "Castrol GTX","Mobil Super","Shell Helix",
            "Servo Pride","Total Quartz","Valvoline Max",
            "Motul 7100","Gulf Pride","HP Racer",
            "BP Visco","Castrol Magnatec","Mobil 1",
            "Shell Advance","Servo 4T","Total Rubia",
            "Valvoline All Climate","Motul 300V",
            "Gulf Formula","HP Milcy","BP Ultimate",
            "Castrol Power","Mobil Delvac","Shell Rimula",
            "Servo Synth","Total Classic","Valvoline VR1"
        };
        return brands;
    }

    if (productName.equals("Grease")) {
        String[] brands = {
            "Castrol","Servo","Mobil","Shell","Gulf",
            "Valvoline","Total","HP","BP","SKF",
            "Castrol Spheerol","Servo Grease","Mobil XHP",
            "Shell Gadus","Gulf Crown","Valvoline Palladium",
            "Total Multis","HP MP","BP Energrease",
            "SKF LGMT","Castrol LM","Servo Gem",
            "Mobil Polyrex","Shell Retinax","Gulf Grease",
            "Valvoline Heavy","Total Bearing",
            "HP Lithium","BP Lithium","SKF LGEP",
            "Castrol AP","Servo HiTech","Mobil Grease",
            "Shell Multi","Gulf EP","Valvoline EP"
        };
        return brands;
    }

    if (productName.equals("Lubricant")) {
        String[] brands = {
            "WD-40","CRC","Castrol","3M","Bosch",
            "Shell","Motul","Gulf","Servo","Total",
            "WD-40 Multi","CRC 5-56","Castrol Chain",
            "3M Silicone","Bosch Lube","Shell Lube",
            "Motul Chain","Gulf Lube","Servo Lube",
            "Total Lube","WD-40 Specialist","CRC Power",
            "Castrol Spray","3M Dry","Bosch Chain",
            "Shell Advance","Motul C2","Gulf Spray",
            "Servo Spray","Total Spray","WD-40 Bike",
            "CRC Bike","Castrol Bike","3M Bike",
            "Bosch Bike","Shell Bike"
        };
        return brands;
    }

    if (productName.equals("Insect Spray")) {
        String[] brands = {
            "Hit","Baygon","Godrej","All Out","Good Knight",
            "Maxo","Mortein","Lal Hit","Black Hit","Combat",
            "Hit Red","Baygon Spray","Godrej Spray",
            "All Out Spray","Good Knight Gold","Maxo Spray",
            "Mortein Spray","Lal Hit Spray","Black Hit Spray",
            "Combat Spray","Hit Yellow","Baygon Plus",
            "Godrej Power","All Out Power","Good Knight Power",
            "Maxo Power","Mortein Power","Lal Hit Power",
            "Black Hit Power","Combat Power","Hit Herbal",
            "Baygon Herbal","Godrej Herbal","All Out Herbal",
            "Good Knight Herbal","Maxo Herbal","Mortein Herbal"
        };
        return brands;
    }

    if (productName.equals("Mosquito Coil")) {
        String[] brands = {
            "Good Knight","All Out","Maxo","Mortein","Godrej",
            "Lal Hit","Black Hit","Combat","Baygon","Hit",
            "Good Knight Plus","All Out Plus","Maxo Plus",
            "Mortein Plus","Godrej Plus","Lal Hit Plus",
            "Black Hit Plus","Combat Plus","Baygon Plus",
            "Hit Plus","Good Knight Neem","All Out Neem",
            "Maxo Neem","Mortein Neem","Godrej Neem",
            "Lal Hit Neem","Black Hit Neem","Combat Neem",
            "Baygon Neem","Hit Neem","Good Knight Gold",
            "All Out Gold","Maxo Gold","Mortein Gold",
            "Godrej Gold","Lal Hit Gold","Black Hit Gold"
        };
        return brands;
    }

    if (productName.equals("Mosquito Liquid")) {
        String[] brands = {
            "Good Knight","All Out","Maxo","Mortein","Godrej",
            "Lal Hit","Black Hit","Combat","Baygon","Hit",
            "Good Knight Gold","All Out Ultra","Maxo Expert",
            "Mortein Power","Godrej Power","Lal Hit Power",
            "Black Hit Power","Combat Power","Baygon Power",
            "Hit Power","Good Knight Neem","All Out Neem",
            "Maxo Neem","Mortein Neem","Godrej Neem",
            "Lal Hit Neem","Black Hit Neem","Combat Neem",
            "Baygon Neem","Hit Neem","Good Knight Fast",
            "All Out Fast","Maxo Fast","Mortein Fast",
            "Godrej Fast","Lal Hit Fast","Black Hit Fast"
        };
        return brands;
    }

    if (productName.equals("Rat Killer")) {
        String[] brands = {
            "Ratol","Racumin","Ratimor","Storm","Tomcat",
            "Just One Bite","Neogen","Liphatech","ZP Rat",
            "Bayer","Ratol Cake","Racumin Paste",
            "Ratimor Blocks","Storm Secure","Tomcat Bait",
            "Just One Bar","Neogen Rodent","Liphatech Bait",
            "ZP Powder","Bayer Rodent","Ratol Liquid",
            "Racumin Liquid","Ratimor Liquid","Storm Liquid",
            "Tomcat Liquid","Just One Liquid","Neogen Liquid",
            "Liphatech Liquid","ZP Liquid","Bayer Liquid",
            "Ratol Plus","Racumin Plus","Ratimor Plus",
            "Storm Plus","Tomcat Plus","Neogen Plus"
        };
        return brands;
    }

    if (productName.equals("Ant Chalk")) {
        String[] brands = {
            "Laxman Rekha","Kala Hit","Good Knight","Godrej",
            "Hit","Baygon","Combat","Black Hit","All Out",
            "Maxo","Laxman Rekha Plus","Kala Hit Plus",
            "Good Knight Plus","Godrej Plus","Hit Plus",
            "Baygon Plus","Combat Plus","Black Hit Plus",
            "All Out Plus","Maxo Plus","Laxman Rekha Neem",
            "Kala Hit Neem","Good Knight Neem","Godrej Neem",
            "Hit Neem","Baygon Neem","Combat Neem",
            "Black Hit Neem","All Out Neem","Maxo Neem",
            "Laxman Rekha Strong","Kala Hit Strong",
            "Good Knight Strong","Godrej Strong","Hit Strong",
            "Baygon Strong","Combat Strong"
        };
        return brands;
    }

    if (productName.equals("Hair Gel")) {
        String[] brands = {
            "Set Wet","Park Avenue","Gatsby","Livon",
            "L'Oreal","Schwarzkopf","Matrix","WOW",
            "Mamaearth","Himalaya","Set Wet Cool",
            "Park Avenue Strong","Gatsby Hard",
            "Livon Mega","Loreal Studio","Schwarzkopf Taft",
            "Matrix Style","WOW Strong","Mamaearth Onion",
            "Himalaya Strong","Set Wet Vertical",
            "Park Avenue Classic","Gatsby Spiky",
            "Livon Gel","Loreal Fix","Schwarzkopf Power",
            "Matrix Hold","WOW Matte","Mamaearth Aloe",
            "Himalaya Styling","Set Wet Clay",
            "Park Avenue Clay","Gatsby Clay",
            "Livon Clay","Loreal Clay","Schwarzkopf Clay","Matrix Clay"
        };
        return brands;
    }

    if (productName.equals("Hair Spray")) {
        String[] brands = {
            "Set Wet","L'Oreal","Schwarzkopf","Matrix",
            "TRESemme","Gatsby","Livon","Park Avenue",
            "WOW","Mamaearth","Set Wet Strong",
            "Loreal Infinium","Schwarzkopf Osis",
            "Matrix Fix","Tresemme Hold","Gatsby Hold",
            "Livon Hold","Park Avenue Hold","WOW Hold",
            "Mamaearth Hold","Set Wet Pro",
            "Loreal Fix","Schwarzkopf Fix","Matrix Hold",
            "Tresemme Fix","Gatsby Fix","Livon Fix",
            "Park Avenue Fix","WOW Fix","Mamaearth Fix",
            "Set Wet Ultra","Loreal Ultra",
            "Schwarzkopf Ultra","Matrix Ultra",
            "Tresemme Ultra","Gatsby Ultra","Livon Ultra"
        };
        return brands;
    }
	
	    if (productName.equals("Hair Wax")) {
        String[] brands = {
            "Gatsby","Set Wet","Park Avenue","Ustraa","Beardo",
            "Mamaearth","WOW","Livon","L'Oreal","Schwarzkopf",
            "Gatsby Matte","Set Wet Matte","Park Avenue Matte",
            "Ustraa Matte","Beardo Matte","Mamaearth Onion",
            "WOW Clay","Livon Clay","Loreal Clay","Schwarzkopf Clay",
            "Gatsby Spiky","Set Wet Spiky","Park Avenue Spiky",
            "Ustraa Strong","Beardo Strong","Mamaearth Strong",
            "WOW Strong","Livon Strong","Loreal Strong",
            "Schwarzkopf Strong","Gatsby Hard","Set Wet Hard",
            "Park Avenue Hard","Ustraa Hard","Beardo Hard",
            "Mamaearth Hard","WOW Hard"
        };
        return brands;
    }

    if (productName.equals("Beard Oil")) {
        String[] brands = {
            "Beardo","Ustraa","Bombay Shaving","The Man Company","Mamaearth",
            "WOW","Himalaya","Khadi","Man Arden","Park Avenue",
            "Beardo Growth","Ustraa Growth","Bombay Growth",
            "Man Company Growth","Mamaearth Onion","WOW Onion",
            "Himalaya Nourish","Khadi Natural","Man Arden Growth",
            "Park Avenue Beard","Beardo Lite","Ustraa Lite",
            "Bombay Lite","Man Company Lite","Mamaearth Lite",
            "WOW Lite","Himalaya Lite","Khadi Lite",
            "Man Arden Lite","Park Avenue Lite",
            "Beardo Dark","Ustraa Dark","Bombay Dark",
            "Man Company Dark","Mamaearth Dark","WOW Dark","Himalaya Dark"
        };
        return brands;
    }

    if (productName.equals("Face Mask")) {
        String[] brands = {
            "Plum","Mamaearth","WOW","Biotique","Himalaya",
            "Garnier","Pond's","Lotus","VLCC","MCaffeine",
            "Plum Green Tea","Mamaearth Ubtan","WOW Charcoal",
            "Biotique Neem","Himalaya Neem","Garnier Charcoal",
            "Pond's Clay","Lotus Clay","VLCC Gold","MCaffeine Coffee",
            "Plum Vitamin C","Mamaearth Tea Tree","WOW Aloe",
            "Biotique Fruit","Himalaya Purifying","Garnier Pure",
            "Pond's Mineral","Lotus Herbals","VLCC Silver","MCaffeine Clay",
            "Plum Bright","Mamaearth Rice","WOW Vitamin C",
            "Biotique Bio","Himalaya Glow","Garnier Black","Pond's Glow"
        };
        return brands;
    }

    if (productName.equals("Scrub")) {
        String[] brands = {
            "St Ives","Plum","Mamaearth","WOW","Biotique",
            "Himalaya","MCaffeine","Good Vibes","Lotus","VLCC",
            "St Ives Apricot","Plum Green Tea","Mamaearth Walnut",
            "WOW Charcoal","Biotique Walnut","Himalaya Apricot",
            "MCaffeine Coffee","Good Vibes Rose","Lotus Herbals",
            "VLCC Walnut","St Ives Coffee","Plum Bright",
            "Mamaearth Rice","WOW Aloe","Biotique Papaya",
            "Himalaya Tan","MCaffeine Tan","Good Vibes Neem",
            "Lotus WhiteGlow","VLCC Papaya",
            "St Ives Oat","Plum Exfoliate","Mamaearth Vitamin C",
            "WOW Vitamin C","Biotique Fruit","Himalaya Gentle","MCaffeine Gentle"
        };
        return brands;
    }

    if (productName.equals("Peel Off Mask")) {
        String[] brands = {
            "WOW","Plum","Mamaearth","Garnier","Pilgrim",
            "Biotique","Himalaya","Lotus","VLCC","MCaffeine",
            "WOW Gold","Plum Green Tea","Mamaearth Charcoal",
            "Garnier Charcoal","Pilgrim Gold","Biotique Neem",
            "Himalaya Purifying","Lotus Herbals","VLCC Gold","MCaffeine Coffee",
            "WOW Silver","Plum Bright","Mamaearth Tea Tree",
            "Garnier Black","Pilgrim Platinum","Biotique Fruit",
            "Himalaya Glow","Lotus WhiteGlow","VLCC Silver",
            "MCaffeine Tan","WOW Aloe","Plum Vitamin C",
            "Mamaearth Rice","Garnier Pure","Pilgrim Volcanic",
            "Biotique Bio","Himalaya Detox"
        };
        return brands;
    }

    if (productName.equals("Shower Gel")) {
        String[] brands = {
            "Dove","Nivea","Pears","Fiama","Palmolive",
            "Lux","Himalaya","Biotique","Plum","Mamaearth",
            "Dove Deep","Nivea Men","Pears Soft",
            "Fiama Gel","Palmolive Aroma","Lux Velvet",
            "Himalaya Refresh","Biotique Bio","Plum Vanilla",
            "Mamaearth Tea Tree","Dove Care","Nivea Fresh",
            "Pears Pure","Fiama Cool","Palmolive Coconut",
            "Lux Rose","Himalaya Neem","Biotique Aloe",
            "Plum Orchid","Mamaearth Neem","Dove Silk",
            "Nivea Energy","Pears Gentle","Fiama Black",
            "Palmolive Milk","Lux Jasmine","Himalaya Lemon"
        };
        return brands;
    }

    if (productName.equals("Bath Salt")) {
        String[] brands = {
            "Plum","MCaffeine","Soulflower","Himalaya","Khadi",
            "WOW","Biotique","VLCC","Good Vibes","Forest Essentials",
            "Plum Lavender","MCaffeine Coffee","Soulflower Rose",
            "Himalaya Relax","Khadi Natural","WOW Detox",
            "Biotique Bio","VLCC Spa","Good Vibes Epsom",
            "Forest Essential Rose","Plum Calm","MCaffeine Relax",
            "Soulflower Epsom","Himalaya Epsom","Khadi Herbal",
            "WOW Epsom","Biotique Relax","VLCC Relax",
            "Good Vibes Lavender","Forest Essential Sandal",
            "Plum Refresh","MCaffeine Refresh","Soulflower Detox",
            "Himalaya Detox","Khadi Detox","WOW Calm","Biotique Calm"
        };
        return brands;
    }

    if (productName.equals("Foot Cream")) {
        String[] brands = {
            "Scholl","Himalaya","VLCC","Lotus","Biotique",
            "Khadi","WOW","Mamaearth","Plum","MCaffeine",
            "Scholl Repair","Himalaya Foot","VLCC Heel",
            "Lotus Herbals","Biotique Bio","Khadi Natural",
            "WOW Repair","Mamaearth Repair","Plum Soft",
            "MCaffeine Repair","Scholl Crack",
            "Himalaya Nourish","VLCC Nourish","Lotus Soft",
            "Biotique Soft","Khadi Soft","WOW Soft",
            "Mamaearth Soft","Plum Repair","MCaffeine Soft",
            "Scholl Soft","Himalaya Soft","VLCC Soft",
            "Lotus Repair","Biotique Repair","Khadi Repair","WOW Heal"
        };
        return brands;
    }
	
	    if (productName.equals("Hand Cream")) {
        String[] brands = {
            "Nivea","Vaseline","Himalaya","Plum","Mamaearth",
            "WOW","Biotique","Lotus","VLCC","MCaffeine",
            "Nivea Soft","Vaseline Repair","Himalaya Nourish",
            "Plum Almond","Mamaearth Ubtan","WOW Aloe",
            "Biotique Bio","Lotus Herbals","VLCC Repair",
            "MCaffeine Coffee","Nivea Repair","Vaseline Healthy",
            "Himalaya Soft","Plum Vanilla","Mamaearth Rice",
            "WOW Vitamin C","Biotique Almond","Lotus WhiteGlow",
            "VLCC Soft","MCaffeine Soft","Nivea Men",
            "Vaseline Men","Himalaya Men","Plum Men",
            "Mamaearth Men","WOW Men","Biotique Men"
        };
        return brands;
    }

    if (productName.equals("Lip Balm")) {
        String[] brands = {
            "Nivea","Vaseline","Maybelline","Lakme","Plum",
            "Mamaearth","WOW","Biotique","Himalaya","Laneige",
            "Nivea Cherry","Vaseline Cocoa","Maybelline Baby",
            "Lakme Lip","Plum Candy","Mamaearth Rose",
            "WOW Aloe","Biotique Fruit","Himalaya Natural",
            "Laneige Berry","Nivea Men","Vaseline Repair",
            "Maybelline Pink","Lakme Peach","Plum Vanilla",
            "Mamaearth Vitamin C","WOW Vitamin C",
            "Biotique Almond","Himalaya Soft","Laneige Night",
            "Nivea Shine","Vaseline Pink","Maybelline Nude",
            "Lakme Nude","Plum Nude","Mamaearth Nude","WOW Nude"
        };
        return brands;
    }

    if (productName.equals("Lipstick")) {
        String[] brands = {
            "Lakme","Maybelline","MAC","Swiss Beauty","Sugar",
            "Faces","Colorbar","Nykaa","Huda Beauty","Elle 18",
            "Lakme 9to5","Maybelline Matte","MAC Ruby",
            "Swiss Beauty Matte","Sugar Matte","Faces Canada",
            "Colorbar Velvet","Nykaa Matte","Huda Power","Elle 18 Pop",
            "Lakme Cushion","Maybelline Nude","MAC Nude",
            "Swiss Beauty Nude","Sugar Nude","Faces Nude",
            "Colorbar Nude","Nykaa Nude","Huda Nude","Elle 18 Nude",
            "Lakme Red","Maybelline Red","MAC Red",
            "Swiss Beauty Red","Sugar Red","Faces Red","Colorbar Red"
        };
        return brands;
    }

    if (productName.equals("Foundation")) {
        String[] brands = {
            "Maybelline","Lakme","MAC","Swiss Beauty","Sugar",
            "Faces","Colorbar","Nykaa","Huda Beauty","L'Oreal",
            "Maybelline Fit Me","Lakme 9to5","MAC Studio",
            "Swiss Beauty Liquid","Sugar Ace","Faces Ultime",
            "Colorbar Perfect","Nykaa Skin","Huda Faux","Loreal Infallible",
            "Maybelline Matte","Lakme Cushion","MAC Fix",
            "Swiss Beauty Stick","Sugar Stick","Faces Matte",
            "Colorbar Matte","Nykaa Matte","Huda Matte","Loreal Matte",
            "Maybelline Nude","Lakme Nude","MAC Nude",
            "Swiss Beauty Nude","Sugar Nude","Faces Nude","Colorbar Nude"
        };
        return brands;
    }

    if (productName.equals("Compact Powder")) {
        String[] brands = {
            "Lakme","Maybelline","MAC","Swiss Beauty","Sugar",
            "Faces","Colorbar","Pond's","Nykaa","Elle 18",
            "Lakme 9to5","Maybelline Fit","MAC Studio",
            "Swiss Beauty Matte","Sugar Compact","Faces Canada",
            "Colorbar Perfect","Pond's BB","Nykaa Skin",
            "Elle 18 Oil","Lakme Matte","Maybelline Matte",
            "MAC Matte","Swiss Beauty Oil","Sugar Oil",
            "Faces Oil","Colorbar Oil","Pond's Oil",
            "Nykaa Oil","Elle 18 Compact","Lakme Radiance",
            "Maybelline Radiance","MAC Radiance",
            "Swiss Beauty Radiance","Sugar Radiance","Faces Radiance","Colorbar Radiance"
        };
        return brands;
    }

    if (productName.equals("Eyeliner")) {
        String[] brands = {
            "Lakme","Maybelline","MAC","Sugar","Colorbar",
            "Faces","Swiss Beauty","Nykaa","Elle 18","Blue Heaven",
            "Lakme Eyeconic","Maybelline Colossal","MAC Liquid",
            "Sugar Black","Colorbar Precision","Faces Magnet",
            "Swiss Beauty Liquid","Nykaa Black","Elle 18 Bold",
            "Blue Heaven Sketch","Lakme Gel","Maybelline Gel",
            "MAC Gel","Sugar Gel","Colorbar Gel",
            "Faces Gel","Swiss Beauty Gel","Nykaa Gel",
            "Elle 18 Gel","Blue Heaven Gel","Lakme Brown",
            "Maybelline Brown","MAC Brown","Sugar Brown",
            "Colorbar Brown","Faces Brown","Swiss Beauty Brown"
        };
        return brands;
    }

    if (productName.equals("Nail Polish")) {
        String[] brands = {
            "Lakme","Colorbar","Maybelline","Faces","Elle 18",
            "Nykaa","Swiss Beauty","Plum","Blue Heaven","Revlon",
            "Lakme 9to5","Colorbar Matte","Maybelline Color",
            "Faces Canada","Elle 18 Pop","Nykaa Matte",
            "Swiss Beauty Gel","Plum Gel","Blue Heaven Gloss",
            "Revlon Color","Lakme Nude","Colorbar Nude",
            "Maybelline Nude","Faces Nude","Elle 18 Nude",
            "Nykaa Nude","Swiss Beauty Nude","Plum Nude",
            "Blue Heaven Nude","Revlon Nude","Lakme Red",
            "Colorbar Red","Maybelline Red","Faces Red",
            "Elle 18 Red","Nykaa Red","Swiss Beauty Red"
        };
        return brands;
    }

    if (productName.equals("Makeup Remover")) {
        String[] brands = {
            "Garnier","Maybelline","Lakme","Plum","Mamaearth",
            "WOW","Biotique","Himalaya","Simple","Neutrogena",
            "Garnier Micellar","Maybelline Clean","Lakme Clean",
            "Plum Cleansing","Mamaearth Rose","WOW Aloe",
            "Biotique Bio","Himalaya Gentle","Simple Clean",
            "Neutrogena Clean","Garnier Oil","Maybelline Oil",
            "Lakme Oil","Plum Oil","Mamaearth Oil",
            "WOW Oil","Biotique Oil","Himalaya Oil",
            "Simple Oil","Neutrogena Oil","Garnier Sensitive",
            "Maybelline Sensitive","Lakme Sensitive","Plum Sensitive",
            "Mamaearth Sensitive","WOW Sensitive","Biotique Sensitive"
        };
        return brands;
    }

    if (productName.equals("Cotton Pads")) {
        String[] brands = {
            "Bella","Johnson","Patanjali","Mee","Sanfe",
            "Sirona","Carmesi","Swiss Beauty","Vega","Miniso",
            "Bella Soft","Johnson Soft","Patanjali Soft",
            "Mee Soft","Sanfe Soft","Sirona Soft",
            "Carmesi Soft","Swiss Beauty Soft","Vega Soft",
            "Miniso Soft","Bella Round","Johnson Round",
            "Patanjali Round","Mee Round","Sanfe Round",
            "Sirona Round","Carmesi Round","Swiss Beauty Round",
            "Vega Round","Miniso Round","Bella Large",
            "Johnson Large","Patanjali Large","Mee Large",
            "Sanfe Large","Sirona Large","Carmesi Large"
        };
        return brands;
    }
	
	    if (productName.equals("Band Aid")) {
        String[] brands = {
            "BandAid","Dettol","Hansaplast","Leukoplast","3M",
            "Nexcare","Patanjali","CarePlast","Medicare","Viva",
            "BandAid Plus","Dettol Care","Hansaplast Aqua",
            "Leukoplast Strong","3M Micropore","Nexcare Active",
            "Patanjali Herbal","CarePlast Soft","Medicare Plus",
            "Viva Shield","BandAid Kids","Dettol Kids",
            "Hansaplast Kids","Leukoplast Kids","3M Kids",
            "Nexcare Kids","Patanjali Kids","CarePlast Kids",
            "Medicare Kids","Viva Kids","BandAid Waterproof",
            "Dettol Waterproof","Hansaplast Waterproof",
            "Leukoplast Waterproof","3M Waterproof","Nexcare Waterproof","CarePlast Waterproof"
        };
        return brands;
    }

    if (productName.equals("Antiseptic Cream")) {
        String[] brands = {
            "Dettol","Boroline","Himalaya","Savlon","Nebanol",
            "Betnovate","Patanjali","Boroplus","Moov","Relispray",
            "Dettol Plus","Boroline Plus","Himalaya Neem",
            "Savlon Heal","Nebanol Heal","Betnovate N",
            "Patanjali Herbal","Boroplus Aloe","Moov Fast",
            "Relispray Care","Dettol Germ","Boroline Germ",
            "Himalaya Care","Savlon Germ","Nebanol Germ",
            "Betnovate Care","Patanjali Care","Boroplus Care",
            "Moov Care","Relispray Heal","Dettol Skin",
            "Boroline Skin","Himalaya Skin","Savlon Skin",
            "Nebanol Skin","Betnovate Skin","Boroplus Skin"
        };
        return brands;
    }

    if (productName.equals("Pain Relief Gel")) {
        String[] brands = {
            "Volini","Moov","Iodex","Relispray","Fast Relief",
            "Zandu","Dr Ortho","Himalaya","Patanjali","Amrutanjan",
            "Volini Max","Moov Max","Iodex Ultra",
            "Relispray Plus","Fast Relief Gel","Zandu Balm",
            "Dr Ortho Oil","Himalaya Pain","Patanjali Pain",
            "Amrutanjan Strong","Volini Spray","Moov Spray",
            "Iodex Spray","Relispray Spray","Fast Relief Spray",
            "Zandu Spray","Dr Ortho Spray","Himalaya Spray",
            "Patanjali Spray","Amrutanjan Spray","Volini Roll",
            "Moov Roll","Iodex Roll","Relispray Roll",
            "Zandu Roll","Dr Ortho Roll","Himalaya Roll"
        };
        return brands;
    }

    if (productName.equals("Thermometer")) {
        String[] brands = {
            "Dr Trust","Omron","AccuSure","Equinox","Beurer",
            "Rossmax","Dr Morepen","Patanjali","HealthSense","Citizen",
            "Dr Trust Digital","Omron Digital","AccuSure Digital",
            "Equinox Digital","Beurer Digital","Rossmax Digital",
            "Dr Morepen Digital","Patanjali Digital","HealthSense Digital",
            "Citizen Digital","Dr Trust Infrared","Omron Infrared",
            "AccuSure Infrared","Equinox Infrared","Beurer Infrared",
            "Rossmax Infrared","Dr Morepen Infrared","Patanjali Infrared",
            "HealthSense Infrared","Citizen Infrared","Dr Trust Classic",
            "Omron Classic","AccuSure Classic","Equinox Classic",
            "Beurer Classic","Rossmax Classic","Dr Morepen Classic"
        };
        return brands;
    }

    if (productName.equals("Protein Powder")) {
        String[] brands = {
            "MuscleBlaze","BigMuscles","HealthKart","Optimum Nutrition","MyProtein",
            "GNC","Fast&Up","Himalayan Organics","Boldfit","Patanjali",
            "MuscleBlaze Whey","BigMuscles Whey","HealthKart Whey",
            "ON Gold","MyProtein Impact","GNC Whey","Fast&Up Whey",
            "Himalayan Whey","Boldfit Whey","Patanjali Whey",
            "MuscleBlaze Isolate","BigMuscles Isolate","HealthKart Isolate",
            "ON Isolate","MyProtein Isolate","GNC Isolate","Fast&Up Isolate",
            "Himalayan Isolate","Boldfit Isolate","Patanjali Isolate",
            "MuscleBlaze Mass","BigMuscles Mass","HealthKart Mass",
            "ON Mass","MyProtein Mass","GNC Mass","Fast&Up Mass"
        };
        return brands;
    }

    if (productName.equals("Energy Drink")) {
        String[] brands = {
            "Red Bull","Monster","Sting","Gatorade","Powerade",
            "Fast&Up","Glucon-D","Enerzal","Tzinga","Cloud9",
            "Red Bull Sugarfree","Monster Ultra","Sting Berry",
            "Gatorade Lemon","Powerade Blue","Fast&Up Reload",
            "Glucon-D Tangy","Enerzal Orange","Tzinga Mango",
            "Cloud9 Lemon","Red Bull Cola","Monster Java",
            "Sting Lime","Gatorade Orange","Powerade Orange",
            "Fast&Up Orange","Glucon-D Regular","Enerzal Lime",
            "Tzinga Cola","Cloud9 Cola","Red Bull Tropical",
            "Monster Mango","Sting Orange","Gatorade Berry",
            "Powerade Berry","Fast&Up Berry","Enerzal Berry"
        };
        return brands;
    }

    if (productName.equals("Mineral Water")) {
        String[] brands = {
            "Bisleri","Kinley","Aquafina","Bailley","Rail Neer",
            "Himalayan","Evian","Vedica","Oxyrich","Tata Water",
            "Bisleri Plus","Kinley Plus","Aquafina Plus",
            "Bailley Plus","Rail Neer Plus","Himalayan Plus",
            "Evian Plus","Vedica Plus","Oxyrich Plus",
            "Tata Plus","Bisleri Smart","Kinley Smart",
            "Aquafina Smart","Bailley Smart","Rail Neer Smart",
            "Himalayan Smart","Evian Smart","Vedica Smart",
            "Oxyrich Smart","Tata Smart","Bisleri Soda",
            "Kinley Soda","Aquafina Soda","Bailley Soda",
            "Rail Neer Soda","Vedica Soda","Oxyrich Soda"
        };
        return brands;
    }

    if (productName.equals("Coffee")) {
        String[] brands = {
            "Nescafe","Bru","Tata Coffee","Continental","Sleepy Owl",
            "Blue Tokai","Davidoff","Starbucks","Country Bean","Rage",
            "Nescafe Classic","Bru Instant","Tata Gold",
            "Continental Xtra","Sleepy Owl Brew","Blue Tokai Roast",
            "Davidoff Rich","Starbucks Pike","Country Bean Dark",
            "Rage Strong","Nescafe Gold","Bru Gold","Tata Platinum",
            "Continental Dark","Sleepy Owl Dark","Blue Tokai Dark",
            "Davidoff Espresso","Starbucks Dark","Country Bean Espresso",
            "Rage Espresso","Nescafe Decaf","Bru Decaf","Tata Decaf",
            "Continental Decaf","Sleepy Owl Decaf","Blue Tokai Decaf","Davidoff Decaf"
        };
        return brands;
    }

    if (productName.equals("Rice")) {
        String[] brands = {
            "India Gate","Daawat","Kohinoor","Fortune","Patanjali",
            "Lal Qilla","Unity","Sri Lalitha","Royal","24 Mantra",
            "India Gate Basmati","Daawat Basmati","Kohinoor Basmati",
            "Fortune Basmati","Patanjali Basmati","Lal Qilla Basmati",
            "Unity Basmati","Sri Lalitha Basmati","Royal Basmati",
            "24 Mantra Basmati","India Gate Brown","Daawat Brown",
            "Kohinoor Brown","Fortune Brown","Patanjali Brown",
            "Lal Qilla Brown","Unity Brown","Sri Lalitha Brown",
            "Royal Brown","24 Mantra Brown","India Gate Sonamasuri",
            "Daawat Sonamasuri","Kohinoor Sonamasuri","Fortune Sonamasuri",
            "Patanjali Sonamasuri","Unity Sonamasuri","Royal Sonamasuri"
        };
        return brands;
    }

    if (productName.equals("Biscuits")) {
        String[] brands = {
            "Parle","Britannia","Sunfeast","Oreo","Good Day",
            "Hide & Seek","Marie Gold","Tiger","Treat","Milano",
            "Parle-G","Britannia Marie","Sunfeast Dark",
            "Oreo Vanilla","Good Day Butter","Hide & Seek Fab",
            "Marie Gold Classic","Tiger Krunch","Treat Croissant",
            "Milano Choco","Parle Monaco","Britannia Little Hearts",
            "Sunfeast Bounce","Oreo Chocolate","Good Day Nuts",
            "Hide & Seek Black","Marie Gold Vita","Tiger Glucose",
            "Treat Strawberry","Milano Center","Parle Krackjack",
            "Britannia Bourbon","Sunfeast Moms Magic",
            "Oreo Strawberry","Good Day Creamy","Hide & Seek Cashew","Tiger Cream"
        };
        return brands;
    }
	
	 if (productName == "oil") 
		{
       String brands[] = {"Fortune","GoldWinner","Saffola","Dhara","Freedom","Sunpure","Gemini","NatureFresh",
                               "Patanjali","Engine","Ruchi","Emami","Figaro","Oleev","Nutrela","24Mantra",
                               "BBRoyal","Annapurna","Safal","Idhayam","CocoSoul","OrganicIndia","SaffolaGold",
                               "FortuneRiceBran","FortuneSunlite","GeminiPure","FreedomRefined","DharaRefined",
                               "GoldWinnerRefined","PatanjaliMustard","NatureFreshActi","SunpureGroundnut",
                               "RuchiGold","EngineMustard","EmamiHealthy","FigaroOlive","OleevActive"};
            return brands;
        }
		
		if (productName == "milk") 
		{
			String brands[] = {"Amul","Nandini","Heritage","Aavin","MotherDairy","Milma","Dodla","Gokul","Vijaya",
                       "Sanchi","Dynamix","Kwality","Verka","Paras","Ananda","CountryDelight",
                       "Akshayakalpa","PrideOfCows","NestleAPlus","Britannia","BBRoyal","BBHome",
                       "NamasteIndia","Shreeja","Gowardhan","Sudha","Saras","Patanjali","Arokya",
                       "Tirumala","Cavin","MilkyMist","Vita","Vijetha","Ksheer","Madhusudan","Anmol"};
			return brands;
		}
		
		if (productName == "Butter") {
			String brands[] = {
				"Amul","Nandini","Britannia","MilkyMist","Govardhan","MotherDairy","Verka",
				"Paras","Aavin","Vita","GowardhanPure","BBRoyal","BBHome","CountryDelight",
				"Ananda","Heritage","Milma","Dodla","Gokul","Vijaya","Sanchi",
				"Dynamix","Kwality","Saras","Sudha","Patanjali","Akshayakalpa","PrideOfCows"
			};
			return brands;
		}

		if (productName == "tea") {
			String brands[] = {
				"TataTea","RedLabel","TajMahal","Lipton","Society","WaghBakri","BrookeBond",
				"Tetley","Twinings","Girnar","Vahdam","Teabox","OrganicIndia","24Mantra",
				"Assamica","Goodricke","McLeodRussel","Typhoo","Dilmah","Namhah",
				"GoldenTips","Chaayos","Teacurry","Dorje","Aromica","TeaTrunk","Ripple","Chamong"
			};
			return brands;
		}
		
		if (productName == "detergentpowder") {
			String brands[] = {
				"SurfExcel","Ariel","Tide","Rin","Ghadi","Wheel","Henko","Fena",
				"ActiveWheel","Nirma","Ujala","Ezee","MoreChoice","BBRoyal","Safewash",
				"EasyWash","PowerWash","CleanMate","Xpert","MaxClean","FreshWash",
				"WhitePlus","UltraWash","ShineWash","PureWash","Sparkle","SuperClean","WashMate"
			};
			return brands;
		}

		if (productName == "toothpaste") {
			String brands[] = {
				"Colgate","Pepsodent","Sensodyne","CloseUp","DaburRed","Patanjali",
				"Meswak","Babool","Vicco","OralB","Aimil","Himalaya","Ayush",
				"ColgateHerbal","ColgateActive","ColgateSalt","PepsodentGermicheck",
				"SensodyneRapid","SensodyneFresh","CloseUpRed","Anchor","Forhans",
				"Herbodent","Zandu","NeemActive","FreshGel","WhiteSmile","SparkleDent"
			};
			return brands;
		}

		if (productName == "chips") {
			String brands[] = {
				"Lays","Bingo","UncleChips","Pringles","TooYumm","Haldirams","Balaji",
				"Kurkure","TagZ","Ruffles","Crax","TakaTak","MadAngles","BlueDiamond",
				"Cornitos","Doritos","PopCorners","Beanitos","Garden","Bikaji",
				"YellowDiamond","Simply7","EatReal","OpenSecret","Snackible","MaxProtein",
				"RiteBite","MrMakhana"
			};
			return brands;
		}
		if (productName == "curd") {
			String brands[] = {
				"Amul","Nandini","Heritage","Aavin","MotherDairy","Milma","Dodla","Gokul","Vijaya",
				"Sanchi","Dynamix","Kwality","Verka","Paras","Ananda","CountryDelight",
				"Akshayakalpa","PrideOfCows","Nestle","Britannia","BBRoyal","BBHome",
				"NamasteIndia","Shreeja","Gowardhan","Sudha","Saras","Patanjali","Arokya"
			};
			return brands;
		}

		if (productName == "cheese") {
			String brands[] = {
				"Amul","Britannia","Go","MilkyMist","Dlecta","LaCasa","MotherDairy","Verka",
				"Paras","Aavin","Nandini","Heritage","BBRoyal","BBHome","CountryDelight",
				"Akshayakalpa","PrideOfCows","Gowardhan","Kwality","Saras","Sudha",
				"Dynamix","Vita","Milma","Dodla","Gokul","Vijaya","Ananda","Patanjali"
			};
			return brands;
		}

		if (productName == "jam") {
			String brands[] = {
				"Kissan","Mapro","Saffola","MotherDairy","Stute","Veeba","Hersheys",
				"BBRoyal","BBHome","UrbanPlatter","24Mantra","OrganicIndia","Patanjali",
				"Anveshan","Farmley","Wingreens","DelMonte","Britannia","RelianceSelect",
				"Spencers","MoreChoice","StarSelect","Fresho","Tops","Priya","MTR",
				"Aachi","Smith","Dabur"
			};
			return brands;
		}

		if (productName == "honey") {
			String brands[] = {
				"Dabur","Patanjali","24Mantra","Saffola","Hitkari","Apis","Indigenous",
				"NatureNectar","Zandu","OrganicIndia","BBRoyal","BBHome","FarmNaturelle",
				"Anveshan","Baidyanath","Kapiva","Gir","RelianceSelect","Spencers",
				"MoreChoice","StarSelect","UrbanPlatter","VedaOils","PureAndSure",
				"ProNature","TrueElements","Himalayan","ForestEssentials","Ayurvedix"
			};
			return brands;
		}

		if (productName == "noodles") {
			String brands[] = {
				"Maggi","Yippee","TopRamen","Knorr","Chings","WaiWai","Nissin",
				"Indomie","Samyang","Koka","Itsuki","Nongshim","Paldo","Prima",
				"BBRoyal","BBHome","Patanjali","24Mantra","UrbanPlatter","SlurrpFarm",
				"RelianceSelect","Spencers","MoreChoice","StarSelect","Fresho",
				"Safal","OrganicIndia","Tops","Anil"
			};
			return brands;
		}

		if (productName == "pasta") {
			String brands[] = {
				"Borges","DelMonte","Barilla","Disano","Maggi","DiSano","LaPasta",
				"SanRemo","Durum","BBRoyal","BBHome","UrbanPlatter","24Mantra",
				"OrganicIndia","Patanjali","RelianceSelect","Spencers","MoreChoice",
				"StarSelect","Fresho","TataSampann","Bambino","Delicia","Milano",
				"Veeba","Tops","Anil","Priya","MTR"
			};
			return brands;
		}

		if (productName == "icecream") {
			String brands[] = {
				"Amul","Vadilal","KwalityWalls","MotherDairy","Arun","CreamBell",
				"Havmor","Ibaco","Naturals","BaskinRobbins","HaagenDazs","GelatoItalia",
				"LondonDairy","Giani","Apsara","Dinshaw","NIC","PolarBear",
				"TopNTop","Scoops","TenderCoconut","Milano","Gowardhan","BBRoyal",
				"BBHome","RelianceSelect","Spencers","MoreChoice","StarSelect"
			};
			return brands;
		}

		if (productName == "detergentliquid") {
			String brands[] = {
				"SurfExcel","Ariel","Tide","Rin","Henko","Ezee","Ujala",
				"MoreChoice","BBRoyal","BBHome","RelianceSelect","Spencers","StarSelect",
				"Ghadi","Wheel","Fena","Nirma","PowerWash","EasyWash","CleanMate",
				"Xpert","FreshWash","WhitePlus","UltraWash","PureWash","Sparkle",
				"SuperClean","WashMate","MaxClean"
			};
			return brands;
		}

 
        return null;
    }
}

