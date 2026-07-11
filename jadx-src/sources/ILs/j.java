package ILs;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {
    private static final /* synthetic */ j[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f4186r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f4185n = new j("SUSPEND", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f4187t = new j("DROP_OLDEST", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f4184O = new j("DROP_LATEST", 2);

    static {
        j[] jVarArrN = n();
        J2 = jVarArrN;
        f4186r = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f4185n, f4187t, f4184O};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) J2.clone();
    }

    private j(String str, int i2) {
    }
}
