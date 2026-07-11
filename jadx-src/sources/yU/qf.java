package yU;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class qf {
    private static final /* synthetic */ qf[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f75662r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qf f75661n = new qf("TOP", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qf f75663t = new qf("BOTTOM", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final qf f75660O = new qf("REMOVE", 2);

    static {
        qf[] qfVarArrN = n();
        J2 = qfVarArrN;
        f75662r = EnumEntriesKt.enumEntries(qfVarArrN);
    }

    private static final /* synthetic */ qf[] n() {
        return new qf[]{f75661n, f75663t, f75660O};
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
