package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/semantics/CollectionInfo;", "", "", "rowCount", "columnCount", "<init>", "(II)V", c.f62177j, "I", "rl", "()I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CollectionInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int rowCount;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int columnCount;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getColumnCount() {
        return this.columnCount;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getRowCount() {
        return this.rowCount;
    }

    public CollectionInfo(int i2, int i3) {
        this.rowCount = i2;
        this.columnCount = i3;
    }
}
