class CalenderRunner{

public static void main(String[] a){

Calender calender = new Calender();
 
Event event = new Event();
event.eventTypes = EventTypes.LEAVES;
event.title = " ";
event.startDate = "13 April";
event.enddate = "14 April";
event.userName = "Rajitha";


calender.addEvent(event);
calender.getEvent();
}

}