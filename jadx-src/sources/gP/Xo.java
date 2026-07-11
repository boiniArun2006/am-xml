package gP;

import WJ.phkN.HFAkacKHsU;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Xo {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ Xo[] f67529D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f67540a;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f67546O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f67547n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f67548t;
    public static final Xo J2 = new Xo("latin", 0, "latin", 1, 2132019125);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Xo f67544r = new Xo("latin_ext", 1, "latin-ext", 2, 2132019126);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Xo f67543o = new Xo("sinhala", 2, "sinhala", 12, 2132019130);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Xo f67539Z = new Xo("greek", 3, "greek", 13, 2132019116);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Xo f67535S = new Xo(HFAkacKHsU.kOYRcwlDicvpr, 4, "hebrew", 14, 2132019120);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Xo f67542g = new Xo("cyrillic_ext", 5, "cyrillic-ext", 15, 2132019114);
    public static final Xo E2 = new Xo("cyrillic", 6, "cyrillic", 16, 2132019113);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Xo f67541e = new Xo("greek_ext", 7, "greek-ext", 17, 2132019117);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final Xo f67538X = new Xo("vietnamese", 8, "vietnamese", 18, 2132019134);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final Xo f67536T = new Xo("devanagari", 9, "devanagari", 19, 2132019115);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Xo f67534N = new Xo("arabic", 10, "arabic", 20, 2132019111);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Xo f67545v = new Xo("khmer", 11, "khmer", 21, 2132019123);
    public static final Xo Xw = new Xo("tamil", 12, "tamil", 22, 2132019131);
    public static final Xo jB = new Xo("thai", 13, "thai", 23, 2132019133);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final Xo f67537U = new Xo("bengali", 14, "bengali", 24, 2132019112);
    public static final Xo P5 = new Xo("gujarati", 15, "gujarati", 25, 2132019118);
    public static final Xo M7 = new Xo("oriya", 16, "oriya", 26, 2132019129);
    public static final Xo p5 = new Xo("malayalam", 17, "malayalam", 27, 2132019127);
    public static final Xo eF = new Xo("gurmukhi", 18, "gurmukhi", 28, 2132019119);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Xo f67530E = new Xo("kannada", 19, "kannada", 29, 2132019122);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Xo f67533M = new Xo("telugu", 20, "telugu", 30, 2132019132);

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    public static final Xo f67531FX = new Xo("korean", 21, "korean", 31, 2132019124);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Xo f67528B = new Xo("japanese", 22, "japanese", 32, 2132019121);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final Xo f67532J = new Xo("myanmar", 23, "myanmar", 33, 2132019128);

    static {
        Xo[] xoArrN = n();
        f67529D = xoArrN;
        f67540a = EnumEntriesKt.enumEntries(xoArrN);
    }

    private static final /* synthetic */ Xo[] n() {
        return new Xo[]{J2, f67544r, f67543o, f67539Z, f67535S, f67542g, E2, f67541e, f67538X, f67536T, f67534N, f67545v, Xw, jB, f67537U, P5, M7, p5, eF, f67530E, f67533M, f67531FX, f67528B, f67532J};
    }

    public static Xo valueOf(String str) {
        return (Xo) Enum.valueOf(Xo.class, str);
    }

    public static Xo[] values() {
        return (Xo[]) f67529D.clone();
    }

    public final int rl() {
        return this.f67548t;
    }

    public final int t() {
        return this.f67546O;
    }

    private Xo(String str, int i2, String str2, int i3, int i5) {
        this.f67547n = str2;
        this.f67548t = i3;
        this.f67546O = i5;
    }
}
