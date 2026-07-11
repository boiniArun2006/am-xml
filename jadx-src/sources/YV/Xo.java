package YV;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Xo {
    private static final /* synthetic */ Xo[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12137r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Xo f12136n = new Xo("CONNECTION_ERROR", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Xo f12138t = new Xo("RESTORED", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Xo f12135O = new Xo("NOTHING_TO_RESTORE", 2);

    static {
        Xo[] xoArrN = n();
        J2 = xoArrN;
        f12137r = EnumEntriesKt.enumEntries(xoArrN);
    }

    private static final /* synthetic */ Xo[] n() {
        return new Xo[]{f12136n, f12138t, f12135O};
    }

    public static Xo valueOf(String str) {
        return (Xo) Enum.valueOf(Xo.class, str);
    }

    public static Xo[] values() {
        return (Xo[]) J2.clone();
    }

    private Xo(String str, int i2) {
    }
}
