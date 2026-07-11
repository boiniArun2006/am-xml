package f;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f.CN3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class EnumC1973CN3 {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ EnumC1973CN3[] f63961O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC1973CN3 f63962n = new EnumC1973CN3("MY_ACCOUNT", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC1973CN3 f63963t = new EnumC1973CN3("V5_CAROUSEL", 1);

    static {
        EnumC1973CN3[] enumC1973CN3ArrN = n();
        f63961O = enumC1973CN3ArrN;
        J2 = EnumEntriesKt.enumEntries(enumC1973CN3ArrN);
    }

    private static final /* synthetic */ EnumC1973CN3[] n() {
        return new EnumC1973CN3[]{f63962n, f63963t};
    }

    public static EnumC1973CN3 valueOf(String str) {
        return (EnumC1973CN3) Enum.valueOf(EnumC1973CN3.class, str);
    }

    public static EnumC1973CN3[] values() {
        return (EnumC1973CN3[]) f63961O.clone();
    }

    private EnumC1973CN3(String str, int i2) {
    }
}
