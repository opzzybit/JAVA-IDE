public enum GeoPoliticalZone {
    NORTH_CENTRAL("Benue","FCT","Kogi","Kwara","Nassarawa","Niger","Plateau"),
    NORTH_EAST("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    NORTH_WEST("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTH_EAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTH_SOUTH("Akwa-Ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SOUTH_WEST("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");

    private final String[] state;

    GeoPoliticalZone(String... state){
        this.state = state;
    }

    public String[] getState() {
        return state;
    }

    public static void inputVerification(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input State can not be empty");
        }
    }
    public static GeoPoliticalZone getPoliticalZone (String userState){
            inputVerification(userState);

            for (GeoPoliticalZone zone : GeoPoliticalZone.values()) {
                for (String state : zone.state) {
                    if (state.equalsIgnoreCase(userState.trim())) {
                        return zone;
                    }
                }
            }
            throw new IllegalArgumentException("Invalid stateInput" + userState);
    }
}

