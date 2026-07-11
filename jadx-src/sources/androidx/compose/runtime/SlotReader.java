package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0014J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0014J\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\"¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\"¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\"¢\u0006\u0004\b'\u0010$J\r\u0010(\u001a\u00020\"¢\u0006\u0004\b(\u0010$J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\"¢\u0006\u0004\b+\u0010$J\u0015\u0010,\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b.\u0010-J\r\u0010/\u001a\u00020\"¢\u0006\u0004\b/\u0010$J\u0013\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010@\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010?R\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010BR\u0014\u0010D\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010?R6\u0010I\u001a\"\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020F\u0018\u00010Ej\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020F\u0018\u0001`G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010HR$\u0010N\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010K\u001a\u0004\bL\u0010MR$\u0010P\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010?\u001a\u0004\bO\u0010*R$\u0010R\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bQ\u0010*R$\u0010T\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bQ\u0010?\u001a\u0004\bS\u0010*R\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010VR\u0016\u0010Y\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010?R\u0016\u0010[\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010?R\u0016\u0010]\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010?R$\u0010`\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b^\u0010K\u001a\u0004\b_\u0010MR\u0011\u0010b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\ba\u0010*R\u0011\u0010d\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bc\u0010MR\u0011\u0010f\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\be\u0010MR\u0011\u0010g\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bK\u0010MR\u0011\u0010i\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bh\u0010*R\u0011\u0010j\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bZ\u0010*R\u0011\u0010k\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\\\u0010*R\u0011\u0010m\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bl\u0010*R\u0011\u0010o\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bn\u0010MR\u0013\u0010p\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b^\u0010!R\u0013\u0010q\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bX\u0010!R\u0011\u0010s\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\br\u0010*R\u0011\u0010u\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bt\u0010*¨\u0006v"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "", "index", "v", "([II)Ljava/lang/Object;", "rl", "bzg", "Xw", "(I)I", "", "nHg", "(I)Z", "rV9", "wTp", "(I)Ljava/lang/Object;", "E2", "iF", "X", "fD", "nY", "e", "O", "g", "group", "te", "(II)Ljava/lang/Object;", "s7N", "()Ljava/lang/Object;", "", "t", "()V", "J2", "nr", "p5", "eF", "P5", "()I", "M7", "jB", "(I)V", "U", "Uo", "", "Landroidx/compose/runtime/KeyInfo;", "KN", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/Anchor;", c.f62177j, "(I)Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/SlotTable;", "ViF", "()Landroidx/compose/runtime/SlotTable;", "[I", "groups", "I", "groupsSize", "", "[Ljava/lang/Object;", "slots", "slotsSize", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "sourceInformationMap", "<set-?>", "Z", "xMQ", "()Z", "closed", "gh", "currentGroup", "mUb", "currentEnd", "XQ", "parent", "Landroidx/compose/runtime/IntStack;", "Landroidx/compose/runtime/IntStack;", "currentSlotStack", "qie", "emptyCount", "az", "currentSlot", "ty", "currentSlotEnd", "HI", "r", "hadNext", "aYN", "size", "N", "isNode", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "isGroupEnd", "inEmpty", "ck", "groupSize", "groupEnd", "groupKey", "Ik", "groupSlotIndex", "o", "hasObjectKey", "groupObjectKey", "groupAux", "S", "parentNodes", "WPU", "remainingSlots", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3963:1\n3746#2:3964\n3666#2:3965\n3666#2:3966\n3732#2:3967\n3732#2:3968\n3666#2:3969\n3726#2:3970\n3726#2:3971\n3672#2:3972\n3672#2:3973\n3726#2:3974\n3689#2:3975\n3698#2:3976\n3732#2:3977\n3746#2:3983\n3777#2:3984\n3777#2:3985\n3746#2:3991\n3777#2:3997\n3666#2:3998\n3666#2:4009\n3732#2:4010\n3746#2:4021\n3746#2:4032\n3777#2:4033\n3726#2:4034\n3666#2:4035\n3732#2:4036\n3825#2,6:4037\n3666#2:4043\n3669#2:4044\n3681#2:4045\n3672#2:4046\n33#3,5:3978\n33#3,5:3986\n33#3,5:3992\n33#3,5:3999\n4643#4,5:4004\n4643#4,5:4011\n4643#4,5:4016\n4643#4,5:4022\n4643#4,5:4027\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n873#1:3964\n877#1:3965\n880#1:3966\n887#1:3967\n890#1:3968\n893#1:3969\n924#1:3970\n928#1:3971\n938#1:3972\n941#1:3973\n962#1:3974\n965#1:3975\n971#1:3976\n975#1:3977\n985#1:3983\n994#1:3984\n1011#1:3985\n1062#1:3991\n1080#1:3997\n1087#1:3998\n1095#1:4009\n1095#1:4010\n1112#1:4021\n1140#1:4032\n1151#1:4033\n1168#1:4034\n1171#1:4035\n1171#1:4036\n1185#1:4037,6\n1188#1:4043\n1189#1:4044\n1193#1:4045\n1198#1:4046\n984#1:3978,5\n1044#1:3986,5\n1062#1:3992,5\n1087#1:3999,5\n1094#1:4004,5\n1102#1:4011,5\n1110#1:4016,5\n1125#1:4022,5\n1137#1:4027,5\n*E\n"})
public final class SlotReader {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private boolean hadNext;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private HashMap sourceInformationMap;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata and from toString */
    private int current;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int slotsSize;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private int currentSlot;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final IntStack currentSlotStack;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata and from toString */
    private int parent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SlotTable table;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Object[] slots;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private int emptyCount;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int[] groups;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int groupsSize;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private int currentSlotEnd;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata and from toString */
    private int end;

