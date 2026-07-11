package gP;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gP.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class EnumC2123w6 {
    private static final /* synthetic */ EnumC2123w6[] E2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f67561e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f67565n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f67566t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final EnumC2123w6 f67558O = new EnumC2123w6("sans_serif", 0, "sans-serif", 1);
    public static final EnumC2123w6 J2 = new EnumC2123w6("serif", 1, "serif", 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC2123w6 f67564r = new EnumC2123w6("display", 2, "display", 3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC2123w6 f67563o = new EnumC2123w6("handwriting", 3, "handwriting", 4);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final EnumC2123w6 f67560Z = new EnumC2123w6("monospace", 4, "monospace", 5);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final EnumC2123w6 f67559S = new EnumC2123w6("imported", 5, "imported", 100);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC2123w6 f67562g = new EnumC2123w6("favorite", 6, "favorite", 110);

    static {
        EnumC2123w6[] enumC2123w6ArrN = n();
        E2 = enumC2123w6ArrN;
        f67561e = EnumEntriesKt.enumEntries(enumC2123w6ArrN);
    }

    private static final /* synthetic */ EnumC2123w6[] n() {
        return new EnumC2123w6[]{f67558O, J2, f67564r, f67563o, f67560Z, f67559S, f67562g};
    }

    public static EnumC2123w6 valueOf(String str) {
        return (EnumC2123w6) Enum.valueOf(EnumC2123w6.class, str);
    }

    public static EnumC2123w6[] values() {
        return (EnumC2123w6[]) E2.clone();
    }

    public final int rl() {
        return this.f67566t;
    }

    private EnumC2123w6(String str, int i2, String str2, int i3) {
        this.f67565n = str2;
        this.f67566t = i3;
    }
}
