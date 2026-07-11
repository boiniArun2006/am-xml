package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001fR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001cR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001cR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010$¨\u0006)"}, d2 = {"Landroidx/compose/runtime/SlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "Landroidx/compose/runtime/SlotTable;", "table", "", "group", NodeModuleProcess.PROPERTY_VERSION, "<init>", "(Landroidx/compose/runtime/SlotTable;II)V", "", "KN", "()V", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", c.f62177j, "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "t", "I", "getGroup", "()I", "O", "getVersion", "", "getKey", "()Ljava/lang/Object;", "key", "", "()Ljava/lang/String;", "sourceInfo", "J2", "node", "getData", "()Ljava/lang/Iterable;", "data", "Uo", "identity", "compositionGroups", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,3963:1\n3672#2:3964\n3726#2:3965\n3681#2:3966\n3666#2,4:3967\n3777#2:3978\n3777#2:3979\n158#3,7:3971\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3238#1:3964\n3239#1:3965\n3243#1:3966\n3247#1:3967,4\n3278#1:3978\n3280#1:3979\n3258#1:3971,7\n*E\n"})
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SlotTable table;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int group;

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable O() {
        return this;
    }

    private final void KN() {
        if (this.table.getCom.caoccao.javet.node.modules.NodeModuleProcess.PROPERTY_VERSION java.lang.String() != this.version) {
            SlotTableKt.S();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object J2() {
        if ((this.table.getGroups()[(this.group * 5) + 1] & 1073741824) != 0) {
            return this.table.getSlots()[this.table.getGroups()[(this.group * 5) + 4]];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable getData() {
        GroupSourceInformation groupSourceInformationE2 = this.table.E2(this.group);
        return groupSourceInformationE2 != null ? new SourceInformationGroupDataIterator(this.table, this.group, groupSourceInformationE2) : new DataIterator(this.table, this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        if ((this.table.getGroups()[(this.group * 5) + 1] & 536870912) == 0) {
            return Integer.valueOf(this.table.getGroups()[this.group * 5]);
        }
        Object obj = this.table.getSlots()[SlotTableKt.o(this.table.getGroups(), this.group)];
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String t() {
        int[] groups = this.table.getGroups();
        int i2 = this.group;
        if ((groups[(i2 * 5) + 1] & 268435456) != 0) {
            Object obj = this.table.getSlots()[SlotTableKt.ty(this.table.getGroups(), this.group)];
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        GroupSourceInformation groupSourceInformationE2 = this.table.E2(i2);
        if (groupSourceInformationE2 != null) {
            return groupSourceInformationE2.getSourceInformation();
        }
        return null;
    }

    public SlotTableGroup(SlotTable slotTable, int i2, int i3) {
        this.table = slotTable;
        this.group = i2;
        this.version = i3;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object Uo() {
        KN();
        SlotReader slotReaderNY = this.table.nY();
        try {
            return slotReaderNY.n(this.group);
        } finally {
            slotReaderNY.nr();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        KN();
        GroupSourceInformation groupSourceInformationE2 = this.table.E2(this.group);
        if (groupSourceInformationE2 != null) {
            SlotTable slotTable = this.table;
            int i2 = this.group;
            return new SourceInformationGroupIterator(slotTable, i2, groupSourceInformationE2, new AnchoredGroupPath(i2));
        }
        SlotTable slotTable2 = this.table;
        int i3 = this.group;
        return new GroupIterator(slotTable2, i3 + 1, i3 + SlotTableKt.ck(slotTable2.getGroups(), this.group));
    }
}
