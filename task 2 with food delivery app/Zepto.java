class Zepto{
static double price;

public static double search(String foodName){
	if(foodName == "Burger"){
	price=149.00;
	return price;
	}
	if(foodName == "Sandwich"){
		price = 79.00;
		return price;
    }
	if(foodName == "IceCake"){
	price=59.00;
	return price;
	}
	if(foodName == "Lays"){
		price = 20.00;
		return price;
    }
	if(foodName == "Chaoclate Icecream"){
	price=45.00;
	return price;
	}
	if(foodName == "Frenchfries"){
		price = 60.00;
		return price;
	}
	if(foodName == "Pizza"){
		price=199; 
		return price; 
		}
    if(foodName == "Pasta"){
		price=120; 
		return price; 
		}
    if(foodName == "Noodles"){ 
		price=90;
		return price; 
		}
    if(foodName == "Momos"){
		price=80;
		return price;
		}
    if(foodName == "Samosa"){
		price=15; 
		return price; 
		}
    if(foodName == "Dosa"){
		price=50; 
		return price; 
		}
    if(foodName == "Idli"){
		price=40;
		return price;
		}
    if(foodName == "Vada"){ 
		price=30; 
		return price;
		}
    if(foodName == "Biryani"){
		price=180; 
		return price;
		}
    if(foodName == "FriedRice"){
			price=130;
			return price; 
			}
    if(foodName == "PaneerButterMasala"){
			price=220; 
			return price;
			}
    if(foodName == "Chapati"){
			price=20;
			return price;
			}
    if(foodName == "Parotta"){
			price=25; 
			return price; 
			}
    if(foodName == "EggRoll"){
		price=70;
		return price; 
			}
    if(foodName == "ChickenRoll"){
		price=100;
		return price;
		}
    if(foodName == "ColdCoffee"){
			price=90; 
			return price; 
			}
        if(foodName == "Tea"){ 
		price=15;
		return price; 
		}
        if(foodName == "Coffee"){ 
		price=20; 
		return price;
		}
        if(foodName == "Milkshake"){
			price=110; 
			return price;
			}
        if(foodName == "Brownie"){
			price=60;
			return price;
			}
        if(foodName == "Cupcake"){ 
		price=50; 
		return price;
		}
        if(foodName == "Donut"){
			price=70;
			return price; }
        if(foodName == "Popcorn"){
			price=40; 
			return price; }
        if(foodName == "Nachos"){
			price=120; 
			return price; }
        if(foodName == "Hotdog"){
			price=150;
			return price; }
    if(foodName == "CheeseBalls"){ 
		price=90; 
		return price; }
    if(foodName == "SpringRoll"){
			price=100;
			return price; }
        if(foodName == "Tacos"){
			price=130;
			return price; }
        if(foodName == "Wrap"){
			price=110;
			return price; }
        if(foodName == "Falooda"){
			price=85;
			return price; }
        if(foodName == "GulabJamun"){
			price=40;
			return price; }
        if(foodName == "Rasgulla"){
			price=45;
			return price; }
        if(foodName == "Kheer"){
			price=60;
			return price; }
        if(foodName == "Halwa"){
			price=70;
			return price; }
        if(foodName == "FruitSalad"){
			price=90;
			return price; }
        if(foodName == "Omelette"){
			price=50;
			return price; }
        if(foodName == "BoiledEgg"){
			price=20;
			return price; }
        if(foodName == "ChickenCurry"){
			price=200;
			return price; }
        if(foodName == "FishFry"){
			price=180;
			return price; }
        if(foodName == "Prawns"){
			price=250;
			return price; }
        if(foodName == "VegMeal"){
			price=120;
			return price; }
        if(foodName == "NonVegMeal"){
			price=200;
			return price; 
			}
        if(foodName == "Juice"){
			price=60;
			return price;
			}
        if(foodName == "Lemonade"){
			price=40;
			return price; 
			}
        if(foodName == "Soda"){
			price=30;
			return price;
			}
        if(foodName == "EnergyDrink"){
			price=110;
			return price;
			}
        if(foodName == "Chocolate"){
			price=50;
			return price; 
			}
        if(foodName == "IceCreamCone"){
			price=35;
			return price;
			}
        if(foodName == "Kulfi"){
			price=40;
			return price;
			}
        if(foodName == "Chips"){
			price=25;
			return price; 
			}
        if(foodName == "Biscuits"){
			price=30;
			return price; 
			}
        if(foodName == "CakeSlice"){
			price=80;
			return price; 
			}
        if(foodName == "Pastry"){
			price=90;
			return price; 
			}

	
return price;
}
 
 public static double search(String foodName, int quantity){
	if (foodName == "Burger") {
		price = 149.00 * quantity;
		return price;
	}
	if (foodName == "Sandwich") {
		price = 79.00 * quantity;
		return price;
	}
	if (foodName == "IceCake") {
		price = 59.00 * quantity;
		return price;
	}
    if (foodName == "Lays")  {
		price = 20.00 * quantity;
		return price;
	}
    if (foodName == "Chaoclate ICC_ColorSpace") {
		price = 45.00 * quantity;
		return price;
	}
    if (foodName == "Frenchfries") {
		price = 60.00 * quantity;
		return price;		
		
	}
	if (foodName == "Pizza"){
	price = 199 * quantity;
    return price;
    }
        if (foodName == "Pasta"){ 
			price = 120 * quantity;
			return price;
		}
        if (foodName == "Noodles"){
			price = 90 * quantity;
		return price;	
		}
        if (foodName == "Momos"){
			price = 80 * quantity;
		return price;	
		}
        if (foodName == "Samosa"){
			price = 15 * quantity;
		return price;	
		}
        if (foodName == "Dosa"){
			price = 50 * quantity;
		return price;	
		}
        if (foodName == "Idli"){
			price = 40 * quantity;
		return price;
        }		
	    if (foodName == "Vada"){
			price = 30 * quantity;
		return price;	
		}
        if (foodName == "Biryani"){ 
			price = 180 * quantity;
		return price;	
		}
        if (foodName == "FriedRice"){
			price = 130 * quantity;
		return price;	
		}
        if (foodName == "PaneerButterMasala"){
			price = 220 * quantity;
		return price;	
		}
        if (foodName == "Chapati"){
			price = 20 * quantity;
		return price;	
		}
        if (foodName == "Parotta"){
			price = 25 * quantity;
		return price;	
		}
        if (foodName == "EggRoll"){
			price = 70 * quantity;
		return price;	
		}
        if (foodName == "ChickenRoll"){
			price = 100 * quantity;
		return price;	
		}
		
	 return price;
 }
}