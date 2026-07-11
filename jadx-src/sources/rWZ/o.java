package rWZ;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class o {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ o[] f73104O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o f73105n = new o("TEMPLATES_TAB", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o f73106t = new o("LIBRARY_UI", 1);

    static {
        o[] oVarArrN = n();
        f73104O = oVarArrN;
        J2 = EnumEntriesKt.enumEntries(oVarArrN);
    }

    private static final /* synthetic */ o[] n() {
        return new o[]{f73105n, f73106t};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f73104O.clone();
    }

    private o(String str, int i2) {
    }
}
