package Mgn;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f6647Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ j[] f6649o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f6648n = new j("Neighbor", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f6651t = new j("Linear", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f6646O = new j("SincLow", 2);
    public static final j J2 = new j("SincMid", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f6650r = new j("SincHigh", 4);

    static {
        j[] jVarArrN = n();
        f6649o = jVarArrN;
        f6647Z = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f6648n, f6651t, f6646O, J2, f6650r};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f6649o.clone();
    }

    private j(String str, int i2) {
    }
}
