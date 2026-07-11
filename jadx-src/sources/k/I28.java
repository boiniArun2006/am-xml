package k;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.vungle.ads.internal.Constants;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class I28 {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ I28[] f69640S;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f69642g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f69646n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final I28 f69645t = new I28("APP_OPEN", 0, "app_open");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final I28 f69639O = new I28(BrandSafetyUtils.f61447m, 1, "banner");
    public static final I28 J2 = new I28("HARDCODED", 2, "hardcoded");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final I28 f69644r = new I28("INTERSTITIAL", 3, "standard");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final I28 f69643o = new I28("NATIVE", 4, "native");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final I28 f69641Z = new I28(BrandSafetyUtils.f61445k, 5, Constants.PLACEMENT_TYPE_REWARDED);

    static {
        I28[] i28ArrN = n();
        f69640S = i28ArrN;
        f69642g = EnumEntriesKt.enumEntries(i28ArrN);
    }

    private static final /* synthetic */ I28[] n() {
        return new I28[]{f69645t, f69639O, J2, f69644r, f69643o, f69641Z};
    }

    public static I28 valueOf(String str) {
        return (I28) Enum.valueOf(I28.class, str);
    }

    public static I28[] values() {
        return (I28[]) f69640S.clone();
    }

    public final String rl() {
        return this.f69646n;
    }

    private I28(String str, int i2, String str2) {
        this.f69646n = str2;
    }
}
