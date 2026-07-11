package f;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f.Wre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class EnumC1978Wre {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ EnumC1978Wre[] f64002O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnumC1978Wre f64003n = new EnumC1978Wre("REWARD", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnumC1978Wre f64004t = new EnumC1978Wre("INTERSTITIAL", 1);

    static {
        EnumC1978Wre[] enumC1978WreArrN = n();
        f64002O = enumC1978WreArrN;
        J2 = EnumEntriesKt.enumEntries(enumC1978WreArrN);
    }

    private static final /* synthetic */ EnumC1978Wre[] n() {
        return new EnumC1978Wre[]{f64003n, f64004t};
    }

    public static EnumC1978Wre valueOf(String str) {
        return (EnumC1978Wre) Enum.valueOf(EnumC1978Wre.class, str);
    }

    public static EnumC1978Wre[] values() {
        return (EnumC1978Wre[]) f64002O.clone();
    }

    private EnumC1978Wre(String str, int i2) {
    }
}
