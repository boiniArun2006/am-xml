package Hh;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class o {
    public static CopyOnWriteArraySet n() {
        return new CopyOnWriteArraySet();
    }

    public static Set rl() {
        return t(new IdentityHashMap());
    }

    public static Set t(Map map) {
        return Collections.newSetFromMap(map);
    }
}
