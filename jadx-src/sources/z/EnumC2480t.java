package z;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class EnumC2480t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f76337o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumC2480t[] f76338r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76340n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC2480t f76339t = new EnumC2480t("clamp", 0, 33071);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final EnumC2480t f76336O = new EnumC2480t("repeat", 1, 10497);
    public static final EnumC2480t J2 = new EnumC2480t("mirrorRepeat", 2, 33648);

    static {
        EnumC2480t[] enumC2480tArrN = n();
        f76338r = enumC2480tArrN;
        f76337o = EnumEntriesKt.enumEntries(enumC2480tArrN);
    }

    private static final /* synthetic */ EnumC2480t[] n() {
        return new EnumC2480t[]{f76339t, f76336O, J2};
    }

    public static EnumC2480t valueOf(String str) {
        return (EnumC2480t) Enum.valueOf(EnumC2480t.class, str);
    }

    public static EnumC2480t[] values() {
        return (EnumC2480t[]) f76338r.clone();
    }

    public final int rl() {
        return this.f76340n;
    }

    private EnumC2480t(String str, int i2, int i3) {
        this.f76340n = i3;
    }
}
