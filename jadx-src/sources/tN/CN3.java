package tN;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class CN3 {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ CN3[] f73453O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f73454n = new CN3("TEMPLATE", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final CN3 f73455t = new CN3("PRESET", 1);

    static {
        CN3[] cn3ArrN = n();
        f73453O = cn3ArrN;
        J2 = EnumEntriesKt.enumEntries(cn3ArrN);
    }

    private static final /* synthetic */ CN3[] n() {
        return new CN3[]{f73454n, f73455t};
    }

    public static CN3 valueOf(String str) {
        return (CN3) Enum.valueOf(CN3.class, str);
    }

    public static CN3[] values() {
        return (CN3[]) f73453O.clone();
    }

    private CN3(String str, int i2) {
    }
}