    public final void nr() {
        this.closed = true;
        this.table.mUb(this, this.sourceInformationMap);
    }

    private final Object bzg(int[] iArr, int i2) {
        if ((iArr[(i2 * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.o(iArr, i2)];
        }
        return null;
    }

    private final Object rl(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 268435456) != 0 ? this.slots[SlotTableKt.ty(iArr, i2)] : Composer.INSTANCE.n();
    }

    private final Object v(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return (iArr[i3 + 1] & 1073741824) != 0 ? this.slots[iArr[i3 + 4]] : Composer.INSTANCE.n();
    }

    public final int E2(int index) {
        return SlotTableKt.ck(this.groups, index);
    }

    public final Object HI() {
        int i2 = this.current;
        if (i2 < this.end) {
            return bzg(this.groups, i2);
        }
        return null;
    }

    public final int Ik() {
        return this.currentSlot - SlotTableKt.XQ(this.groups, this.parent);
    }

    public final void J2() {
        if (!(this.emptyCount > 0)) {
            PreconditionsKt.n("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final List KN() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int i2 = 0;
            int iCk = this.current;
            while (true) {
                int i3 = i2;
                if (iCk >= this.end) {
                    break;
                }
                int[] iArr = this.groups;
                int i5 = iCk * 5;
                int i7 = iArr[i5];
                Object objBzg = bzg(iArr, iCk);
                int i8 = 1;
                int i9 = this.groups[i5 + 1];
                if ((1073741824 & i9) == 0) {
                    i8 = i9 & 67108863;
                }
                i2 = i3 + 1;
                arrayList.add(new KeyInfo(i7, objBzg, iCk, i8, i3));
                iCk += SlotTableKt.ck(this.groups, iCk);
            }
        }
        return arrayList;
    }

    public final void M7() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.Z("Cannot skip the enclosing group while in an empty region");
        }
        this.current = this.end;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final boolean N() {
        return (this.groups[(this.current * 5) + 1] & 1073741824) != 0;
    }

    public final boolean O(int index) {
        return (this.groups[(index * 5) + 1] & C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0;
    }

    public final int P5() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.Z("Cannot skip while in an empty region");
        }
        int[] iArr = this.groups;
        int i2 = this.current;
        int i3 = (iArr[(i2 * 5) + 1] & 1073741824) == 0 ? iArr[(i2 * 5) + 1] & 67108863 : 1;
        this.current = i2 + SlotTableKt.ck(iArr, i2);
        return i3;
    }

