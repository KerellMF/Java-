import java.util.Locale;

public class Temperature
{
    public static void main(String args[])
    {
        float[] patientTemperature = new float[30];

        float sum = 0;
        float averageTemp= 0;
        int recoverdPacient = 0;

        System.out.println("Температура всех пациентов: ");
        for(int i = 0; i < patientTemperature.length; i++)
        {
            float temperature = (float) (32 + (float) 8 * Math.random());
            patientTemperature[i] = temperature;
            sum += patientTemperature[i];
            System.out.print(" " + String.format(Locale.ENGLISH, "%(.1f", patientTemperature[i]));

            averageTemp = sum/patientTemperature.length;

            if(patientTemperature[i] > 36.1 && patientTemperature[i] < 37.0)
            {
                recoverdPacient += 1;
            }

        }
        System.out.println();

        System.out.println("Средняя температура: " + String.format(Locale.ENGLISH, "%(.1f", averageTemp));

        System.out.println("Колличество выздоровевших пациентов: " + recoverdPacient);

    }
}
