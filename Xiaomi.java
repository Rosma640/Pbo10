public class Xiaomi implements Phone {
    int volume;
    boolean isPower;
    
    public Xiaomi() {
        volume = 50;
    }

    @Override
    public void powerOn() {
        isPower = true;
        System.out.println("Hp Menyala" );
        System.out.println("Welcome to Xiaomi Technologies" );
    }

    @Override
    public void powerOff() {
       isPower = false;
       System.out.println("Shutting Down" );
    }

    @Override
    public void volumeUp() {
        if(isPower){
            if(volume == MAX_VOLUME){
                System.out.println("Volume is Full 100%" );
            }
            else{
                volume+=5;
                System.out.println("Volume is " + getVolume() + "%" );
            }
        }
        else{
            System.out.println("Trun On Your Phone" );
        }
    }

    @Override
    public void volumeDown() {
         if(isPower){
            if(volume == MIN_VOLUME){
                System.out.println("Volume is 0%" );
            }
            else{
                volume-=5;
                System.out.println("Volume is " + getVolume() + "%" );
            }
        }
        else{
            System.out.println("Trun On Your Phone" );
        }
    }

    private int getVolume() {
       return volume;
    }
    
}
