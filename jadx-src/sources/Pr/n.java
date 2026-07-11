package Pr;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7850o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ n[] f7851r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f7849n = new n("YEARS", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f7852t = new n("UP_TO_MONTHS", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final n f7848O = new n("UP_TO_YEARS", 2);
    public static final n J2 = new n("DEFINED_BY_THIRD_PARTY", 3);

    static {
        n[] nVarArrN = n();
        f7851r = nVarArrN;
        f7850o = EnumEntriesKt.enumEntries(nVarArrN);
    }

    private static final /* synthetic */ n[] n() {
        return new n[]{f7849n, f7852t, f7848O, J2};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f7851r.clone();
    }

    private n(String str, int i2) {
    }
}
