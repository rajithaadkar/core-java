class InternetRunner{

public static void main(String[] inter){

Internet i = new Internet();
i.internetId = 1;


Browser browser = new Browser();
i.b = browser;

browser.browserId = 1;
browser.browserName = "Chrome";
browser.browserCompany = "Google";
browser.isSecured = true;

i.getDetails();



}

}