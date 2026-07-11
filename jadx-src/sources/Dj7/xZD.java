package Dj7;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class xZD {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ xZD[] f1894O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final xZD f1895n = new xZD("TOP_DOWN", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final xZD f1896t = new xZD("BOTTOM_UP", 1);

    static {
        xZD[] xzdArrN = n();
        f1894O = xzdArrN;
        J2 = EnumEntriesKt.enumEntries(xzdArrN);
    }

    private static final /* synthetic */ xZD[] n() {
        return new xZD[]{f1895n, f1896t};
    }

    public static xZD valueOf(String str) {
        return (xZD) Enum.valueOf(xZD.class, str);
    }

    public static xZD[] values() {
        return (xZD[]) f1894O.clone();
    }

    private xZD(String str, int i2) {
    }
}
