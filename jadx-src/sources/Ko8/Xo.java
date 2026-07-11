package Ko8;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Xo {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ Xo[] f5803O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Xo f5804n = new Xo("PROJECT_PACKAGE", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Xo f5805t = new Xo("XML", 1);

    static {
        Xo[] xoArrN = n();
        f5803O = xoArrN;
        J2 = EnumEntriesKt.enumEntries(xoArrN);
    }

    private static final /* synthetic */ Xo[] n() {
        return new Xo[]{f5804n, f5805t};
    }

    public static Xo valueOf(String str) {
        return (Xo) Enum.valueOf(Xo.class, str);
    }

    public static Xo[] values() {
        return (Xo[]) f5803O.clone();
    }

    private Xo(String str, int i2) {
    }
}
