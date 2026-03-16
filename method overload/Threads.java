class Threads{
    static void login(String userName,String password){
        System.out.println("Threads username "+userName);
        System.out.println("Threads password "+password);
    }
    static void login(long phone,String password){
        System.out.println("Threads phone "+phone);
        System.out.println("Threads password "+password);
    }
}