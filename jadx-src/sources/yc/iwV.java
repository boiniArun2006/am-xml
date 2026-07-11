package yc;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class iwV {
    private static final /* synthetic */ iwV[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f76014r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final iwV f76013n = new iwV("HIDE", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final iwV f76015t = new iwV("SHOW", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final iwV f76012O = new iwV("REDUCED_OPACITY", 2);

    static {
        iwV[] iwvArrN = n();
        J2 = iwvArrN;
        f76014r = EnumEntriesKt.enumEntries(iwvArrN);
    }

    private static final /* synthetic */ iwV[] n() {
        return new iwV[]{f76013n, f76015t, f76012O};
    }

    public static iwV valueOf(String str) {
        return (iwV) Enum.valueOf(iwV.class, str);
    }

    public static iwV[] values() {
        return (iwV[]) J2.clone();
    }

    private iwV(String str, int i2) {
    }
}
