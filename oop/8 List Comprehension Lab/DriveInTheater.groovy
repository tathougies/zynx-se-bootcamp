class DriveInTheater {
    private name
    private movie
    private time

    DriveInTheater(String name,
                   String movie,
                   Time time
    ) {
        this.name = name
        this.movie = movie
        this.time = time
    }

    void setUpProjector() {
        println "Setting up projector at theater ${name}."
    }

    void setUpSpeakers() {
        println "Setting up speakers next to cars at theater ${name}."
    }

    void closeGate() {
        println "Closing gate while ${movie} is showing."
    }

    void showMovie() {
        println "Showing ${movie} at theater ${name}."
    }

    void rollCredits() {
        println "Rolling credits for ${movie} at theater ${name}."
    }

    void openGate() {
        println "Opening gates for cars to leave at theater ${name}."
    }

    void takeDownProjector() {
        println "Taking down the project at theater ${name}."
    }

    void takeDownSpeakers() {
        println "Taking down speakers at theater ${name}."
    }
}