    public final int S() {
        int i2 = this.parent;
        if (i2 >= 0) {
            return this.groups[(i2 * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final void U(int index) {
        int iCk = SlotTableKt.ck(this.groups, index) + index;
        int i2 = this.current;
        if (!(i2 >= index && i2 <= iCk)) {
            ComposerKt.Z("Index " + index + " is not a parent of " + i2);
        }
        this.parent = index;
        this.end = iCk;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void Uo() {
        if (this.emptyCount == 0) {
            if (!(this.current == this.end)) {
                ComposerKt.Z("endGroup() not called at the end of a group");
            }
            int[] iArr = this.groups;
            int i2 = iArr[(this.parent * 5) + 2];
            this.parent = i2;
            this.end = i2 < 0 ? this.groupsSize : SlotTableKt.ck(iArr, i2) + i2;
            int iUo = this.currentSlotStack.Uo();
            if (iUo < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = iUo;
                this.currentSlotEnd = i2 >= this.groupsSize - 1 ? this.slotsSize : this.groups[((i2 + 1) * 5) + 4];
            }
        }
    }

    /* JADX INFO: renamed from: ViF, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final int WPU() {
        return this.currentSlotEnd - this.currentSlot;
    }

    public final boolean X(int index) {
        return (this.groups[(index * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final int Xw(int index) {
        return this.groups[(index * 5) + 2];
    }

    public final boolean Z() {
        return this.emptyCount > 0;
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    public final int ck() {
        return SlotTableKt.ck(this.groups, this.current);
    }

    public final boolean e(int index) {
        return (this.groups[(index * 5) + 1] & 134217728) != 0;
    }

    public final void eF() {
        if (this.emptyCount <= 0) {
            if (!((this.groups[(this.current * 5) + 1] & 1073741824) != 0)) {
                PreconditionsKt.n("Expected a node group");
            }
            p5();
        }
    }

    public final Object fD(int index) {
        return bzg(this.groups, index);
    }

    public final Object g(int index) {
        return te(this.current, index);
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    public final int iF(int index) {
        return this.groups[index * 5];
    }

    public final void jB(int index) {
        if (!(this.emptyCount == 0)) {
            ComposerKt.Z("Cannot reposition while in an empty region");
        }
        this.current = index;
        int i2 = this.groupsSize;
        int i3 = index < i2 ? this.groups[(index * 5) + 2] : -1;
        this.parent = i3;
        if (i3 < 0) {
            this.end = i2;
        } else {
            this.end = i3 + SlotTableKt.ck(this.groups, i3);
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int mUb() {
        return this.end;
    }

    public final Anchor n(int index) {
        ArrayList anchors = this.table.getAnchors();
        int iZ = SlotTableKt.Z(anchors, index, this.groupsSize);
        if (iZ >= 0) {
            return (Anchor) anchors.get(iZ);
        }
        Anchor anchor = new Anchor(index);
        anchors.add(-(iZ + 1), anchor);
        return anchor;
    }

    public final boolean nHg(int index) {
        return (this.groups[(index * 5) + 1] & 1073741824) != 0;
    }

    public final Object nY(int index) {
        return rl(this.groups, index);
    }

    public final boolean o() {
        int i2 = this.current;
        return i2 < this.end && (this.groups[(i2 * 5) + 1] & 536870912) != 0;
    }

    public final void p5() {
        GroupSourceInformation groupSourceInformation;
        if (this.emptyCount <= 0) {
            int i2 = this.parent;
            int i3 = this.current;
            if (!(this.groups[(i3 * 5) + 2] == i2)) {
                PreconditionsKt.n("Invalid slot table detected");
            }
            HashMap map = this.sourceInformationMap;
            if (map != null && (groupSourceInformation = (GroupSourceInformation) map.get(n(i2))) != null) {
                groupSourceInformation.gh(this.table, i3);
            }
            IntStack intStack = this.currentSlotStack;
            int i5 = this.currentSlot;
            int i7 = this.currentSlotEnd;
            if (i5 == 0 && i7 == 0) {
                intStack.KN(-1);
            } else {
                intStack.KN(i5);
            }
            this.parent = i3;
            this.end = SlotTableKt.ck(this.groups, i3) + i3;
            int i8 = i3 + 1;
            this.current = i8;
            this.currentSlot = SlotTableKt.XQ(this.groups, i3);
            this.currentSlotEnd = i3 >= this.groupsSize - 1 ? this.slotsSize : this.groups[(i8 * 5) + 4];
        }
    }

    public final Object qie() {
        int i2 = this.current;
        if (i2 < this.end) {
            return rl(this.groups, i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final int rV9(int index) {
        return this.groups[(index * 5) + 1] & 67108863;
    }

    public final Object s7N() {
        int i2;
        if (this.emptyCount > 0 || (i2 = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return Composer.INSTANCE.n();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i2 + 1;
        return objArr[i2];
    }

    public final void t() {
        this.emptyCount++;
    }

    public final Object te(int group, int index) {
        int iXQ = SlotTableKt.XQ(this.groups, group);
        int i2 = group + 1;
        int i3 = iXQ + index;
        return i3 < (i2 < this.groupsSize ? this.groups[(i2 * 5) + 4] : this.slotsSize) ? this.slots[i3] : Composer.INSTANCE.n();
    }

    public String toString() {
        return "SlotReader(current=" + this.current + ", key=" + ty() + ", parent=" + this.parent + ", end=" + this.end + ')';
    }

    public final int ty() {
        int i2 = this.current;
        if (i2 < this.end) {
            return this.groups[i2 * 5];
        }
        return 0;
    }

    public final Object wTp(int index) {
        int[] iArr = this.groups;
        if ((iArr[(index * 5) + 1] & 1073741824) != 0) {
            return v(iArr, index);
        }
        return null;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public SlotReader(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.end = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new IntStack();
    }

    public final boolean T() {
        if (!Z() && this.current != this.end) {
            return false;
        }
        return true;
    }
}
