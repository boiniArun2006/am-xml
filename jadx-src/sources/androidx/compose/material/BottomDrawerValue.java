package androidx.compose.material;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/BottomDrawerValue;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BottomDrawerValue {
    private static final /* synthetic */ BottomDrawerValue[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f21427r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BottomDrawerValue f21426n = new BottomDrawerValue("Closed", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final BottomDrawerValue f21428t = new BottomDrawerValue("Open", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final BottomDrawerValue f21425O = new BottomDrawerValue("Expanded", 2);

    private static final /* synthetic */ BottomDrawerValue[] n() {
        return new BottomDrawerValue[]{f21426n, f21428t, f21425O};
    }

    public static BottomDrawerValue valueOf(String str) {
        return (BottomDrawerValue) Enum.valueOf(BottomDrawerValue.class, str);
    }

    public static BottomDrawerValue[] values() {
        return (BottomDrawerValue[]) J2.clone();
    }

    static {
        BottomDrawerValue[] bottomDrawerValueArrN = n();
        J2 = bottomDrawerValueArrN;
        f21427r = EnumEntriesKt.enumEntries(bottomDrawerValueArrN);
    }

    private BottomDrawerValue(String str, int i2) {
    }
}
