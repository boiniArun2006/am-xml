package Kz;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ j[] f5916O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f5917t = new j("ANALYTICS_DISABLED", 0, "analytics_disabled");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5918n;

    public static EnumEntries rl() {
        return J2;
    }

    static {
        j[] jVarArrN = n();
        f5916O = jVarArrN;
        J2 = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f5917t};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f5916O.clone();
    }

    public final String t() {
        return this.f5918n;
    }

    private j(String str, int i2, String str2) {
        this.f5918n = str2;
    }
}
