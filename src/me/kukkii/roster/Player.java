package me.kukkii.roster;

public class Player implements java.io.Serializable, Comparable<Player>{
    
    private String firstName;
    private String lastName;
    private String number;
    private String position;
    private double battingAverage;
    private String hometown;
    private String highSchool;
    
    // constructer
    public Player(String firstName, String lastName, String number, String position, double battingAverage, String hometown, String highSchool){
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.position = position;
        this.battingAverage = battingAverage;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }
        
    // gets name
    public String getFirstName(){
        return firstName;
    }

       // gets name
    public String getLastName(){
        return lastName;
    }
    
    // gets number
    public String getNumber(){
        return number;
    }
    
    // gets position
    public String getPosition(){
        return position;
    }
    
    // gets batting average
    public double getBattingAverage(){
        return battingAverage;
    }

    // gets hometown
    public String getHomeTown(){
        return hometown;
    }

    // gets high school
    public String getHighSchool(){
        return highSchool;
    }
    
    /*
    // shows player's info
    public void showInfo(){
        System.out.println("name: " + name.getFirst() + " " + name.getLast() + " " + "number: " + number + " " + "position: " + position + " " + "batting average: " + battingAverage + "% " + "hometown: " + hometown + " " + "high school: " + highSchool);
    }
    */
    
    // compares player's last name
    public int compareTo(Player player){
        return lastName.compareTo(player.getLastName());
    }
    
    public int hashCode(){
        return lastName.hashCode();
    }
    
    public boolean equals(Player p){
        if(lastName.equals(p.getLastName())){
            return true;
        }
        else{
            return false;
        }
    }
    
}