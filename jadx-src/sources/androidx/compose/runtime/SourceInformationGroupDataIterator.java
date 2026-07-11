package androidx.compose.runtime;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0018¨\u0006$"}, d2 = {"Landroidx/compose/runtime/SourceInformationGroupDataIterator;", "", "", "", "Landroidx/compose/runtime/SlotTable;", "table", "", "group", "Landroidx/compose/runtime/GroupSourceInformation;", "sourceInformation", "<init>", "(Landroidx/compose/runtime/SlotTable;ILandroidx/compose/runtime/GroupSourceInformation;)V", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", c.f62177j, "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "t", "I", TtmlNode.RUBY_BASE, "O", TtmlNode.START, "J2", TtmlNode.END, "Landroidx/compose/runtime/BitVector;", "r", "Landroidx/compose/runtime/BitVector;", "filter", "o", "index", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n3777#2:3964\n3777#2:3965\n33#3,6:3966\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n*L\n3408#1:3964\n3414#1:3965\n3421#1:3966,6\n*E\n"})
final class SourceInformationGroupDataIterator implements Iterable<Object>, Iterator<Object>, KMappedMarker {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SlotTable table;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final BitVector filter;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int base;

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i2 = this.end;
        int i3 = this.index;
        Object obj = (i3 < 0 || i3 >= i2) ? null : this.table.getSlots()[this.base + this.index];
        this.index = this.filter.t(this.index + 1);
        return obj;
    }

    public SourceInformationGroupDataIterator(SlotTable slotTable, int i2, GroupSourceInformation groupSourceInformation) {
        int slotsSize;
        this.table = slotTable;
        int i3 = slotTable.getGroups()[(i2 * 5) + 4];
        this.base = i3;
        this.start = groupSourceInformation.getDataStartOffset();
        int dataEndOffset = groupSourceInformation.getDataEndOffset();
        if (dataEndOffset <= 0) {
            int i5 = i2 + 1;
            if (i5 < slotTable.getGroupsSize()) {
                slotsSize = slotTable.getGroups()[(i5 * 5) + 4];
            } else {
                slotsSize = slotTable.getSlotsSize();
            }
            dataEndOffset = slotsSize - i3;
        }
        this.end = dataEndOffset;
        BitVector bitVector = new BitVector();
        ArrayList groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = groups.get(i7);
                if (obj instanceof GroupSourceInformation) {
                    GroupSourceInformation groupSourceInformation2 = (GroupSourceInformation) obj;
                    bitVector.O(groupSourceInformation2.getDataStartOffset(), groupSourceInformation2.getDataEndOffset());
                }
            }
        }
        this.filter = bitVector;
        this.index = bitVector.t(this.start);
    }
}
