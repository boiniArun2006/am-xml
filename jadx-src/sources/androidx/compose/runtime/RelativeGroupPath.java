package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/RelativeGroupPath;", "Landroidx/compose/runtime/SourceInformationGroupPath;", "parent", "", "index", "<init>", "(Landroidx/compose/runtime/SourceInformationGroupPath;I)V", "Landroidx/compose/runtime/SlotTable;", "table", "", c.f62177j, "(Landroidx/compose/runtime/SlotTable;)Ljava/lang/Object;", "Landroidx/compose/runtime/SourceInformationGroupPath;", "getParent", "()Landroidx/compose/runtime/SourceInformationGroupPath;", "rl", "I", "getIndex", "()I", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class RelativeGroupPath extends SourceInformationGroupPath {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SourceInformationGroupPath parent;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int index;

    public RelativeGroupPath(SourceInformationGroupPath sourceInformationGroupPath, int i2) {
        super(null);
        this.parent = sourceInformationGroupPath;
        this.index = i2;
    }

    @Override // androidx.compose.runtime.SourceInformationGroupPath
    public Object n(SlotTable table) {
        return new SourceInformationSlotTableGroupIdentity(this.parent.n(table), this.index);
    }
}
