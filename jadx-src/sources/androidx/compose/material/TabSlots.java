package androidx.compose.material;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/TabSlots;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class TabSlots {
    private static final /* synthetic */ TabSlots[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f23468r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TabSlots f23467n = new TabSlots("Tabs", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TabSlots f23469t = new TabSlots("Divider", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final TabSlots f23466O = new TabSlots("Indicator", 2);

    private static final /* synthetic */ TabSlots[] n() {
        return new TabSlots[]{f23467n, f23469t, f23466O};
    }

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) J2.clone();
    }

    static {
        TabSlots[] tabSlotsArrN = n();
        J2 = tabSlotsArrN;
        f23468r = EnumEntriesKt.enumEntries(tabSlotsArrN);
    }

    private TabSlots(String str, int i2) {
    }
}
