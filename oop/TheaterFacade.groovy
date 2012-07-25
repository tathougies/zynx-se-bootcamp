class TheaterFacade {
    private theater

    TheaterFacade(Theater1 theater) {
        this.theater = theater
    }

    void runTheater() {
        theater.dimLights()
        theater.showPreviews()
        theater.showMovie()
        theater.rollCredits()
        theater.cleanTheater()
    }
}
