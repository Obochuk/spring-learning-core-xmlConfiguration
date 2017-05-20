package com.obochuk;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    // init method
    public void doMyStartupMethod(){
        System.out.println("TrackCoach: in doMyStartupMethod");
    }

    // destroy method
    public void doMyDestroyMethod(){
        System.out.println("TrackCoach: in doMyDestroyMethod");
    }
}
