package Ken;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {
    private static final /* synthetic */ n[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5627r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f5626n = new n("PROJECT_PACKAGE_SHARED", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f5628t = new n("EXPORT_SHARED", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final n f5625O = new n("NONE", 2);

    static {
        n[] nVarArrN = n();
        J2 = nVarArrN;
        f5627r = EnumEntriesKt.enumEntries(nVarArrN);
    }

    private static final /* synthetic */ n[] n() {
        return new n[]{f5626n, f5628t, f5625O};
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
