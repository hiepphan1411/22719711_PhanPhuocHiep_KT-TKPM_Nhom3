package com.iuh.strategy;

public class NormalTimingStrategy implements TimingStrategy{
    @Override public int getGreenDuration() { return 30; }
    @Override public int getRedDuration()   { return 30; }
}
