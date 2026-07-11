package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Ê\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014¢\u0006\u0002\b\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0000¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u000bJ\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&H\u0016¢\u0006\u0004\b)\u0010*J#\u0010,\u001a\u00020\t2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0014H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\u000bJ\u000f\u0010/\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u0010\u000bJ\r\u00100\u001a\u00020\t¢\u0006\u0004\b0\u0010\u000bJ\u001a\u00103\u001a\u00020\u00012\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001a\u00105\u001a\u00020\t2\u0006\u00102\u001a\u000201H\u0000ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\"2\u0006\u00102\u001a\u000201ø\u0001\u0000¢\u0006\u0004\b7\u00108J=\u00109\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014¢\u0006\u0002\b\u0016H\u0014ø\u0001\u0000¢\u0006\u0004\b9\u0010:J*\u0010;\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0014ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020\"H\u0016¢\u0006\u0004\b>\u0010%J\u0018\u0010@\u001a\u00020(2\u0006\u0010?\u001a\u00020'H\u0096\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020(2\u0006\u0010B\u001a\u00020(H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020(2\u0006\u0010B\u001a\u00020(H\u0016¢\u0006\u0004\bE\u0010DJ\u0017\u0010G\u001a\u00020(2\u0006\u0010F\u001a\u00020(H\u0016¢\u0006\u0004\bG\u0010DJ\u0017\u0010H\u001a\u00020(2\u0006\u0010F\u001a\u00020(H\u0016¢\u0006\u0004\bH\u0010DJ\u0015\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020\"¢\u0006\u0004\bJ\u0010%J\r\u0010K\u001a\u00020\t¢\u0006\u0004\bK\u0010\u000bJ\r\u0010L\u001a\u00020\"¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\tH\u0000¢\u0006\u0004\bN\u0010\u000bJ\r\u0010O\u001a\u00020\t¢\u0006\u0004\bO\u0010\u000bJ\r\u0010P\u001a\u00020\t¢\u0006\u0004\bP\u0010\u000bJ\r\u0010Q\u001a\u00020\t¢\u0006\u0004\bQ\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010TR\u0016\u0010X\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\"\u0010]\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010W\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010TR\"\u0010k\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010T\u001a\u0004\bi\u0010M\"\u0004\bj\u0010%R\u0016\u0010m\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010TR\u001e\u0010p\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bn\u0010oR\u001c\u0010s\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u00109R)\u0010x\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014¢\u0006\u0002\b\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010{\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010~\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010}R\u001e\u0010\u0083\u0001\u001a\u00020\u007f8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\bR\u0010\u0082\u0001R\u001e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R&\u0010\u008b\u0001\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010T\u001a\u0005\b\u0089\u0001\u0010M\"\u0005\b\u008a\u0001\u0010%R'\u0010\u008e\u0001\u001a\u00020\"2\u0007\u0010\u008c\u0001\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\b!\u0010T\u001a\u0005\b\u008d\u0001\u0010MR\u0018\u0010\u0090\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010TR/\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0005\bG\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u0097\u0001\u001a\u00020\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010T\u001a\u0005\b\u0097\u0001\u0010M\"\u0005\b\u0098\u0001\u0010%R\u0017\u0010\u0099\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010TR(\u0010\u009d\u0001\u001a\u00020\"2\u0007\u0010\u009a\u0001\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b\u009b\u0001\u0010M\"\u0005\b\u009c\u0001\u0010%R(\u0010 \u0001\u001a\u00020\"2\u0007\u0010\u009a\u0001\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b\u009e\u0001\u0010M\"\u0005\b\u009f\u0001\u0010%R(\u0010£\u0001\u001a\u00020\"2\u0007\u0010\u009a\u0001\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b¡\u0001\u0010M\"\u0005\b¢\u0001\u0010%R\u0017\u0010¦\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010ª\u0001\u001a\u00030§\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R,\u0010°\u0001\u001a\u00030«\u00012\b\u0010\u009a\u0001\u001a\u00030«\u00018B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010²\u0001\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b±\u0001\u0010MR\u0018\u0010¶\u0001\u001a\u00030³\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u001c\u0010¹\u0001\u001a\u0004\u0018\u0001018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0016\u0010»\u0001\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010MR\u0018\u0010½\u0001\u001a\u00030§\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010©\u0001R\u0013\u0010¿\u0001\u001a\u00020\"8F¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010MR\u001e\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000À\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010Å\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bt\u0010Ä\u0001R\u0016\u0010Ç\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010ZR\u0016\u0010É\u0001\u001a\u00020(8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ë\u0001"}, d2 = {"Landroidx/compose/ui/node/LookaheadPassDelegate;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutNodeLayoutDelegate", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "", "X4T", "()V", "Landroidx/compose/ui/node/LayoutNode;", "node", "C7B", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "d", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "eo", "Zmq", "H", "tEO", "NP", "E", "", "inLookahead", "j", "(Z)V", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "te", "()Ljava/util/Map;", "block", "ijL", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "ofS", "waP", "Landroidx/compose/ui/unit/Constraints;", "constraints", "dR0", "(J)Landroidx/compose/ui/layout/Placeable;", "q9", "(J)V", "rT", "(J)Z", "F", "(JFLkotlin/jvm/functions/Function1;)V", "W", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "newMFR", "P5", "alignmentLine", "z", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "height", "GR", "(I)I", "Nxk", "width", "FX", "g", "forceRequest", "lNy", "D76", "wYi", "()Z", "lS", "L", "wKY", "LPV", "o", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Z", "relayoutWithoutParentInProgress", "S", "I", "previousPlaceOrder", "getPlaceOrder$ui_release", "()I", "Xli", "(I)V", "placeOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "E2", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "wKp", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "eb", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", "e", "duringAlignmentLinesQuery", "X", "XNZ", "setPlacedOnce$ui_release", "placedOnce", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "measuredOnce", "N", "Landroidx/compose/ui/unit/Constraints;", "lookaheadConstraints", "v", "J", "lastPosition", "Xw", "lastZIndex", "jB", "Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "U", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "lastExplicitLayer", "Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "_placedState", "Landroidx/compose/ui/node/AlignmentLines;", "M7", "Landroidx/compose/ui/node/AlignmentLines;", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Landroidx/compose/runtime/collection/MutableVector;", "p5", "Landroidx/compose/runtime/collection/MutableVector;", "_childDelegates", "eF", "getChildDelegatesDirty$ui_release", "Om", "childDelegatesDirty", "<set-?>", "n7b", "layingOutChildren", "M", "parentDataDirty", "", "Ljava/lang/Object;", "J2", "()Ljava/lang/Object;", "parentData", "B", "isPlacedUnderMotionFrameOfReference", "fq", "onNodePlacedCalled", "value", "getMeasurePending", "HFS", "measurePending", "Aum", "t1J", "layoutPending", "Lp6", "GH3", "layoutPendingForAlignment", "A", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/NodeCoordinator;", "xzo", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "Mh", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "w", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "layoutState", "uG", "detachedFromParentLookaheadPlacement", "Landroidx/compose/ui/node/MeasurePassDelegate;", "jO", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePassDelegate", "v0j", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "HI", "isPlaced", "D", "innerCoordinator", "Th", "needsToBePlacedInApproach", "", "xVH", "()Ljava/util/List;", "childDelegates", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner", "mYa", "measuredWidth", "n1", "measuredHeight", "PlacedState", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLookaheadPassDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadPassDelegate.kt\nandroidx/compose/ui/node/LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,850:1\n211#1:882\n211#1:893\n211#1:957\n1083#2,2:851\n390#3:853\n391#3,6:861\n397#3,2:870\n210#4:854\n207#4:872\n207#4:883\n207#4:894\n207#4:904\n207#4:914\n207#4:958\n207#4:968\n207#4:978\n435#5,6:855\n441#5,3:867\n423#5,9:873\n423#5,9:884\n423#5,9:895\n423#5,9:905\n423#5,9:915\n423#5,9:959\n423#5,9:969\n423#5,9:979\n56#6,5:924\n102#6,5:929\n56#6,5:936\n102#6,5:947\n56#6,5:952\n56#6,5:988\n30#7:934\n30#7:941\n80#8:935\n80#8:942\n85#8:944\n90#8:946\n54#9:943\n59#9:945\n*S KotlinDebug\n*F\n+ 1 LookaheadPassDelegate.kt\nandroidx/compose/ui/node/LookaheadPassDelegate\n*L\n277#1:882\n316#1:893\n736#1:957\n160#1:851,2\n200#1:853\n200#1:861,6\n200#1:870,2\n200#1:854\n211#1:872\n277#1:883\n316#1:894\n343#1:904\n367#1:914\n736#1:958\n769#1:968\n804#1:978\n200#1:855,6\n200#1:867,3\n211#1:873,9\n277#1:884,9\n316#1:895,9\n343#1:905,9\n367#1:915,9\n736#1:959,9\n769#1:969,9\n804#1:979,9\n407#1:924,5\n455#1:929,5\n474#1:936,5\n530#1:947,5\n717#1:952,5\n823#1:988,5\n471#1:934\n479#1:941\n471#1:935\n479#1:942\n481#1:944\n482#1:946\n481#1:943\n482#1:945\n*E\n"})
public final class LookaheadPassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean layingOutChildren;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean onNodePlacedCalled;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private Constraints lookaheadConstraints;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private boolean measuredOnce;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer lastExplicitLayer;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private boolean placedOnce;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private float lastZIndex;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean relayoutWithoutParentInProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean duringAlignmentLinesQuery;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Function1 lastLayerBlock;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int previousPlaceOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int placeOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.f32465O;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long lastPosition = IntOffset.INSTANCE.rl();

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private PlacedState _placedState = PlacedState.f32515O;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final AlignmentLines alignmentLines = new LookaheadAlignmentLines(this);

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final MutableVector _childDelegates = new MutableVector(new LookaheadPassDelegate[16], 0);

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private boolean childDelegatesDirty = true;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean parentDataDirty = true;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private Object parentData = jO().getParentData();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class PlacedState {
        private static final /* synthetic */ PlacedState[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f32517r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final PlacedState f32516n = new PlacedState("IsPlacedInLookahead", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final PlacedState f32518t = new PlacedState("IsPlacedInApproach", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final PlacedState f32515O = new PlacedState("IsNotPlaced", 2);

        private static final /* synthetic */ PlacedState[] n() {
            return new PlacedState[]{f32516n, f32518t, f32515O};
        }

        public static PlacedState valueOf(String str) {
            return (PlacedState) Enum.valueOf(PlacedState.class, str);
        }

        public static PlacedState[] values() {
            return (PlacedState[]) J2.clone();
        }

        static {
            PlacedState[] placedStateArrN = n();
            J2 = placedStateArrN;
            f32517r = EnumEntriesKt.enumEntries(placedStateArrN);
        }

        private PlacedState(String str, int i2) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.f32463t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.f32460n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.f32458O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[LayoutNode.UsageByParent.f32466n.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LayoutNode.UsageByParent.f32468t.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final void D76() {
        this.parentDataDirty = true;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void E() {
        this.layingOutChildren = true;
        getAlignmentLines().HI();
        if (Aum()) {
            tEO();
        }
        final LookaheadDelegate lookaheadDelegateRR = D().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        if (Lp6() || (!this.duringAlignmentLinesQuery && !lookaheadDelegateRR.getIsPlacingForAlignment() && Aum())) {
            t1J(false);
            LayoutNode.LayoutState layoutStateMh = Mh();
            w(LayoutNode.LayoutState.J2);
            Owner ownerRl = LayoutNodeKt.rl(A());
            this.layoutNodeLayoutDelegate.M7(false);
            OwnerSnapshotObserver.J2(ownerRl.getSnapshotObserver(), A(), false, new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildren$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    this.f32519n.Zmq();
                    this.f32519n.ijL(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildren$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                            n(alignmentLinesOwner);
                            return Unit.INSTANCE;
                        }

                        public final void n(AlignmentLinesOwner alignmentLinesOwner) {
                            alignmentLinesOwner.getAlignmentLines().Z(false);
                        }
                    });
                    LookaheadDelegate lookaheadDelegate = this.f32519n.D().getLookaheadDelegate();
                    if (lookaheadDelegate != null) {
                        boolean isPlacingForAlignment = lookaheadDelegate.getIsPlacingForAlignment();
                        List listBzg = this.f32519n.A().bzg();
                        int size = listBzg.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            LookaheadDelegate lookaheadDelegate2 = ((LayoutNode) listBzg.get(i2)).n1().getLookaheadDelegate();
                            if (lookaheadDelegate2 != null) {
                                lookaheadDelegate2.NP(isPlacingForAlignment);
                            }
                        }
                    }
                    lookaheadDelegateRR.uG().Z();
                    LookaheadDelegate lookaheadDelegate3 = this.f32519n.D().getLookaheadDelegate();
                    if (lookaheadDelegate3 != null) {
                        lookaheadDelegate3.getIsPlacingForAlignment();
                        List listBzg2 = this.f32519n.A().bzg();
                        int size2 = listBzg2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            LookaheadDelegate lookaheadDelegate4 = ((LayoutNode) listBzg2.get(i3)).n1().getLookaheadDelegate();
                            if (lookaheadDelegate4 != null) {
                                lookaheadDelegate4.NP(false);
                            }
                        }
                    }
                    this.f32519n.X4T();
                    this.f32519n.ijL(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildren$1.4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                            n(alignmentLinesOwner);
                            return Unit.INSTANCE;
                        }

                        public final void n(AlignmentLinesOwner alignmentLinesOwner) {
                            alignmentLinesOwner.getAlignmentLines().Ik(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout());
                        }
                    });
                }
            }, 2, null);
            w(layoutStateMh);
            if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegateRR.getIsPlacingForAlignment()) {
                requestLayout();
            }
            GH3(false);
        }
        if (getAlignmentLines().getUsedDuringParentLayout()) {
            getAlignmentLines().Ik(true);
        }
        if (getAlignmentLines().getDirty() && getAlignmentLines().gh()) {
            getAlignmentLines().ty();
        }
        this.layingOutChildren = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    public void F(long position, float zIndex, Function1 layerBlock) {
        d(position, zIndex, layerBlock, null);
    }

    public final void L() {
        LookaheadPassDelegate lookaheadPassDelegate;
        LayoutNode layoutNodeMYa;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                InlineClassHelperKt.t("replace() called on item that was not placed");
            }
            this.onNodePlacedCalled = false;
            boolean zHI = getIsPlaced();
            lookaheadPassDelegate = this;
            try {
                lookaheadPassDelegate.d(this.lastPosition, 0.0f, this.lastLayerBlock, this.lastExplicitLayer);
                if (zHI && !lookaheadPassDelegate.onNodePlacedCalled && (layoutNodeMYa = A().mYa()) != null) {
                    LayoutNode.jO(layoutNodeMYa, false, 1, null);
                }
                lookaheadPassDelegate.relayoutWithoutParentInProgress = false;
            } catch (Throwable th) {
                th = th;
                lookaheadPassDelegate.relayoutWithoutParentInProgress = false;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            lookaheadPassDelegate = this;
        }
    }

    public final void NP() {
        t1J(true);
        GH3(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    public void W(long position, float zIndex, GraphicsLayer layer) {
        d(position, zIndex, null, layer);
    }

    public final void lS() {
        this.onNodePlacedCalled = true;
        LayoutNode layoutNodeMYa = A().mYa();
        if ((this._placedState != PlacedState.f32516n && !uG()) || (this._placedState != PlacedState.f32518t && uG())) {
            H();
            if (this.relayoutWithoutParentInProgress && layoutNodeMYa != null) {
                LayoutNode.jO(layoutNodeMYa, false, 1, null);
            }
        }
        if (layoutNodeMYa == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && (layoutNodeMYa.k() == LayoutNode.LayoutState.f32458O || layoutNodeMYa.k() == LayoutNode.LayoutState.J2)) {
            if (!(this.placeOrder == Integer.MAX_VALUE)) {
                InlineClassHelperKt.t("Place was called on a node which was placed already");
            }
            this.placeOrder = layoutNodeMYa.getLayoutDelegate().getNextChildLookaheadPlaceOrder();
            LayoutNodeLayoutDelegate layoutDelegate = layoutNodeMYa.getLayoutDelegate();
            layoutDelegate.M(layoutDelegate.getNextChildLookaheadPlaceOrder() + 1);
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNode A() {
        return this.layoutNodeLayoutDelegate.getLayoutNode();
    }

    private final boolean Aum() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPending();
    }

    private final void GH3(boolean z2) {
        this.layoutNodeLayoutDelegate.eF(z2);
    }

    private final void H() {
        PlacedState placedState = this._placedState;
        if (uG()) {
            this._placedState = PlacedState.f32518t;
        } else {
            this._placedState = PlacedState.f32516n;
        }
        if (placedState != PlacedState.f32516n && this.layoutNodeLayoutDelegate.getLookaheadMeasurePending()) {
            LayoutNode.wKp(A(), true, false, false, 6, null);
        }
        MutableVector mutableVectorHRu = A().hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            LookaheadPassDelegate lookaheadPassDelegatePiY = layoutNode.piY();
            if (lookaheadPassDelegatePiY == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (lookaheadPassDelegatePiY.placeOrder != Integer.MAX_VALUE) {
                lookaheadPassDelegatePiY.H();
                layoutNode.I9f(layoutNode);
            }
        }
    }

    private final void HFS(boolean z2) {
        this.layoutNodeLayoutDelegate.E(z2);
    }

    private final boolean Lp6() {
        return this.layoutNodeLayoutDelegate.getLookaheadLayoutPendingForAlignment();
    }

    private final LayoutNode.LayoutState Mh() {
        return this.layoutNodeLayoutDelegate.getLayoutState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Zmq() {
        this.layoutNodeLayoutDelegate.M(0);
        MutableVector mutableVectorHRu = A().hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LookaheadPassDelegate lookaheadPassDelegateS = ((LayoutNode) objArr[i2]).getLayoutDelegate().getLookaheadPassDelegate();
            Intrinsics.checkNotNull(lookaheadPassDelegateS);
            lookaheadPassDelegateS.previousPlaceOrder = lookaheadPassDelegateS.placeOrder;
            lookaheadPassDelegateS.placeOrder = Integer.MAX_VALUE;
            if (lookaheadPassDelegateS.measuredByParent == LayoutNode.UsageByParent.f32468t) {
                lookaheadPassDelegateS.measuredByParent = LayoutNode.UsageByParent.f32465O;
            }
        }
    }

    private final void t1J(boolean z2) {
        this.layoutNodeLayoutDelegate.p5(z2);
    }

    private final boolean uG() {
        return this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement();
    }

    private final void w(LayoutNode.LayoutState layoutState) {
        this.layoutNodeLayoutDelegate.U(layoutState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NodeCoordinator xzo() {
        return this.layoutNodeLayoutDelegate.g();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    /* JADX INFO: renamed from: HI */
    public boolean getIsPlaced() {
        return this._placedState != PlacedState.f32515O;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    /* JADX INFO: renamed from: J2, reason: from getter */
    public Object getParentData() {
        return this.parentData;
    }

    public final void LPV() {
        this._placedState = PlacedState.f32516n;
    }

    public final void Om(boolean z2) {
        this.childDelegatesDirty = z2;
    }

    /* JADX INFO: renamed from: XNZ, reason: from getter */
    public final boolean getPlacedOnce() {
        return this.placedOnce;
    }

    public final void Xli(int i2) {
        this.placeOrder = i2;
    }

    public final void eb(LayoutNode.UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    public void fq(boolean z2) {
        this.isPlacedUnderMotionFrameOfReference = z2;
    }

    public final void j(boolean inLookahead) {
        if (inLookahead && uG()) {
            return;
        }
        if (inLookahead || uG()) {
            this._placedState = PlacedState.f32515O;
            MutableVector mutableVectorHRu = A().hRu();
            Object[] objArr = mutableVectorHRu.content;
            int size = mutableVectorHRu.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                LookaheadPassDelegate lookaheadPassDelegateS = ((LayoutNode) objArr[i2]).getLayoutDelegate().getLookaheadPassDelegate();
                Intrinsics.checkNotNull(lookaheadPassDelegateS);
                lookaheadPassDelegateS.j(true);
            }
        }
    }

    public final MeasurePassDelegate jO() {
        return this.layoutNodeLayoutDelegate.getMeasurePassDelegate();
    }

    /* JADX INFO: renamed from: n7b, reason: from getter */
    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    /* JADX INFO: renamed from: o, reason: from getter */
    public AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    public final void q9(final long constraints) {
        w(LayoutNode.LayoutState.f32463t);
        HFS(false);
        OwnerSnapshotObserver.KN(LayoutNodeKt.rl(A()).getSnapshotObserver(), A(), false, new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                LookaheadDelegate lookaheadDelegate = this.f32523n.xzo().getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate);
                lookaheadDelegate.dR0(constraints);
            }
        }, 2, null);
        NP();
        if (LayoutNodeLayoutDelegateKt.n(A())) {
            jO().LPV();
        } else {
            jO().tEO();
        }
        w(LayoutNode.LayoutState.f32462r);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public Map te() {
        if (!this.duringAlignmentLinesQuery) {
            if (Mh() == LayoutNode.LayoutState.f32463t) {
                getAlignmentLines().o(true);
                if (getAlignmentLines().getDirty()) {
                    this.layoutNodeLayoutDelegate.e();
                }
            } else {
                getAlignmentLines().r(true);
            }
        }
        LookaheadDelegate lookaheadDelegateRR = D().getLookaheadDelegate();
        if (lookaheadDelegateRR != null) {
            lookaheadDelegateRR.NP(true);
        }
        E();
        LookaheadDelegate lookaheadDelegateRR2 = D().getLookaheadDelegate();
        if (lookaheadDelegateRR2 != null) {
            lookaheadDelegateRR2.NP(false);
        }
        return getAlignmentLines().getAlignmentLineMap();
    }

    /* JADX INFO: renamed from: v0j, reason: from getter */
    public final Constraints getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    /* JADX INFO: renamed from: wKp, reason: from getter */
    public final LayoutNode.UsageByParent getMeasuredByParent() {
        return this.measuredByParent;
    }

    public final void waP() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingLookaheadCoordinatesDuringPlacement() > 0) {
            MutableVector mutableVectorHRu = A().hRu();
            Object[] objArr = mutableVectorHRu.content;
            int size = mutableVectorHRu.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLookaheadLayoutPending()) {
                    LayoutNode.jO(layoutNode, false, 1, null);
                }
                LookaheadPassDelegate lookaheadPassDelegateS = layoutDelegate.getLookaheadPassDelegate();
                if (lookaheadPassDelegateS != null) {
                    lookaheadPassDelegateS.waP();
                }
            }
        }
    }

    public LookaheadPassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
    }

    private final void C7B(LayoutNode node) {
        boolean z2;
        LayoutNode.UsageByParent usageByParent;
        LayoutNode layoutNodeMYa = node.mYa();
        if (layoutNodeMYa != null) {
            if (this.measuredByParent != LayoutNode.UsageByParent.f32465O && !node.getCanMultiMeasure()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                InlineClassHelperKt.t("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNodeMYa.k().ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodeMYa.k());
                }
                usageByParent = LayoutNode.UsageByParent.f32468t;
            } else {
                usageByParent = LayoutNode.UsageByParent.f32466n;
            }
            this.measuredByParent = usageByParent;
            return;
        }
        this.measuredByParent = LayoutNode.UsageByParent.f32465O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X4T() {
        MutableVector mutableVectorHRu = A().hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LookaheadPassDelegate lookaheadPassDelegateS = ((LayoutNode) objArr[i2]).getLayoutDelegate().getLookaheadPassDelegate();
            Intrinsics.checkNotNull(lookaheadPassDelegateS);
            int i3 = lookaheadPassDelegateS.previousPlaceOrder;
            int i5 = lookaheadPassDelegateS.placeOrder;
            if (i3 != i5 && i5 == Integer.MAX_VALUE) {
                lookaheadPassDelegateS.j(true);
            }
        }
    }

    private final void d(final long position, float zIndex, Function1 layerBlock, GraphicsLayer layer) {
        LayoutNode.LayoutState layoutStateK;
        LayoutNode layoutNodeMYa = A().mYa();
        if (layoutNodeMYa != null) {
            layoutStateK = layoutNodeMYa.k();
        } else {
            layoutStateK = null;
        }
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.J2;
        if (layoutStateK == layoutState) {
            this.layoutNodeLayoutDelegate.jB(false);
        }
        if (A().getIsDeactivated()) {
            InlineClassHelperKt.n("place is called on a deactivated node");
        }
        w(layoutState);
        this.placedOnce = true;
        this.onNodePlacedCalled = false;
        if (!IntOffset.mUb(position, this.lastPosition)) {
            if (this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement()) {
                t1J(true);
            }
            waP();
        }
        final Owner ownerRl = LayoutNodeKt.rl(A());
        if (!Aum() && getIsPlaced()) {
            LookaheadDelegate lookaheadDelegateRR = xzo().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegateRR);
            lookaheadDelegateRR.Om(position);
            lS();
        } else {
            this.layoutNodeLayoutDelegate.P5(false);
            getAlignmentLines().r(false);
            OwnerSnapshotObserver.nr(ownerRl.getSnapshotObserver(), A(), false, new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$placeSelf$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    LookaheadDelegate lookaheadDelegate;
                    Placeable.PlacementScope placementScope = null;
                    if (LayoutNodeLayoutDelegateKt.n(this.f32526n.A()) || this.f32526n.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement()) {
                        NodeCoordinator wrappedBy = this.f32526n.xzo().getWrappedBy();
                        if (wrappedBy != null) {
                            placementScope = wrappedBy.getPlacementScope();
                        }
                    } else {
                        NodeCoordinator wrappedBy2 = this.f32526n.xzo().getWrappedBy();
                        if (wrappedBy2 != null && (lookaheadDelegate = wrappedBy2.getLookaheadDelegate()) != null) {
                            placementScope = lookaheadDelegate.getPlacementScope();
                        }
                    }
                    if (placementScope == null) {
                        placementScope = ownerRl.getPlacementScope();
                    }
                    LookaheadPassDelegate lookaheadPassDelegate = this.f32526n;
                    long j2 = position;
                    LookaheadDelegate lookaheadDelegate2 = lookaheadPassDelegate.xzo().getLookaheadDelegate();
                    Intrinsics.checkNotNull(lookaheadDelegate2);
                    Placeable.PlacementScope.gh(placementScope, lookaheadDelegate2, j2, 0.0f, 2, null);
                }
            }, 2, null);
        }
        this.lastPosition = position;
        this.lastZIndex = zIndex;
        this.lastLayerBlock = layerBlock;
        this.lastExplicitLayer = layer;
        w(LayoutNode.LayoutState.f32462r);
    }

    private final void eo() {
        LayoutNode.UsageByParent intrinsicsUsageByParent;
        LayoutNode.wKp(A(), false, false, false, 7, null);
        LayoutNode layoutNodeMYa = A().mYa();
        if (layoutNodeMYa != null && A().getIntrinsicsUsageByParent() == LayoutNode.UsageByParent.f32465O) {
            LayoutNode layoutNodeA = A();
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNodeMYa.k().ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    intrinsicsUsageByParent = layoutNodeMYa.getIntrinsicsUsageByParent();
                } else {
                    intrinsicsUsageByParent = LayoutNode.UsageByParent.f32468t;
                }
            } else {
                intrinsicsUsageByParent = LayoutNode.UsageByParent.f32466n;
            }
            layoutNodeA.LPV(intrinsicsUsageByParent);
        }
    }

    private final void tEO() {
        MutableVector mutableVectorHRu = A().hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.z() && layoutNode.C() == LayoutNode.UsageByParent.f32466n) {
                LookaheadPassDelegate lookaheadPassDelegateS = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                Intrinsics.checkNotNull(lookaheadPassDelegateS);
                Constraints constraintsQie = layoutNode.getLayoutDelegate().qie();
                Intrinsics.checkNotNull(constraintsQie);
                if (lookaheadPassDelegateS.rT(constraintsQie.getValue())) {
                    LayoutNode.wKp(A(), false, false, false, 7, null);
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public NodeCoordinator D() {
        return A().E();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int FX(int width) {
        eo();
        LookaheadDelegate lookaheadDelegateRR = xzo().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        return lookaheadDelegateRR.FX(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int GR(int height) {
        eo();
        LookaheadDelegate lookaheadDelegateRR = xzo().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        return lookaheadDelegateRR.GR(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int Nxk(int height) {
        eo();
        LookaheadDelegate lookaheadDelegateRR = xzo().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        return lookaheadDelegateRR.Nxk(height);
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void P5(boolean newMFR) {
        Boolean boolValueOf;
        LookaheadDelegate lookaheadDelegateRR;
        LookaheadDelegate lookaheadDelegateRR2 = xzo().getLookaheadDelegate();
        if (lookaheadDelegateRR2 != null) {
            boolValueOf = Boolean.valueOf(lookaheadDelegateRR2.getIsPlacedUnderMotionFrameOfReference());
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.areEqual(Boolean.valueOf(newMFR), boolValueOf) && (lookaheadDelegateRR = xzo().getLookaheadDelegate()) != null) {
            lookaheadDelegateRR.D76(newMFR);
        }
        fq(newMFR);
    }

    public final boolean Th() {
        if (LayoutNodeLayoutDelegateKt.n(A())) {
            return true;
        }
        if (this._placedState == PlacedState.f32515O && !this.layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPass()) {
            this.layoutNodeLayoutDelegate.jB(true);
        }
        return uG();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public AlignmentLinesOwner Xw() {
        LayoutNodeLayoutDelegate layoutDelegate;
        LayoutNode layoutNodeMYa = A().mYa();
        if (layoutNodeMYa != null && (layoutDelegate = layoutNodeMYa.getLayoutDelegate()) != null) {
            return layoutDelegate.ck();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // androidx.compose.ui.layout.Measurable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Placeable dR0(long constraints) {
        LayoutNode.LayoutState layoutStateK;
        LayoutNode layoutNodeMYa = A().mYa();
        LayoutNode.LayoutState layoutStateK2 = null;
        if (layoutNodeMYa != null) {
            layoutStateK = layoutNodeMYa.k();
        } else {
            layoutStateK = null;
        }
        if (layoutStateK != LayoutNode.LayoutState.f32463t) {
            LayoutNode layoutNodeMYa2 = A().mYa();
            if (layoutNodeMYa2 != null) {
                layoutStateK2 = layoutNodeMYa2.k();
            }
            if (layoutStateK2 == LayoutNode.LayoutState.J2) {
            }
        } else {
            this.layoutNodeLayoutDelegate.Xw(false);
        }
        C7B(A());
        if (A().getIntrinsicsUsageByParent() == LayoutNode.UsageByParent.f32465O) {
            A().te();
        }
        rT(constraints);
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int g(int width) {
        eo();
        LookaheadDelegate lookaheadDelegateRR = xzo().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        return lookaheadDelegateRR.g(width);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void ijL(Function1 block) {
        MutableVector mutableVectorHRu = A().hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            AlignmentLinesOwner alignmentLinesOwnerCk = ((LayoutNode) objArr[i2]).getLayoutDelegate().ck();
            Intrinsics.checkNotNull(alignmentLinesOwnerCk);
            block.invoke(alignmentLinesOwnerCk);
        }
    }

    public final void lNy(boolean forceRequest) {
        LayoutNode layoutNode;
        LayoutNode layoutNodeMYa = A().mYa();
        LayoutNode.UsageByParent intrinsicsUsageByParent = A().getIntrinsicsUsageByParent();
        if (layoutNodeMYa != null && intrinsicsUsageByParent != LayoutNode.UsageByParent.f32465O) {
            do {
                layoutNode = layoutNodeMYa;
                if (layoutNode.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                    break;
                } else {
                    layoutNodeMYa = layoutNode.mYa();
                }
            } while (layoutNodeMYa != null);
            int i2 = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (layoutNode.getLookaheadRoot() != null) {
                        layoutNode.Mh(forceRequest);
                        return;
                    } else {
                        layoutNode.Th(forceRequest);
                        return;
                    }
                }
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (layoutNode.getLookaheadRoot() != null) {
                LayoutNode.wKp(layoutNode, forceRequest, false, false, 6, null);
            } else {
                LayoutNode.lNy(layoutNode, forceRequest, false, false, 6, null);
            }
        }
    }

    @Override // androidx.compose.ui.layout.Placeable
    public int mYa() {
        LookaheadDelegate lookaheadDelegateRR = xzo().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        return lookaheadDelegateRR.mYa();
    }

    @Override // androidx.compose.ui.layout.Placeable
    public int n1() {
        LookaheadDelegate lookaheadDelegateRR = xzo().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        return lookaheadDelegateRR.n1();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void ofS() {
        LayoutNode.wKp(A(), false, false, false, 7, null);
    }

    public final boolean rT(long constraints) {
        boolean z2;
        long jT2;
        boolean z3;
        boolean zJ2;
        if (A().getIsDeactivated()) {
            InlineClassHelperKt.n("measure is called on a deactivated node");
        }
        LayoutNode layoutNodeMYa = A().mYa();
        LayoutNode layoutNodeA = A();
        if (!A().getCanMultiMeasure() && (layoutNodeMYa == null || !layoutNodeMYa.getCanMultiMeasure())) {
            z2 = false;
        } else {
            z2 = true;
        }
        layoutNodeA.QgZ(z2);
        if (!A().z()) {
            Constraints constraints2 = this.lookaheadConstraints;
            if (constraints2 == null) {
                zJ2 = false;
            } else {
                zJ2 = Constraints.J2(constraints2.getValue(), constraints);
            }
            if (zJ2) {
                Owner owner = A().getOwner();
                if (owner != null) {
                    owner.az(A(), true);
                }
                A().NP();
                return false;
            }
        }
        this.lookaheadConstraints = Constraints.n(constraints);
        VwL(constraints);
        getAlignmentLines().o(false);
        ijL(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$remeasure$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                n(alignmentLinesOwner);
                return Unit.INSTANCE;
            }

            public final void n(AlignmentLinesOwner alignmentLinesOwner) {
                alignmentLinesOwner.getAlignmentLines().XQ(false);
            }
        });
        if (this.measuredOnce) {
            jT2 = getMeasuredSize();
        } else {
            long j2 = Integer.MIN_VALUE;
            jT2 = IntSize.t((j2 & 4294967295L) | (j2 << 32));
        }
        this.measuredOnce = true;
        LookaheadDelegate lookaheadDelegateRR = xzo().getLookaheadDelegate();
        if (lookaheadDelegateRR != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            InlineClassHelperKt.t("Lookahead result from lookaheadRemeasure cannot be null");
        }
        this.layoutNodeLayoutDelegate.nHg(constraints);
        QZ6(IntSize.t((((long) lookaheadDelegateRR.getHeight()) & 4294967295L) | (((long) lookaheadDelegateRR.getWidth()) << 32)));
        if (((int) (jT2 >> 32)) != lookaheadDelegateRR.getWidth() || ((int) (jT2 & 4294967295L)) != lookaheadDelegateRR.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestLayout() {
        LayoutNode.jO(A(), false, 1, null);
    }

    public final void wKY() {
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this._placedState = PlacedState.f32515O;
    }

    public final boolean wYi() {
        if (getParentData() == null) {
            LookaheadDelegate lookaheadDelegateRR = xzo().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegateRR);
            if (lookaheadDelegateRR.getParentData() == null) {
                return false;
            }
        }
        if (!this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        LookaheadDelegate lookaheadDelegateRR2 = xzo().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR2);
        this.parentData = lookaheadDelegateRR2.getParentData();
        return true;
    }

    public final List xVH() {
        A().bzg();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.Uo();
        }
        LayoutNode layoutNodeA = A();
        MutableVector mutableVector = this._childDelegates;
        MutableVector mutableVectorHRu = layoutNodeA.hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (mutableVector.getSize() <= i2) {
                LookaheadPassDelegate lookaheadPassDelegateS = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                Intrinsics.checkNotNull(lookaheadPassDelegateS);
                mutableVector.rl(lookaheadPassDelegateS);
            } else {
                LookaheadPassDelegate lookaheadPassDelegateS2 = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                Intrinsics.checkNotNull(lookaheadPassDelegateS2);
                mutableVector.S(i2, lookaheadPassDelegateS2);
            }
        }
        mutableVector.o(layoutNodeA.bzg().size(), mutableVector.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.Uo();
    }

    @Override // androidx.compose.ui.layout.Measured
    public int z(AlignmentLine alignmentLine) {
        LayoutNode.LayoutState layoutStateK;
        LayoutNode layoutNodeMYa = A().mYa();
        LayoutNode.LayoutState layoutStateK2 = null;
        if (layoutNodeMYa != null) {
            layoutStateK = layoutNodeMYa.k();
        } else {
            layoutStateK = null;
        }
        if (layoutStateK == LayoutNode.LayoutState.f32463t) {
            getAlignmentLines().XQ(true);
        } else {
            LayoutNode layoutNodeMYa2 = A().mYa();
            if (layoutNodeMYa2 != null) {
                layoutStateK2 = layoutNodeMYa2.k();
            }
            if (layoutStateK2 == LayoutNode.LayoutState.J2) {
                getAlignmentLines().Z(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        LookaheadDelegate lookaheadDelegateRR = xzo().getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        int iZ = lookaheadDelegateRR.z(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return iZ;
    }
}
