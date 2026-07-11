package rWZ;

import WJ.phkN.HFAkacKHsU;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class aC {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f73078o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ aC[] f73079r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final aC f73077n = new aC(HFAkacKHsU.RdUFNp, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final aC f73080t = new aC("MY_ACCOUNT", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final aC f73076O = new aC("CREATOR_PROGRAM_ONBOARDING", 2);
    public static final aC J2 = new aC(NativeAdContent.ViewTag.OTHER, 3);

    static {
        aC[] aCVarArrN = n();
        f73079r = aCVarArrN;
        f73078o = EnumEntriesKt.enumEntries(aCVarArrN);
    }

    private static final /* synthetic */ aC[] n() {
        return new aC[]{f73077n, f73080t, f73076O, J2};
    }

    public static aC valueOf(String str) {
        return (aC) Enum.valueOf(aC.class, str);
    }

    public static aC[] values() {
        return (aC[]) f73079r.clone();
    }

    private aC(String str, int i2) {
    }
}
