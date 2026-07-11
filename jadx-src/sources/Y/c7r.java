package Y;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class c7r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11941o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ c7r[] f11942r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11944n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c7r f11943t = new c7r("EFFECT_CARD", 0, "effect_card");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final c7r f11940O = new c7r("SEARCH_SUGGESTED", 1, "search_suggested");
    public static final c7r J2 = new c7r("SEARCH_MATCH", 2, "search_match");

    static {
        c7r[] c7rVarArrN = n();
        f11942r = c7rVarArrN;
        f11941o = EnumEntriesKt.enumEntries(c7rVarArrN);
    }

    private static final /* synthetic */ c7r[] n() {
        return new c7r[]{f11943t, f11940O, J2};
    }

    public static c7r valueOf(String str) {
        return (c7r) Enum.valueOf(c7r.class, str);
    }

    public static c7r[] values() {
        return (c7r[]) f11942r.clone();
    }

    public final String rl() {
        return this.f11944n;
    }

    private c7r(String str, int i2, String str2) {
        this.f11944n = str2;
    }
}
