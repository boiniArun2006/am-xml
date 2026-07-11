package gIX;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class DAz {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ DAz[] f67200O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DAz f67201n = new DAz("LINK", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final DAz f67202t = new DAz("QRCODE", 1);

    static {
        DAz[] dAzArrN = n();
        f67200O = dAzArrN;
        J2 = EnumEntriesKt.enumEntries(dAzArrN);
    }

    private static final /* synthetic */ DAz[] n() {
        return new DAz[]{f67201n, f67202t};
    }

    public static DAz valueOf(String str) {
        return (DAz) Enum.valueOf(DAz.class, str);
    }

    public static DAz[] values() {
        return (DAz[]) f67200O.clone();
    }

    private DAz(String str, int i2) {
    }
}
