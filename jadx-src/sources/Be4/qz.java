package Be4;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class qz {
    private static final /* synthetic */ qz[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f562r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qz f561n = new qz("IGNORE", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qz f563t = new qz("RESPECT_PERFORMANCE", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final qz f560O = new qz("RESPECT_ALL", 2);

    static {
        qz[] qzVarArrN = n();
        J2 = qzVarArrN;
        f562r = EnumEntriesKt.enumEntries(qzVarArrN);
    }

    private static final /* synthetic */ qz[] n() {
        return new qz[]{f561n, f563t, f560O};
    }

    public static qz valueOf(String str) {
        return (qz) Enum.valueOf(qz.class, str);
    }

    public static qz[] values() {
        return (qz[]) J2.clone();
    }

    private qz(String str, int i2) {
    }
}
