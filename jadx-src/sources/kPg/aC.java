package kPg;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class aC {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f69914X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ aC[] f69916e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f69920n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f69921t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final aC f69912O = new aC("RES_2160", 0, 2160, "4k");
    public static final aC J2 = new aC("RES_1440", 1, 1440, "QHD");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final aC f69919r = new aC("RES_1080", 2, 1080, "FHD");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final aC f69918o = new aC("RES_720", 3, 720, "HD");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final aC f69915Z = new aC("RES_540", 4, 540, "SD");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final aC f69913S = new aC("RES_360", 5, 360, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final aC f69917g = new aC("RES_270", 6, 270, null);
    public static final aC E2 = new aC("RES_180", 7, 180, null);

    static {
        aC[] aCVarArrN = n();
        f69916e = aCVarArrN;
        f69914X = EnumEntriesKt.enumEntries(aCVarArrN);
    }

    private static final /* synthetic */ aC[] n() {
        return new aC[]{f69912O, J2, f69919r, f69918o, f69915Z, f69913S, f69917g, E2};
    }

    public static aC valueOf(String str) {
        return (aC) Enum.valueOf(aC.class, str);
    }

    public static aC[] values() {
        return (aC[]) f69916e.clone();
    }

    public final String rl() {
        return this.f69921t;
    }

    public final int t() {
        return this.f69920n;
    }

    private aC(String str, int i2, int i3, String str2) {
        this.f69920n = i3;
        this.f69921t = str2;
    }
}
