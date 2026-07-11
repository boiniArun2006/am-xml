package rWZ;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Dsr {
    private static final /* synthetic */ Dsr[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73057r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f73056n = new Dsr("WRITE_ONLY", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Dsr f73058t = new Dsr("READ_ONLY", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Dsr f73055O = new Dsr("WRITE_AND_READ", 2);

    static {
        Dsr[] dsrArrN = n();
        J2 = dsrArrN;
        f73057r = EnumEntriesKt.enumEntries(dsrArrN);
    }

    private static final /* synthetic */ Dsr[] n() {
        return new Dsr[]{f73056n, f73058t, f73055O};
    }

    public static Dsr valueOf(String str) {
        return (Dsr) Enum.valueOf(Dsr.class, str);
    }

    public static Dsr[] values() {
        return (Dsr[]) J2.clone();
    }

    private Dsr(String str, int i2) {
    }
}
