package com.iuh.strategy;

public class PeakHourTimingStrategy implements TimingStrategy{
    @Override public int getGreenDuration() { return 60; }
    @Override public int getRedDuration()   { return 20; }
}
