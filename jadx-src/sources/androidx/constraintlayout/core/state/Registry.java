package androidx.constraintlayout.core.state;

import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Registry {
    private static final Registry rl = new Registry();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HashMap f35397n = new HashMap();

    public static Registry n() {
        return rl;
    }

    public void rl(String str, RegistryCallback registryCallback) {
        this.f35397n.put(str, registryCallback);
    }
}
