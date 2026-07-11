package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010'\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR6\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010(j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00105\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00108\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/compose/runtime/GroupSourceInformation;", "", "xMQ", "()Landroidx/compose/runtime/GroupSourceInformation;", "group", "", c.f62177j, "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/Anchor;", "anchor", "", "KN", "(Landroidx/compose/runtime/Anchor;)Z", "Landroidx/compose/runtime/SlotWriter;", "writer", "", "qie", "(Landroidx/compose/runtime/SlotWriter;I)V", "Landroidx/compose/runtime/SlotTable;", "table", "gh", "(Landroidx/compose/runtime/SlotTable;I)V", "predecessor", "rl", "(Landroidx/compose/runtime/SlotWriter;II)V", "mUb", "I", "J2", "()I", "key", "", "Ljava/lang/String;", "Uo", "()Ljava/lang/String;", "setSourceInformation", "(Ljava/lang/String;)V", "sourceInformation", "t", "nr", "dataStartOffset", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "O", "()Ljava/util/ArrayList;", "setGroups", "(Ljava/util/ArrayList;)V", "groups", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "setDataEndOffset", "(I)V", "dataEndOffset", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n1#2:3964\n799#3,8:3965\n789#3,7:3973\n90#4,2:3980\n33#4,6:3982\n92#4:3988\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n*L\n733#1:3965,8\n749#1:3973,7\n760#1:3980,2\n760#1:3982,6\n760#1:3988\n*E\n"})
public final class GroupSourceInformation {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int dataEndOffset;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private ArrayList groups;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private String sourceInformation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int dataStartOffset;

    private final boolean KN(Anchor anchor) {
        ArrayList arrayList = this.groups;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = arrayList.get(i2);
                if (Intrinsics.areEqual(obj, anchor)) {
                    return true;
                }
                if ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).KN(anchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void n(Object group) {
        ArrayList arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.groups = arrayList;
        arrayList.add(group);
    }

    private final GroupSourceInformation xMQ() {
        Object obj;
        GroupSourceInformation groupSourceInformationXMQ;
        ArrayList arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).closed) {
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        GroupSourceInformation groupSourceInformation = obj instanceof GroupSourceInformation ? (GroupSourceInformation) obj : null;
        return (groupSourceInformation == null || (groupSourceInformationXMQ = groupSourceInformation.xMQ()) == null) ? this : groupSourceInformationXMQ;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final ArrayList getGroups() {
        return this.groups;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final String getSourceInformation() {
        return this.sourceInformation;
    }

    public final boolean mUb(Anchor anchor) {
        ArrayList arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof Anchor) {
                    if (Intrinsics.areEqual(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof GroupSourceInformation) && !((GroupSourceInformation) obj).mUb(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getDataStartOffset() {
        return this.dataStartOffset;
    }

    public final void rl(SlotWriter writer, int predecessor, int group) {
        Anchor anchorY;
        ArrayList arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.groups = arrayList;
        }
        int i2 = 0;
        if (predecessor >= 0 && (anchorY = writer.y(predecessor)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                Object obj = arrayList.get(i2);
                if (Intrinsics.areEqual(obj, anchorY) || ((obj instanceof GroupSourceInformation) && ((GroupSourceInformation) obj).KN(anchorY))) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        arrayList.add(i2, writer.fD(group));
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getDataEndOffset() {
        return this.dataEndOffset;
    }

    public final void gh(SlotTable table, int group) {
        xMQ().n(table.KN(group));
    }

    public final void qie(SlotWriter writer, int group) {
        xMQ().n(writer.fD(group));
    }
}
