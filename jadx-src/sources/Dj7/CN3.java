package Dj7;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ CN3[] f1594S;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1596g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f1597n = new CN3("PRIMARY", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final CN3 f1600t = new CN3("SECONDARY", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final CN3 f1593O = new CN3("TERTIARY", 2);
    public static final CN3 J2 = new CN3("QUATERNARY", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final CN3 f1599r = new CN3("PAYWALL", 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final CN3 f1598o = new CN3("MAIN_TAB_SELECTED", 5);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final CN3 f1595Z = new CN3("MAIN_TAB_UNSELECTED", 6);

    static {
        CN3[] cn3ArrN = n();
        f1594S = cn3ArrN;
        f1596g = EnumEntriesKt.enumEntries(cn3ArrN);
    }

    private static final /* synthetic */ CN3[] n() {
        return new CN3[]{f1597n, f1600t, f1593O, J2, f1599r, f1598o, f1595Z};
    }

    public static CN3 valueOf(String str) {
        return (CN3) Enum.valueOf(CN3.class, str);
    }

    public static CN3[] values() {
        return (CN3[]) f1594S.clone();
    }

    private CN3(String str, int i2) {
    }
}
