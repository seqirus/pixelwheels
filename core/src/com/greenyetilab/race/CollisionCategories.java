package com.greenyetilab.race;

/**
 * Collision categories for Box2D fixtures
 */
public class CollisionCategories {
    public static final int WALL = 1;
    public static final int PLAYER = 2;
    public static final int PLAYER_BULLET = 4;
    public static final int ENEMY = 8;
    public static final int FLAT_ENEMY = 16;
    public static final int GIFT = 32;
}