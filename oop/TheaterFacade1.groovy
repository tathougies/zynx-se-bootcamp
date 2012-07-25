class TheaterFacade1 {
    private theater

    TheaterFacade1(Theater1 theater) {
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
