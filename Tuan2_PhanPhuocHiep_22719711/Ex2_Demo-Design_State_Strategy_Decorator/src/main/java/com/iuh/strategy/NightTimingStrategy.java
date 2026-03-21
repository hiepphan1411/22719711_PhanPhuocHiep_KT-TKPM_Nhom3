package com.iuh.strategy;

public class NightTimingStrategy implements TimingStrategy {
    @Override public int getGreenDuration() { return 15; }
    @Override public int getRedDuration()   { return 45; }
}
