package androidx.compose.ui.unit;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/unit/LayoutDirection;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LayoutDirection {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ LayoutDirection[] f34159O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LayoutDirection f34160n = new LayoutDirection("Ltr", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final LayoutDirection f34161t = new LayoutDirection("Rtl", 1);

    private static final /* synthetic */ LayoutDirection[] n() {
        return new LayoutDirection[]{f34160n, f34161t};
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) f34159O.clone();
    }

    static {
        LayoutDirection[] layoutDirectionArrN = n();
        f34159O = layoutDirectionArrN;
        J2 = EnumEntriesKt.enumEntries(layoutDirectionArrN);
    }

    private LayoutDirection(String str, int i2) {
    }
}
