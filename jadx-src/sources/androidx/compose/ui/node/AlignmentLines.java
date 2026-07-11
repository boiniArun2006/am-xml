package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\b*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J\u001e\u0010\u001b\u001a\u00020\u0019*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H$ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010-\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b,\u0010%\"\u0004\b#\u0010'R\"\u00101\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R\"\u00104\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\"\u00107\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R\u0018\u00108\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010:R\u0014\u0010=\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010%R\u0014\u0010?\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010%R$\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011*\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b.\u0010@\u0082\u0001\u0002BC\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Landroidx/compose/ui/node/AlignmentLines;", "", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "initialPosition", "Landroidx/compose/ui/node/NodeCoordinator;", "initialCoordinator", "", "t", "(Landroidx/compose/ui/layout/AlignmentLine;ILandroidx/compose/ui/node/NodeCoordinator;)V", "HI", "()V", "", "KN", "()Ljava/util/Map;", "xMQ", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/layout/AlignmentLine;)I", "ty", "ck", "az", "Landroidx/compose/ui/geometry/Offset;", "position", "nr", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", c.f62177j, "Landroidx/compose/ui/node/AlignmentLinesOwner;", "J2", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "", "rl", "Z", "Uo", "()Z", "setDirty$ui_release", "(Z)V", "dirty", "getUsedDuringParentMeasurement$ui_release", "XQ", "usedDuringParentMeasurement", "qie", "usedDuringParentLayout", "O", "getPreviousUsedDuringParentLayout$ui_release", "Ik", "previousUsedDuringParentLayout", "getUsedByModifierMeasurement$ui_release", "o", "usedByModifierMeasurement", "getUsedByModifierLayout$ui_release", "r", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "mUb", "queried", "gh", "required", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "Landroidx/compose/ui/node/LookaheadAlignmentLines;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,227:1\n30#2:228\n30#2:232\n53#3,3:229\n53#3,3:233\n70#3:237\n60#3:240\n69#4:236\n65#4:239\n22#5:238\n22#5:241\n26#5:242\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/AlignmentLines\n*L\n112#1:228\n120#1:232\n112#1:229,3\n120#1:233,3\n126#1:237\n128#1:240\n126#1:236\n128#1:239\n126#1:238\n128#1:241\n130#1:242\n*E\n"})
public abstract class AlignmentLines {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean usedByModifierMeasurement;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private AlignmentLinesOwner queryOwner;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean previousUsedDuringParentLayout;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean usedByModifierLayout;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AlignmentLinesOwner alignmentLinesOwner;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean usedDuringParentLayout;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean dirty;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentMeasurement;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Map alignmentLineMap;

