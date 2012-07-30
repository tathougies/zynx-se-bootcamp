
/**
 * Travel Plan -- represents a desired set of destinations, dates, and times
 *
 * Variables:
 *      List of Travel Steps
 *
 * Constructor() (empty)
 * Constructor(takes in List of Travel Plans)
 * Load(list of dictionaries)
 *      each dictionary represents one leg of trip
 */
class TravelPlan {
    public def planList = []

    TravelPlan(){}

    TravelPlan(planList){
        this.planList = planList
    }

    public Boolean load(inList){
        if (inList == null || inList.size() < 1)
            throw Exception("Invalid list of steps")
        for(step in inList)
        {def newStep = new TravelStep()
            newStep.load(step)
            planList.add(newStep)
        }
        return true
    }

    public List getPlanList(){
        return planList
    }

}
