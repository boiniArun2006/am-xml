package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/compose/ui/semantics/CollectionItemInfo;", "", "", c.f62177j, "I", "t", "()I", "rowIndex", "rl", "nr", "rowSpan", "columnIndex", "columnSpan", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CollectionItemInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int rowIndex;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int columnSpan;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int rowSpan;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int columnIndex;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getColumnIndex() {
        return this.columnIndex;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getRowSpan() {
        return this.rowSpan;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getColumnSpan() {
        return this.columnSpan;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getRowIndex() {
        return this.rowIndex;
    }
}
