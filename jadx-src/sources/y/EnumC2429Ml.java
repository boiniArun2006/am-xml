package y;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class EnumC2429Ml {
    private static final /* synthetic */ EnumC2429Ml[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f75528r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC2429Ml f75527n = new EnumC2429Ml("LOW", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC2429Ml f75529t = new EnumC2429Ml("MEDIUM", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final EnumC2429Ml f75526O = new EnumC2429Ml("ALMOST_FULL", 2);

    static {
        EnumC2429Ml[] enumC2429MlArrN = n();
        J2 = enumC2429MlArrN;
        f75528r = EnumEntriesKt.enumEntries(enumC2429MlArrN);
    }

    private static final /* synthetic */ EnumC2429Ml[] n() {
        return new EnumC2429Ml[]{f75527n, f75529t, f75526O};
    }

    public static EnumC2429Ml valueOf(String str) {
        return (EnumC2429Ml) Enum.valueOf(EnumC2429Ml.class, str);
    }

    public static EnumC2429Ml[] values() {
        return (EnumC2429Ml[]) J2.clone();
    }

    private EnumC2429Ml(String str, int i2) {
    }
}
