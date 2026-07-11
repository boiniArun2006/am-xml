package androidx.compose.material;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/DismissValue;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DismissValue {
    private static final /* synthetic */ DismissValue[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f21823r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DismissValue f21822n = new DismissValue("Default", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final DismissValue f21824t = new DismissValue("DismissedToEnd", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final DismissValue f21821O = new DismissValue("DismissedToStart", 2);

    private static final /* synthetic */ DismissValue[] n() {
        return new DismissValue[]{f21822n, f21824t, f21821O};
    }

    public static DismissValue valueOf(String str) {
        return (DismissValue) Enum.valueOf(DismissValue.class, str);
    }

    public static DismissValue[] values() {
        return (DismissValue[]) J2.clone();
    }

    static {
        DismissValue[] dismissValueArrN = n();
        J2 = dismissValueArrN;
        f21823r = EnumEntriesKt.enumEntries(dismissValueArrN);
    }

    private DismissValue(String str, int i2) {
    }
}
