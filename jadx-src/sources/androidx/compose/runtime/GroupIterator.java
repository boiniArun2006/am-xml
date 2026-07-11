package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/GroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/SlotTable;", "table", "", TtmlNode.START, TtmlNode.END, "<init>", "(Landroidx/compose/runtime/SlotTable;II)V", "", "O", "()V", "", "hasNext", "()Z", "t", "()Landroidx/compose/runtime/tooling/CompositionGroup;", c.f62177j, "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "I", "getEnd", "()I", "index", "J2", NodeModuleProcess.PROPERTY_VERSION, "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class GroupIterator implements Iterator<CompositionGroup>, KMappedMarker {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SlotTable table;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int end;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final void O() {
        if (this.table.getCom.caoccao.javet.node.modules.NodeModuleProcess.PROPERTY_VERSION java.lang.String() != this.version) {
            SlotTableKt.S();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    public GroupIterator(SlotTable slotTable, int i2, int i3) {
        this.table = slotTable;
        this.end = i3;
        this.index = i2;
        this.version = slotTable.getCom.caoccao.javet.node.modules.NodeModuleProcess.PROPERTY_VERSION java.lang.String();
        if (slotTable.getWriter()) {
            SlotTableKt.S();
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public CompositionGroup next() {
        O();
        int i2 = this.index;
        this.index = SlotTableKt.ck(this.table.getGroups(), i2) + i2;
        return new SlotTableGroup(this.table, i2, this.version);
    }
}
