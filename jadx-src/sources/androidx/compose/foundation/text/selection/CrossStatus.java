package androidx.compose.foundation.text.selection;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/selection/CrossStatus;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CrossStatus {
    private static final /* synthetic */ CrossStatus[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f20734r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CrossStatus f20733n = new CrossStatus("CROSSED", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final CrossStatus f20735t = new CrossStatus("NOT_CROSSED", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final CrossStatus f20732O = new CrossStatus("COLLAPSED", 2);

    private static final /* synthetic */ CrossStatus[] n() {
        return new CrossStatus[]{f20733n, f20735t, f20732O};
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) J2.clone();
    }

    static {
        CrossStatus[] crossStatusArrN = n();
        J2 = crossStatusArrN;
        f20734r = EnumEntriesKt.enumEntries(crossStatusArrN);
    }

    private CrossStatus(String str, int i2) {
    }
}
