package YV;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class fuX {
    private static final /* synthetic */ fuX[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12141r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fuX f12140n = new fuX("PURCHASED", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final fuX f12142t = new fuX("USER_CANCELLED", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final fuX f12139O = new fuX("PENDING", 2);

    static {
        fuX[] fuxArrN = n();
        J2 = fuxArrN;
        f12141r = EnumEntriesKt.enumEntries(fuxArrN);
    }

    private static final /* synthetic */ fuX[] n() {
        return new fuX[]{f12140n, f12142t, f12139O};
    }

    public static fuX valueOf(String str) {
        return (fuX) Enum.valueOf(fuX.class, str);
    }

    public static fuX[] values() {
        return (fuX[]) J2.clone();
    }

    private fuX(String str, int i2) {
    }
}
