class Signal{
    static void login(String userName,String password){
        System.out.println("Signal username "+userName);
        System.out.println("Signal password "+password);
    }
    static void login(long phone,String password){
        System.out.println("Signal phone "+phone);
        System.out.println("Signal password "+password);
    }
}