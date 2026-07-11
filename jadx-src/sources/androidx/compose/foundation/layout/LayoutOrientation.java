package androidx.compose.foundation.layout;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutOrientation {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ LayoutOrientation[] f17703O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LayoutOrientation f17704n = new LayoutOrientation("Horizontal", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final LayoutOrientation f17705t = new LayoutOrientation("Vertical", 1);

    private static final /* synthetic */ LayoutOrientation[] n() {
        return new LayoutOrientation[]{f17704n, f17705t};
    }

    public static LayoutOrientation valueOf(String str) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) f17703O.clone();
    }

    static {
        LayoutOrientation[] layoutOrientationArrN = n();
        f17703O = layoutOrientationArrN;
        J2 = EnumEntriesKt.enumEntries(layoutOrientationArrN);
    }

    private LayoutOrientation(String str, int i2) {
    }
}
