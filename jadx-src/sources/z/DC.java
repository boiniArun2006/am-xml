package z;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class DC {
    private static final /* synthetic */ DC[] Xw;
    private static final /* synthetic */ EnumEntries jB;
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f76237O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76238n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f76239r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f76240t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final DC f76235o = new DC("ALPHA_8", 0, 6406, 5121, 1, true, 0);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final DC f76232Z = new DC("LUMINANCE_8", 1, 6409, 5121, 1, false, 0);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final DC f76229S = new DC("LUMINANCE_ALPHA_88", 2, 6410, 5121, 2, true, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DC f76234g = new DC("RGB_888", 3, 6407, 5121, 3, false, 0);
    public static final DC E2 = new DC("RGB_565", 4, 6407, 33635, 2, false, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DC f76233e = new DC("RGBA_8888", 5, 6408, 5121, 4, true, 0);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final DC f76231X = new DC("RGBA_8888_STENCIL", 6, 6408, 5121, 5, true, 36168);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final DC f76230T = new DC("RGBA_4444", 7, 6408, 32819, 2, true, 0);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final DC f76228N = new DC("RGBA_5551", 8, 6408, 32820, 2, true, 0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final DC f76236v = new DC("RGBA_5551_STENCIL", 9, 6408, 32820, 2, true, 36168);

    static {
        DC[] dcArrN = n();
        Xw = dcArrN;
        jB = EnumEntriesKt.enumEntries(dcArrN);
    }

    private static final /* synthetic */ DC[] n() {
        return new DC[]{f76235o, f76232Z, f76229S, f76234g, E2, f76233e, f76231X, f76230T, f76228N, f76236v};
    }

    public static DC valueOf(String str) {
        return (DC) Enum.valueOf(DC.class, str);
    }

    public static DC[] values() {
        return (DC[]) Xw.clone();
    }

    public final int J2() {
        return this.f76240t;
    }

    public final int nr() {
        return this.f76238n;
    }

    public final int rl() {
        return this.f76237O;
    }

    public final boolean t() {
        return this.J2;
    }

    private DC(String str, int i2, int i3, int i5, int i7, boolean z2, int i8) {
        this.f76238n = i3;
        this.f76240t = i5;
        this.f76237O = i7;
        this.J2 = z2;
        this.f76239r = i8;
    }
}
