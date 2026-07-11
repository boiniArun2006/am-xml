package jOL;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Dsr {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ Dsr[] f69410O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f69411n = new Dsr("PT_28", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Dsr f69412t = new Dsr("PT_20", 1);

    static {
        Dsr[] dsrArrN = n();
        f69410O = dsrArrN;
        J2 = EnumEntriesKt.enumEntries(dsrArrN);
    }

    private static final /* synthetic */ Dsr[] n() {
        return new Dsr[]{f69411n, f69412t};
    }

    public static Dsr valueOf(String str) {
        return (Dsr) Enum.valueOf(Dsr.class, str);
    }

    public static Dsr[] values() {
        return (Dsr[]) f69410O.clone();
    }

    private Dsr(String str, int i2) {
    }
}
