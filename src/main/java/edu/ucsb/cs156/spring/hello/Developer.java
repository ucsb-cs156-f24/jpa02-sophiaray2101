package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Sophia";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "sophiaray2101";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f24-15");
        team.addMember("Sophia");
        team.addMember("Cooper");
        team.addMember("Calvin");
        team.addMember("Kailai");
        team.addMember("Ria");
        team.addMember("Bhavya");
        return team;
    }

}
