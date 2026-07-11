package KNH;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ I28[] f5292O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f5293n = new I28("COMMON_BENEFIT", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final I28 f5294t = new I28("DIFFERENT_ID", 1);

    static {
        I28[] i28ArrN = n();
        f5292O = i28ArrN;
        J2 = EnumEntriesKt.enumEntries(i28ArrN);
    }

    private static final /* synthetic */ I28[] n() {
        return new I28[]{f5293n, f5294t};
    }

    public static I28 valueOf(String str) {
        return (I28) Enum.valueOf(I28.class, str);
    }

    public static I28[] values() {
        return (I28[]) f5292O.clone();
    }

    private I28(String str, int i2) {
    }
}
