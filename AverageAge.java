package com.jap.averageofintegers;


public class AverageAge
{
    //This function calculates the average age, takes as input the raw data array
    // handle the exception appropriately
    public String averageAgeCalculator(String[] ageRawData)
    {


        int n = ageRawData.length; 
        double sum = 0;
        String res = null;

        try {
            for (int i = 0; i < n; i++) {
                sum += Integer.parseInt(ageRawData[i]);
                double avgAge = sum / n;
                res = String.valueOf(avgAge);
            }

            }
            catch (NumberFormatException object) {
            res = "java.lang.NumberFormatException: For input string: \"" + ageRawData[2] + "\"";
            }

            return res;
    }
}
