package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.IntervalTree;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R,\u0010\u0010\u001a\f0\bR\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"androidx/compose/ui/graphics/IntervalTree$iterator$1", "", "Landroidx/compose/ui/graphics/Interval;", "", "hasNext", "()Z", "t", "()Landroidx/compose/ui/graphics/Interval;", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/IntervalTree;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/graphics/IntervalTree$Node;", "getNext", "()Landroidx/compose/ui/graphics/IntervalTree$Node;", "setNext", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "next", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntervalTree$iterator$1 implements Iterator<Interval<Object>>, KMappedMarker {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private IntervalTree.Node next;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ IntervalTree f31490t;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != this.f31490t.terminator;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Interval next() {
        IntervalTree.Node node = this.next;
        this.next = node.qie();
        return node;
    }
}
