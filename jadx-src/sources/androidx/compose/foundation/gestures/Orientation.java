package androidx.compose.foundation.gestures;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/gestures/Orientation;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Orientation {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ Orientation[] f16968O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Orientation f16969n = new Orientation("Vertical", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Orientation f16970t = new Orientation("Horizontal", 1);

    private static final /* synthetic */ Orientation[] n() {
        return new Orientation[]{f16969n, f16970t};
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) f16968O.clone();
    }

    static {
        Orientation[] orientationArrN = n();
        f16968O = orientationArrN;
        J2 = EnumEntriesKt.enumEntries(orientationArrN);
    }

    private Orientation(String str, int i2) {
    }
}
