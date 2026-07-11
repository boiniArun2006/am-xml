package F2p;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Ml {
    private static final /* synthetic */ Ml[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f2487r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f2486n = new Ml("CREATOR_FAQS", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Ml f2488t = new Ml("RANKING_FAQS", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Ml f2485O = new Ml("HOW_IT_WORKS", 2);

    static {
        Ml[] mlArrN = n();
        J2 = mlArrN;
        f2487r = EnumEntriesKt.enumEntries(mlArrN);
    }

    private static final /* synthetic */ Ml[] n() {
        return new Ml[]{f2486n, f2488t, f2485O};
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
