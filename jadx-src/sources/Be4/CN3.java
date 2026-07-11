package Be4;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class CN3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f518o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ CN3[] f519r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f517n = new CN3("MEMORY_CACHE", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final CN3 f520t = new CN3("MEMORY", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final CN3 f516O = new CN3("DISK", 2);
    public static final CN3 J2 = new CN3("NETWORK", 3);

    static {
        CN3[] cn3ArrN = n();
        f519r = cn3ArrN;
        f518o = EnumEntriesKt.enumEntries(cn3ArrN);
    }

    private static final /* synthetic */ CN3[] n() {
        return new CN3[]{f517n, f520t, f516O, J2};
    }

    public static CN3 valueOf(String str) {
        return (CN3) Enum.valueOf(CN3.class, str);
    }

    public static CN3[] values() {
        return (CN3[]) f519r.clone();
    }

    private CN3(String str, int i2) {
    }
}
