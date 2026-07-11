package Qk;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class u {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8336o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ u[] f8337r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f8335n = new u("ON_TOP", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u f8338t = new u("ON_SIDE", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final u f8334O = new u("ON_BOTTOM", 2);
    public static final u J2 = new u("NONE", 3);

    static {
        u[] uVarArrN = n();
        f8337r = uVarArrN;
        f8336o = EnumEntriesKt.enumEntries(uVarArrN);
    }

    private static final /* synthetic */ u[] n() {
        return new u[]{f8335n, f8338t, f8334O, J2};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f8337r.clone();
    }

    private u(String str, int i2) {
    }
}
