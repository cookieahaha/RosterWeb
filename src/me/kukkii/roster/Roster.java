package me.kukkii.roster;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.Map;
import java.util.HashMap;


public class Roster implements java.io.Serializable{
  
    private static Roster roster = new Roster();
  
    public static Roster getRoster(){
        return roster;
    }
    
    HashMap<String,Player> map;

    public Roster(){
        map = new HashMap<String,Player>();
        Player test1 = new Player("yas", "kash", "000", "cent", 0.1, "jijiji", "ftghj school");
        addPlayer("kash", test1);
        Player test2 = new Player("jhgfd", "asdfg", "uytre", "cent", 0.4, "jitiji", "ftghj ool");
        addPlayer("asdfg", test2);
        Player test3 = new Player("ytre", "kashhh", "hgfd", "cent", 55, "jijiji", "ghj school");
        addPlayer("kashhh", test3);
        Player test4 = new Player("nbvcx", "iuytr", "000", "ryhrynbt", 2.1, "brgvefv", "tgj scool");
        addPlayer("iuytr", test4);
    }
    
    public void addPlayer(String lastname, Player player){
        map.put(lastname, player);
    }
    
    public Player lookUpPlayer(String lastname){
        Player player = map.get(lastname);
        return player;
    }
    
    public void deletePlayer(String lastname){
        map.remove(lastname);
    }

    public Player[] getAll(){
      int n = map.size();
      Player [] all = new Player[n];
      int i=0;
      for (String lastname : map.keySet()) {
        Player player = map.get(lastname);
        all[i] = player;
        i += 1;
      }
      return all;
    }
        
    public void writeToFile(){
        try{
           FileOutputStream fileOut = new FileOutputStream("roster.ser");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(this);
           out.close();
           fileOut.close();
        }
        catch(IOException i){
           i.printStackTrace();
        }
    }


    public static Roster readFromFile(){
        File file = new File("roster.ser");
        if(! file.exists()){
            Roster list = new Roster();
            return list;
        }
        try{
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Roster list = (Roster) in.readObject();
            in.close();
            fileIn.close();
            return list;
        }
        catch(IOException i){
            i.printStackTrace();
            return null;
        }
        catch(ClassNotFoundException c){
            System.out.println("Roster class not found");
            c.printStackTrace();
            return null;
        }
    }
    
    
}