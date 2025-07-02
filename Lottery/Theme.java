import javax.swing.*;
import java.awt.*;

public class Theme {
    private String state;
    
    public Theme(String s) {
        state = s;
    }
    
    public ImageIcon getImageIcon() {
        return new ImageIcon("Images/" + state + ".png");
    }
    
    public Color getColor() {
        switch(state) {
            case "ARIZONA" : return new Color(129, 194, 215);
            case "ARKANSAS" : return new Color(205, 112, 89);
            case "CALIFORNIA" : return new Color(223, 143, 13);
            case "COLORADO" : return new Color(48, 186, 153);
            case "CONNECTICUT" : return new Color(136, 89, 205);
            case "DELAWARE" : return new Color(236, 184, 61);
            case "FLORIDA" : return new Color(241, 102, 109);
            case "GEORGIA" : return new Color(115, 73, 229);
            case "IDAHO" : return new Color(39, 166, 233);
            case "ILLINOIS" : return new Color(208, 150, 63);
            case "INDIANA" : return new Color(138, 57, 57);
            case "IOWA" : return new Color(239, 123, 0);
            case "KANSAS" : return new Color(89, 186, 221);
            case "KENTUCKY" : return new Color(54, 117, 215);
            case "LOUISIANA" : return new Color(143, 15, 88);
            case "MAINE" : return new Color(174, 221, 73);
            case "MARYLAND" : return new Color(231, 219, 98);
            case "MASSACHUSETTS" : return new Color(61, 99, 153);
            case "MICHIGAN" : return new Color(69, 127, 194);
            case "MINNESOTA" : return new Color(195, 213, 3);
            case "MISSISSIPPI" : return new Color(216, 172, 41);
            case "MISSOURI" : return new Color(124, 150, 180);
            case "MONTANA" : return new Color(203, 81, 81);
            case "NEBRASKA" : return new Color(255, 150, 0);
            case "NEWHAMPSHIRE" : return new Color(166, 166, 166);
            case "NEWJERSEY" : return new Color(4, 106, 56);
            case "NEWMEXICO" : return new Color(170, 154, 102);
            case "NEWYORK" : return new Color(0, 96, 169);
            case "NORTHCAROLINA" : return new Color(28, 61, 112);
            case "NORTHDAKOTA" : return new Color(244, 137, 67);
            case "OHIO" : return new Color(130, 171, 201);
            case "OKLAHOMA" : return new Color(243, 161, 44);
            case "OREGON" : return new Color(92, 21, 21);
            case "PENNSYLVANIA" : return new Color(87, 135, 76);
            case "RHODEISLAND" : return new Color(236, 236, 62);
            case "SOUTHCAROLINA" : return new Color(0, 93, 171);
            case "SOUTHDAKOTA" : return new Color(255, 123, 0);
            case "TENNESSEE" : return new Color(155, 48, 202);
            case "TEXAS" : return new Color(110, 156, 223);
            case "VERMONT" : return new Color(129, 168, 85);
            case "VIRGINIA" : return new Color(255, 101, 0);
            case "WASHINGTON" : return new Color(0, 72, 58);
            case "WESTVIRGINIA" : return new Color(175, 42, 33);
            case "WISCONSIN" : return new Color(215, 54, 54);
            case "WYOMING" : return new Color(4, 83, 127);
            default : return new Color(245, 175, 12);
        }
    }
}
