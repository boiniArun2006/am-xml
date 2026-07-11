package tu;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class CN3 {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73866X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ CN3[] f73868e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String[] f73873n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final CN3 f73872t = new CN3("JPEG", 0, "FF D8 FF DB", "FF D8 FF E0 ?? ?? 4A 46 49 46 00 01", "FF D8 FF E1 ?? ?? 45 78 69 66 00 00");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final CN3 f73864O = new CN3("PNG", 1, "89 50 4E 47 0D 0A 1A 0A");
    public static final CN3 J2 = new CN3("GIF", 2, "47 49 46 38 37 61", "47 49 46 38 39 61");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final CN3 f73871r = new CN3("TIFF", 3, "49 49 2A 00", "4D 4D 00 2A");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final CN3 f73870o = new CN3("WEBP", 4, "52 49 46 46 ?? ?? ?? ?? 57 45 42 50");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final CN3 f73867Z = new CN3("ZIP", 5, "50 4B 03 04", "50 4B 05 06", "50 4B 07 08");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final CN3 f73865S = new CN3("PDF", 6, "25 50 44 46");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CN3 f73869g = new CN3("WAV", 7, "52 49 46 46 ?? ?? ?? ?? 57 41 56 45");
    public static final CN3 E2 = new CN3("BMP", 8, "42 4D");

    static {
        CN3[] cn3ArrN = n();
        f73868e = cn3ArrN;
        f73866X = EnumEntriesKt.enumEntries(cn3ArrN);
    }

    private static final /* synthetic */ CN3[] n() {
        return new CN3[]{f73872t, f73864O, J2, f73871r, f73870o, f73867Z, f73865S, f73869g, E2};
    }

    public static CN3 valueOf(String str) {
        return (CN3) Enum.valueOf(CN3.class, str);
    }

    public static CN3[] values() {
        return (CN3[]) f73868e.clone();
    }

    public final String[] rl() {
        return this.f73873n;
    }

    private CN3(String str, int i2, String... strArr) {
        this.f73873n = strArr;
    }
}
