package FjR;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f3051S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ n[] f3052Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f3055n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f3056t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final n f3050O = new n("ENABLED", 0, true, true);
    public static final n J2 = new n("READ_ONLY", 1, true, false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f3054r = new n("WRITE_ONLY", 2, false, true);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n f3053o = new n("DISABLED", 3, false, false);

    static {
        n[] nVarArrN = n();
        f3052Z = nVarArrN;
        f3051S = EnumEntriesKt.enumEntries(nVarArrN);
    }

    private static final /* synthetic */ n[] n() {
        return new n[]{f3050O, J2, f3054r, f3053o};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f3052Z.clone();
    }

    public final boolean rl() {
        return this.f3055n;
    }

    public final boolean t() {
        return this.f3056t;
    }

    private n(String str, int i2, boolean z2, boolean z3) {
        this.f3055n = z2;
        this.f3056t = z3;
    }
}
