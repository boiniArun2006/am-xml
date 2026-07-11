package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.media3.common.C;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010(\n\u0002\b-\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u000b2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001eH\u0000¢\u0006\u0004\b!\u0010\"J\u008f\u0001\u00101\u001a\u00020 2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u0006\u0010*\u001a\u00020\u00062\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0000¢\u0006\u0004\b1\u00102J\u0087\u0001\u00103\u001a\u00020 2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u0006\u0010*\u001a\u00020\u00062\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0000¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0015¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0004\u0018\u00010\u001d2\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020 ¢\u0006\u0004\b:\u0010\u0005J\r\u0010;\u001a\u00020 ¢\u0006\u0004\b;\u0010\u0005J!\u0010=\u001a\u0004\u0018\u00010(2\u0006\u00107\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010>J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030?H\u0096\u0002¢\u0006\u0004\b@\u0010AR$\u0010%\u001a\u00020$2\u0006\u0010B\u001a\u00020$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR$\u0010&\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR4\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR$\u0010*\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bO\u0010H\u001a\u0004\bP\u0010JR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010S\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010RR$\u0010#\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bT\u0010T\u001a\u0004\bU\u00106R\"\u0010Z\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010H\u001a\u0004\bW\u0010J\"\u0004\bX\u0010YR2\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_RB\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010`\u001a\u0004\bV\u0010a\"\u0004\bb\u0010cR*\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u00106R\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010j¨\u0006l"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "<init>", "()V", "", "index", "Landroidx/compose/runtime/Anchor;", "e", "(I)Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/SlotReader;", "nY", "()Landroidx/compose/runtime/SlotReader;", "Landroidx/compose/runtime/SlotWriter;", "g", "()Landroidx/compose/runtime/SlotWriter;", "KN", "anchor", "xMQ", "(Landroidx/compose/runtime/Anchor;)I", "", "te", "(Landroidx/compose/runtime/Anchor;)Z", "groupIndex", "ViF", "(ILandroidx/compose/runtime/Anchor;)Z", "reader", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "", "mUb", "(Landroidx/compose/runtime/SlotReader;Ljava/util/HashMap;)V", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "calledByMap", "gh", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "iF", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "ty", "()Z", "group", "E2", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "qie", "az", "slotIndex", "fD", "(II)Ljava/lang/Object;", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "<set-?>", c.f62177j, "[I", "Ik", "()[I", "t", "I", "r", "()I", "O", "[Ljava/lang/Object;", "o", "()[Ljava/lang/Object;", "J2", "XQ", "readers", "Ljava/lang/Object;", "lock", "Z", "aYN", "S", "WPU", "setVersion$runtime_release", "(I)V", NodeModuleProcess.PROPERTY_VERSION, "Ljava/util/ArrayList;", "HI", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "Landroidx/collection/MutableIntObjectMap;", "ck", "()Landroidx/collection/MutableIntObjectMap;", "setCalledByMap$runtime_release", "(Landroidx/collection/MutableIntObjectMap;)V", "isEmpty", "()Ljava/lang/Iterable;", "compositionGroups", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 6 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n158#1,7:4029\n174#1,4:4036\n179#1,3:4047\n27#2:3964\n33#2,2:4022\n1#3:3965\n1#3:4046\n4643#4,5:3966\n4643#4,5:3971\n4643#4,5:3976\n4643#4,5:3992\n4643#4,5:3997\n4643#4,5:4007\n4643#4,5:4012\n4643#4,5:4017\n33#5,5:3981\n33#5,5:4002\n33#5,5:4024\n48#5,5:4052\n48#5,5:4057\n33#5,5:4066\n33#5,5:4071\n33#5,5:4077\n33#5,5:4082\n48#5,5:4099\n48#5,5:4104\n48#5,5:4109\n48#5,5:4116\n48#5,5:4121\n48#5,5:4126\n48#5,5:4134\n48#5,5:4141\n48#5,5:4147\n48#5,5:4152\n48#5,5:4159\n33#5,5:4168\n33#5,5:4173\n3825#6,6:3986\n3698#6:4050\n3746#6:4051\n3726#6:4087\n3732#6:4088\n3689#6:4089\n3698#6:4090\n3672#6:4091\n3666#6:4092\n3669#6:4093\n3681#6:4094\n3777#6:4095\n3777#6:4096\n3777#6:4097\n3746#6:4098\n3777#6:4114\n3777#6:4115\n3666#6:4131\n3672#6:4132\n3681#6:4133\n3666#6:4139\n3669#6:4140\n3732#6:4146\n3708#6:4157\n3698#6:4158\n3777#6:4179\n33#7,6:4040\n33#7,4:4062\n38#7:4076\n33#7,4:4164\n38#7:4178\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n346#1:4029,7\n382#1:4036,4\n382#1:4047,3\n123#1:3964\n268#1:4022,2\n382#1:4046\n202#1:3966,5\n203#1:3971,5\n219#1:3976,5\n226#1:3992,5\n237#1:3997,5\n254#1:4007,5\n255#1:4012,5\n265#1:4017,5\n220#1:3981,5\n238#1:4002,5\n294#1:4024,5\n493#1:4052,5\n500#1:4057,5\n509#1:4066,5\n512#1:4071,5\n533#1:4077,5\n534#1:4082,5\n434#1:4099,5\n439#1:4104,5\n442#1:4109,5\n448#1:4116,5\n451#1:4121,5\n453#1:4126,5\n458#1:4134,5\n462#1:4141,5\n471#1:4147,5\n476#1:4152,5\n481#1:4159,5\n521#1:4168,5\n522#1:4173,5\n221#1:3986,6\n399#1:4050\n418#1:4051\n588#1:4087\n593#1:4088\n596#1:4089\n599#1:4090\n605#1:4091\n612#1:4092\n613#1:4093\n615#1:4094\n660#1:4095\n661#1:4096\n667#1:4097\n433#1:4098\n446#1:4114\n447#1:4115\n455#1:4131\n456#1:4132\n457#1:4133\n461#1:4139\n462#1:4140\n469#1:4146\n480#1:4157\n481#1:4158\n589#1:4179\n384#1:4040,6\n507#1:4062,4\n507#1:4076\n518#1:4164,4\n518#1:4178\n*E\n"})
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private HashMap sourceInformationMap;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int slotsSize;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int version;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean writer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private MutableIntObjectMap calledByMap;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int readers;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int groupsSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int[] groups = new int[0];

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Object[] slots = new Object[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ArrayList anchors = new ArrayList();

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable O() {
        return this;
    }

    private final Anchor e(int index) {
        int i2;
        if (this.writer) {
            ComposerKt.Z("use active SlotWriter to crate an anchor for location instead");
        }
        if (index < 0 || index >= (i2 = this.groupsSize)) {
            return null;
        }
        return SlotTableKt.HI(this.anchors, index, i2);
    }

    public final GroupSourceInformation E2(int group) {
        Anchor anchorE;
        HashMap map = this.sourceInformationMap;
        if (map == null || (anchorE = e(group)) == null) {
            return null;
        }
        return (GroupSourceInformation) map.get(anchorE);
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final ArrayList getAnchors() {
        return this.anchors;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final int[] getGroups() {
        return this.groups;
    }

    public final Anchor KN(int index) {
        if (this.writer) {
            ComposerKt.Z("use active SlotWriter to create an anchor location instead");
        }
        boolean z2 = false;
        if (index >= 0 && index < this.groupsSize) {
            z2 = true;
        }
        if (!z2) {
            PreconditionsKt.n("Parameter index is out of range");
        }
        ArrayList arrayList = this.anchors;
        int iZ = SlotTableKt.Z(arrayList, index, this.groupsSize);
        if (iZ >= 0) {
            return (Anchor) arrayList.get(iZ);
        }
        Anchor anchor = new Anchor(index);
        arrayList.add(-(iZ + 1), anchor);
        return anchor;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final HashMap getSourceInformationMap() {
        return this.sourceInformationMap;
    }

    public final boolean ViF(int groupIndex, Anchor anchor) {
        if (this.writer) {
            ComposerKt.Z("Writer is active");
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            ComposerKt.Z("Invalid group index");
        }
        if (te(anchor)) {
            int iCk = SlotTableKt.ck(this.groups, groupIndex) + groupIndex;
            int iN = anchor.getLocation();
            if (groupIndex <= iN && iN < iCk) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final int getSlotsSize() {
        return this.slotsSize;
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final void az() {
        this.sourceInformationMap = new HashMap();
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final MutableIntObjectMap getCalledByMap() {
        return this.calledByMap;
    }

    public final Object fD(int group, int slotIndex) {
        int iXQ = SlotTableKt.XQ(this.groups, group);
        int i2 = group + 1;
        return (slotIndex < 0 || slotIndex >= (i2 < this.groupsSize ? this.groups[(i2 * 5) + 4] : this.slots.length) - iXQ) ? Composer.INSTANCE.n() : this.slots[iXQ + slotIndex];
    }

    public final SlotWriter g() {
        if (this.writer) {
            ComposerKt.Z("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            ComposerKt.Z("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final void iF(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList anchors, HashMap sourceInformationMap, MutableIntObjectMap calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    public final SlotReader nY() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Object[] getSlots() {
        return this.slots;
    }

    public final void qie() {
        this.calledByMap = new MutableIntObjectMap(0, 1, null);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final boolean ty() {
        return this.groupsSize > 0 && (this.groups[1] & C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0;
    }

    public final int xMQ(Anchor anchor) {
        if (this.writer) {
            ComposerKt.Z("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.rl()) {
            PreconditionsKt.n("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }

    public final void gh(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList anchors, HashMap sourceInformationMap, MutableIntObjectMap calledByMap) {
        boolean z2;
        if (writer.getTable() == this && this.writer) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            PreconditionsKt.n("Unexpected writer close()");
        }
        this.writer = false;
        iF(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }

    public final void mUb(SlotReader reader, HashMap sourceInformationMap) {
        boolean z2;
        if (reader.getTable() == this && this.readers > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ComposerKt.Z("Unexpected reader close()");
        }
        this.readers--;
        if (sourceInformationMap != null) {
            synchronized (this.lock) {
                try {
                    HashMap map = this.sourceInformationMap;
                    if (map != null) {
                        map.putAll(sourceInformationMap);
                    } else {
                        this.sourceInformationMap = sourceInformationMap;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean te(Anchor anchor) {
        int iZ;
        if (anchor.rl() && (iZ = SlotTableKt.Z(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && Intrinsics.areEqual(this.anchors.get(iZ), anchor)) {
            return true;
        }
        return false;
    }
}
