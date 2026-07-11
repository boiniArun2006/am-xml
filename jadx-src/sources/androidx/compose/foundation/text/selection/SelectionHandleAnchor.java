package androidx.compose.foundation.text.selection;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelectionHandleAnchor {
    private static final /* synthetic */ SelectionHandleAnchor[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f20864r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SelectionHandleAnchor f20863n = new SelectionHandleAnchor("Left", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SelectionHandleAnchor f20865t = new SelectionHandleAnchor("Middle", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final SelectionHandleAnchor f20862O = new SelectionHandleAnchor("Right", 2);

    private static final /* synthetic */ SelectionHandleAnchor[] n() {
        return new SelectionHandleAnchor[]{f20863n, f20865t, f20862O};
    }

    public static SelectionHandleAnchor valueOf(String str) {
        return (SelectionHandleAnchor) Enum.valueOf(SelectionHandleAnchor.class, str);
    }

    public static SelectionHandleAnchor[] values() {
        return (SelectionHandleAnchor[]) J2.clone();
    }

    static {
        SelectionHandleAnchor[] selectionHandleAnchorArrN = n();
        J2 = selectionHandleAnchorArrN;
        f20864r = EnumEntriesKt.enumEntries(selectionHandleAnchorArrN);
    }

    private SelectionHandleAnchor(String str, int i2) {
    }
}
