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
    private static List<Ride> rideDb;

    public static void updateDB(AssetManager manager) {
        String allJson = readAllLines(manager,"db.json");
        Gson gson = new Gson();
        db = gson.fromJson(allJson, new TypeToken<List<User>>() {}.getType());
    }

    public static List<User> getDb() {
        return db;
    }

    public void setDb(List<User> db) {
        this.db = db;
    }

    public static void updateRideDB(AssetManager manager) {
        String allJson = readAllLines(manager,"rides.json");
        Gson gson = new Gson();
        rideDb = gson.fromJson(allJson, new TypeToken<List<Ride>>() {}.getType());
    }

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

    public static List<Ride> getRideDb() {
        return rideDb;
    }
}
