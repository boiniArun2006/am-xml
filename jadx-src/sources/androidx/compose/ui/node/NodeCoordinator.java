package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 ½\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004¾\u0002¿\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&J@\u00100\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101JP\u00104\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\t2\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105JH\u00106\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\t2\u0006\u00102\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107JH\u00108\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\t2\u0006\u00102\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00107J(\u00109\u001a\u00020\t*\u0004\u0018\u00010\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010.\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b;\u0010<J\"\u0010@\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\"\u0010B\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>H\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010AJ*\u0010E\u001a\u00020)2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010C\u001a\u00020)2\u0006\u0010D\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ'\u0010J\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u00002\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\tH\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010M\u001a\u00020\u00182\u0006\u0010L\u001a\u00020G2\u0006\u0010I\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010NJ\u001a\u0010O\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001e\u0010Q\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\t¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0018H\u0010¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0018H&¢\u0006\u0004\bW\u0010VJ\u001f\u0010[\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020XH\u0014¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0018H\u0000¢\u0006\u0004\b]\u0010VJ\r\u0010^\u001a\u00020\u0018¢\u0006\u0004\b^\u0010VJ\r\u0010_\u001a\u00020\u0018¢\u0006\u0004\b_\u0010VJ=\u0010`\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u0019H\u0014ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ*\u0010c\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010b\u001a\u00020\u001bH\u0014ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ\r\u0010e\u001a\u00020\u0018¢\u0006\u0004\be\u0010VJE\u0010f\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00192\b\u0010b\u001a\u0004\u0018\u00010\u001bø\u0001\u0000¢\u0006\u0004\bf\u0010\u001eJ\u001f\u0010g\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bg\u0010#J!\u0010h\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\bh\u0010#J\r\u0010i\u001a\u00020\u0018¢\u0006\u0004\bi\u0010VJ2\u0010k\u001a\u00020\u00182\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00192\b\b\u0002\u0010j\u001a\u00020\t¢\u0006\u0004\bk\u0010lJ\r\u0010m\u001a\u00020\u0018¢\u0006\u0004\bm\u0010VJ\r\u0010n\u001a\u00020\u0018¢\u0006\u0004\bn\u0010VJ8\u0010o\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\bo\u0010pJ:\u0010q\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bq\u0010pJ\r\u0010s\u001a\u00020r¢\u0006\u0004\bs\u0010tJ\u001a\u0010v\u001a\u00020)2\u0006\u0010u\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\bv\u0010PJ\u001a\u0010x\u001a\u00020)2\u0006\u0010w\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\bx\u0010PJ\u001a\u0010z\u001a\u00020)2\u0006\u0010y\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\bz\u0010PJ\u001a\u0010{\u001a\u00020)2\u0006\u0010w\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\b{\u0010PJ\"\u0010~\u001a\u00020)2\u0006\u0010|\u001a\u00020\u00032\u0006\u0010}\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ-\u0010\u0080\u0001\u001a\u00020)2\u0006\u0010|\u001a\u00020\u00032\u0006\u0010}\u001a\u00020)2\u0006\u0010D\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J%\u0010\u0082\u0001\u001a\u00020\u00182\u0006\u0010|\u001a\u00020\u00032\u0006\u0010?\u001a\u00020>H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001d\u0010\u0084\u0001\u001a\u00020\u00182\u0006\u0010?\u001a\u00020>H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\"\u0010\u0086\u0001\u001a\u00020r2\u0006\u0010|\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u00020)2\u0006\u0010w\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0005\b\u0088\u0001\u0010PJ'\u0010\u0089\u0001\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020)2\b\b\u0002\u0010D\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J'\u0010\u008b\u0001\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020)2\b\b\u0002\u0010D\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008a\u0001J$\u0010\u008e\u0001\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001H\u0004¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u000f\u0010\u0090\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u0090\u0001\u0010VJ\u000f\u0010\u0091\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u0091\u0001\u0010VJ-\u0010\u0093\u0001\u001a\u00020\u00182\u0006\u0010L\u001a\u00020G2\u0006\u0010I\u001a\u00020\t2\t\b\u0002\u0010\u0092\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001d\u0010\u0095\u0001\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001d\u0010\u0097\u0001\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u0096\u0001J\u0011\u0010\u0098\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0098\u0001\u0010VJ\u0011\u0010\u0099\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0099\u0001\u0010VJ\u001b\u0010\u009b\u0001\u001a\u00020\u00002\u0007\u0010\u009a\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u000f\u0010\u009d\u0001\u001a\u00020\t¢\u0006\u0005\b\u009d\u0001\u0010TJ\u001f\u0010 \u0001\u001a\u00030\u009e\u00012\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0004ø\u0001\u0000¢\u0006\u0005\b \u0001\u0010PJ'\u0010¡\u0001\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R'\u0010«\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bz\u0010§\u0001\u001a\u0005\b¨\u0001\u0010T\"\u0006\b©\u0001\u0010ª\u0001R(\u0010®\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0082\u0001\u0010§\u0001\u001a\u0005\b¬\u0001\u0010T\"\u0006\b\u00ad\u0001\u0010ª\u0001R+\u0010µ\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R+\u0010¹\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010°\u0001\u001a\u0006\b·\u0001\u0010²\u0001\"\u0006\b¸\u0001\u0010´\u0001R\u0019\u0010»\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010§\u0001R\u0019\u0010½\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010§\u0001RO\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00192\u001a\u0010¾\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00198\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u001a\u0010Æ\u0001\u001a\u00030Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u001a\u0010Ê\u0001\u001a\u00030Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0017\u0010Ë\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010`R\u001c\u0010Ï\u0001\u001a\u0005\u0018\u00010Ì\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R#\u0010Ô\u0001\u001a\f\u0012\u0005\u0012\u00030Ñ\u0001\u0018\u00010Ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R7\u0010\u0013\u001a\u00020\u00122\u0007\u0010¾\u0001\u001a\u00020\u00128\u0016@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010Í\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R0\u0010\u0015\u001a\u00020\u00142\u0007\u0010¾\u0001\u001a\u00020\u00148\u0006@DX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0086\u0001\u0010`\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R\u001b\u0010ß\u0001\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u001c\u0010ã\u0001\u001a\u0005\u0018\u00010à\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u001b\u0010æ\u0001\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u001b\u0010é\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R0\u0010í\u0001\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u001e\u0010ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R)\u0010ô\u0001\u001a\u00020\t2\u0007\u0010¾\u0001\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\bò\u0001\u0010§\u0001\u001a\u0005\bó\u0001\u0010TR/\u0010b\u001a\u0005\u0018\u00010õ\u00012\n\u0010¾\u0001\u001a\u0005\u0018\u00010õ\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010å\u0001R\u0018\u0010þ\u0001\u001a\u00030û\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bü\u0001\u0010ý\u0001R,\u0010\u0081\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u00180ê\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R\u0017\u0010\u0084\u0002\u001a\u00020\u000b8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0018\u0010\u0087\u0002\u001a\u00030Ç\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R\u0017\u0010\u0089\u0002\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0002\u0010Ú\u0001R\u0017\u0010\u008b\u0002\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010Ú\u0001R\u0019\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0017\u0010\u0091\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R\u0016\u0010\u0093\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0002\u0010TR\u001b\u0010\u0096\u0002\u001a\u00030\u0094\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010Ö\u0001R\u0018\u0010\u009a\u0002\u001a\u00030\u0097\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0019\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010\u008d\u0002R\u0016\u0010\u009e\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0002\u0010TR\u0016\u0010 \u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0002\u0010TR,\u0010¦\u0002\u001a\u00030Ì\u00012\b\u0010¡\u0002\u001a\u00030Ì\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b¢\u0002\u0010£\u0002\"\u0006\b¤\u0002\u0010¥\u0002R0\u0010¬\u0002\u001a\u0005\u0018\u00010§\u00022\n\u0010¾\u0001\u001a\u0005\u0018\u00010§\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\b¨\u0002\u0010©\u0002\"\u0006\bª\u0002\u0010«\u0002R\u001a\u0010°\u0002\u001a\u0005\u0018\u00010\u00ad\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b®\u0002\u0010¯\u0002R\u0016\u0010±\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\bò\u0001\u0010\u0090\u0002R\u0016\u0010³\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b²\u0002\u0010\u0090\u0002R\u0017\u0010¶\u0002\u001a\u00020G8DX\u0084\u0004¢\u0006\b\u001a\u0006\b´\u0002\u0010µ\u0002R\u001e\u0010¹\u0002\u001a\u00030·\u00028@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¸\u0002\u0010Ö\u0001R\u0016\u0010»\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bº\u0002\u0010TR\u001b\u0010\u009f\u0001\u001a\u00030\u009e\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¼\u0002\u0010Ö\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006À\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "includeTail", "Landroidx/compose/ui/Modifier$Node;", "GRh", "(Z)Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/NodeKind;", "type", "Qg8", "(I)Z", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "layerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "explicitLayer", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "wYi", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "invokeOnLayoutChange", "sYH", "(Z)Z", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "isInLayer", "Rc", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "distanceFromEdge", "isHitInMinimumTouchTargetBetter", "R3E", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZFZ)V", "UR", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZF)V", "F6W", "poH", "(Landroidx/compose/ui/Modifier$Node;JI)Z", "u2n", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/node/NodeCoordinator;", "ancestor", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "X6", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "ep", "offset", "includeMotionFrameOfReference", "HFS", "(Landroidx/compose/ui/node/NodeCoordinator;JZ)J", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "clipBounds", "w", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/geometry/MutableRect;Z)V", "bounds", "gxH", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "ni", "(J)J", "tdZ", "(I)Landroidx/compose/ui/Modifier$Node;", CmcdConfiguration.KEY_PLAYBACK_RATE, "()Z", "lNy", "()V", "TVk", "", "width", "height", "jE", "(II)V", "Vd", "kC", "VK2", "F", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "W", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "yUZ", "f11", "fq", "Yq", "eOa", "forceUpdateLayerParameters", "fwz", "(Lkotlin/jvm/functions/Function1;Z)V", "GT", "b", "W5k", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "NC9", "Landroidx/compose/ui/geometry/Rect;", TtmlNode.TAG_P, "()Landroidx/compose/ui/geometry/Rect;", "relativeToScreen", "r", "relativeToLocal", "aYN", "relativeToWindow", "jB", "B", "sourceCoordinates", "relativeToSource", "nHg", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "e", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "U", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "([F)V", "I", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "xg", "q", "(JZ)J", "n7u", "Landroidx/compose/ui/graphics/Paint;", "paint", "C7B", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Paint;)V", "ZwA", "i7", "clipToMinimumTouchTargetSize", "cAB", "(Landroidx/compose/ui/geometry/MutableRect;ZZ)V", "eF0", "(J)Z", "W1c", "ex", "WKb", InneractiveMediationNameConsts.OTHER, "lRt", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "lvn", "Landroidx/compose/ui/geometry/Size;", "minimumTouchTargetSize", "eb", "Xli", "(JJ)F", "Xw", "Landroidx/compose/ui/node/LayoutNode;", "A", "()Landroidx/compose/ui/node/LayoutNode;", "Z", "getForcePlaceWithLookaheadOffset$ui_release", "H6M", "(Z)V", "forcePlaceWithLookaheadOffset", "Sax", "Bha", "forceMeasureWithLookaheadConstraints", "P5", "Landroidx/compose/ui/node/NodeCoordinator;", "Of6", "()Landroidx/compose/ui/node/NodeCoordinator;", "ENe", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrapped", "M7", "jX", "Ai", "wrappedBy", "p5", "released", "eF", "isClipping", "<set-?>", "E", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/unit/Density;", "M", "Landroidx/compose/ui/unit/Density;", "layerDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "FX", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "lastLayerAlpha", "Landroidx/compose/ui/layout/MeasureResult;", "J", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/compose/ui/layout/AlignmentLine;", "D", "Landroidx/collection/MutableObjectIntMap;", "oldAlignmentLines", "Aum", "()J", "hu", "(J)V", "iu", "()F", "setZIndex", "(F)V", "GR", "Landroidx/compose/ui/geometry/MutableRect;", "_rectCache", "Landroidx/compose/ui/node/LayerPositionalProperties;", "Nxk", "Landroidx/compose/ui/node/LayerPositionalProperties;", "layerPositionalProperties", "Y", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawBlockParentLayer", "k", "Landroidx/compose/ui/graphics/Canvas;", "drawBlockCanvas", "Lkotlin/Function2;", "dR0", "Lkotlin/jvm/functions/Function2;", "_drawBlock", "Lkotlin/Function0;", "z", "Lkotlin/jvm/functions/Function0;", "invalidateParentLayer", "piY", "kQ", "lastLayerDrawingWasSkipped", "Landroidx/compose/ui/node/OwnedLayer;", "ijL", "Landroidx/compose/ui/node/OwnedLayer;", "XUb", "()Landroidx/compose/ui/node/OwnedLayer;", "m", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "sFO", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "c", "()Lkotlin/jvm/functions/Function2;", "drawBlock", "JI", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "yAc", "fontScale", "v0j", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "parent", "Zmq", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "fD", "introducesMotionFrameOfReference", "Landroidx/compose/ui/unit/IntSize;", c.f62177j, "size", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "YiW", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "X4T", "child", "xVH", "hasMeasureResult", "nr", "isAttached", "value", "uG", "()Landroidx/compose/ui/layout/MeasureResult;", "YE", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureResult", "Landroidx/compose/ui/node/LookaheadDelegate;", "rR", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "", "J2", "()Ljava/lang/Object;", "parentData", "parentLayoutCoordinates", "v", "parentCoordinates", "V5F", "()Landroidx/compose/ui/geometry/MutableRect;", "rectCache", "Landroidx/compose/ui/unit/Constraints;", "x", "lastMeasurementConstraints", "Vvq", "isValidOwnerScope", "MPw", "eTf", "Companion", "HitTestSource", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 10 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 14 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 15 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 16 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 17 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 18 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 19 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 20 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 21 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,1619:1\n105#1,5:1620\n110#1,4:1668\n105#1,9:1672\n116#1:1688\n105#1,5:1689\n110#1,8:1737\n116#1:1817\n105#1,5:1818\n110#1,8:1866\n116#1:1877\n105#1,5:1878\n110#1,8:1926\n116#1:1941\n105#1,5:1942\n110#1,8:1990\n437#2,6:1625\n447#2,2:1632\n449#2,8:1637\n457#2,9:1648\n466#2,8:1660\n437#2,6:1694\n447#2,2:1701\n449#2,8:1706\n457#2,9:1717\n466#2,8:1729\n437#2,5:1752\n442#2:1758\n447#2,2:1760\n449#2,8:1765\n457#2,9:1776\n466#2,8:1788\n437#2,6:1823\n447#2,2:1830\n449#2,8:1835\n457#2,9:1846\n466#2,8:1858\n437#2,6:1883\n447#2,2:1890\n449#2,8:1895\n457#2,9:1906\n466#2,8:1918\n437#2,6:1947\n447#2,2:1954\n449#2,8:1959\n457#2,9:1970\n466#2,8:1982\n437#2,5:2051\n442#2:2068\n447#2,2:2070\n449#2,8:2075\n457#2,9:2086\n466#2,8:2098\n222#2:2191\n223#2,8:2197\n235#2:2207\n209#2:2208\n210#2,6:2214\n437#2,6:2220\n447#2,2:2227\n449#2,8:2232\n457#2,9:2243\n466#2,8:2255\n217#2,3:2263\n246#3:1631\n246#3:1700\n246#3:1750\n246#3:1759\n246#3:1829\n246#3:1889\n246#3:1953\n246#3:2069\n246#3:2226\n240#4,3:1634\n243#4,3:1657\n240#4,3:1703\n243#4,3:1726\n240#4,3:1762\n243#4,3:1785\n240#4,3:1832\n243#4,3:1855\n240#4,3:1892\n243#4,3:1915\n240#4,3:1956\n243#4,3:1979\n240#4,3:2072\n243#4,3:2095\n240#4,3:2229\n243#4,3:2252\n1101#5:1645\n1083#5,2:1646\n1101#5:1714\n1083#5,2:1715\n1101#5:1773\n1083#5,2:1774\n1101#5:1843\n1083#5,2:1844\n1101#5:1903\n1083#5,2:1904\n1101#5:1967\n1083#5,2:1968\n1101#5:2083\n1083#5,2:2084\n1101#5:2240\n1083#5,2:2241\n215#6,2:1681\n30#7:1683\n30#7:1685\n80#8:1684\n80#8:1686\n60#8:2057\n60#8:2060\n70#8:2063\n70#8:2066\n60#8:2107\n70#8:2110\n60#8:2113\n70#8:2116\n60#8:2137\n70#8:2140\n85#8:2152\n90#8:2154\n85#8:2161\n90#8:2163\n60#8:2165\n70#8:2168\n85#8:2171\n90#8:2173\n85#8:2175\n90#8:2177\n85#8:2179\n90#8:2181\n60#8:2185\n70#8:2188\n60#8:2267\n70#8:2270\n53#8,3:2273\n60#8:2277\n70#8:2280\n53#8,3:2283\n60#8:2287\n70#8:2290\n60#8:2294\n70#8:2298\n60#8:2300\n70#8:2303\n87#9:1687\n103#9:1745\n103#9:1749\n103#9:1751\n107#9:1809\n107#9:1816\n155#9:1875\n155#9:1876\n87#9:1939\n107#9:1940\n83#9:2034\n83#9:2046\n83#9:2049\n95#9:2050\n83#9:2190\n95#9:2205\n95#9:2206\n712#10,3:1746\n715#10,3:1796\n1#11:1757\n56#12,5:1799\n56#12,5:1804\n102#12,5:1934\n102#12,5:1998\n76#12,7:2003\n56#12,5:2010\n56#12,5:2118\n56#12,5:2123\n56#12,5:2128\n56#12,5:2141\n56#12,5:2146\n56#12,5:2155\n56#12,5:2192\n56#12,5:2209\n602#13,6:1810\n609#13:1874\n139#14:2015\n139#14:2016\n92#15,9:2017\n113#15,8:2026\n121#15,2:2035\n100#15:2037\n113#15,8:2038\n121#15,2:2047\n65#16:2056\n65#16:2059\n69#16:2062\n69#16:2065\n150#16:2133\n150#16:2134\n65#16:2136\n69#16:2139\n65#16:2184\n69#16:2187\n65#16:2266\n69#16:2269\n65#16:2299\n69#16:2302\n22#17:2058\n22#17:2061\n22#17:2064\n22#17:2067\n22#17:2108\n22#17:2111\n22#17:2114\n22#17:2117\n22#17:2138\n22#17:2166\n22#17:2169\n22#17:2186\n22#17:2189\n22#17:2268\n22#17:2271\n22#17:2278\n22#17:2281\n22#17:2288\n22#17:2291\n22#17:2295\n22#17:2301\n57#18:2106\n61#18:2109\n57#18:2112\n61#18:2115\n57#18:2164\n61#18:2167\n57#18:2276\n61#18:2279\n57#18:2286\n61#18:2289\n63#18:2292\n57#18:2293\n65#18:2296\n61#18:2297\n273#19:2135\n266#19,2:2182\n30#19:2272\n54#20:2151\n59#20:2153\n54#20:2160\n59#20:2162\n54#20:2170\n59#20:2172\n54#20:2174\n59#20:2176\n54#20:2178\n59#20:2180\n33#21:2282\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n116#1:1620,5\n116#1:1668,4\n124#1:1672,9\n243#1:1688\n243#1:1689,5\n243#1:1737,8\n318#1:1817\n318#1:1818,5\n318#1:1866,8\n325#1:1877\n325#1:1878,5\n325#1:1926,8\n460#1:1941\n460#1:1942,5\n460#1:1990,8\n116#1:1625,6\n116#1:1632,2\n116#1:1637,8\n116#1:1648,9\n116#1:1660,8\n243#1:1694,6\n243#1:1701,2\n243#1:1706,8\n243#1:1717,9\n243#1:1729,8\n265#1:1752,5\n265#1:1758\n265#1:1760,2\n265#1:1765,8\n265#1:1776,9\n265#1:1788,8\n318#1:1823,6\n318#1:1830,2\n318#1:1835,8\n318#1:1846,9\n318#1:1858,8\n325#1:1883,6\n325#1:1890,2\n325#1:1895,8\n325#1:1906,9\n325#1:1918,8\n460#1:1947,6\n460#1:1954,2\n460#1:1959,8\n460#1:1970,9\n460#1:1982,8\n884#1:2051,5\n884#1:2068\n884#1:2070,2\n884#1:2075,8\n884#1:2086,9\n884#1:2098,8\n1328#1:2191\n1328#1:2197,8\n1364#1:2207\n1364#1:2208\n1364#1:2214,6\n1364#1:2220,6\n1364#1:2227,2\n1364#1:2232,8\n1364#1:2243,9\n1364#1:2255,8\n1364#1:2263,3\n116#1:1631\n243#1:1700\n264#1:1750\n265#1:1759\n318#1:1829\n325#1:1889\n460#1:1953\n884#1:2069\n1364#1:2226\n116#1:1634,3\n116#1:1657,3\n243#1:1703,3\n243#1:1726,3\n265#1:1762,3\n265#1:1785,3\n318#1:1832,3\n318#1:1855,3\n325#1:1892,3\n325#1:1915,3\n460#1:1956,3\n460#1:1979,3\n884#1:2072,3\n884#1:2095,3\n1364#1:2229,3\n1364#1:2252,3\n116#1:1645\n116#1:1646,2\n243#1:1714\n243#1:1715,2\n265#1:1773\n265#1:1774,2\n318#1:1843\n318#1:1844,2\n325#1:1903\n325#1:1904,2\n460#1:1967\n460#1:1968,2\n884#1:2083\n884#1:2084,2\n1364#1:2240\n1364#1:2241,2\n196#1:1681,2\n232#1:1683\n239#1:1685\n232#1:1684\n239#1:1686\n887#1:2057\n888#1:2060\n889#1:2063\n890#1:2066\n922#1:2107\n923#1:2110\n924#1:2113\n925#1:2116\n1038#1:2137\n1038#1:2140\n1084#1:2152\n1085#1:2154\n1186#1:2161\n1187#1:2163\n1234#1:2165\n1235#1:2168\n1239#1:2171\n1240#1:2173\n1243#1:2175\n1243#1:2177\n1278#1:2179\n1278#1:2181\n1299#1:2185\n1300#1:2188\n1373#1:2267\n1375#1:2270\n1378#1:2273,3\n1387#1:2277\n1388#1:2280\n1389#1:2283,3\n1402#1:2287\n1403#1:2290\n1409#1:2294\n1409#1:2298\n1413#1:2300\n1413#1:2303\n243#1:1687\n257#1:1745\n264#1:1749\n265#1:1751\n316#1:1809\n318#1:1816\n324#1:1875\n325#1:1876\n446#1:1939\n460#1:1940\n724#1:2034\n811#1:2046\n855#1:2049\n884#1:2050\n1328#1:2190\n1358#1:2205\n1364#1:2206\n263#1:1746,3\n263#1:1796,3\n282#1:1799,5\n289#1:1804,5\n358#1:1934,5\n503#1:1998,5\n566#1:2003,7\n595#1:2010,5\n944#1:2118,5\n952#1:2123,5\n959#1:2128,5\n1073#1:2141,5\n1074#1:2146,5\n1128#1:2155,5\n1328#1:2192,5\n1364#1:2209,5\n317#1:1810,6\n317#1:1874\n670#1:2015\n695#1:2016\n723#1:2017,9\n723#1:2026,8\n723#1:2035,2\n810#1:2037\n810#1:2038,8\n810#1:2047,2\n887#1:2056\n888#1:2059\n889#1:2062\n890#1:2065\n995#1:2133\n993#1:2134\n1038#1:2136\n1038#1:2139\n1299#1:2184\n1300#1:2187\n1373#1:2266\n1375#1:2269\n1413#1:2299\n1413#1:2302\n887#1:2058\n888#1:2061\n889#1:2064\n890#1:2067\n922#1:2108\n923#1:2111\n924#1:2114\n925#1:2117\n1038#1:2138\n1234#1:2166\n1235#1:2169\n1299#1:2186\n1300#1:2189\n1373#1:2268\n1375#1:2271\n1387#1:2278\n1388#1:2281\n1402#1:2288\n1403#1:2291\n1409#1:2295\n1413#1:2301\n922#1:2106\n923#1:2109\n924#1:2112\n925#1:2115\n1234#1:2164\n1235#1:2167\n1387#1:2276\n1388#1:2279\n1402#1:2286\n1403#1:2289\n1409#1:2292\n1409#1:2293\n1409#1:2296\n1409#1:2297\n1037#1:2135\n1287#1:2182,2\n1378#1:2272\n1084#1:2151\n1085#1:2153\n1186#1:2160\n1187#1:2162\n1239#1:2170\n1240#1:2172\n1243#1:2174\n1243#1:2176\n1278#1:2178\n1278#1:2180\n1389#1:2282\n*E\n"})
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private MutableObjectIntMap oldAlignmentLines;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Function1 layerBlock;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private MutableRect _rectCache;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private float zIndex;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private MeasureResult _measureResult;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private NodeCoordinator wrappedBy;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private LayerPositionalProperties layerPositionalProperties;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private NodeCoordinator wrapped;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean forceMeasureWithLookaheadConstraints;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer drawBlockParentLayer;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private Function2 _drawBlock;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private boolean isClipping;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private OwnedLayer layer;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean forcePlaceWithLookaheadOffset;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Canvas drawBlockCanvas;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer explicitLayer;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private boolean released;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private boolean lastLayerDrawingWasSkipped;

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Function1 xg = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            n(nodeCoordinator);
            return Unit.INSTANCE;
        }

        public final void n(NodeCoordinator nodeCoordinator) {
            if (nodeCoordinator.Vvq() && NodeCoordinator.c2(nodeCoordinator, false, 1, null)) {
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.xzo(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().lS();
                }
                Owner ownerRl = LayoutNodeKt.rl(layoutNode);
                ownerRl.getRectManager().gh(layoutNode);
                ownerRl.KN(layoutNode);
            }
        }
    };
    private static final Function1 pJg = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            n(nodeCoordinator);
            return Unit.INSTANCE;
        }

        public final void n(NodeCoordinator nodeCoordinator) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };
    private static final ReusableGraphicsLayerScope ofS = new ReusableGraphicsLayerScope();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final LayerPositionalProperties f32573C = new LayerPositionalProperties();
    private static final float[] Mx = Matrix.t(null, 1, null);

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private static final HitTestSource f32574G7 = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean nr(LayoutNode parentLayoutNode) {
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public int n() {
            return NodeKind.n(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.MutableVector] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.MutableVector] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r5v4 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean t(Modifier.Node node) {
            int iN = NodeKind.n(16);
            ?? mutableVector = 0;
            while (node != 0) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).ul()) {
                        return true;
                    }
                } else if ((node.getKindSet() & iN) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate = ((DelegatingNode) node).getDelegate();
                    int i2 = 0;
                    mutableVector = mutableVector;
                    node = node;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & iN) != 0) {
                            i2++;
                            mutableVector = mutableVector;
                            if (i2 == 1) {
                                node = delegate;
                            } else {
                                if (mutableVector == 0) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector.rl(node);
                                    node = 0;
                                }
                                mutableVector.rl(delegate);
                            }
                        }
                        delegate = delegate.getChild();
                        mutableVector = mutableVector;
                        node = node;
                    }
                    if (i2 == 1) {
                    }
                }
                node = DelegatableNodeKt.KN(mutableVector);
            }
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public void rl(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.UhV(pointerPosition, hitTestResult, pointerType, isInLayer);
        }
    };
    private static final HitTestSource fcU = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean t(Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public int n() {
            return NodeKind.n(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean nr(LayoutNode parentLayoutNode) {
            SemanticsConfiguration semanticsConfigurationD = parentLayoutNode.D();
            boolean z2 = false;
            if (semanticsConfigurationD != null && semanticsConfigurationD.getIsClearingSemantics()) {
                z2 = true;
            }
            return !z2;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public void rl(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.K(pointerPosition, hitTestResult, pointerType, isInLayer);
        }
    };

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private Density layerDensity = getLayoutNode().getDensity();

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private float lastLayerAlpha = 0.8f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long position = IntOffset.INSTANCE.rl();

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Function0 invalidateParentLayer = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
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
            NodeCoordinator wrappedBy = this.f32594n.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.ex();
            }
        }
    };

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", c.f62177j, "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "rl", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLayerParams", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "Landroidx/compose/ui/graphics/Matrix;", "tmpMatrix", "[F", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HitTestSource n() {
            return NodeCoordinator.f32574G7;
        }

        public final HitTestSource rl() {
            return NodeCoordinator.fcU;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007H&ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "Landroidx/compose/ui/node/NodeKind;", c.f62177j, "()I", "Landroidx/compose/ui/Modifier$Node;", "node", "", "t", "(Landroidx/compose/ui/Modifier$Node;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "nr", "(Landroidx/compose/ui/node/LayoutNode;)Z", "layoutNode", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "isInLayer", "", "rl", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface HitTestSource {
        int n();

        boolean nr(LayoutNode parentLayoutNode);

        void rl(LayoutNode layoutNode, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer);

        boolean t(Modifier.Node node);
    }

    private final void G(long position, float zIndex, Function1 layerBlock, GraphicsLayer explicitLayer) {
        if (explicitLayer != null) {
            if (!(layerBlock == null)) {
                InlineClassHelperKt.n("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != explicitLayer) {
                this.explicitLayer = null;
                Q(this, null, false, 2, null);
                this.explicitLayer = explicitLayer;
            }
            if (this.layer == null) {
                OwnedLayer ownedLayerTy = Owner.ty(LayoutNodeKt.rl(getLayoutNode()), c(), this.invalidateParentLayer, explicitLayer, false, 8, null);
                ownedLayerTy.nr(getMeasuredSize());
                ownedLayerTy.mUb(position);
                this.layer = ownedLayerTy;
                getLayoutNode().H(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                Q(this, null, false, 2, null);
            }
            Q(this, layerBlock, false, 2, null);
        }
        if (!IntOffset.mUb(getPosition(), position)) {
            hu(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().lS();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mUb(position);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.ex();
                }
            }
            Mh(this);
            Owner owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.gh(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
        if (getIsPlacingForAlignment()) {
            return;
        }
        ub(uG());
    }

    private final void X6(NodeCoordinator ancestor, float[] matrix) {
        NodeCoordinator nodeCoordinator = this;
        while (!Intrinsics.areEqual(nodeCoordinator, ancestor)) {
            OwnedLayer ownedLayer = nodeCoordinator.layer;
            if (ownedLayer != null) {
                ownedLayer.n(matrix);
            }
            if (!IntOffset.mUb(nodeCoordinator.getPosition(), IntOffset.INSTANCE.rl())) {
                float[] fArr = Mx;
                Matrix.KN(fArr);
                Matrix.HI(fArr, IntOffset.gh(r1), IntOffset.qie(r1), 0.0f, 4, null);
                Matrix.qie(matrix, fArr);
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    private final boolean poH(Modifier.Node node, long j2, int i2) {
        if (node == 0) {
            return false;
        }
        PointerType.Companion companion = PointerType.INSTANCE;
        if (!PointerType.KN(i2, companion.t()) && !PointerType.KN(i2, companion.n())) {
            return false;
        }
        int iN = NodeKind.n(16);
        ?? mutableVector = 0;
        while (node != 0) {
            if (node instanceof PointerInputModifierNode) {
                long jX4T = ((PointerInputModifierNode) node).X4T();
                int i3 = (int) (j2 >> 32);
                if (Float.intBitsToFloat(i3) >= (-TouchBoundsExpansion.rl(jX4T, getLayoutDirection())) && Float.intBitsToFloat(i3) < mYa() + TouchBoundsExpansion.t(jX4T, getLayoutDirection())) {
                    int i5 = (int) (j2 & 4294967295L);
                    if (Float.intBitsToFloat(i5) >= (-TouchBoundsExpansion.xMQ(jX4T)) && Float.intBitsToFloat(i5) < n1() + TouchBoundsExpansion.J2(jX4T)) {
                        return true;
                    }
                }
                return false;
            }
            if ((node.getKindSet() & iN) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node nodeW5k = ((DelegatingNode) node).getDelegate();
                int i7 = 0;
                mutableVector = mutableVector;
                node = node;
                while (nodeW5k != null) {
                    if ((nodeW5k.getKindSet() & iN) != 0) {
                        i7++;
                        mutableVector = mutableVector;
                        if (i7 == 1) {
                            node = nodeW5k;
                        } else {
                            if (mutableVector == 0) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                mutableVector.rl(node);
                                node = 0;
                            }
                            mutableVector.rl(nodeW5k);
                        }
                    }
                    nodeW5k = nodeW5k.getChild();
                    mutableVector = mutableVector;
                    node = node;
                }
                if (i7 == 1) {
                }
            }
            node = DelegatableNodeKt.KN(mutableVector);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wYi(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node nodeTdZ = tdZ(NodeKind.n(4));
        if (nodeTdZ == null) {
            Yq(canvas, graphicsLayer);
        } else {
            getLayoutNode().m().HI(canvas, IntSizeKt.O(n()), this, nodeTdZ, graphicsLayer);
        }
    }

    public abstract Modifier.Node JI();

    public abstract void TVk();

    public final void W5k(HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        boolean z2;
        Modifier.Node nodeTdZ = tdZ(hitTestSource.n());
        boolean z3 = false;
        if (!eF0(pointerPosition)) {
            if (PointerType.KN(pointerType, PointerType.INSTANCE.nr())) {
                float fXli = Xli(pointerPosition, MPw());
                if ((Float.floatToRawIntBits(fXli) & Integer.MAX_VALUE) >= 2139095040 || !hitTestResult.Ik(fXli, false)) {
                    return;
                }
                UR(nodeTdZ, hitTestSource, pointerPosition, hitTestResult, pointerType, false, fXli);
                return;
            }
            return;
        }
        if (nodeTdZ == null) {
            NC9(hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        if (W1c(pointerPosition)) {
            Rc(nodeTdZ, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        float fXli2 = !PointerType.KN(pointerType, PointerType.INSTANCE.nr()) ? Float.POSITIVE_INFINITY : Xli(pointerPosition, MPw());
        if ((Float.floatToRawIntBits(fXli2) & Integer.MAX_VALUE) < 2139095040) {
            z2 = isInLayer;
            if (hitTestResult.Ik(fXli2, z2)) {
                z3 = true;
            }
        } else {
            z2 = isInLayer;
        }
        R3E(nodeTdZ, hitTestSource, pointerPosition, hitTestResult, pointerType, z2, fXli2, z3);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates Zmq() {
        return this;
    }

    public final void fwz(Function1 layerBlock, boolean forceUpdateLayerParameters) {
        Owner owner;
        if (!(layerBlock == null || this.explicitLayer == null)) {
            InlineClassHelperKt.n("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z2 = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && Intrinsics.areEqual(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (!layoutNode.nr() || layerBlock == null) {
            this.layerBlock = null;
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                layoutNode.H(true);
                this.invalidateParentLayer.invoke();
                if (nr() && layoutNode.HI() && (owner = layoutNode.getOwner()) != null) {
                    owner.gh(layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.layerBlock = layerBlock;
        if (this.layer != null) {
            if (z2 && c2(this, false, 1, null)) {
                LayoutNodeKt.rl(layoutNode).getRectManager().gh(layoutNode);
                return;
            }
            return;
        }
        OwnedLayer ownedLayerTy = Owner.ty(LayoutNodeKt.rl(layoutNode), c(), this.invalidateParentLayer, null, layoutNode.getForceUseOldLayers(), 4, null);
        ownedLayerTy.nr(getMeasuredSize());
        ownedLayerTy.mUb(getPosition());
        this.layer = ownedLayerTy;
        c2(this, false, 1, null);
        layoutNode.H(true);
        this.invalidateParentLayer.invoke();
    }

    public final void i7() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        yUZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    public final void kC() {
        Modifier.Node parent;
        if (Qg8(NodeKind.n(128))) {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot snapshotNr = companion.nr();
            Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
            Snapshot snapshotO = companion.O(snapshotNr);
            try {
                int iN = NodeKind.n(128);
                boolean zXMQ = NodeKindKt.xMQ(iN);
                if (!zXMQ) {
                    parent = JI().getParent();
                    if (parent == null) {
                    }
                    Unit unit = Unit.INSTANCE;
                    companion.az(snapshotNr, snapshotO, function1Uo);
                }
                parent = JI();
                for (Modifier.Node nodeGRh = GRh(zXMQ); nodeGRh != null && (nodeGRh.getAggregateChildKindSet() & iN) != 0; nodeGRh = nodeGRh.getChild()) {
                    if ((nodeGRh.getKindSet() & iN) != 0) {
                        ?? mutableVector = 0;
                        ?? KN = nodeGRh;
                        while (KN != 0) {
                            if (KN instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) KN).HI(getMeasuredSize());
                            } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                                Modifier.Node nodeW5k = ((DelegatingNode) KN).getDelegate();
                                int i2 = 0;
                                KN = KN;
                                mutableVector = mutableVector;
                                while (nodeW5k != null) {
                                    if ((nodeW5k.getKindSet() & iN) != 0) {
                                        i2++;
                                        mutableVector = mutableVector;
                                        if (i2 == 1) {
                                            KN = nodeW5k;
                                        } else {
                                            if (mutableVector == 0) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (KN != 0) {
                                                mutableVector.rl(KN);
                                                KN = 0;
                                            }
                                            mutableVector.rl(nodeW5k);
                                        }
                                    }
                                    nodeW5k = nodeW5k.getChild();
                                    KN = KN;
                                    mutableVector = mutableVector;
                                }
                                if (i2 == 1) {
                                }
                            }
                            KN = DelegatableNodeKt.KN(mutableVector);
                        }
                    }
                    if (nodeGRh == parent) {
                        break;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                companion.az(snapshotNr, snapshotO, function1Uo);
            } catch (Throwable th) {
                companion.az(snapshotNr, snapshotO, function1Uo);
                throw th;
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long nHg(LayoutCoordinates sourceCoordinates, long relativeToSource) {
        return e(sourceCoordinates, relativeToSource, true);
    }

    /* JADX INFO: renamed from: rR */
    public abstract LookaheadDelegate getLookaheadDelegate();

    private final void F6W(final Modifier.Node node, final HitTestSource hitTestSource, final long j2, final HitTestResult hitTestResult, final int i2, final boolean z2, final float f3) {
        if (node == null) {
            NC9(hitTestSource, j2, hitTestResult, i2, z2);
        } else if (hitTestSource.t(node)) {
            hitTestResult.S(node, f3, z2, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
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
                    this.f32606n.R3E(NodeCoordinatorKt.nr(node, hitTestSource.n(), NodeKind.n(2)), hitTestSource, j2, hitTestResult, i2, z2, f3, false);
                }
            });
        } else {
            R3E(NodeCoordinatorKt.nr(node, hitTestSource.n(), NodeKind.n(2)), hitTestSource, j2, hitTestResult, i2, z2, f3, false);
        }
    }

    private final long HFS(NodeCoordinator ancestor, long offset, boolean includeMotionFrameOfReference) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        return (nodeCoordinator == null || Intrinsics.areEqual(ancestor, nodeCoordinator)) ? n7u(offset, includeMotionFrameOfReference) : n7u(nodeCoordinator.HFS(ancestor, offset, includeMotionFrameOfReference), includeMotionFrameOfReference);
    }

    public static /* synthetic */ long Hq(NodeCoordinator nodeCoordinator, long j2, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return nodeCoordinator.q(j2, z2);
    }

    public static /* synthetic */ void Q(NodeCoordinator nodeCoordinator, Function1 function1, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        nodeCoordinator.fwz(function1, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R3E(final Modifier.Node node, final HitTestSource hitTestSource, final long j2, final HitTestResult hitTestResult, final int i2, final boolean z2, final float f3, final boolean z3) {
        if (node == null) {
            NC9(hitTestSource, j2, hitTestResult, i2, z2);
            return;
        }
        if (poH(node, j2, i2)) {
            hitTestResult.HI(node, z2, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
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
                    this.f32599n.R3E(NodeCoordinatorKt.nr(node, hitTestSource.n(), NodeKind.n(2)), hitTestSource, j2, hitTestResult, i2, z2, f3, z3);
                }
            });
        } else if (z3) {
            UR(node, hitTestSource, j2, hitTestResult, i2, z2, f3);
        } else {
            F6W(node, hitTestSource, j2, hitTestResult, i2, z2, f3);
        }
    }

    private final void Rc(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z2) {
        if (node == null) {
            NC9(hitTestSource, j2, hitTestResult, i2, z2);
            return;
        }
        int i3 = hitTestResult.hitDepth;
        hitTestResult.XQ(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.ty(node);
        hitTestResult.distanceFromEdgeAndFlags.nr(HitTestResultKt.n(-1.0f, z2, false));
        Rc(NodeCoordinatorKt.nr(node, hitTestSource.n(), NodeKind.n(2)), hitTestSource, j2, hitTestResult, i2, z2);
        hitTestResult.hitDepth = i3;
    }

    private final void UR(Modifier.Node node, HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, int i2, boolean z2, float f3) {
        if (node == null) {
            NC9(hitTestSource, j2, hitTestResult, i2, z2);
            return;
        }
        int i3 = hitTestResult.hitDepth;
        hitTestResult.XQ(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.ty(node);
        hitTestResult.distanceFromEdgeAndFlags.nr(HitTestResultKt.n(f3, z2, false));
        R3E(NodeCoordinatorKt.nr(node, hitTestSource.n(), NodeKind.n(2)), hitTestSource, j2, hitTestResult, i2, z2, f3, true);
        hitTestResult.hitDepth = i3;
    }

    private final Function2 c() {
        Function2 function2 = this._drawBlock;
        if (function2 != null) {
            return function2;
        }
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
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
                NodeCoordinator nodeCoordinator = this.f32593n;
                Canvas canvas = nodeCoordinator.drawBlockCanvas;
                Intrinsics.checkNotNull(canvas);
                nodeCoordinator.wYi(canvas, this.f32593n.drawBlockParentLayer);
            }
        };
        Function2<Canvas, GraphicsLayer, Unit> function22 = new Function2<Canvas, GraphicsLayer, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas, GraphicsLayer graphicsLayer) {
                n(canvas, graphicsLayer);
                return Unit.INSTANCE;
            }

            public final void n(Canvas canvas, GraphicsLayer graphicsLayer) {
                if (!this.f32591n.getLayoutNode().HI()) {
                    this.f32591n.lastLayerDrawingWasSkipped = true;
                    return;
                }
                this.f32591n.drawBlockCanvas = canvas;
                this.f32591n.drawBlockParentLayer = graphicsLayer;
                this.f32591n.sFO().xMQ(this.f32591n, NodeCoordinator.pJg, function0);
                this.f32591n.lastLayerDrawingWasSkipped = false;
            }
        };
        this._drawBlock = function22;
        return function22;
    }

    static /* synthetic */ boolean c2(NodeCoordinator nodeCoordinator, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return nodeCoordinator.sYH(z2);
    }

    public static /* synthetic */ void kR(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z2, boolean z3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        nodeCoordinator.cAB(mutableRect, z2, z3);
    }

    private final long ni(long pointerPosition) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat < 0.0f ? -fIntBitsToFloat : fIntBitsToFloat - mYa());
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerPosition & 4294967295L));
        return Offset.O((((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 < 0.0f ? -fIntBitsToFloat2 : fIntBitsToFloat2 - n1()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32));
    }

    private final boolean sYH(boolean invokeOnLayoutChange) {
        Owner owner;
        if (this.explicitLayer != null) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            if (!(this.layerBlock == null)) {
                InlineClassHelperKt.t("null layer with a non-null layerBlock");
            }
            return false;
        }
        final Function1 function1 = this.layerBlock;
        if (function1 == null) {
            InlineClassHelperKt.nr("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = ofS;
        reusableGraphicsLayerScope.v();
        reusableGraphicsLayerScope.Xw(getLayoutNode().getDensity());
        reusableGraphicsLayerScope.jB(getLayoutNode().getLayoutDirection());
        reusableGraphicsLayerScope.U(IntSizeKt.O(n()));
        sFO().xMQ(this, xg, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
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
                function1.invoke(NodeCoordinator.ofS);
                NodeCoordinator.ofS.P5();
            }
        });
        LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
        if (layerPositionalProperties == null) {
            layerPositionalProperties = new LayerPositionalProperties();
            this.layerPositionalProperties = layerPositionalProperties;
        }
        LayerPositionalProperties layerPositionalProperties2 = f32573C;
        layerPositionalProperties2.rl(layerPositionalProperties);
        layerPositionalProperties.n(reusableGraphicsLayerScope);
        ownedLayer.KN(reusableGraphicsLayerScope);
        boolean z2 = this.isClipping;
        this.isClipping = reusableGraphicsLayerScope.getClip();
        this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
        boolean zT2 = layerPositionalProperties2.t(layerPositionalProperties);
        boolean z3 = !zT2;
        if (invokeOnLayoutChange && ((!zT2 || z2 != this.isClipping) && (owner = getLayoutNode().getOwner()) != null)) {
            owner.gh(getLayoutNode());
        }
        return z3;
    }

    private final NodeCoordinator u2n(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator nodeCoordinatorRl;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (nodeCoordinatorRl = lookaheadLayoutCoordinates.rl()) != null) {
            return nodeCoordinatorRl;
        }
        Intrinsics.checkNotNull(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    private final void w(NodeCoordinator ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.w(ancestor, rect, clipBounds);
        }
        gxH(rect, clipBounds);
    }

    public static /* synthetic */ long yA(NodeCoordinator nodeCoordinator, long j2, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return nodeCoordinator.n7u(j2, z2);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    /* JADX INFO: renamed from: A, reason: from getter */
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final void Ai(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: Aum, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    public final void Bha(boolean z2) {
        this.forceMeasureWithLookaheadConstraints = z2;
    }

    public final void ENe(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    @Override // androidx.compose.ui.layout.Placeable
    protected void F(long position, float zIndex, Function1 layerBlock) {
        if (!this.forcePlaceWithLookaheadOffset) {
            G(position, zIndex, layerBlock, null);
            return;
        }
        LookaheadDelegate lookaheadDelegateRR = getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        G(lookaheadDelegateRR.getPosition(), zIndex, layerBlock, null);
    }

    public final void GT() {
        if (this.layer != null || this.layerBlock == null) {
            return;
        }
        OwnedLayer ownedLayerTy = Owner.ty(LayoutNodeKt.rl(getLayoutNode()), c(), this.invalidateParentLayer, this.explicitLayer, false, 8, null);
        ownedLayerTy.nr(getMeasuredSize());
        ownedLayerTy.mUb(getPosition());
        ownedLayerTy.invalidate();
        this.layer = ownedLayerTy;
    }

    public final void H6M(boolean z2) {
        this.forcePlaceWithLookaheadOffset = z2;
    }

    public final long MPw() {
        return this.layerDensity.M(getLayoutNode().getViewConfiguration().O());
    }

    public void NC9(HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.W5k(hitTestSource, yA(nodeCoordinator, pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
        }
    }

    /* JADX INFO: renamed from: Of6, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    /* JADX INFO: renamed from: Sax, reason: from getter */
    public final boolean getForceMeasureWithLookaheadConstraints() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    protected final MutableRect V5F() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void VK2() {
        if (Qg8(NodeKind.n(1048576))) {
            int iN = NodeKind.n(1048576);
            boolean zXMQ = NodeKindKt.xMQ(iN);
            Modifier.Node nodeJI = JI();
            if (!zXMQ && (nodeJI = nodeJI.getParent()) == null) {
                return;
            }
            for (Modifier.Node nodeGRh = GRh(zXMQ); nodeGRh != null && (nodeGRh.getAggregateChildKindSet() & iN) != 0; nodeGRh = nodeGRh.getChild()) {
                if ((nodeGRh.getKindSet() & iN) != 0) {
                    ?? KN = nodeGRh;
                    ?? mutableVector = 0;
                    while (KN != 0) {
                        if (KN instanceof OnUnplacedModifierNode) {
                            ((OnUnplacedModifierNode) KN).GH3();
                        } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                            Modifier.Node nodeW5k = ((DelegatingNode) KN).getDelegate();
                            int i2 = 0;
                            KN = KN;
                            mutableVector = mutableVector;
                            while (nodeW5k != null) {
                                if ((nodeW5k.getKindSet() & iN) != 0) {
                                    i2++;
                                    mutableVector = mutableVector;
                                    if (i2 == 1) {
                                        KN = nodeW5k;
                                    } else {
                                        if (mutableVector == 0) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (KN != 0) {
                                            mutableVector.rl(KN);
                                            KN = 0;
                                        }
                                        mutableVector.rl(nodeW5k);
                                    }
                                }
                                nodeW5k = nodeW5k.getChild();
                                KN = KN;
                                mutableVector = mutableVector;
                            }
                            if (i2 == 1) {
                            }
                        }
                        KN = DelegatableNodeKt.KN(mutableVector);
                    }
                }
                if (nodeGRh == nodeJI) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean Vvq() {
        return (this.layer == null || this.released || !getLayoutNode().nr()) ? false : true;
    }

    @Override // androidx.compose.ui.layout.Placeable
    protected void W(long position, float zIndex, GraphicsLayer layer) {
        if (!this.forcePlaceWithLookaheadOffset) {
            G(position, zIndex, null, layer);
            return;
        }
        LookaheadDelegate lookaheadDelegateRR = getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegateRR);
        G(lookaheadDelegateRR.getPosition(), zIndex, null, layer);
    }

    protected final boolean W1c(long pointerPosition) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerPosition & 4294967295L));
        return fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < ((float) mYa()) && fIntBitsToFloat2 < ((float) n1());
    }

    public void WKb() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable X4T() {
        return this.wrapped;
    }

    /* JADX INFO: renamed from: XUb, reason: from getter */
    public final OwnedLayer getLayer() {
        return this.layer;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void YE(MeasureResult measureResult) {
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.getF32270n() != measureResult2.getF32270n() || measureResult.getRl() != measureResult2.getRl()) {
                jE(measureResult.getF32270n(), measureResult.getRl());
            }
            MutableObjectIntMap mutableObjectIntMap = this.oldAlignmentLines;
            if (mutableObjectIntMap != null) {
                Intrinsics.checkNotNull(mutableObjectIntMap);
                if (!mutableObjectIntMap.KN()) {
                    if (measureResult.getF32271t().isEmpty()) {
                        return;
                    }
                }
            }
            if (NodeCoordinatorKt.t(this.oldAlignmentLines, measureResult.getF32271t())) {
                return;
            }
            YiW().getAlignmentLines().az();
            MutableObjectIntMap mutableObjectIntMapRl = this.oldAlignmentLines;
            if (mutableObjectIntMapRl == null) {
                mutableObjectIntMapRl = ObjectIntMapKt.rl();
                this.oldAlignmentLines = mutableObjectIntMapRl;
            }
            mutableObjectIntMapRl.mUb();
            for (Map.Entry entry : measureResult.getF32271t().entrySet()) {
                mutableObjectIntMapRl.XQ(entry.getKey(), ((Number) entry.getValue()).intValue());
            }
        }
    }

    public void Yq(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.fq(canvas, graphicsLayer);
        }
    }

    public final void ZwA() {
        fwz(this.layerBlock, true);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void b() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.destroy();
        }
        this.layer = null;
    }

    public final void cAB(MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jMPw = MPw();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jMPw >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMPw & 4294967295L)) / 2.0f;
                    bounds.O(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (n() >> 32)) + fIntBitsToFloat, ((int) (4294967295L & n())) + fIntBitsToFloat2);
                } else if (clipBounds) {
                    bounds.O(0.0f, 0.0f, (int) (n() >> 32), (int) (4294967295L & n()));
                }
                if (bounds.J2()) {
                    return;
                }
            }
            ownedLayer.J2(bounds, false);
        }
        float fGh = IntOffset.gh(getPosition());
        bounds.xMQ(bounds.getLeft() + fGh);
        bounds.mUb(bounds.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() + fGh);
        float fQie = IntOffset.qie(getPosition());
        bounds.gh(bounds.getTop() + fQie);
        bounds.KN(bounds.getBottom() + fQie);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long e(LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (sourceCoordinates instanceof LookaheadLayoutCoordinates) {
            ((LookaheadLayoutCoordinates) sourceCoordinates).rl().Vd();
            return Offset.O(sourceCoordinates.e(this, Offset.O(relativeToSource ^ (-9223372034707292160L)), includeMotionFrameOfReference) ^ (-9223372034707292160L));
        }
        NodeCoordinator nodeCoordinatorU2n = u2n(sourceCoordinates);
        nodeCoordinatorU2n.Vd();
        NodeCoordinator nodeCoordinatorLRt = lRt(nodeCoordinatorU2n);
        while (nodeCoordinatorU2n != nodeCoordinatorLRt) {
            relativeToSource = nodeCoordinatorU2n.q(relativeToSource, includeMotionFrameOfReference);
            nodeCoordinatorU2n = nodeCoordinatorU2n.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinatorU2n);
        }
        return HFS(nodeCoordinatorLRt, relativeToSource, includeMotionFrameOfReference);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void eOa() {
        int iN = NodeKind.n(128);
        boolean zXMQ = NodeKindKt.xMQ(iN);
        Modifier.Node nodeJI = JI();
        if (!zXMQ && (nodeJI = nodeJI.getParent()) == null) {
            return;
        }
        for (Modifier.Node nodeGRh = GRh(zXMQ); nodeGRh != null && (nodeGRh.getAggregateChildKindSet() & iN) != 0; nodeGRh = nodeGRh.getChild()) {
            if ((nodeGRh.getKindSet() & iN) != 0) {
                ?? KN = nodeGRh;
                ?? mutableVector = 0;
                while (KN != 0) {
                    if (KN instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) KN).o(this);
                    } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                        Modifier.Node nodeW5k = ((DelegatingNode) KN).getDelegate();
                        int i2 = 0;
                        KN = KN;
                        mutableVector = mutableVector;
                        while (nodeW5k != null) {
                            if ((nodeW5k.getKindSet() & iN) != 0) {
                                i2++;
                                mutableVector = mutableVector;
                                if (i2 == 1) {
                                    KN = nodeW5k;
                                } else {
                                    if (mutableVector == 0) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (KN != 0) {
                                        mutableVector.rl(KN);
                                        KN = 0;
                                    }
                                    mutableVector.rl(nodeW5k);
                                }
                            }
                            nodeW5k = nodeW5k.getChild();
                            KN = KN;
                            mutableVector = mutableVector;
                        }
                        if (i2 == 1) {
                        }
                    }
                    KN = DelegatableNodeKt.KN(mutableVector);
                }
            }
            if (nodeGRh == nodeJI) {
                return;
            }
        }
    }

    protected final long eb(long minimumTouchTargetSize) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) - mYa();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (minimumTouchTargetSize & 4294967295L)) - n1();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return Size.nr((((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    public void ex() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.ex();
        }
    }

    public final void fq(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.O(canvas, graphicsLayer);
            return;
        }
        float fGh = IntOffset.gh(getPosition());
        float fQie = IntOffset.qie(getPosition());
        canvas.nr(fGh, fQie);
        wYi(canvas, graphicsLayer);
        canvas.nr(-fGh, -fQie);
    }

    protected void hu(long j2) {
        this.position = j2;
    }

    /* JADX INFO: renamed from: iu, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    protected void jE(int width, int height) {
        NodeCoordinator nodeCoordinator;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.nr(IntSize.t((((long) width) << 32) | (((long) height) & 4294967295L)));
        } else if (getLayoutNode().HI() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.ex();
        }
        QZ6(IntSize.t((((long) height) & 4294967295L) | (((long) width) << 32)));
        if (this.layerBlock != null) {
            sYH(false);
        }
        int iN = NodeKind.n(4);
        boolean zXMQ = NodeKindKt.xMQ(iN);
        Modifier.Node nodeJI = JI();
        if (zXMQ || (nodeJI = nodeJI.getParent()) != null) {
            for (Modifier.Node nodeGRh = GRh(zXMQ); nodeGRh != null && (nodeGRh.getAggregateChildKindSet() & iN) != 0; nodeGRh = nodeGRh.getChild()) {
                if ((nodeGRh.getKindSet() & iN) != 0) {
                    ?? KN = nodeGRh;
                    ?? mutableVector = 0;
                    while (KN != 0) {
                        if (KN instanceof DrawModifierNode) {
                            ((DrawModifierNode) KN).j();
                        } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                            Modifier.Node nodeW5k = ((DelegatingNode) KN).getDelegate();
                            int i2 = 0;
                            KN = KN;
                            mutableVector = mutableVector;
                            while (nodeW5k != null) {
                                if ((nodeW5k.getKindSet() & iN) != 0) {
                                    i2++;
                                    mutableVector = mutableVector;
                                    if (i2 == 1) {
                                        KN = nodeW5k;
                                    } else {
                                        if (mutableVector == 0) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (KN != 0) {
                                            mutableVector.rl(KN);
                                            KN = 0;
                                        }
                                        mutableVector.rl(nodeW5k);
                                    }
                                }
                                nodeW5k = nodeW5k.getChild();
                                KN = KN;
                                mutableVector = mutableVector;
                            }
                            if (i2 == 1) {
                            }
                        }
                        KN = DelegatableNodeKt.KN(mutableVector);
                    }
                }
                if (nodeGRh == nodeJI) {
                    break;
                }
            }
        }
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.gh(getLayoutNode());
        }
    }

    /* JADX INFO: renamed from: jX, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    /* JADX INFO: renamed from: kQ, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void lNy() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            W(getPosition(), this.zIndex, graphicsLayer);
        } else {
            F(getPosition(), this.zIndex, this.layerBlock);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final boolean lvn() {
        Modifier.Node nodeGRh = GRh(NodeKindKt.xMQ(NodeKind.n(16)));
        if (nodeGRh != null && nodeGRh.getIsAttached()) {
            int iN = NodeKind.n(16);
            if (!nodeGRh.getNode().getIsAttached()) {
                InlineClassHelperKt.t("visitLocalDescendants called on an unattached node");
            }
            Modifier.Node node = nodeGRh.getNode();
            if ((node.getAggregateChildKindSet() & iN) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & iN) != 0) {
                        ?? KN = node;
                        ?? mutableVector = 0;
                        while (KN != 0) {
                            if (KN instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) KN).q9()) {
                                    return true;
                                }
                            } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                                Modifier.Node nodeW5k = ((DelegatingNode) KN).getDelegate();
                                int i2 = 0;
                                KN = KN;
                                mutableVector = mutableVector;
                                while (nodeW5k != null) {
                                    if ((nodeW5k.getKindSet() & iN) != 0) {
                                        i2++;
                                        mutableVector = mutableVector;
                                        if (i2 == 1) {
                                            KN = nodeW5k;
                                        } else {
                                            if (mutableVector == 0) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (KN != 0) {
                                                mutableVector.rl(KN);
                                                KN = 0;
                                            }
                                            mutableVector.rl(nodeW5k);
                                        }
                                    }
                                    nodeW5k = nodeW5k.getChild();
                                    KN = KN;
                                    mutableVector = mutableVector;
                                }
                                if (i2 == 1) {
                                }
                            }
                            KN = DelegatableNodeKt.KN(mutableVector);
                        }
                    }
                    node = node.getChild();
                }
            }
        }
        return false;
    }

    public long n7u(long position, boolean includeMotionFrameOfReference) {
        if (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) {
            position = IntOffsetKt.rl(position, getPosition());
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.rl(position, true) : position;
    }

    public final boolean pr() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.pr();
        }
        return false;
    }

    public long q(long position, boolean includeMotionFrameOfReference) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.rl(position, false);
        }
        return (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) ? IntOffsetKt.t(position, getPosition()) : position;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult uG() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable v0j() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean xVH() {
        return this._measureResult != null;
    }

    public final void yUZ() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            Q(this, null, false, 2, null);
            LayoutNode.xzo(getLayoutNode(), false, 1, null);
        }
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node GRh(boolean includeTail) {
        Modifier.Node nodeJI;
        if (getLayoutNode().n1() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator == null || (nodeJI = nodeCoordinator.JI()) == null) {
                return null;
            }
            return nodeJI.getChild();
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null) {
            return null;
        }
        return nodeCoordinator2.JI();
    }

    private final boolean Qg8(int type) {
        Modifier.Node nodeGRh = GRh(NodeKindKt.xMQ(type));
        if (nodeGRh == null || !DelegatableNodeKt.J2(nodeGRh, type)) {
            return false;
        }
        return true;
    }

    private final void ep(NodeCoordinator ancestor, float[] matrix) {
        if (!Intrinsics.areEqual(ancestor, this)) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
            nodeCoordinator.ep(ancestor, matrix);
            if (!IntOffset.mUb(getPosition(), IntOffset.INSTANCE.rl())) {
                float[] fArr = Mx;
                Matrix.KN(fArr);
                Matrix.HI(fArr, -IntOffset.gh(getPosition()), -IntOffset.qie(getPosition()), 0.0f, 4, null);
                Matrix.qie(matrix, fArr);
            }
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.xMQ(matrix);
            }
        }
    }

    private final void gxH(MutableRect bounds, boolean clipBounds) {
        float fGh = IntOffset.gh(getPosition());
        bounds.xMQ(bounds.getLeft() - fGh);
        bounds.mUb(bounds.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - fGh);
        float fQie = IntOffset.qie(getPosition());
        bounds.gh(bounds.getTop() - fQie);
        bounds.KN(bounds.getBottom() - fQie);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.J2(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.O(0.0f, 0.0f, (int) (n() >> 32), (int) (n() & 4294967295L));
                bounds.J2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver sFO() {
        return LayoutNodeKt.rl(getLayoutNode()).getSnapshotObserver();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long B(long relativeToLocal) {
        return LayoutNodeKt.rl(getLayoutNode()).J2(xg(relativeToLocal));
    }

    protected final void C7B(Canvas canvas, Paint paint) {
        canvas.Uo(0.5f, 0.5f, ((int) (getMeasuredSize() >> 32)) - 0.5f, ((int) (getMeasuredSize() & 4294967295L)) - 0.5f, paint);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect I(LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        if (!nr()) {
            InlineClassHelperKt.t("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sourceCoordinates.nr()) {
            InlineClassHelperKt.t("LayoutCoordinates " + sourceCoordinates + " is not attached!");
        }
        NodeCoordinator nodeCoordinatorU2n = u2n(sourceCoordinates);
        nodeCoordinatorU2n.Vd();
        NodeCoordinator nodeCoordinatorLRt = lRt(nodeCoordinatorU2n);
        MutableRect mutableRectV5F = V5F();
        mutableRectV5F.xMQ(0.0f);
        mutableRectV5F.gh(0.0f);
        mutableRectV5F.mUb((int) (sourceCoordinates.n() >> 32));
        mutableRectV5F.KN((int) (sourceCoordinates.n() & 4294967295L));
        NodeCoordinator nodeCoordinator = nodeCoordinatorU2n;
        while (nodeCoordinator != nodeCoordinatorLRt) {
            boolean z2 = clipBounds;
            kR(nodeCoordinator, mutableRectV5F, z2, false, 4, null);
            if (mutableRectV5F.J2()) {
                return Rect.INSTANCE.n();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
            clipBounds = z2;
        }
        w(nodeCoordinatorLRt, mutableRectV5F, clipBounds);
        return MutableRectKt.n(mutableRectV5F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    /* JADX INFO: renamed from: J2 */
    public Object getParentData() {
        if (!getLayoutNode().getNodes().Ik(NodeKind.n(64))) {
            return null;
        }
        JI();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Modifier.Node nodeCk = getLayoutNode().getNodes().getTail(); nodeCk != null; nodeCk = nodeCk.getParent()) {
            if ((NodeKind.n(64) & nodeCk.getKindSet()) != 0) {
                int iN = NodeKind.n(64);
                ?? mutableVector = 0;
                ?? KN = nodeCk;
                while (KN != 0) {
                    if (KN instanceof ParentDataModifierNode) {
                        objectRef.element = ((ParentDataModifierNode) KN).Xw(getLayoutNode().getDensity(), objectRef.element);
                    } else if ((KN.getKindSet() & iN) != 0 && (KN instanceof DelegatingNode)) {
                        Modifier.Node nodeW5k = ((DelegatingNode) KN).getDelegate();
                        int i2 = 0;
                        KN = KN;
                        mutableVector = mutableVector;
                        while (nodeW5k != null) {
                            if ((nodeW5k.getKindSet() & iN) != 0) {
                                i2++;
                                mutableVector = mutableVector;
                                if (i2 == 1) {
                                    KN = nodeW5k;
                                } else {
                                    if (mutableVector == 0) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (KN != 0) {
                                        mutableVector.rl(KN);
                                        KN = 0;
                                    }
                                    mutableVector.rl(nodeW5k);
                                }
                            }
                            nodeW5k = nodeW5k.getChild();
                            KN = KN;
                            mutableVector = mutableVector;
                        }
                        if (i2 == 1) {
                        }
                    }
                    KN = DelegatableNodeKt.KN(mutableVector);
                }
            }
        }
        return objectRef.element;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public void U(LayoutCoordinates sourceCoordinates, float[] matrix) {
        NodeCoordinator nodeCoordinatorU2n = u2n(sourceCoordinates);
        nodeCoordinatorU2n.Vd();
        NodeCoordinator nodeCoordinatorLRt = lRt(nodeCoordinatorU2n);
        Matrix.KN(matrix);
        nodeCoordinatorU2n.X6(nodeCoordinatorLRt, matrix);
        ep(nodeCoordinatorLRt, matrix);
    }

    public final void Vd() {
        getLayoutNode().getLayoutDelegate().N();
    }

    protected final float Xli(long pointerPosition, long minimumTouchTargetSize) {
        if (mYa() >= Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) && n1() >= Float.intBitsToFloat((int) (minimumTouchTargetSize & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jEb = eb(minimumTouchTargetSize);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jEb >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jEb & 4294967295L));
        long jNi = ni(pointerPosition);
        if ((fIntBitsToFloat <= 0.0f && fIntBitsToFloat2 <= 0.0f) || Float.intBitsToFloat((int) (jNi >> 32)) > fIntBitsToFloat || Float.intBitsToFloat((int) (jNi & 4294967295L)) > fIntBitsToFloat2) {
            return Float.POSITIVE_INFINITY;
        }
        return Offset.qie(jNi);
    }

    public AlignmentLinesOwner YiW() {
        return getLayoutNode().getLayoutDelegate().t();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public void a(float[] matrix) {
        Owner ownerRl = LayoutNodeKt.rl(getLayoutNode());
        NodeCoordinator nodeCoordinatorU2n = u2n(LayoutCoordinatesKt.nr(this));
        X6(nodeCoordinatorU2n, matrix);
        if (ownerRl instanceof MatrixPositionCalculator) {
            ((MatrixPositionCalculator) ownerRl).Ik(matrix);
            return;
        }
        long jKN = LayoutCoordinatesKt.KN(nodeCoordinatorU2n);
        if ((9223372034707292159L & jKN) != 9205357640488583168L) {
            Matrix.ty(matrix, Float.intBitsToFloat((int) (jKN >> 32)), Float.intBitsToFloat((int) (jKN & 4294967295L)), 0.0f);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long aYN(long relativeToLocal) {
        if (!nr()) {
            InlineClassHelperKt.t("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return LayoutNodeKt.rl(getLayoutNode()).aYN(xg(relativeToLocal));
    }

    public final void f11(long position, float zIndex, Function1 layerBlock, GraphicsLayer layer) {
        G(IntOffset.HI(position, getApparentToRealOffset()), zIndex, layerBlock, layer);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean fD() {
        return getIsPlacedUnderMotionFrameOfReference();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long jB(long relativeToWindow) {
        if (!nr()) {
            InlineClassHelperKt.t("LayoutCoordinate operations are only valid when isAttached is true");
        }
        LayoutCoordinates layoutCoordinatesNr = LayoutCoordinatesKt.nr(this);
        return nHg(layoutCoordinatesNr, Offset.ck(LayoutNodeKt.rl(getLayoutNode()).g(relativeToWindow), LayoutCoordinatesKt.J2(layoutCoordinatesNr)));
    }

    public final NodeCoordinator lRt(NodeCoordinator other) {
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node nodeJI = other.JI();
            Modifier.Node nodeJI2 = JI();
            int iN = NodeKind.n(2);
            if (!nodeJI2.getNode().getIsAttached()) {
                InlineClassHelperKt.t("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node parent = nodeJI2.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & iN) != 0 && parent == nodeJI) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.mYa();
            Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.mYa();
            Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.mYa();
            layoutNode2 = layoutNode2.mYa();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != other.getLayoutNode()) {
                return layoutNode.E();
            }
            return other;
        }
        return this;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long n() {
        return getMeasuredSize();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean nr() {
        return JI().getIsAttached();
    }

    public final Rect p() {
        if (!nr()) {
            return Rect.INSTANCE.n();
        }
        LayoutCoordinates layoutCoordinatesNr = LayoutCoordinatesKt.nr(this);
        MutableRect mutableRectV5F = V5F();
        long jEb = eb(MPw());
        int i2 = (int) (jEb >> 32);
        mutableRectV5F.xMQ(-Float.intBitsToFloat(i2));
        int i3 = (int) (jEb & 4294967295L);
        mutableRectV5F.gh(-Float.intBitsToFloat(i3));
        mutableRectV5F.mUb(mYa() + Float.intBitsToFloat(i2));
        mutableRectV5F.KN(n1() + Float.intBitsToFloat(i3));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesNr) {
            nodeCoordinator.cAB(mutableRectV5F, false, true);
            if (mutableRectV5F.J2()) {
                return Rect.INSTANCE.n();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.checkNotNull(nodeCoordinator);
        }
        return MutableRectKt.n(mutableRectV5F);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates piY() {
        if (!nr()) {
            InlineClassHelperKt.t("LayoutCoordinate operations are only valid when isAttached is true");
        }
        Vd();
        return getLayoutNode().n1().wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long r(long relativeToScreen) {
        if (!nr()) {
            InlineClassHelperKt.t("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return nHg(LayoutCoordinatesKt.nr(this), LayoutNodeKt.rl(getLayoutNode()).r(relativeToScreen));
    }

    public final Modifier.Node tdZ(int type) {
        boolean zXMQ = NodeKindKt.xMQ(type);
        Modifier.Node nodeJI = JI();
        if (zXMQ || (nodeJI = nodeJI.getParent()) != null) {
            for (Modifier.Node nodeGRh = GRh(zXMQ); nodeGRh != null && (nodeGRh.getAggregateChildKindSet() & type) != 0; nodeGRh = nodeGRh.getChild()) {
                if ((nodeGRh.getKindSet() & type) != 0) {
                    return nodeGRh;
                }
                if (nodeGRh == nodeJI) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates v() {
        if (!nr()) {
            InlineClassHelperKt.t("LayoutCoordinate operations are only valid when isAttached is true");
        }
        Vd();
        return this.wrappedBy;
    }

    public final long x() {
        return getMeasurementConstraints();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long xg(long relativeToLocal) {
        if (!nr()) {
            InlineClassHelperKt.t("LayoutCoordinate operations are only valid when isAttached is true");
        }
        Vd();
        long jHq = relativeToLocal;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            jHq = Hq(nodeCoordinator, jHq, false, 2, null);
        }
        return jHq;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: yAc */
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    protected final boolean eF0(long pointerPosition) {
        if ((((9187343241974906880L ^ (pointerPosition & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null && this.isClipping && !ownedLayer.Uo(pointerPosition)) {
            return false;
        }
        return true;
    }
}
