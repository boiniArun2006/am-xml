package androidx.webkit.internal;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class StartupApiFeature {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f42523t = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f42524n;
    private final String rl;

    public static class NoFramework extends StartupApiFeature {
        NoFramework(String str, String str2) {
            super(str, str2);
        }
    }

    public static class P extends StartupApiFeature {
        P(String str, String str2) {
            super(str, str2);
        }
    }

    StartupApiFeature(String str, String str2) {
        this.f42524n = str;
        this.rl = str2;
        f42523t.add(this);
    }
}
