package WzY;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ j[] f11649O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f11650n = new j("Normal", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f11651t = new j("Erase", 1);

    static {
        j[] jVarArrN = n();
        f11649O = jVarArrN;
        J2 = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f11650n, f11651t};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f11649O.clone();
    }

    private j(String str, int i2) {
    }
}
