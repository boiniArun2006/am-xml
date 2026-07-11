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
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\u0002\b\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\u0002\b\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\tH\u0000¢\u0006\u0004\b\"\u0010\u000bJ\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010$\u001a\u00020\tH\u0000¢\u0006\u0004\b$\u0010\u000bJ\u001a\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001a\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020%ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0018\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0096\u0002¢\u0006\u0004\b1\u00102J=\u00103\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\u0002\b\u0019H\u0014ø\u0001\u0000¢\u0006\u0004\b3\u00104J*\u00105\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0014ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\t2\u0006\u00107\u001a\u00020+H\u0016¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\t¢\u0006\u0004\b:\u0010\u000bJ\u0017\u0010<\u001a\u0002002\u0006\u0010;\u001a\u000200H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u0002002\u0006\u0010;\u001a\u000200H\u0016¢\u0006\u0004\b>\u0010=J\u0017\u0010@\u001a\u0002002\u0006\u0010?\u001a\u000200H\u0016¢\u0006\u0004\b@\u0010=J\u0017\u0010A\u001a\u0002002\u0006\u0010?\u001a\u000200H\u0016¢\u0006\u0004\bA\u0010=J\r\u0010B\u001a\u00020\t¢\u0006\u0004\bB\u0010\u000bJ\r\u0010C\u001a\u00020+¢\u0006\u0004\bC\u0010DJ\u001b\u0010F\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u0002000EH\u0016¢\u0006\u0004\bF\u0010GJ#\u0010I\u001a\u00020\t2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0017H\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\tH\u0016¢\u0006\u0004\bK\u0010\u000bJ\u000f\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\bL\u0010\u000bJ\r\u0010M\u001a\u00020\t¢\u0006\u0004\bM\u0010\u000bJ\u0015\u0010O\u001a\u00020\t2\u0006\u0010N\u001a\u00020+¢\u0006\u0004\bO\u00109J\r\u0010P\u001a\u00020\t¢\u0006\u0004\bP\u0010\u000bJ\r\u0010Q\u001a\u00020\t¢\u0006\u0004\bQ\u0010\u000bJ\u000f\u0010R\u001a\u00020\tH\u0000¢\u0006\u0004\bR\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010UR$\u0010\\\u001a\u0002002\u0006\u0010W\u001a\u0002008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R$\u0010^\u001a\u0002002\u0006\u0010W\u001a\u0002008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bA\u0010Y\u001a\u0004\b]\u0010[R\u0016\u0010`\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010UR\u0016\u0010b\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010UR\"\u0010j\u001a\u00020c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010n\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010U\u001a\u0004\bl\u0010D\"\u0004\bm\u00109R*\u0010s\u001a\u00020\u00132\u0006\u0010W\u001a\u00020\u00138\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR)\u0010v\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\u0002\b\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010y\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010{\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u00103R\u0016\u0010}\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010UR+\u0010\u0082\u0001\u001a\u0004\u0018\u00010~2\b\u0010W\u001a\u0004\u0018\u00010~8\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0004\b8\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R.\u0010\u0086\u0001\u001a\u00020+2\u0006\u0010W\u001a\u00020+8\u0016@PX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010U\u001a\u0005\b\u0084\u0001\u0010D\"\u0005\b\u0085\u0001\u00109R.\u0010\u008a\u0001\u001a\u00020+2\u0006\u0010W\u001a\u00020+8\u0006@@X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010U\u001a\u0005\b\u0088\u0001\u0010D\"\u0005\b\u0089\u0001\u00109R'\u0010\u008d\u0001\u001a\u00020+2\u0006\u0010W\u001a\u00020+8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010U\u001a\u0005\b\u008c\u0001\u0010DR&\u0010\u008f\u0001\u001a\u00020+2\u0006\u0010W\u001a\u00020+8\u0000@BX\u0080\u000e¢\u0006\r\n\u0004\b#\u0010U\u001a\u0005\b\u008e\u0001\u0010DR\u0018\u0010\u0091\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010UR\u001e\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b@\u0010\u0093\u0001\u001a\u0005\bS\u0010\u0094\u0001R\u001e\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R%\u0010\u009c\u0001\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bp\u0010U\u001a\u0005\b\u009a\u0001\u0010D\"\u0005\b\u009b\u0001\u00109R'\u0010\u009f\u0001\u001a\u00020+2\u0006\u0010W\u001a\u00020+8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010U\u001a\u0005\b\u009e\u0001\u0010DR\u001e\u0010¡\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b \u0001\u0010pR%\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¢\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bY\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001d\u0010§\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¢\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b<\u0010£\u0001R&\u0010\u0016\u001a\u00020\u00152\u0006\u0010W\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0004\b>\u00103\u001a\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010«\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010UR+\u0010\u00ad\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\u0002\b\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010uR\u0019\u0010®\u0001\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010xR\u001d\u0010¯\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010pR\u0018\u0010±\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b°\u0001\u00103R\u001d\u0010²\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¢\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010£\u0001R\u0018\u0010´\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b³\u0001\u0010UR&\u0010¶\u0001\u001a\u00020+8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\bµ\u0001\u0010U\u001a\u0005\b¶\u0001\u0010D\"\u0005\b·\u0001\u00109R\u001a\u0010»\u0001\u001a\u0005\u0018\u00010¸\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001R\u001c\u0010¾\u0001\u001a\u0004\u0018\u00010%8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0014\u0010Á\u0001\u001a\u00020\u000f8F¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R,\u0010È\u0001\u001a\u00030Â\u00012\b\u0010Ã\u0001\u001a\u00030Â\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R\u0015\u0010Ì\u0001\u001a\u00030É\u00018F¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Í\u0001\u001a\u00030É\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010Ë\u0001R\u001e\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000Î\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0016\u0010Ó\u0001\u001a\u0002008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010[R\u0016\u0010Õ\u0001\u001a\u0002008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010[R\u0018\u0010×\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bw\u0010Ö\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ø\u0001"}, d2 = {"Landroidx/compose/ui/node/MeasurePassDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutNodeLayoutDelegate", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "", "xVH", "()V", "wKY", "eo", "uG", "Landroidx/compose/ui/node/LayoutNode;", "node", "TVk", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "GH3", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "t1J", "d", "q9", "waP", "E", "L", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Om", "(J)V", "dR0", "(J)Landroidx/compose/ui/layout/Placeable;", "", "w", "(J)Z", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "z", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "F", "(JFLkotlin/jvm/functions/Function1;)V", "W", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "newMFR", "P5", "(Z)V", "HFS", "height", "GR", "(I)I", "Nxk", "width", "FX", "g", "j", "lRt", "()Z", "", "te", "()Ljava/util/Map;", "block", "ijL", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "ofS", "lS", "forceRequest", "NP", "rT", "LPV", "tEO", "o", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Z", "relayoutWithoutParentInProgress", "<set-?>", "S", "I", "getPreviousPlaceOrder$ui_release", "()I", "previousPlaceOrder", "lNy", "placeOrder", "E2", "measuredOnce", "e", "placedOnce", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "X", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "xzo", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "fq", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "duringAlignmentLinesQuery", "N", "J", "Aum", "()J", "lastPosition", "v", "Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "Xw", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "lastExplicitLayer", "jB", "lastZIndex", "U", "parentDataDirty", "", "Ljava/lang/Object;", "J2", "()Ljava/lang/Object;", "parentData", "M7", "HI", "C7B", "isPlaced", "p5", "H", "setPlacedByParent$ui_release", "isPlacedByParent", "eF", "Th", "measurePending", "Mh", "layoutPending", "M", "layoutPendingForAlignment", "Landroidx/compose/ui/node/AlignmentLines;", "Landroidx/compose/ui/node/AlignmentLines;", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Landroidx/compose/runtime/collection/MutableVector;", "B", "Landroidx/compose/runtime/collection/MutableVector;", "_childDelegates", "getChildDelegatesDirty$ui_release", "eb", "childDelegatesDirty", "D", "Lp6", "layingOutChildren", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "performMeasureConstraints", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getPerformMeasureBlock$ui_release", "()Lkotlin/jvm/functions/Function0;", "performMeasureBlock", "layoutChildrenBlock", "D76", "()F", "Y", "onNodePlacedCalled", "k", "placeOuterCoordinatorLayerBlock", "placeOuterCoordinatorLayer", "placeOuterCoordinatorPosition", "piY", "placeOuterCoordinatorZIndex", "placeOuterCoordinatorBlock", "m", "needsCoordinatesUpdate", "eTf", "isPlacedUnderMotionFrameOfReference", "wYi", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "wKp", "()Landroidx/compose/ui/node/LookaheadPassDelegate;", "lookaheadPassDelegate", "n7b", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "A", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "value", "jO", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "Xli", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "layoutState", "Landroidx/compose/ui/node/NodeCoordinator;", "XNZ", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "innerCoordinator", "", "v0j", "()Ljava/util/List;", "childDelegates", "mYa", "measuredWidth", "n1", "measuredHeight", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMeasurePassDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePassDelegate.kt\nandroidx/compose/ui/node/MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,903:1\n407#1:942\n408#1:953\n407#1:983\n408#1:994\n1083#2,2:904\n390#3:906\n391#3,6:914\n397#3,2:923\n210#4:907\n207#4:925\n1296#4,7:935\n207#4:943\n1296#4,7:954\n207#4:961\n1286#4,7:971\n207#4:984\n207#4:995\n207#4:1038\n207#4:1048\n207#4:1058\n435#5,6:908\n441#5,3:920\n423#5,9:926\n423#5,9:944\n423#5,9:962\n423#5,9:985\n423#5,9:996\n423#5,9:1039\n423#5,9:1049\n423#5,9:1059\n56#6,5:978\n56#6,5:1005\n102#6,5:1010\n56#6,5:1017\n56#6,5:1023\n102#6,5:1028\n56#6,5:1033\n30#7:1015\n80#8:1016\n1#9:1022\n*S KotlinDebug\n*F\n+ 1 MeasurePassDelegate.kt\nandroidx/compose/ui/node/MeasurePassDelegate\n*L\n269#1:942\n269#1:953\n393#1:983\n393#1:994\n143#1:904,2\n153#1:906\n153#1:914,6\n153#1:923,2\n153#1:907\n234#1:925\n261#1:935,7\n269#1:943\n289#1:954,7\n294#1:961\n347#1:971,7\n393#1:984\n407#1:995\n798#1:1038\n822#1:1048\n853#1:1058\n153#1:908,6\n153#1:920,3\n234#1:926,9\n269#1:944,9\n294#1:962,9\n393#1:985,9\n407#1:996,9\n798#1:1039,9\n822#1:1049,9\n853#1:1059,9\n373#1:978,5\n415#1:1005,5\n458#1:1010,5\n498#1:1017,5\n615#1:1023,5\n629#1:1028,5\n670#1:1033,5\n479#1:1015\n479#1:1016\n*E\n"})
public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final MutableVector _childDelegates;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean layingOutChildren;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPending;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private boolean measuredOnce;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private final AlignmentLines alignmentLines;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private final Function0 layoutChildrenBlock;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final Function0 performMeasureBlock;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean childDelegatesDirty;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPendingForAlignment;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private boolean isPlaced;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private long lastPosition;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private float zIndex;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private Object parentData;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private boolean duringAlignmentLinesQuery;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean parentDataDirty;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private GraphicsLayer lastExplicitLayer;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private boolean onNodePlacedCalled;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean relayoutWithoutParentInProgress;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long performMeasureConstraints;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private GraphicsLayer placeOuterCoordinatorLayer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean placedOnce;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private boolean measurePending;

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private final Function0 placeOuterCoordinatorBlock;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private float lastZIndex;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Function1 placeOuterCoordinatorLayerBlock;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean needsCoordinatesUpdate;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private boolean isPlacedByParent;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private float placeOuterCoordinatorZIndex;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Function1 lastLayerBlock;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private long placeOuterCoordinatorPosition;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int previousPlaceOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int placeOrder = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.f32465O;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.f32460n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.f32458O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[LayoutNode.UsageByParent.f32466n.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LayoutNode.UsageByParent.f32468t.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final void GH3(long position, float zIndex, Function1 layerBlock, GraphicsLayer layer) {
        Placeable.PlacementScope placementScope;
        this.isPlacedByParent = true;
        if (!IntOffset.mUb(position, this.lastPosition) || this.needsCoordinatesUpdate) {
            if (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement() || this.needsCoordinatesUpdate) {
                this.layoutPending = true;
                this.needsCoordinatesUpdate = false;
            }
            lS();
        }
        LookaheadPassDelegate lookaheadPassDelegateWKp = wKp();
        if (lookaheadPassDelegateWKp != null && lookaheadPassDelegateWKp.Th()) {
            NodeCoordinator wrappedBy = XNZ().getWrappedBy();
            if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                placementScope = LayoutNodeKt.rl(A()).getPlacementScope();
            }
            Placeable.PlacementScope placementScope2 = placementScope;
            LookaheadPassDelegate lookaheadPassDelegateWKp2 = wKp();
            Intrinsics.checkNotNull(lookaheadPassDelegateWKp2);
            LayoutNode layoutNodeMYa = A().mYa();
            if (layoutNodeMYa != null) {
                layoutNodeMYa.getLayoutDelegate().M(0);
            }
            lookaheadPassDelegateWKp2.Xli(Integer.MAX_VALUE);
            Placeable.PlacementScope.xMQ(placementScope2, lookaheadPassDelegateWKp2, IntOffset.gh(position), IntOffset.qie(position), 0.0f, 4, null);
        }
        LookaheadPassDelegate lookaheadPassDelegateWKp3 = wKp();
        if ((lookaheadPassDelegateWKp3 == null || lookaheadPassDelegateWKp3.getPlacedOnce()) ? false : true) {
            InlineClassHelperKt.t("Error: Placement happened before lookahead.");
        }
        t1J(position, zIndex, layerBlock, layer);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void E() {
        this.layingOutChildren = true;
        getAlignmentLines().HI();
        if (this.layoutPending) {
            q9();
        }
        if (this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !D().getIsPlacingForAlignment() && this.layoutPending)) {
            this.layoutPending = false;
            LayoutNode.LayoutState layoutStateJO = jO();
            Xli(LayoutNode.LayoutState.f32458O);
            this.layoutNodeLayoutDelegate.bzg(false);
            LayoutNode layoutNodeA = A();
            LayoutNodeKt.rl(layoutNodeA).getSnapshotObserver().O(layoutNodeA, false, this.layoutChildrenBlock);
            Xli(layoutStateJO);
            if (D().getIsPlacingForAlignment() && this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                requestLayout();
            }
            this.layoutPendingForAlignment = false;
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
        GH3(position, zIndex, layerBlock, null);
    }

    public final void HFS() {
        MeasurePassDelegate measurePassDelegate;
        LayoutNode layoutNodeMYa;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                InlineClassHelperKt.t("replace called on unplaced item");
            }
            boolean isPlaced = getIsPlaced();
            measurePassDelegate = this;
            try {
                measurePassDelegate.t1J(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);
                if (isPlaced && !measurePassDelegate.onNodePlacedCalled && (layoutNodeMYa = A().mYa()) != null) {
                    LayoutNode.xzo(layoutNodeMYa, false, 1, null);
                }
                measurePassDelegate.relayoutWithoutParentInProgress = false;
            } catch (Throwable th) {
                th = th;
                measurePassDelegate.relayoutWithoutParentInProgress = false;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            measurePassDelegate = this;
        }
    }

    public final void L() {
        this.onNodePlacedCalled = true;
        LayoutNode layoutNodeMYa = A().mYa();
        float zIndex = D().getZIndex();
        LayoutNode layoutNodeA = A();
        NodeCoordinator nodeCoordinatorE = layoutNodeA.E();
        for (NodeCoordinator nodeCoordinatorN1 = layoutNodeA.n1(); nodeCoordinatorN1 != nodeCoordinatorE; nodeCoordinatorN1 = nodeCoordinatorN1.getWrapped()) {
            Intrinsics.checkNotNull(nodeCoordinatorN1, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            zIndex += ((LayoutModifierNodeCoordinator) nodeCoordinatorN1).getZIndex();
        }
        if (zIndex != this.zIndex) {
            this.zIndex = zIndex;
            if (layoutNodeMYa != null) {
                layoutNodeMYa.nO();
            }
            if (layoutNodeMYa != null) {
                layoutNodeMYa.ER();
            }
        }
        if (getIsPlaced()) {
            A().E().eOa();
        } else {
            if (layoutNodeMYa != null) {
                layoutNodeMYa.ER();
            }
            eo();
            if (this.relayoutWithoutParentInProgress && layoutNodeMYa != null) {
                LayoutNode.xzo(layoutNodeMYa, false, 1, null);
            }
        }
        if (layoutNodeMYa == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && layoutNodeMYa.k() == LayoutNode.LayoutState.f32458O) {
            if (!(this.placeOrder == Integer.MAX_VALUE)) {
                InlineClassHelperKt.t("Place was called on a node which was placed already");
            }
            this.placeOrder = layoutNodeMYa.getLayoutDelegate().getNextChildPlaceOrder();
            LayoutNodeLayoutDelegate layoutDelegate = layoutNodeMYa.getLayoutDelegate();
            layoutDelegate.FX(layoutDelegate.getNextChildPlaceOrder() + 1);
        }
        E();
    }

    public final void LPV() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    public void W(long position, float zIndex, GraphicsLayer layer) {
        GH3(position, zIndex, null, layer);
    }

    public final void j() {
        this.parentDataDirty = true;
    }

    public final void tEO() {
        this.measurePending = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uG() {
        this.layoutNodeLayoutDelegate.FX(0);
        MutableVector mutableVectorHRu = A().hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            MeasurePassDelegate measurePassDelegateETf = ((LayoutNode) objArr[i2]).eTf();
            measurePassDelegateETf.previousPlaceOrder = measurePassDelegateETf.placeOrder;
            measurePassDelegateETf.placeOrder = Integer.MAX_VALUE;
            measurePassDelegateETf.isPlacedByParent = false;
            if (measurePassDelegateETf.measuredByParent == LayoutNode.UsageByParent.f32468t) {
                measurePassDelegateETf.measuredByParent = LayoutNode.UsageByParent.f32465O;
            }
        }
    }

    private final LookaheadPassDelegate wKp() {
        return this.layoutNodeLayoutDelegate.getLookaheadPassDelegate();
    }

    public final LayoutNode A() {
        return this.layoutNodeLayoutDelegate.getLayoutNode();
    }

    /* JADX INFO: renamed from: Aum, reason: from getter */
    public final long getLastPosition() {
        return this.lastPosition;
    }

    public void C7B(boolean z2) {
        this.isPlaced = z2;
    }

    /* JADX INFO: renamed from: D76, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final boolean getIsPlacedByParent() {
        return this.isPlacedByParent;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    /* JADX INFO: renamed from: HI, reason: from getter */
    public boolean getIsPlaced() {
        return this.isPlaced;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    /* JADX INFO: renamed from: J2, reason: from getter */
    public Object getParentData() {
        return this.parentData;
    }

    /* JADX INFO: renamed from: Lp6, reason: from getter */
    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    /* JADX INFO: renamed from: Mh, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    /* JADX INFO: renamed from: Th, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    public final NodeCoordinator XNZ() {
        return this.layoutNodeLayoutDelegate.g();
    }

    public final void Xli(LayoutNode.LayoutState layoutState) {
        this.layoutNodeLayoutDelegate.U(layoutState);
    }

    public final void eb(boolean z2) {
        this.childDelegatesDirty = z2;
    }

    public final void fq(LayoutNode.UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    public final LayoutNode.LayoutState jO() {
        return this.layoutNodeLayoutDelegate.getLayoutState();
    }

    /* JADX INFO: renamed from: lNy, reason: from getter */
    public final int getPlaceOrder() {
        return this.placeOrder;
    }

    public final void lS() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            MutableVector mutableVectorHRu = A().hRu();
            Object[] objArr = mutableVectorHRu.content;
            int size = mutableVectorHRu.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.ty()) {
                    LayoutNode.xzo(layoutNode, false, 1, null);
                }
                layoutDelegate.getMeasurePassDelegate().lS();
            }
        }
    }

    public final Constraints n7b() {
        if (this.measuredOnce) {
            return Constraints.n(getMeasurementConstraints());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    /* JADX INFO: renamed from: o, reason: from getter */
    public AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public Map te() {
        if (!this.duringAlignmentLinesQuery) {
            if (jO() == LayoutNode.LayoutState.f32460n) {
                getAlignmentLines().o(true);
                if (getAlignmentLines().getDirty()) {
                    LPV();
                }
            } else {
                getAlignmentLines().r(true);
            }
        }
        D().NP(true);
        E();
        D().NP(false);
        return getAlignmentLines().getAlignmentLineMap();
    }

    public void wYi(boolean z2) {
        this.isPlacedUnderMotionFrameOfReference = z2;
    }

    public final void waP() {
        this.layoutNodeLayoutDelegate.Xw(true);
    }

    /* JADX INFO: renamed from: xzo, reason: from getter */
    public final LayoutNode.UsageByParent getMeasuredByParent() {
        return this.measuredByParent;
    }

    public MeasurePassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
        IntOffset.Companion companion = IntOffset.INSTANCE;
        this.lastPosition = companion.rl();
        this.parentDataDirty = true;
        this.alignmentLines = new LayoutNodeAlignmentLines(this);
        this._childDelegates = new MutableVector(new MeasurePassDelegate[16], 0);
        this.childDelegatesDirty = true;
        this.performMeasureConstraints = ConstraintsKt.rl(0, 0, 0, 0, 15, null);
        this.performMeasureBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
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
                this.f32560n.XNZ().dR0(this.f32560n.performMeasureConstraints);
            }
        };
        this.layoutChildrenBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
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
                this.f32557n.uG();
                this.f32557n.ijL(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                        n(alignmentLinesOwner);
                        return Unit.INSTANCE;
                    }

                    public final void n(AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().Z(false);
                    }
                });
                this.f32557n.D().uG().Z();
                this.f32557n.xVH();
                this.f32557n.ijL(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.2
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
        };
        this.placeOuterCoordinatorPosition = companion.rl();
        this.placeOuterCoordinatorBlock = new Function0<Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
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
                Placeable.PlacementScope placementScope;
                NodeCoordinator wrappedBy = this.f32561n.XNZ().getWrappedBy();
                if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                    placementScope = LayoutNodeKt.rl(this.f32561n.A()).getPlacementScope();
                }
                Placeable.PlacementScope placementScope2 = placementScope;
                MeasurePassDelegate measurePassDelegate = this.f32561n;
                Function1 function1 = measurePassDelegate.placeOuterCoordinatorLayerBlock;
                GraphicsLayer graphicsLayer = measurePassDelegate.placeOuterCoordinatorLayer;
                if (graphicsLayer != null) {
                    placementScope2.ViF(measurePassDelegate.XNZ(), measurePassDelegate.placeOuterCoordinatorPosition, graphicsLayer, measurePassDelegate.placeOuterCoordinatorZIndex);
                } else if (function1 == null) {
                    placementScope2.mUb(measurePassDelegate.XNZ(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex);
                } else {
                    placementScope2.aYN(measurePassDelegate.XNZ(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex, function1);
                }
            }
        };
    }

    private final void TVk(LayoutNode node) {
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
            if (i2 != 1) {
                if (i2 == 2) {
                    usageByParent = LayoutNode.UsageByParent.f32468t;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + layoutNodeMYa.k());
                }
            } else {
                usageByParent = LayoutNode.UsageByParent.f32466n;
            }
            this.measuredByParent = usageByParent;
            return;
        }
        this.measuredByParent = LayoutNode.UsageByParent.f32465O;
    }

    private final void d() {
        LayoutNode.UsageByParent intrinsicsUsageByParent;
        LayoutNode.lNy(A(), false, false, false, 7, null);
        LayoutNode layoutNodeMYa = A().mYa();
        if (layoutNodeMYa != null && A().getIntrinsicsUsageByParent() == LayoutNode.UsageByParent.f32465O) {
            LayoutNode layoutNodeA = A();
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNodeMYa.k().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
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

    private final void eo() {
        boolean isPlaced = getIsPlaced();
        C7B(true);
        LayoutNode layoutNodeA = A();
        if (!isPlaced) {
            layoutNodeA.E().eOa();
            if (layoutNodeA.xg()) {
                LayoutNode.lNy(layoutNodeA, true, false, false, 6, null);
            } else if (layoutNodeA.z()) {
                LayoutNode.wKp(layoutNodeA, true, false, false, 6, null);
            }
        }
        NodeCoordinator wrapped = layoutNodeA.E().getWrapped();
        for (NodeCoordinator nodeCoordinatorN1 = layoutNodeA.n1(); !Intrinsics.areEqual(nodeCoordinatorN1, wrapped) && nodeCoordinatorN1 != null; nodeCoordinatorN1 = nodeCoordinatorN1.getWrapped()) {
            if (nodeCoordinatorN1.getLastLayerDrawingWasSkipped()) {
                nodeCoordinatorN1.ex();
            }
        }
        MutableVector mutableVectorHRu = layoutNodeA.hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.Org() != Integer.MAX_VALUE) {
                layoutNode.eTf().eo();
                layoutNodeA.I9f(layoutNode);
            }
        }
    }

    private final void q9() {
        MutableVector mutableVectorHRu = A().hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.xg() && layoutNode.ofS() == LayoutNode.UsageByParent.f32466n && LayoutNode.n7b(layoutNode, null, 1, null)) {
                LayoutNode.lNy(A(), false, false, false, 7, null);
            }
        }
    }

    private final void t1J(long position, float zIndex, Function1 layerBlock, GraphicsLayer layer) {
        if (A().getIsDeactivated()) {
            InlineClassHelperKt.n("place is called on a deactivated node");
        }
        Xli(LayoutNode.LayoutState.f32458O);
        boolean z2 = !this.placedOnce;
        this.lastPosition = position;
        this.lastZIndex = zIndex;
        this.lastLayerBlock = layerBlock;
        this.lastExplicitLayer = layer;
        this.placedOnce = true;
        this.onNodePlacedCalled = false;
        Owner ownerRl = LayoutNodeKt.rl(A());
        ownerRl.getRectManager().qie(A(), position, z2);
        if (!this.layoutPending && getIsPlaced()) {
            XNZ().f11(position, zIndex, layerBlock, layer);
            L();
        } else {
            getAlignmentLines().r(false);
            this.layoutNodeLayoutDelegate.rV9(false);
            this.placeOuterCoordinatorLayerBlock = layerBlock;
            this.placeOuterCoordinatorPosition = position;
            this.placeOuterCoordinatorZIndex = zIndex;
            this.placeOuterCoordinatorLayer = layer;
            ownerRl.getSnapshotObserver().t(A(), false, this.placeOuterCoordinatorBlock);
        }
        Xli(LayoutNode.LayoutState.f32462r);
    }

    private final void wKY() {
        if (getIsPlaced()) {
            C7B(false);
            LayoutNode layoutNodeA = A();
            NodeCoordinator wrapped = layoutNodeA.E().getWrapped();
            for (NodeCoordinator nodeCoordinatorN1 = layoutNodeA.n1(); !Intrinsics.areEqual(nodeCoordinatorN1, wrapped) && nodeCoordinatorN1 != null; nodeCoordinatorN1 = nodeCoordinatorN1.getWrapped()) {
                nodeCoordinatorN1.VK2();
                nodeCoordinatorN1.yUZ();
            }
            MutableVector mutableVectorHRu = A().hRu();
            Object[] objArr = mutableVectorHRu.content;
            int size = mutableVectorHRu.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                ((LayoutNode) objArr[i2]).eTf().wKY();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xVH() {
        LayoutNode layoutNodeA = A();
        MutableVector mutableVectorHRu = layoutNodeA.hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.eTf().previousPlaceOrder != layoutNode.Org()) {
                layoutNodeA.nO();
                layoutNodeA.ER();
                if (layoutNode.Org() == Integer.MAX_VALUE) {
                    if (layoutNode.getLayoutDelegate().getDetachedFromParentLookaheadPlacement()) {
                        LookaheadPassDelegate lookaheadPassDelegatePiY = layoutNode.piY();
                        Intrinsics.checkNotNull(lookaheadPassDelegatePiY);
                        lookaheadPassDelegatePiY.j(false);
                    }
                    layoutNode.eTf().wKY();
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
        if (LayoutNodeLayoutDelegateKt.n(A())) {
            LookaheadPassDelegate lookaheadPassDelegateWKp = wKp();
            Intrinsics.checkNotNull(lookaheadPassDelegateWKp);
            return lookaheadPassDelegateWKp.FX(width);
        }
        d();
        return XNZ().FX(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int GR(int height) {
        if (LayoutNodeLayoutDelegateKt.n(A())) {
            LookaheadPassDelegate lookaheadPassDelegateWKp = wKp();
            Intrinsics.checkNotNull(lookaheadPassDelegateWKp);
            return lookaheadPassDelegateWKp.GR(height);
        }
        d();
        return XNZ().GR(height);
    }

    public final void NP(boolean forceRequest) {
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
                    layoutNode.Th(forceRequest);
                    return;
                }
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            LayoutNode.lNy(layoutNode, forceRequest, false, false, 6, null);
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int Nxk(int height) {
        if (LayoutNodeLayoutDelegateKt.n(A())) {
            LookaheadPassDelegate lookaheadPassDelegateWKp = wKp();
            Intrinsics.checkNotNull(lookaheadPassDelegateWKp);
            return lookaheadPassDelegateWKp.Nxk(height);
        }
        d();
        return XNZ().Nxk(height);
    }

    public final void Om(long constraints) {
        boolean z2;
        LayoutNode.LayoutState layoutStateJO = jO();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.f32462r;
        if (layoutStateJO == layoutState) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.t("layout state is not idle before measure starts");
        }
        this.performMeasureConstraints = constraints;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f32460n;
        Xli(layoutState2);
        this.measurePending = false;
        LayoutNodeKt.rl(A()).getSnapshotObserver().Uo(A(), false, this.performMeasureBlock);
        if (jO() == layoutState2) {
            LPV();
            Xli(layoutState);
        }
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void P5(boolean newMFR) {
        if (newMFR != XNZ().getIsPlacedUnderMotionFrameOfReference()) {
            XNZ().D76(newMFR);
            this.needsCoordinatesUpdate = true;
        }
        wYi(newMFR);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public AlignmentLinesOwner Xw() {
        LayoutNodeLayoutDelegate layoutDelegate;
        LayoutNode layoutNodeMYa = A().mYa();
        if (layoutNodeMYa != null && (layoutDelegate = layoutNodeMYa.getLayoutDelegate()) != null) {
            return layoutDelegate.t();
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.Measurable
    public Placeable dR0(long constraints) {
        LayoutNode.UsageByParent intrinsicsUsageByParent = A().getIntrinsicsUsageByParent();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.f32465O;
        if (intrinsicsUsageByParent == usageByParent) {
            A().te();
        }
        if (LayoutNodeLayoutDelegateKt.n(A())) {
            LookaheadPassDelegate lookaheadPassDelegateWKp = wKp();
            Intrinsics.checkNotNull(lookaheadPassDelegateWKp);
            lookaheadPassDelegateWKp.eb(usageByParent);
            lookaheadPassDelegateWKp.dR0(constraints);
        }
        TVk(A());
        w(constraints);
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int g(int width) {
        if (LayoutNodeLayoutDelegateKt.n(A())) {
            LookaheadPassDelegate lookaheadPassDelegateWKp = wKp();
            Intrinsics.checkNotNull(lookaheadPassDelegateWKp);
            return lookaheadPassDelegateWKp.g(width);
        }
        d();
        return XNZ().g(width);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void ijL(Function1 block) {
        MutableVector mutableVectorHRu = A().hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            block.invoke(((LayoutNode) objArr[i2]).getLayoutDelegate().t());
        }
    }

    public final boolean lRt() {
        if ((getParentData() == null && XNZ().getParentData() == null) || !this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        this.parentData = XNZ().getParentData();
        return true;
    }

    @Override // androidx.compose.ui.layout.Placeable
    public int mYa() {
        return XNZ().mYa();
    }

    @Override // androidx.compose.ui.layout.Placeable
    public int n1() {
        return XNZ().n1();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void ofS() {
        LayoutNode.lNy(A(), false, false, false, 7, null);
    }

    public final void rT() {
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        C7B(false);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public void requestLayout() {
        LayoutNode.xzo(A(), false, 1, null);
    }

    public final List v0j() {
        A().wKY();
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
                mutableVector.rl(layoutNode.getLayoutDelegate().getMeasurePassDelegate());
            } else {
                mutableVector.S(i2, layoutNode.getLayoutDelegate().getMeasurePassDelegate());
            }
        }
        mutableVector.o(layoutNodeA.bzg().size(), mutableVector.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.Uo();
    }

    public final boolean w(long constraints) {
        boolean z2;
        if (A().getIsDeactivated()) {
            InlineClassHelperKt.n("measure is called on a deactivated node");
        }
        Owner ownerRl = LayoutNodeKt.rl(A());
        LayoutNode layoutNodeMYa = A().mYa();
        LayoutNode layoutNodeA = A();
        boolean z3 = true;
        if (!A().getCanMultiMeasure() && (layoutNodeMYa == null || !layoutNodeMYa.getCanMultiMeasure())) {
            z2 = false;
        } else {
            z2 = true;
        }
        layoutNodeA.QgZ(z2);
        if (!A().xg() && Constraints.J2(getMeasurementConstraints(), constraints)) {
            Owner.HI(ownerRl, A(), false, 2, null);
            A().NP();
            return false;
        }
        getAlignmentLines().o(false);
        ijL(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$remeasure$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                n(alignmentLinesOwner);
                return Unit.INSTANCE;
            }

            public final void n(AlignmentLinesOwner alignmentLinesOwner) {
                alignmentLinesOwner.getAlignmentLines().XQ(false);
            }
        });
        this.measuredOnce = true;
        long jN = XNZ().n();
        VwL(constraints);
        Om(constraints);
        if (IntSize.O(XNZ().n(), jN) && XNZ().getWidth() == getWidth() && XNZ().getHeight() == getHeight()) {
            z3 = false;
        }
        QZ6(IntSize.t((((long) XNZ().getHeight()) & 4294967295L) | (((long) XNZ().getWidth()) << 32)));
        return z3;
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
        if (layoutStateK == LayoutNode.LayoutState.f32460n) {
            getAlignmentLines().XQ(true);
        } else {
            LayoutNode layoutNodeMYa2 = A().mYa();
            if (layoutNodeMYa2 != null) {
                layoutStateK2 = layoutNodeMYa2.k();
            }
            if (layoutStateK2 == LayoutNode.LayoutState.f32458O) {
                getAlignmentLines().Z(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int iZ = XNZ().z(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return iZ;
    }
}
