package zD;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n {
    private static final /* synthetic */ n[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f76402r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f76401n = new n("BACKUP", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f76403t = new n("NON_BACKUP", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final n f76400O = new n("NOT_PERSISTED", 2);

    static {
        n[] nVarArrN = n();
        J2 = nVarArrN;
        f76402r = EnumEntriesKt.enumEntries(nVarArrN);
    }

    private static final /* synthetic */ n[] n() {
        return new n[]{f76401n, f76403t, f76400O};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) J2.clone();
    }

    private n(String str, int i2) {
    }
}
