public class Main {
    public static void main(String[] args) {
        //Массив температур оборудования
        int[] temperatures = {75, 78, 82, 79, 85, 77, 81, 76, 83, 74};

        double sum = 0; 
        boolean hasCritical = false; 

        System.out.println("Мониторинг температуры оборудования:\n");

       
        for (int i = 0; i < temperatures.length; i++) {
            int minute = i + 1; 
            int temp = temperatures[i];
            sum += temp; 
            if (temp > 80) {
                System.out.println("ТРЕВОГА! На " + minute + "-й минуте температура: " + temp + "°C (превышает 80°C)");
                hasCritical = true;
            }
        }
        double averageTemp = sum / temperatures.length;

        System.out.println("\nСредняя температура за период: " + averageTemp + "°C");

        if (!hasCritical) {
            System.out.println("Критических превышений не зафиксировано.");
        }
    }
}
