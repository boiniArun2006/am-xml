package rWZ;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class CN3 {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ CN3[] f73052O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f73053n = new CN3("GRANTED", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final CN3 f73054t = new CN3("DENIED", 1);

    static {
        CN3[] cn3ArrN = n();
        f73052O = cn3ArrN;
        J2 = EnumEntriesKt.enumEntries(cn3ArrN);
    }

    private static final /* synthetic */ CN3[] n() {
        return new CN3[]{f73053n, f73054t};
    }

    public static CN3 valueOf(String str) {
        return (CN3) Enum.valueOf(CN3.class, str);
    }

    public static CN3[] values() {
        return (CN3[]) f73052O.clone();
    }

    private CN3(String str, int i2) {
    }
}
