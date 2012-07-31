class DriveInTheaterAdaptor implements Theater{

    private driveInTheater

    DriveInTheaterAdaptor(DriveInTheater driveInTheater) {
        this.driveInTheater = driveInTheater
    }

    void dimLights() {
        driveInTheater.setUpProjector()
        driveInTheater.setUpSpeakers()
    }

    void showPreviews() {}

    void showMovie() {
        driveInTheater.closeGate()
        driveInTheater.showMovie()
    }

    void rollCredits() {
        driveInTheater.rollCredits()
        driveInTheater.openGate()
    }

    void cleanTheater() {
        driveInTheater.takeDownProjector()
        driveInTheater.takeDownSpeakers()
    }
}
