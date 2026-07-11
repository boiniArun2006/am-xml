package androidx.compose.foundation.layout;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/Direction;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Direction {
    private static final /* synthetic */ Direction[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f17539r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Direction f17538n = new Direction("Vertical", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Direction f17540t = new Direction("Horizontal", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Direction f17537O = new Direction("Both", 2);

    private static final /* synthetic */ Direction[] n() {
        return new Direction[]{f17538n, f17540t, f17537O};
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) J2.clone();
    }

    static {
        Direction[] directionArrN = n();
        J2 = directionArrN;
        f17539r = EnumEntriesKt.enumEntries(directionArrN);
    }

    private Direction(String str, int i2) {
    }
}
