package code.src.classes.system;

import java.util.HashMap;

public class SystemAttributes {
    public static HashMap<String, String> systemAttributes = new HashMap();

    private static String STATE;
    private static String GLOBAL_ERROR_NUMBER;
    private static String PWD;
    private static String MODE;

    public static String getSTATE() {
        return STATE;
    }

    public static void setSTATE(String STATE) {
        SystemAttributes.STATE = STATE;
    }

    public static String getGlobalErrorNumber() {
        return GLOBAL_ERROR_NUMBER;
    }

    public static void setGlobalErrorNumber(String globalErrorNumber) {
        GLOBAL_ERROR_NUMBER = globalErrorNumber;
    }

    public static String getPWD() {
        return PWD;
    }

    public static void setPWD(String PWD) {
        SystemAttributes.PWD = PWD;
    }

    public static String getMODE() {
        return MODE;
    }

    public static void setMODE(String MODE) {
        SystemAttributes.MODE = MODE;
    }

    SystemAttributes() {
        systemAttributes.put("STATE", STATE);
        systemAttributes.put("GLOBAL_ERROR_NUMBER", GLOBAL_ERROR_NUMBER);
        systemAttributes.put("PWD", PWD);
        systemAttributes.put("MODE", MODE);
    }

    public static HashMap getSystemAttributes() {
        return systemAttributes;
    }
}
