package nl.shadeblackwolf.denversgame.player;

import java.util.HashSet;
import java.util.Set;

public class Player {
    private static final int BASE_MAX_HEALTH = 100;
    private static final int HEALTH_TANK_SIZE = 100;

    private Set<Integer> healthTanks = new HashSet<>();

    public void resetHealthTanks() {
        healthTanks = new HashSet<>();
    }

    public int getMaxHealth() {
        return BASE_MAX_HEALTH + healthTanks.size() * HEALTH_TANK_SIZE;
    }

    public void addHealthTank(int i) {
        healthTanks.add(i);
    }
}
