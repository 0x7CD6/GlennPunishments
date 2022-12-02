package net.glennmc.core.utils;

import org.bukkit.ChatColor;

public class C {
    public static final char COLOR_CHAR = '\u00A7';

    // Misc.
    public static String bold = COLOR_CHAR + "l";
    public static String strike = COLOR_CHAR + "m";
    public static String underline = COLOR_CHAR + "n";
    public static String magic = COLOR_CHAR + "k";
    public static String italic = COLOR_CHAR + "o";
    public static String reset = COLOR_CHAR + "r";

    // Colors
    public static String black = COLOR_CHAR + "0";
    public static String darkBlue = COLOR_CHAR + "1";
    public static String darkGreen = COLOR_CHAR + "2";
    public static String darkAqua = COLOR_CHAR + "3";
    public static String darkRed = COLOR_CHAR + "4";
    public static String darkPurple = COLOR_CHAR + "5";
    public static String gold = COLOR_CHAR + "6";
    public static String gray = COLOR_CHAR + "7";
    public static String darkGray = COLOR_CHAR + "8";
    public static String blue = COLOR_CHAR + "9";
    public static String green = COLOR_CHAR + "a";
    public static String aqua = COLOR_CHAR + "b";
    public static String red = COLOR_CHAR + "c";
    public static String lightPurple = COLOR_CHAR + "d";
    public static String yellow = COLOR_CHAR + "e";
    public static String white = COLOR_CHAR + "f";

    public static String replaceColors(String colorless) {
        return ChatColor.translateAlternateColorCodes('&', colorless);
    }
}
