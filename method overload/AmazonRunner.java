class AmazonRunner{
    public static void main(String[] args){
        Amazon.login("user@amazon.com","amazon123");
        Amazon.login(9876543210L,"amazon123");
    }
}