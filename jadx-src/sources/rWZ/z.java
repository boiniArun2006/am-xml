package rWZ;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class z {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ z[] f73111O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final z f73112n = new z("HORIZONTAL", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final z f73113t = new z("VERTICAL", 1);

    static {
        z[] zVarArrN = n();
        f73111O = zVarArrN;
        J2 = EnumEntriesKt.enumEntries(zVarArrN);
    }

    private static final /* synthetic */ z[] n() {
        return new z[]{f73112n, f73113t};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f73111O.clone();
    }

    private z(String str, int i2) {
    }
}
