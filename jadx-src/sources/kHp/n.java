package kHp;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f69819o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ n[] f69820r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f69822n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f69821t = new n("ACCEPT_ALL", 0, "accept_all");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final n f69818O = new n("CUSTOMIZE", 1, "customize");
    public static final n J2 = new n("REFUSE_NOT_ESSENTIAL", 2, "refuse_not_essential");

    static {
        n[] nVarArrN = n();
        f69820r = nVarArrN;
        f69819o = EnumEntriesKt.enumEntries(nVarArrN);
    }

    private static final /* synthetic */ n[] n() {
        return new n[]{f69821t, f69818O, J2};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f69820r.clone();
    }

    public final String rl() {
        return this.f69822n;
    }

    private n(String str, int i2, String str2) {
        this.f69822n = str2;
    }
}
