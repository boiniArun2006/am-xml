package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012<\u0010\f\u001a8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017RJ\u0010\f\u001a8\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010 \u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowItemIterator;", "", "Landroidx/compose/ui/layout/Measurable;", "", "itemCount", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "index", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "", "getMeasurables", "<init>", "(ILkotlin/jvm/functions/Function2;)V", "", "hasNext", "()Z", "Uo", "()Landroidx/compose/ui/layout/Measurable;", "O", "(Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;", c.f62177j, "I", "t", "Lkotlin/jvm/functions/Function2;", "", "Ljava/util/List;", "_list", "J2", "itemIndex", "r", "listIndex", "()Ljava/util/List;", "list", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ContextualFlowItemIterator implements Iterator<Measurable>, KMappedMarker {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int itemIndex;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final List _list = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int itemCount;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int listIndex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function2 getMeasurables;

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public Measurable next() {
        return J2(this, null, 1, null);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ Measurable J2(ContextualFlowItemIterator contextualFlowItemIterator, FlowLineInfo flowLineInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            flowLineInfo = new FlowLineInfo(0, 0, 0.0f, 0.0f, 15, null);
        }
        return contextualFlowItemIterator.O(flowLineInfo);
    }

    public final Measurable O(FlowLineInfo info) {
        if (this.listIndex < get_list().size()) {
            Measurable measurable = (Measurable) get_list().get(this.listIndex);
            this.listIndex++;
            return measurable;
        }
        int i2 = this.itemIndex;
        if (i2 >= this.itemCount) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.itemIndex);
        }
        List list = (List) this.getMeasurables.invoke(Integer.valueOf(i2), info);
        this.itemIndex++;
        if (list.isEmpty()) {
            return next();
        }
        Measurable measurable2 = (Measurable) CollectionsKt.first(list);
        this._list.addAll(list);
        this.listIndex++;
        return measurable2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.listIndex < get_list().size() || this.itemIndex < this.itemCount;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final List get_list() {
        return this._list;
    }

    public ContextualFlowItemIterator(int i2, Function2 function2) {
        this.itemCount = i2;
        this.getMeasurables = function2;
    }
}
