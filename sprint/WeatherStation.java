package sprint;

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

        int id = Integer.parseInt(parts[0].trim());
        String rawValue = parts[1].trim();

if (!rawValue.equals("NULL")) {
    double number = Double.parseDouble(rawValue);
    rawValue = Double.toString(number);
}

        switch (id) {
            case 1:
                airTemp = rawValue;
                break;
            case 2:
                airPressure =rawValue;
                break;
            case 7:
                precipitation = rawValue;
                break;
            case 11:
                windSpeed =rawValue;
                break;
            case 12:
                windDirection =rawValue;
                break;
            case 13:
                humidity = rawValue;
                break;
            case 14:
                dewPoint = rawValue;
                break;
            case 15:
                soilMoisture = rawValue;
                break;
            case 22:
                cloudCover = rawValue;
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
                + "cloudCover:" + cloudCover + "\n";
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
