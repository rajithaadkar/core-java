class DropletRunner{

public static void main(String[] a){

Droplet d1 = new Droplet(1,"round",1.2,"clear",true);
d1.displayDetails();

Droplet d2=new Droplet(2,"oval",1.5,"blue",false);
d2.display();

Droplet d3=new Droplet(3,"round",1.1,"clear",true);
 d3.display();

Droplet d4=new Droplet(4,"oval",1.8,"grey",false);
d4.display();

Droplet d5=new Droplet(5,"round",1.0,"clear",true);
d5.display();

Droplet d6=new Droplet(6,"oval",1.3,"blue",false);
d6.display();
}