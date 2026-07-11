package androidx.compose.ui.layout;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMinMax;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntrinsicMinMax {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ IntrinsicMinMax[] f32226O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final IntrinsicMinMax f32227n = new IntrinsicMinMax("Min", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final IntrinsicMinMax f32228t = new IntrinsicMinMax("Max", 1);

    private static final /* synthetic */ IntrinsicMinMax[] n() {
        return new IntrinsicMinMax[]{f32227n, f32228t};
    }

    public static IntrinsicMinMax valueOf(String str) {
        return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
    }

    public static IntrinsicMinMax[] values() {
        return (IntrinsicMinMax[]) f32226O.clone();
    }

    static {
        IntrinsicMinMax[] intrinsicMinMaxArrN = n();
        f32226O = intrinsicMinMaxArrN;
        J2 = EnumEntriesKt.enumEntries(intrinsicMinMaxArrN);
    }

    private IntrinsicMinMax(String str, int i2) {
    }
}
