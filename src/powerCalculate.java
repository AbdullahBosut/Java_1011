public class powerCalculate {
    public static double cal(double voltage,double current,double powerfactor ){
        return (Math.sqrt(3)*voltage*current*powerfactor)/1000;
    }
    public static double calculateCurrent(double powerKW, double voltage, double powerFactor) {
        return  ((powerKW * 1000) / (Math.sqrt(3) * voltage * powerFactor));
    }

    public static void main(String[] args) {
        System.out.println(cal(380,25,0.8));
        System.out.println(calculateCurrent(13.163586137523467,380,0.8));
    }

        /*

        public static void main(String[] args) {
            double powerKW = 10; // kW cinsinden güç
            double voltage = 380; // Volt
            double powerFactor = 0.8; // Güç faktörü (genellikle 0.8)

            double current = calculateCurrent(powerKW, voltage, powerFactor);
            System.out.println("Hesaplanan Akım (A): " + current);
        }

         */
    }

