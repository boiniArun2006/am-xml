package b1P;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ w6[] f43147O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f43148n = new w6("X", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final w6 f43149t = new w6("Y", 1);

    static {
        w6[] w6VarArrN = n();
        f43147O = w6VarArrN;
        J2 = EnumEntriesKt.enumEntries(w6VarArrN);
    }

    private static final /* synthetic */ w6[] n() {
        return new w6[]{f43148n, f43149t};
    }

    public static w6 valueOf(String str) {
        return (w6) Enum.valueOf(w6.class, str);
    }

    public static w6[] values() {
        return (w6[]) f43147O.clone();
    }

    private w6(String str, int i2) {
    }
}
