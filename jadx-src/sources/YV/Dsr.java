package YV;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Dsr {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12100Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ Dsr[] f12102o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f12101n = new Dsr("PURCHASED", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Dsr f12104t = new Dsr("USER_CANCELLED", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Dsr f12099O = new Dsr("ERROR", 2);
    public static final Dsr J2 = new Dsr("UNDEFINED", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Dsr f12103r = new Dsr("PENDING", 4);

    static {
        Dsr[] dsrArrN = n();
        f12102o = dsrArrN;
        f12100Z = EnumEntriesKt.enumEntries(dsrArrN);
    }

    private static final /* synthetic */ Dsr[] n() {
        return new Dsr[]{f12101n, f12104t, f12099O, J2, f12103r};
    }

    public static Dsr valueOf(String str) {
        return (Dsr) Enum.valueOf(Dsr.class, str);
    }

    public static Dsr[] values() {
        return (Dsr[]) f12102o.clone();
    }

    private Dsr(String str, int i2) {
    }
}
