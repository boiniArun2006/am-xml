package tu;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {
    private static final /* synthetic */ EnumEntries E2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ n[] f73985g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f73989n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f73988t = new n("Baseline", 0, 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final n f73982O = new n("Main", 1, 2);
    public static final n J2 = new n("Extended", 2, 4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f73987r = new n("High", 3, 8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n f73986o = new n("High10", 4, 16);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final n f73984Z = new n("High422", 5, 32);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final n f73983S = new n("High444", 6, 64);

    static {
        n[] nVarArrN = n();
        f73985g = nVarArrN;
        E2 = EnumEntriesKt.enumEntries(nVarArrN);
    }

    private static final /* synthetic */ n[] n() {
        return new n[]{f73988t, f73982O, J2, f73987r, f73986o, f73984Z, f73983S};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f73985g.clone();
    }

    public final int rl() {
        return this.f73989n;
    }

    private n(String str, int i2, int i3) {
        this.f73989n = i3;
    }
}
