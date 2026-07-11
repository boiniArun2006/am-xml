package com.caoccao.javet.entities;

import com.caoccao.javet.interfaces.IJavetEntityMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class JavetEntityMap extends HashMap<String, Object> implements IJavetEntityMap {
    public JavetEntityMap(int i2, float f3) {
        super(i2, f3);
    }

    public JavetEntityMap(int i2) {
        super(i2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public Object clone() {
        return new JavetEntityMap(this);
    }

    public JavetEntityMap() {
    }

    public JavetEntityMap(Map<? extends String, ?> map) {
        super(map);
    }
}
