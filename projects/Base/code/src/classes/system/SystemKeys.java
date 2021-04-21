package code.src.classes.system;


import java.util.HashMap;

public class SystemKeys {
    public static HashMap systemKeys = new HashMap();

    public static HashMap<String, HashMap> GLOBAL_FINAL_ATTRIBUTES = new HashMap();

    public static void setGlobalFinalAttributes(HashMap globalFinalAttributes) {


    }

    SystemKeys() {
        systemKeys.put("GLOBAL_FINAL_ATTRIBUTES", GLOBAL_FINAL_ATTRIBUTES);

    }


    public static HashMap getSystemKeys() {
        return systemKeys;
    }
}
