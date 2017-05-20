package com.obochuk;

public class FootballCoach implements Coach {

    private FortuneService  fortuneService;
    private String email;
    private String team;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public FootballCoach(){}

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run with ball for 1h";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
