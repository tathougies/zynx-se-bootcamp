class TheaterFacade2 {
    private theater

    TheaterFacade2(Theater2 theater) {
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