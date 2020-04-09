package com.example.loginschoolpool;
import android.content.Context;
import android.content.res.AssetManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Utils {
    private static List<User> db;

    // This method updates the Users database at launching
    public static void updateDB(AssetManager manager) {
        String allJson = readAllLines(manager,"db.json");
        Gson gson = new Gson();
        db = gson.fromJson(allJson, new TypeToken<List<User>>() {}.getType());
    }

    // This method updates the Rides database at launching
    public static void updateRideDB(AssetManager manager) {
        String allJson = readAllLines(manager,"rides.json");
        Gson gson = new Gson();
        List<Ride> rideDb = gson.fromJson(allJson, new TypeToken<List<Ride>>() {}.getType());
        RideManager.setRideDb(rideDb);
    }

    // This method reads all lines from DB object
    private static String readAllLines(AssetManager manager, String fileName){
        BufferedReader reader = null;
        String all = "";
        String mLine = null;
        try {
            reader = new BufferedReader(new InputStreamReader(manager.open(fileName)));
            while ((mLine = reader.readLine()) != null) {
                all = all + mLine;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return all;
    }

    // Getter for Users DB
    public static List<User> getDb() {
        return db;
    }
}
