package Q;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ j[] f7880O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f7881n = new j("INTERSTITIAL", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f7882t = new j(BrandSafetyUtils.f61445k, 1);

    static {
        j[] jVarArrN = n();
        f7880O = jVarArrN;
        J2 = EnumEntriesKt.enumEntries(jVarArrN);
    }

    private static final /* synthetic */ j[] n() {
        return new j[]{f7881n, f7882t};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f7880O.clone();
    }

    private j(String str, int i2) {
    }
}
