package com.workout.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String password;
    private Profile profile;
    private Setting setting;
    private Workout current;
    private List<WorkoutHistory> history;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.profile = new Profile();
        this.setting = new Setting();
        history = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void addWorkoutHistory(WorkoutHistory workout) {
        history.add(workout);
    }

    public void deleteWorkoutHistory(int index) {
        history.remove(index);
    }

    public List<WorkoutHistory> getHistory() {
        return history;
    }

    public Setting getSetting() {
        return setting;
    }

    public void updateSetting(Setting setting) {
        this.setting = setting;
    }
}
