package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_object(){
        Team team = new Team("Team 1");
        team.addMember("mem 1");
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_different_class(){
        Team team = new Team("Team 1");
        team.addMember("mem 1");
        String other = "No team";
        assertFalse(team.equals(other));
    }

    @Test
    public void equals_true_true() {
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 1");
        team1.addMember("mem 1");
        team2.addMember("mem 1");
        assertTrue(team1.equals(team2));
    }

    @Test
    public void equals_true_false() {
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 1");
        team1.addMember("mem 1");
        team2.addMember("mem 2");
        assertFalse(team1.equals(team2));
    }

    @Test
    public void equals_false_true() {
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 2");
        team1.addMember("mem 1");
        team2.addMember("mem 1");
        assertFalse(team1.equals(team2));
    }

    @Test
    public void check_hashcode_value(){
        Team t1 = new Team();
        int result = t1.hashCode(); 
        int expected = 1;
        assertEquals(expected,result);
    }
}
