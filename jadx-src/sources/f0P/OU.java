package f0P;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class OU {
    private static final /* synthetic */ EnumEntries E2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ OU[] f64561g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f64565n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final OU f64564t = new OU("Normal", 0, 2132017323);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final OU f64558O = new OU("Darken", 1, 2132017319);
    public static final OU J2 = new OU("Lighten", 2, 2132017321);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final OU f64563r = new OU("Contrast", 3, 2132017318);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final OU f64562o = new OU("Difference", 4, 2132017320);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final OU f64560Z = new OU("Color", 5, 2132017317);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final OU f64559S = new OU("Mask", 6, 2132017322);

    static {
        OU[] ouArrN = n();
        f64561g = ouArrN;
        E2 = EnumEntriesKt.enumEntries(ouArrN);
    }

    private static final /* synthetic */ OU[] n() {
        return new OU[]{f64564t, f64558O, J2, f64563r, f64562o, f64560Z, f64559S};
    }

    public static OU valueOf(String str) {
        return (OU) Enum.valueOf(OU.class, str);
    }

    public static OU[] values() {
        return (OU[]) f64561g.clone();
    }

    public final int rl() {
        return this.f64565n;
    }

    private OU(String str, int i2, int i3) {
        this.f64565n = i3;
    }
}
