package Dj7;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class crp {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ crp[] f1751O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final crp f1752n = new crp("POINT_UP", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final crp f1753t = new crp("POINT_DOWN", 1);

    static {
        crp[] crpVarArrN = n();
        f1751O = crpVarArrN;
        J2 = EnumEntriesKt.enumEntries(crpVarArrN);
    }

    private static final /* synthetic */ crp[] n() {
        return new crp[]{f1752n, f1753t};
    }

    public static crp valueOf(String str) {
        return (crp) Enum.valueOf(crp.class, str);
    }

    public static crp[] values() {
        return (crp[]) f1751O.clone();
    }

    private crp(String str, int i2) {
    }
}
