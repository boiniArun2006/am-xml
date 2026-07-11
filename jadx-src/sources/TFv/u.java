package TFv;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class u {
    private static final /* synthetic */ u[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f10481r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f10480n = new u("START", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u f10482t = new u("STOP", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final u f10479O = new u("STOP_AND_RESET_REPLAY_CACHE", 2);

    static {
        u[] uVarArrN = n();
        J2 = uVarArrN;
        f10481r = EnumEntriesKt.enumEntries(uVarArrN);
    }

    private static final /* synthetic */ u[] n() {
        return new u[]{f10480n, f10482t, f10479O};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) J2.clone();
    }

    private u(String str, int i2) {
    }
}
