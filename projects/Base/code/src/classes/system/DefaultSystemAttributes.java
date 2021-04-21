package code.src.classes.system;

import java.util.HashMap;

public class DefaultSystemAttributes {
    public static HashMap<String, String> defaultSystemAttributes = new HashMap();

    DefaultSystemAttributes() {
        defaultSystemAttributes.put("STATE", SystemAttributes.getSTATE());
        defaultSystemAttributes.put("GLOBAL_ERROR_NUMBER", SystemAttributes.getGlobalErrorNumber());
        defaultSystemAttributes.put("PWD", SystemAttributes.getPWD());
        defaultSystemAttributes.put("MODE", SystemAttributes.getMODE());
    }
}
