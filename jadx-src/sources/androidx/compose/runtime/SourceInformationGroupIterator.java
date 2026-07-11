package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0016¨\u0006%"}, d2 = {"Landroidx/compose/runtime/SourceInformationGroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/SlotTable;", "table", "", "parent", "Landroidx/compose/runtime/GroupSourceInformation;", "group", "Landroidx/compose/runtime/SourceInformationGroupPath;", JavetError.PARAMETER_PATH, "<init>", "(Landroidx/compose/runtime/SlotTable;ILandroidx/compose/runtime/GroupSourceInformation;Landroidx/compose/runtime/SourceInformationGroupPath;)V", "", "hasNext", "()Z", "t", "()Landroidx/compose/runtime/tooling/CompositionGroup;", c.f62177j, "Landroidx/compose/runtime/SlotTable;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "I", "getParent", "()I", "O", "Landroidx/compose/runtime/GroupSourceInformation;", "getGroup", "()Landroidx/compose/runtime/GroupSourceInformation;", "J2", "Landroidx/compose/runtime/SourceInformationGroupPath;", "getPath", "()Landroidx/compose/runtime/SourceInformationGroupPath;", "r", NodeModuleProcess.PROPERTY_VERSION, "o", "index", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3963:1\n1#2:3964\n*E\n"})
final class SourceInformationGroupIterator implements Iterator<CompositionGroup>, KMappedMarker {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final SourceInformationGroupPath path;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final GroupSourceInformation group;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SlotTable table;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int parent;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList groups = this.group.getGroups();
        return groups != null && this.index < groups.size();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public CompositionGroup next() {
        Object obj;
        ArrayList groups = this.group.getGroups();
        if (groups != null) {
            int i2 = this.index;
            this.index = i2 + 1;
            obj = groups.get(i2);
        } else {
            obj = null;
        }
        if (obj instanceof Anchor) {
            return new SlotTableGroup(this.table, ((Anchor) obj).getLocation(), this.version);
        }
        if (obj instanceof GroupSourceInformation) {
            return new SourceInformationSlotTableGroup(this.table, this.parent, (GroupSourceInformation) obj, new RelativeGroupPath(this.path, this.index - 1));
        }
        ComposerKt.XQ("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }

    public SourceInformationGroupIterator(SlotTable slotTable, int i2, GroupSourceInformation groupSourceInformation, SourceInformationGroupPath sourceInformationGroupPath) {
        this.table = slotTable;
        this.parent = i2;
        this.group = groupSourceInformation;
        this.path = sourceInformationGroupPath;
        this.version = slotTable.getCom.caoccao.javet.node.modules.NodeModuleProcess.PROPERTY_VERSION java.lang.String();
    }
}
