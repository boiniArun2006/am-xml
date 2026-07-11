package tu;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {
    private static final /* synthetic */ EnumEntries P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final /* synthetic */ j[] f73972U;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f73981n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f73979t = new j("Level1", 0, 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f73969O = new j("Level1b", 1, 2);
    public static final j J2 = new j("Level11", 2, 4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f73978r = new j("Level12", 3, 8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f73977o = new j("Level13", 4, 16);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final j f73974Z = new j("Level2", 5, 32);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final j f73970S = new j("Level21", 6, 64);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f73976g = new j("Level22", 7, 128);
    public static final j E2 = new j("Level3", 8, 256);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f73975e = new j("Level31", 9, 512);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final j f73973X = new j("Level32", 10, 1024);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final j f73971T = new j("Level4", 11, 2048);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final j f73968N = new j("Level41", 12, 4096);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f73980v = new j("Level42", 13, 8192);
    public static final j Xw = new j("Level5", 14, 16384);
    public static final j jB = new j("Level51", 15, 32768);

    static {
        j[] jVarArrN = n();
        f73972U = jVarArrN;
        P5 = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f73979t, f73969O, J2, f73978r, f73977o, f73974Z, f73970S, f73976g, E2, f73975e, f73973X, f73971T, f73968N, f73980v, Xw, jB};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f73972U.clone();
    }

    public final int rl() {
        return this.f73981n;
    }

    private j(String str, int i2, int i3) {
        this.f73981n = i3;
    }
}
