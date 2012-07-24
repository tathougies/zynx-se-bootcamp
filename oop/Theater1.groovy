class Theater1 {
    private name
    private movie
    private times

    Theater1(
            String name,
            String movie,
            Time[] times
    )   {
        this.name = name
        this.movie = movie
        this.times = times
    }

    String toString() {
        return name
    }

    void dimLights() {
        println "Dimming lights in theater ${name}."
    }

    void showPreviews() {
        println "Showing previews in theater ${name}."
    }

    void showMovie() {
        println "Showing ${movie} in theater ${name}."
    }

    void rollCredits() {
        println "Rolling credits for ${movie} in theater ${name}."
    }

    void cleanTheater() {
        println "Cleaning theater ${name}."
    }
}
