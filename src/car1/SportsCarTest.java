package car1;

public class SportsCarTest {

    public static void main(String[] args) {
        SportsCar obj = new SportsCar();

        obj.setSpeed(60); // setter로 접근해서 값 변경
        obj.setTurbo(true); // setter로 접근해서 값 변경			
        
        obj.ShowInfo();
    }
}