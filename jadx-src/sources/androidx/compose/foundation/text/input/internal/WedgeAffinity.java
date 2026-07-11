package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "", "<init>", "(Ljava/lang/String;I)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "t", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WedgeAffinity {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ WedgeAffinity[] f20374O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final WedgeAffinity f20375n = new WedgeAffinity("Start", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final WedgeAffinity f20376t = new WedgeAffinity("End", 1);

    private static final /* synthetic */ WedgeAffinity[] n() {
        return new WedgeAffinity[]{f20375n, f20376t};
    }

    public static WedgeAffinity valueOf(String str) {
        return (WedgeAffinity) Enum.valueOf(WedgeAffinity.class, str);
    }

    public static WedgeAffinity[] values() {
        return (WedgeAffinity[]) f20374O.clone();
    }

    static {
        WedgeAffinity[] wedgeAffinityArrN = n();
        f20374O = wedgeAffinityArrN;
        J2 = EnumEntriesKt.enumEntries(wedgeAffinityArrN);
    }

    private WedgeAffinity(String str, int i2) {
    }
}
