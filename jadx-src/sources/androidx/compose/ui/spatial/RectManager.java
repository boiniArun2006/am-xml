package androidx.compose.ui.spatial;

import android.os.Trace;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Actual_androidKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u000b*\u00020\u0018H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u0013\u001a\u00020\b*\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0013\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u000b*\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!J(\u0010&\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\b¢\u0006\u0004\b(\u0010!J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010)\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010*J\u001d\u0010-\u001a\u0004\u0018\u00010\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0+¢\u0006\u0004\b-\u0010.JA\u00108\u001a\u0002072\u0006\u0010/\u001a\u00020\u00112\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00104\u001a\u0002032\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\b05¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b=\u0010\nJ\u0015\u0010>\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b>\u0010\nJ(\u0010?\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b?\u0010\u0010J\u0015\u0010@\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b@\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0017\u0010H\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010JR \u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0+0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010MR\u0016\u0010O\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010&R\u0016\u0010P\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0016\u0010Q\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0018\u0010S\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010RR\u0016\u0010U\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010TR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010VR\u0014\u0010Y\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/ui/spatial/RectManager;", "", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "<init>", "(Landroidx/collection/IntObjectMap;)V", "layoutNode", "", "KN", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "firstPlacement", "Uo", "(Landroidx/compose/ui/node/LayoutNode;JZ)V", "", CmcdData.STREAM_TYPE_LIVE, "t", "r", "b", "J2", "(Landroidx/compose/ui/node/LayoutNode;ZIIII)V", "Landroidx/compose/ui/node/NodeCoordinator;", "ty", "(Landroidx/compose/ui/node/NodeCoordinator;)J", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;)V", "az", "(Landroidx/compose/ui/node/LayoutNode;)J", "xMQ", "()V", "screenOffset", "windowOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "Z", "(JJ[F)V", "nr", "ensureSomethingScheduled", "(Z)V", "Lkotlin/Function0;", "callback", "HI", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "id", "", "throttleMillis", "debounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "ck", "(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "token", "o", "(Ljava/lang/Object;)V", "mUb", "gh", "qie", "Ik", c.f62177j, "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/spatial/RectList;", "rl", "Landroidx/compose/ui/spatial/RectList;", "O", "()Landroidx/compose/ui/spatial/RectList;", "rects", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "throttledCallbacks", "Landroidx/collection/MutableObjectList;", "Landroidx/collection/MutableObjectList;", "callbacks", "isDirty", "isScreenOrWindowDirty", "isFragmented", "Ljava/lang/Object;", "dispatchToken", "J", "scheduledDispatchDeadline", "Lkotlin/jvm/functions/Function0;", "dispatchLambda", "Landroidx/compose/ui/geometry/MutableRect;", "cachedRect", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRectManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n+ 5 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 6 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 7 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 12 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,547:1\n1516#2:548\n544#3:549\n540#3:607\n544#3:608\n287#4,6:550\n725#5,7:556\n732#5,4:564\n736#5,7:569\n835#6:563\n810#6:568\n207#7:576\n207#7:592\n423#8,9:577\n423#8,9:593\n54#9:586\n59#9:588\n85#10:587\n90#10:589\n80#10:591\n53#10,3:604\n30#11:590\n159#12:602\n30#13:603\n*S KotlinDebug\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager\n*L\n50#1:548\n75#1:549\n425#1:607\n426#1:608\n90#1:550,6\n91#1:556,7\n91#1:564,4\n91#1:569,7\n91#1:563\n91#1:568\n213#1:576\n303#1:592\n213#1:577,9\n303#1:593,9\n249#1:586\n250#1:588\n249#1:587\n250#1:589\n288#1:591\n402#1:604,3\n288#1:590\n402#1:602\n402#1:603\n*E\n"})
public final class RectManager {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean isScreenOrWindowDirty;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Object dispatchToken;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean isFragmented;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final IntObjectMap layoutNodes;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final RectList rects = new RectList();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ThrottledCallbacks throttledCallbacks = new ThrottledCallbacks();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableObjectList callbacks = new MutableObjectList(0, 1, null);

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private long scheduledDispatchDeadline = -1;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final Function0 dispatchLambda = new Function0<Unit>() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f33320n.dispatchToken = null;
            RectManager rectManager = this.f33320n;
            Trace.beginSection("OnPositionedDispatch");
            try {
                rectManager.nr();
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.endSection();
            }
        }
    };

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final MutableRect cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);

    public final void mUb(LayoutNode layoutNode) {
        this.isDirty = true;
        this.rects.J2(layoutNode.getSemanticsId());
        r(true);
    }

    public final void o(Object token) {
        if ((TypeIntrinsics.isFunctionOfArity(token, 0) ? (Function0) token : null) == null) {
            return;
        }
        this.callbacks.ViF(token);
    }

    public final void xMQ() {
        this.isDirty = true;
    }

    private final void Uo(LayoutNode layoutNode, long position, boolean firstPlacement) {
        NodeCoordinator nodeCoordinatorN1 = layoutNode.n1();
        MeasurePassDelegate measurePassDelegateETf = layoutNode.eTf();
        int iMYa = measurePassDelegateETf.mYa();
        int iN1 = measurePassDelegateETf.n1();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.Uo(IntOffset.gh(position), IntOffset.qie(position), IntOffset.gh(position) + iMYa, IntOffset.qie(position) + iN1);
        t(nodeCoordinatorN1, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int i2 = (int) mutableRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        if (firstPlacement || !this.rects.mUb(semanticsId, left, top, i2, bottom)) {
            LayoutNode layoutNodeMYa = layoutNode.mYa();
            RectList.O(this.rects, semanticsId, left, top, i2, bottom, layoutNodeMYa != null ? layoutNodeMYa.getSemanticsId() : -1, false, false, 192, null);
        }
        xMQ();
    }

    private final void t(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            long position = nodeCoordinator.getPosition();
            mutableRect.az(Offset.O((((long) Float.floatToRawIntBits(IntOffset.gh(position))) << 32) | (((long) Float.floatToRawIntBits(IntOffset.qie(position))) & 4294967295L)));
            nodeCoordinator = nodeCoordinator.getWrappedBy();
            if (layer != null) {
                float[] fArrMo6getUnderlyingMatrixsQKQjiQ = layer.mo6getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.n(fArrMo6getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.Uo(fArrMo6getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
        }
    }

    private final long ty(NodeCoordinator nodeCoordinator) {
        long jT2 = Offset.INSTANCE.t();
        while (nodeCoordinator != null) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            jT2 = IntOffsetKt.t(jT2, nodeCoordinator.getPosition());
            nodeCoordinator = nodeCoordinator.getWrappedBy();
            if (layer != null) {
                float[] fArrMo6getUnderlyingMatrixsQKQjiQ = layer.mo6getUnderlyingMatrixsQKQjiQ();
                int iT = RectManagerKt.t(fArrMo6getUnderlyingMatrixsQKQjiQ);
                if (iT == 3) {
                    continue;
                } else {
                    if ((iT & 2) == 0) {
                        return IntOffset.INSTANCE.n();
                    }
                    jT2 = Matrix.J2(fArrMo6getUnderlyingMatrixsQKQjiQ, jT2);
                }
            }
        }
        return IntOffsetKt.nr(jT2);
    }

    public final Object HI(Function0 callback) {
        this.callbacks.ty(callback);
        return callback;
    }

    public final void Ik(LayoutNode layoutNode) {
        this.rects.KN(layoutNode.getSemanticsId());
        xMQ();
        this.isFragmented = true;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final RectList getRects() {
        return this.rects;
    }

    public final DelegatableNode.RegistrationHandle ck(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1 callback) {
        return this.throttledCallbacks.ck(id, throttleMillis, debounceMillis, node, callback);
    }

    public final void gh(LayoutNode layoutNode) {
        if (ComposeUiFlags.isRectTrackingEnabled) {
            long jAz = az(layoutNode);
            if (!RectManagerKt.nr(jAz)) {
                KN(layoutNode);
                return;
            }
            layoutNode.tEO(jAz);
            layoutNode.yAc(false);
            MutableVector mutableVectorHRu = layoutNode.hRu();
            Object[] objArr = mutableVectorHRu.content;
            int size = mutableVectorHRu.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
                qie(layoutNode2, layoutNode2.n1().getPosition(), false);
            }
            mUb(layoutNode);
        }
    }

    public final void qie(LayoutNode layoutNode, long position, boolean firstPlacement) {
        long j2;
        long jTy;
        long jAz;
        if (ComposeUiFlags.isRectTrackingEnabled) {
            MeasurePassDelegate measurePassDelegateETf = layoutNode.eTf();
            int iMYa = measurePassDelegateETf.mYa();
            int iN1 = measurePassDelegateETf.n1();
            LayoutNode layoutNodeMYa = layoutNode.mYa();
            long offsetFromRoot = layoutNode.getOffsetFromRoot();
            long lastSize = layoutNode.getLastSize();
            int i2 = (int) (lastSize >> 32);
            int i3 = (int) (lastSize & 4294967295L);
            boolean z2 = false;
            if (layoutNodeMYa != null) {
                boolean outerToInnerOffsetDirty = layoutNodeMYa.getOuterToInnerOffsetDirty();
                long offsetFromRoot2 = layoutNodeMYa.getOffsetFromRoot();
                long outerToInnerOffset = layoutNodeMYa.getOuterToInnerOffset();
                if (RectManagerKt.nr(offsetFromRoot2)) {
                    if (outerToInnerOffsetDirty) {
                        j2 = 4294967295L;
                        jAz = az(layoutNodeMYa);
                        layoutNodeMYa.tEO(jAz);
                        layoutNodeMYa.yAc(false);
                    } else {
                        j2 = 4294967295L;
                        jAz = outerToInnerOffset;
                    }
                    z2 = !RectManagerKt.nr(jAz);
                    jTy = IntOffset.HI(IntOffset.HI(offsetFromRoot2, jAz), position);
                } else {
                    j2 = 4294967295L;
                    jTy = ty(layoutNode.n1());
                }
            } else {
                j2 = 4294967295L;
                jTy = position;
            }
            if (z2 || !RectManagerKt.nr(jTy)) {
                Uo(layoutNode, position, firstPlacement);
                return;
            }
            layoutNode.SR(jTy);
            layoutNode.rxp(IntSize.t((((long) iMYa) << 32) | (((long) iN1) & j2)));
            int iGh = IntOffset.gh(jTy);
            int iQie = IntOffset.qie(jTy);
            int i5 = iGh + iMYa;
            int i7 = iQie + iN1;
            if (!firstPlacement && IntOffset.mUb(jTy, offsetFromRoot) && i2 == iMYa && i3 == iN1) {
                return;
            }
            J2(layoutNode, firstPlacement, iGh, iQie, i5, i7);
        }
    }

    public final void r(boolean ensureSomethingScheduled) {
        boolean z2 = (ensureSomethingScheduled && this.dispatchToken == null) ? false : true;
        long jXMQ = this.throttledCallbacks.getMinDebounceDeadline();
        if (jXMQ >= 0 || !z2) {
            if (this.scheduledDispatchDeadline == jXMQ && z2) {
                return;
            }
            Object obj = this.dispatchToken;
            if (obj != null) {
                Actual_androidKt.O(obj);
            }
            long jRl = Actual_androidKt.rl();
            long jMax = Math.max(jXMQ, ((long) 16) + jRl);
            this.scheduledDispatchDeadline = jMax;
            this.dispatchToken = Actual_androidKt.t(jMax - jRl, this.dispatchLambda);
        }
    }

    public RectManager(IntObjectMap intObjectMap) {
        this.layoutNodes = intObjectMap;
    }

    private final void J2(LayoutNode layoutNode, boolean firstPlacement, int l2, int t3, int r2, int b2) {
        int semanticsId;
        int semanticsId2 = layoutNode.getSemanticsId();
        if (firstPlacement || !this.rects.Uo(semanticsId2, l2, t3, r2, b2)) {
            LayoutNode layoutNodeMYa = layoutNode.mYa();
            if (layoutNodeMYa != null) {
                semanticsId = layoutNodeMYa.getSemanticsId();
            } else {
                semanticsId = -1;
            }
            RectList.O(this.rects, semanticsId2, l2, t3, r2, b2, semanticsId, false, false, 192, null);
        }
        xMQ();
    }

    private final void KN(LayoutNode layoutNode) {
        MutableVector mutableVectorHRu = layoutNode.hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            Uo(layoutNode2, layoutNode2.n1().getPosition(), false);
            KN(layoutNode2);
        }
    }

    private final long az(LayoutNode layoutNode) {
        NodeCoordinator nodeCoordinatorN1 = layoutNode.n1();
        long jT2 = Offset.INSTANCE.t();
        NodeCoordinator nodeCoordinatorE = layoutNode.E();
        while (nodeCoordinatorE != null && nodeCoordinatorE != nodeCoordinatorN1) {
            OwnedLayer layer = nodeCoordinatorE.getLayer();
            jT2 = IntOffsetKt.t(jT2, nodeCoordinatorE.getPosition());
            nodeCoordinatorE = nodeCoordinatorE.getWrappedBy();
            if (layer != null) {
                float[] fArrMo6getUnderlyingMatrixsQKQjiQ = layer.mo6getUnderlyingMatrixsQKQjiQ();
                int iT = RectManagerKt.t(fArrMo6getUnderlyingMatrixsQKQjiQ);
                if (iT == 3) {
                    continue;
                } else {
                    if ((iT & 2) == 0) {
                        return IntOffset.INSTANCE.n();
                    }
                    jT2 = Matrix.J2(fArrMo6getUnderlyingMatrixsQKQjiQ, jT2);
                }
            }
        }
        return IntOffsetKt.nr(jT2);
    }

    public final void Z(long screenOffset, long windowOffset, float[] viewToWindowMatrix) {
        boolean z2;
        int iT = RectManagerKt.t(viewToWindowMatrix);
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        if ((iT & 2) != 0) {
            viewToWindowMatrix = null;
        }
        if (!throttledCallbacks.o(screenOffset, windowOffset, viewToWindowMatrix) && !this.isScreenOrWindowDirty) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.isScreenOrWindowDirty = z2;
    }

    public final void nr() {
        boolean z2;
        long jRl = Actual_androidKt.rl();
        boolean z3 = this.isDirty;
        if (!z3 && !this.isScreenOrWindowDirty) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z3) {
            this.isDirty = false;
            MutableObjectList mutableObjectList = this.callbacks;
            Object[] objArr = mutableObjectList.content;
            int i2 = mutableObjectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                ((Function0) objArr[i3]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i5 = rectList.itemsSize;
            for (int i7 = 0; i7 < jArr.length - 2 && i7 < i5; i7 += 3) {
                long j2 = jArr[i7 + 2];
                if ((((int) (j2 >> 61)) & 1) != 0) {
                    this.throttledCallbacks.Uo(67108863 & ((int) j2), jArr[i7], jArr[i7 + 1], jRl);
                }
            }
            this.rects.n();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.J2(jRl);
        }
        if (z2) {
            this.throttledCallbacks.O(jRl);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.rl();
        }
        this.throttledCallbacks.r(jRl);
    }
}
