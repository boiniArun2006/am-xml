package Z;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 {
    private static final /* synthetic */ I28[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12267r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f12266n = new I28("EXACT", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final I28 f12268t = new I28("INEXACT", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final I28 f12265O = new I28("AUTOMATIC", 2);

    static {
        I28[] i28ArrN = n();
        J2 = i28ArrN;
        f12267r = EnumEntriesKt.enumEntries(i28ArrN);
    }

    private static final /* synthetic */ I28[] n() {
        return new I28[]{f12266n, f12268t, f12265O};
    }

    public static I28 valueOf(String str) {
        return (I28) Enum.valueOf(I28.class, str);
    }

    public static I28[] values() {
        return (I28[]) J2.clone();
    }

    private I28(String str, int i2) {
    }
}
