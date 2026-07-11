package QVk;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8170o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ C[] f8171r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C f8169n = new C("VITO_V2", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C f8172t = new C("VITO_V1", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C f8168O = new C("DRAWEE", 2);
    public static final C J2 = new C(NativeAdContent.ViewTag.OTHER, 3);

    static {
        C[] cArrN = n();
        f8171r = cArrN;
        f8170o = EnumEntriesKt.enumEntries(cArrN);
    }

    private static final /* synthetic */ C[] n() {
        return new C[]{f8169n, f8172t, f8168O, J2};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f8171r.clone();
    }

    private C(String str, int i2) {
    }
}
