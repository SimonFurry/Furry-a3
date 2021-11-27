import org.junit.jupiter.api.Test;

public class Test31 {
    @Test
    void testHeartRateGenerator() {
        System.out.print("Resting Pulse: ");
        int rp = 70;
        System.out.print("Age: ");
        int age = 20;
        int intensity = 55;
        while (intensity < 100) {
            double intensityPercentage = intensity * .01;
            double targetHeartRate = (((220 - age) - rp) * intensityPercentage) + rp;
            double targetHeartRateRounded = targetHeartRate * 100 / 100;
            System.out.print(intensity + "%\t\t|\t" + Math.round(targetHeartRateRounded) + " bpm\n");
            intensity = intensity + 5;
        }
    }
}
