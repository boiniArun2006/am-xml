package Dj7;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class o7q {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ o7q[] f1856O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o7q f1857n = new o7q("IDLE", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o7q f1858t = new o7q("SELECTED", 1);

    static {
        o7q[] o7qVarArrN = n();
        f1856O = o7qVarArrN;
        J2 = EnumEntriesKt.enumEntries(o7qVarArrN);
    }

    private static final /* synthetic */ o7q[] n() {
        return new o7q[]{f1857n, f1858t};
    }

    public static o7q valueOf(String str) {
        return (o7q) Enum.valueOf(o7q.class, str);
    }

    public static o7q[] values() {
        return (o7q[]) f1856O.clone();
    }

    private o7q(String str, int i2) {
    }
}