    public /* synthetic */ AlignmentLines(AlignmentLinesOwner alignmentLinesOwner, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLinesOwner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(AlignmentLine alignmentLine, int initialPosition, NodeCoordinator initialCoordinator) {
        float f3 = initialPosition;
        long jO = Offset.O((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        while (true) {
            jO = nr(initialCoordinator, jO);
            initialCoordinator = initialCoordinator.getWrappedBy();
            Intrinsics.checkNotNull(initialCoordinator);
            if (Intrinsics.areEqual(initialCoordinator, this.alignmentLinesOwner.D())) {
                break;
            } else if (O(initialCoordinator).containsKey(alignmentLine)) {
                float fXMQ = xMQ(initialCoordinator, alignmentLine);
                jO = Offset.O((((long) Float.floatToRawIntBits(fXMQ)) << 32) | (((long) Float.floatToRawIntBits(fXMQ)) & 4294967295L));
            }
        }
        int iRound = Math.round(alignmentLine instanceof HorizontalAlignmentLine ? Float.intBitsToFloat((int) (jO & 4294967295L)) : Float.intBitsToFloat((int) (jO >> 32)));
        Map map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            iRound = AlignmentLineKt.t(alignmentLine, ((Number) MapsKt.getValue(this.alignmentLineMap, alignmentLine)).intValue(), iRound);
        }
        map.put(alignmentLine, Integer.valueOf(iRound));
    }

    protected abstract Map O(NodeCoordinator nodeCoordinator);

    public final void az() {
        this.dirty = true;
        AlignmentLinesOwner alignmentLinesOwnerXw = this.alignmentLinesOwner.Xw();
        if (alignmentLinesOwnerXw == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            alignmentLinesOwnerXw.ofS();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            alignmentLinesOwnerXw.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.ofS();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        alignmentLinesOwnerXw.getAlignmentLines().az();
    }

    public final void ck() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    protected abstract long nr(NodeCoordinator nodeCoordinator, long j2);

    protected abstract int xMQ(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine);

    private AlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        this.alignmentLinesOwner = alignmentLinesOwner;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }

    public final void Ik(boolean z2) {
        this.previousUsedDuringParentLayout = z2;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final AlignmentLinesOwner getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final Map getAlignmentLineMap() {
        return this.alignmentLineMap;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    public final void XQ(boolean z2) {
        this.usedDuringParentMeasurement = z2;
    }

    public final void Z(boolean z2) {
        this.usedDuringParentLayout = z2;
    }

    public final boolean mUb() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final void o(boolean z2) {
        this.usedByModifierMeasurement = z2;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final boolean getUsedDuringParentLayout() {
        return this.usedDuringParentLayout;
    }

    public final void r(boolean z2) {
        this.usedByModifierLayout = z2;
    }

    public final void ty() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.ijL(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                n(alignmentLinesOwner);
                return Unit.INSTANCE;
            }

            public final void n(AlignmentLinesOwner alignmentLinesOwner) {
                if (alignmentLinesOwner.getIsPlaced()) {
                    if (alignmentLinesOwner.getAlignmentLines().getDirty()) {
                        alignmentLinesOwner.E();
                    }
                    Map map = alignmentLinesOwner.getAlignmentLines().alignmentLineMap;
                    AlignmentLines alignmentLines = this.f32374n;
                    for (Map.Entry entry : map.entrySet()) {
                        alignmentLines.t((AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), alignmentLinesOwner.D());
                    }
                    NodeCoordinator wrappedBy = alignmentLinesOwner.D().getWrappedBy();
                    Intrinsics.checkNotNull(wrappedBy);
                    while (!Intrinsics.areEqual(wrappedBy, this.f32374n.getAlignmentLinesOwner().D())) {
                        Set<AlignmentLine> setKeySet = this.f32374n.O(wrappedBy).keySet();
                        AlignmentLines alignmentLines2 = this.f32374n;
                        for (AlignmentLine alignmentLine : setKeySet) {
                            alignmentLines2.t(alignmentLine, alignmentLines2.xMQ(wrappedBy, alignmentLine), wrappedBy);
                        }
                        wrappedBy = wrappedBy.getWrappedBy();
                        Intrinsics.checkNotNull(wrappedBy);
                    }
                }
            }
        });
        this.alignmentLineMap.putAll(O(this.alignmentLinesOwner.D()));
        this.dirty = false;
    }

    public final void HI() {
        AlignmentLinesOwner alignmentLinesOwner;
        AlignmentLines alignmentLinesO;
        AlignmentLines alignmentLinesO2;
        if (mUb()) {
            alignmentLinesOwner = this.alignmentLinesOwner;
        } else {
            AlignmentLinesOwner alignmentLinesOwnerXw = this.alignmentLinesOwner.Xw();
            if (alignmentLinesOwnerXw != null) {
                alignmentLinesOwner = alignmentLinesOwnerXw.getAlignmentLines().queryOwner;
                if (alignmentLinesOwner == null || !alignmentLinesOwner.getAlignmentLines().mUb()) {
                    AlignmentLinesOwner alignmentLinesOwner2 = this.queryOwner;
                    if (alignmentLinesOwner2 != null && !alignmentLinesOwner2.getAlignmentLines().mUb()) {
                        AlignmentLinesOwner alignmentLinesOwnerXw2 = alignmentLinesOwner2.Xw();
                        if (alignmentLinesOwnerXw2 != null && (alignmentLinesO2 = alignmentLinesOwnerXw2.getAlignmentLines()) != null) {
                            alignmentLinesO2.HI();
                        }
                        AlignmentLinesOwner alignmentLinesOwnerXw3 = alignmentLinesOwner2.Xw();
                        if (alignmentLinesOwnerXw3 != null && (alignmentLinesO = alignmentLinesOwnerXw3.getAlignmentLines()) != null) {
                            alignmentLinesOwner = alignmentLinesO.queryOwner;
                        } else {
                            alignmentLinesOwner = null;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.queryOwner = alignmentLinesOwner;
    }

    public final boolean gh() {
        HI();
        if (this.queryOwner != null) {
            return true;
        }
        return false;
    }
}
