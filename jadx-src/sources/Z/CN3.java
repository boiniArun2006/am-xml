package Z;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class CN3 {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ CN3[] f12262O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f12263n = new CN3("FILL", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final CN3 f12264t = new CN3("FIT", 1);

    static {
        CN3[] cn3ArrN = n();
        f12262O = cn3ArrN;
        J2 = EnumEntriesKt.enumEntries(cn3ArrN);
    }

    private static final /* synthetic */ CN3[] n() {
        return new CN3[]{f12263n, f12264t};
    }

    public static CN3 valueOf(String str) {
        return (CN3) Enum.valueOf(CN3.class, str);
    }

    public static CN3[] values() {
        return (CN3[]) f12262O.clone();
    }

    private CN3(String str, int i2) {
    }
}
