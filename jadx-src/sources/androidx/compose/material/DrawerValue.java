package androidx.compose.material;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/DrawerValue;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DrawerValue {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ DrawerValue[] f21978O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DrawerValue f21979n = new DrawerValue("Closed", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final DrawerValue f21980t = new DrawerValue("Open", 1);

    private static final /* synthetic */ DrawerValue[] n() {
        return new DrawerValue[]{f21979n, f21980t};
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) f21978O.clone();
    }

    static {
        DrawerValue[] drawerValueArrN = n();
        f21978O = drawerValueArrN;
        J2 = EnumEntriesKt.enumEntries(drawerValueArrN);
    }

    private DrawerValue(String str, int i2) {
    }
}
