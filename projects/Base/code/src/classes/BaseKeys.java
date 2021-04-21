package code.src.classes;

import code.src.interfaces.MMZedBase;

import java.util.HashMap;

public class BaseKeys implements MMZedBase {
    //public HashMap baseKeys = new HashMap();

    BaseKeys() {
        MMZedBase.baseKeys.put("__SYSTEM__", "value");

    }

}
