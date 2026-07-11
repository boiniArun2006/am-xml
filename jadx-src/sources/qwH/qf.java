package qwH;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class qf {
    private static final /* synthetic */ qf[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f72605r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qf f72604n = new qf("NONE", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qf f72606t = new qf("ZERO", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final qf f72603O = new qf("SPACE", 2);

    static {
        qf[] qfVarArrN = n();
        J2 = qfVarArrN;
        f72605r = EnumEntriesKt.enumEntries(qfVarArrN);
    }

    private static final /* synthetic */ qf[] n() {
        return new qf[]{f72604n, f72606t, f72603O};
    }

    public static qf valueOf(String str) {
        return (qf) Enum.valueOf(qf.class, str);
    }

    public static qf[] values() {
        return (qf[]) J2.clone();
    }

    private qf(String str, int i2) {
    }
}
