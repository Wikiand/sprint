public class WeatherStation {

    private String airTemp;
    private String airPressure;
    private String precipitation;
    private String windSpeed;
    private String windDirection;
    private String humidity;
    private String dewPoint;
    private String soilMoisture;
    private String cloudCover;

    public WeatherStation() {
        clearState();
    }

    public void updateState(String message) {
        String[] lines = message.split("\n");

        for (String line : lines) {
            String[] parts = line.split(",");

            int id = Integer.parseInt(parts[0]);
            String value = parts[1];

            switch (id) {
                case 1:
                    airTemp = value;
                    break;
                case 2:
                    airPressure = value;
                    break;
                case 7:
                    precipitation = value;
                    break;
                case 11:
                    windSpeed = value;
                    break;
                case 12:
                    windDirection = value;
                    break;
                case 13:
                    humidity = value;
                    break;
                case 14:
                    dewPoint = value;
                    break;
                case 15:
                    soilMoisture = value;
                    break;
                case 22:
                    cloudCover = value;
                    break;
                default:
                    // Ignore unknown IDs
                    break;
            }
        }
    }

    public String getState() {
        return "airTemp:" + airTemp + "\n"
                + "airPressure:" + airPressure + "\n"
                + "precipitation:" + precipitation + "\n"
                + "windSpeed:" + windSpeed + "\n"
                + "windDirection:" + windDirection + "\n"
                + "humidity:" + humidity + "\n"
                + "dewPoint:" + dewPoint + "\n"
                + "soilMoisture:" + soilMoisture + "\n"
                + "cloudCover:" + cloudCover;
    }

    public void clearState() {
        airTemp = "NULL";
        airPressure = "NULL";
        precipitation = "NULL";
        windSpeed = "NULL";
        windDirection = "NULL";
        humidity = "NULL";
        dewPoint = "NULL";
        soilMoisture = "NULL";
        cloudCover = "NULL";
    }
}
