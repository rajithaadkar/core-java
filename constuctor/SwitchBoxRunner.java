class SwitchBoxRunner {
    public static void main(String[] args) {

        SwitchBox sb1 = new SwitchBox(1, "Anchor", 4, "Plastic", "White", 250, true, "Modular");
        SwitchBox sb2 = new SwitchBox(2, "Havells", 6, "Polycarbonate", "Ivory", 350, true, "Modular");
        SwitchBox sb3 = new SwitchBox(3, "GM", 8, "Plastic", "White", 450, false, "Traditional");
        SwitchBox sb4 = new SwitchBox(4, "Legrand", 5, "Polycarbonate", "White", 500, true, "Modular");
        SwitchBox sb5 = new SwitchBox(5, "AnchorRoma", 3, "Plastic", "Ivory", 220, false, "Traditional");
        SwitchBox sb6 = new SwitchBox(6, "Syska", 7, "Polycarbonate", "Grey", 480, true, "Modular");
        SwitchBox sb7 = new SwitchBox(7, "Wipro", 2, "Plastic", "White", 150, false, "Traditional");
        SwitchBox sb8 = new SwitchBox(8, "Philips", 6, "Polycarbonate", "Black", 520, true, "Smart");
        SwitchBox sb9 = new SwitchBox(9, "Panasonic", 4, "Plastic", "White", 300, true, "Modular");
        SwitchBox sb10 = new SwitchBox(10, "Crompton", 5, "Polycarbonate", "Grey", 410, false, "Modular");

        
        sb1.display();
        sb2.display();
        sb3.display();
        sb4.display();
        sb5.display();
        sb6.display();
        sb7.display();
        sb8.display();
        sb9.display();
        sb10.display();
    }
}