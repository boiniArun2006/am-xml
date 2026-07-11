package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0018\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010+R\u0016\u0010-\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010$R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010(R\u0014\u00101\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010$¨\u00062"}, d2 = {"Landroidx/compose/runtime/SourceInformationSlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "Landroidx/compose/runtime/SlotTable;", "table", "", "parent", "Landroidx/compose/runtime/GroupSourceInformation;", "sourceInformation", "Landroidx/compose/runtime/SourceInformationGroupPath;", "identityPath", "<init>", "(Landroidx/compose/runtime/SlotTable;ILandroidx/compose/runtime/GroupSourceInformation;Landroidx/compose/runtime/SourceInformationGroupPath;)V", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", c.f62177j, "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "t", "I", "getParent", "()I", "O", "Landroidx/compose/runtime/GroupSourceInformation;", "getSourceInformation", "()Landroidx/compose/runtime/GroupSourceInformation;", "J2", "Landroidx/compose/runtime/SourceInformationGroupPath;", "getIdentityPath", "()Landroidx/compose/runtime/SourceInformationGroupPath;", "", "r", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "o", "Ljava/lang/Iterable;", "()Ljava/lang/Iterable;", "compositionGroups", "", "()Ljava/lang/String;", "sourceInfo", "node", "getData", "data", "Uo", "identity", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SourceInformationSlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final SourceInformationGroupPath identityPath;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final GroupSourceInformation sourceInformation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SlotTable table;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Iterable compositionGroups = this;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int parent;

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object J2() {
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    /* JADX INFO: renamed from: O, reason: from getter */
    public Iterable getCompositionGroups() {
        return this.compositionGroups;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object Uo() {
        return this.identityPath.n(this.table);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable getData() {
        return new SourceInformationGroupDataIterator(this.table, this.parent, this.sourceInformation);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        return this.key;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new SourceInformationGroupIterator(this.table, this.parent, this.sourceInformation, this.identityPath);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String t() {
        return this.sourceInformation.getSourceInformation();
    }

    public SourceInformationSlotTableGroup(SlotTable slotTable, int i2, GroupSourceInformation groupSourceInformation, SourceInformationGroupPath sourceInformationGroupPath) {
        this.table = slotTable;
        this.parent = i2;
        this.sourceInformation = groupSourceInformation;
        this.identityPath = sourceInformationGroupPath;
        this.key = Integer.valueOf(groupSourceInformation.getKey());
    }
}
