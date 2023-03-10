package transport;

public class Car extends Transport{
    private double engineValue;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean tyres;
    private Key key;

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean setRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean setKeylessEntry() {
            return keylessEntry;

        }

        @Override
        public String toString() {
            return (remoteEngineStart?"без удаленного запуска двигателя":"удаленный запуск двигателя")+"," +
                    ""+(keylessEntry?"без ключквой запуска двигателя":"с ключом запуск двигателя");
        }
    }

    public Car(String brand, String model, String color, int maxSpeed, String assemblyCountry, int year,Double engineValue,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean tyres) {
        super(brand, model, color, maxSpeed, assemblyCountry, year);
        setEngineValue(engineValue);
        this.engineValue = engineValue;
        setTransmission(transmission);
        this.bodyType = (bodyType == "" || bodyType == null) ? "Неизвестна" : bodyType;

        setRegistrationNumber(registrationNumber);
        this.numberOfSeats = (numberOfSeats < 3) ? 0 : numberOfSeats;
        this.tyres = tyres;
        setKey(key);
    }


    public Double getEngineValue() {
        return this.engineValue;
    }

    public void setEngineValue(double engineValue) {
        if (engineValue <= 0) {
            engineValue = 1.5;
        }
        this.engineValue = engineValue;
    }


    public String getTransmission() {
        return this.transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "Неизвестна";
        }
        this.transmission = transmission;
    }

    public String getBodyType() {
        return this.bodyType;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.length() < 9 || registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "Не коректный ввод'x000xx000'";
        }
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }


    public boolean getTyres() {
        return this.tyres;
    }

    public void setTyres(boolean tyres) {
        this.tyres = tyres;
    }
    public Key getKey(){
        return key;
    }
    public void  setKey(Key key){
        if(key==null){
            key=new Key(false,false);
        }
        this.key=key;
    }

    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            tyres = false;
        }
        if (month >= 4 && month <= 10) {
            tyres = true;
        }
    }

    @Override
    public String toString() {
        return super.toString()+","+
                "Car{" +
                ", engineValue=" + engineValue +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", numberOfSeats=" + numberOfSeats +
                ", tyres=" + (tyres ? "лето" : "зима") +
                key+
                '}';
    }


}
