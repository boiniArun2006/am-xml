package Pr;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Ml {
    private static final /* synthetic */ Ml[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7845r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f7844n = new Ml("TECHNICAL", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Ml f7846t = new Ml("ANALYTICS", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Ml f7843O = new Ml("PROFILING", 2);

    public static EnumEntries rl() {
        return f7845r;
    }

    static {
        Ml[] mlArrN = n();
        J2 = mlArrN;
        f7845r = EnumEntriesKt.enumEntries(mlArrN);
    }

    private static final /* synthetic */ Ml[] n() {
        return new Ml[]{f7844n, f7846t, f7843O};
    }

    public static Ml valueOf(String str) {
        return (Ml) Enum.valueOf(Ml.class, str);
    }

    public static Ml[] values() {
        return (Ml[]) J2.clone();
    }

    private Ml(String str, int i2) {
    }
}
