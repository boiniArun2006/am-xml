package kP;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kP.I28, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class EnumC2205I28 {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f69846Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumC2205I28[] f69848o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC2205I28 f69847n = new EnumC2205I28("DEFAULT", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC2205I28 f69850t = new EnumC2205I28("BOTTOM_SLIDE", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final EnumC2205I28 f69845O = new EnumC2205I28("MODAL_CLEAR_BACKGROUND", 2);
    public static final EnumC2205I28 J2 = new EnumC2205I28("POPUP", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC2205I28 f69849r = new EnumC2205I28("NONE", 4);

    static {
        EnumC2205I28[] enumC2205I28ArrN = n();
        f69848o = enumC2205I28ArrN;
        f69846Z = EnumEntriesKt.enumEntries(enumC2205I28ArrN);
    }

    private static final /* synthetic */ EnumC2205I28[] n() {
        return new EnumC2205I28[]{f69847n, f69850t, f69845O, J2, f69849r};
    }

    public static EnumC2205I28 valueOf(String str) {
        return (EnumC2205I28) Enum.valueOf(EnumC2205I28.class, str);
    }

    public static EnumC2205I28[] values() {
        return (EnumC2205I28[]) f69848o.clone();
    }

    private EnumC2205I28(String str, int i2) {
    }
}
