package KA9;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class u {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ u[] f5006O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f5007n = new u("NAME", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u f5008t = new u("DATE", 1);

    static {
        u[] uVarArrN = n();
        f5006O = uVarArrN;
        J2 = EnumEntriesKt.enumEntries(uVarArrN);
    }

    private static final /* synthetic */ u[] n() {
        return new u[]{f5007n, f5008t};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f5006O.clone();
    }

    private u(String str, int i2) {
    }
}
