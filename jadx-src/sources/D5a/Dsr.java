package D5a;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Dsr {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1301Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ Dsr[] f1303o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f1302n = new Dsr("ALBUMS", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Dsr f1305t = new Dsr("ARTISTS", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Dsr f1300O = new Dsr("GENRES", 2);
    public static final Dsr J2 = new Dsr("FOLDERS", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Dsr f1304r = new Dsr("NONE", 4);

    static {
        Dsr[] dsrArrN = n();
        f1303o = dsrArrN;
        f1301Z = EnumEntriesKt.enumEntries(dsrArrN);
    }

    private static final /* synthetic */ Dsr[] n() {
        return new Dsr[]{f1302n, f1305t, f1300O, J2, f1304r};
    }

    public static Dsr valueOf(String str) {
        return (Dsr) Enum.valueOf(Dsr.class, str);
    }

    public static Dsr[] values() {
        return (Dsr[]) f1303o.clone();
    }

    private Dsr(String str, int i2) {
    }
}
