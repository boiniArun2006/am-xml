package androidx.compose.ui.viewinterop;

import GJW.C;
import GJW.vd;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.C1561ViewTreeLifecycleOwner;
import androidx.view.C1639ViewTreeSavedStateRegistryOwner;
import androidx.view.LifecycleOwner;
import androidx.view.SavedStateRegistryOwner;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 è\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002é\u0001B9\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\u001cJ7\u0010)\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0014¢\u0006\u0004\b)\u0010*J\u0011\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020$H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001aH\u0014¢\u0006\u0004\b1\u0010\u001cJ\u000f\u00102\u001a\u00020\u001aH\u0014¢\u0006\u0004\b2\u0010\u001cJ%\u00108\u001a\u0004\u0018\u0001072\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u001a¢\u0006\u0004\b>\u0010\u001cJ\u0017\u0010@\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\nH\u0014¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u00020$2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020$H\u0016¢\u0006\u0004\bF\u0010GJ/\u0010J\u001a\u00020$2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010MJ/\u0010N\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010OJ\u001f\u0010P\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010QJG\u0010W\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010V\u001a\u000203H\u0016¢\u0006\u0004\bW\u0010XJ?\u0010Y\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\bY\u0010ZJ7\u0010]\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010[\u001a\u00020\n2\u0006\u0010\\\u001a\u00020\n2\u0006\u0010V\u001a\u0002032\u0006\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\b]\u0010^J/\u0010b\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020_2\u0006\u0010V\u001a\u00020$H\u0016¢\u0006\u0004\bb\u0010cJ'\u0010d\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020_H\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020$H\u0016¢\u0006\u0004\bf\u0010GJ\u001f\u0010j\u001a\u00020h2\u0006\u0010g\u001a\u00020\u000e2\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ'\u0010o\u001a\u00020\n2\u0006\u0010l\u001a\u00020\n2\u0006\u0010m\u001a\u00020\n2\u0006\u0010n\u001a\u00020\nH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020h2\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020s2\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bu\u0010vJ3\u0010|\u001a\u00020w*\u00020w2\u0006\u0010x\u001a\u00020\n2\u0006\u0010y\u001a\u00020\n2\u0006\u0010z\u001a\u00020\n2\u0006\u0010{\u001a\u00020\nH\u0002¢\u0006\u0004\b|\u0010}R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010~R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u007fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R?\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00012\u000e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00018\u0006@DX\u0086\u000e¢\u0006\u0017\n\u0005\b'\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008f\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R@\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00012\u000e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0087\u0001\u001a\u0006\b\u0092\u0001\u0010\u0089\u0001\"\u0006\b\u0093\u0001\u0010\u008b\u0001R?\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00012\u000e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00018\u0006@DX\u0086\u000e¢\u0006\u0017\n\u0005\bu\u0010\u0087\u0001\u001a\u0006\b\u0095\u0001\u0010\u0089\u0001\"\u0006\b\u0096\u0001\u0010\u008b\u0001R3\u0010\u009e\u0001\u001a\u00030\u0098\u00012\b\u0010\u0086\u0001\u001a\u00030\u0098\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bo\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R8\u0010¥\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u009f\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b#\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R4\u0010\u00ad\u0001\u001a\u00030¦\u00012\b\u0010\u0086\u0001\u001a\u00030¦\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R9\u0010±\u0001\u001a\u0012\u0012\u0005\u0012\u00030¦\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u009f\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010 \u0001\u001a\u0006\b¯\u0001\u0010¢\u0001\"\u0006\b°\u0001\u0010¤\u0001R7\u0010¸\u0001\u001a\u0005\u0018\u00010²\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010²\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bg\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R8\u0010À\u0001\u001a\u0005\u0018\u00010¹\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010¹\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R\u0017\u0010Ã\u0001\u001a\u0002038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R \u0010Ç\u0001\u001a\u00030Ä\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001a\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u001e\u0010Ë\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010\u0087\u0001R\u001e\u0010Í\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010\u0087\u0001R8\u0010Ñ\u0001\u001a\u0011\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u009f\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÎ\u0001\u0010 \u0001\u001a\u0006\bÏ\u0001\u0010¢\u0001\"\u0006\bÐ\u0001\u0010¤\u0001R\u0016\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Â\u0001R\u0018\u0010Ô\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÓ\u0001\u0010~R\u0018\u0010Ö\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÕ\u0001\u0010~R\u0018\u0010Ú\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0019\u0010Û\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010\u008e\u0001R\u001d\u0010á\u0001\u001a\u00030Ü\u00018\u0006¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001R\u0016\u0010ã\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010GR\u0018\u0010ç\u0001\u001a\u00030ä\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ê\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "", "compositeKeyHash", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroid/view/View;", "view", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "qie", "()V", "Uo", "t", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "e", "", "changed", CmcdData.STREAM_TYPE_LIVE, "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "iF", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", TtmlNode.TAG_REGION, "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "HI", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "xMQ", "(Landroid/view/View;Landroid/view/View;II)V", "mUb", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "az", "(Landroid/view/View;IIIII[I)V", "ty", "(Landroid/view/View;IIIII)V", "dx", "dy", "gh", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "v", "Landroidx/core/view/WindowInsetsCompat;", "insets", c.f62177j, "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "min", "max", "preferred", "E2", "(III)I", "te", "(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "bounds", "g", "(Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;)Landroidx/core/view/WindowInsetsAnimationCompat$BoundsCompat;", "Landroidx/core/graphics/Insets;", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "nY", "(Landroidx/core/graphics/Insets;IIII)Landroidx/core/graphics/Insets;", "I", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "O", "Landroid/view/View;", "getView", "J2", "Landroidx/compose/ui/node/Owner;", "Lkotlin/Function0;", "value", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "update", "o", "Z", "hasUpdateBlock", "<set-?>", "S", "getReset", "setReset", "reset", "getRelease", "setRelease", "release", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "modifier", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "Landroidx/compose/ui/unit/Density;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "density", "N", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "Xw", "Landroidx/savedstate/SavedStateRegistryOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "savedStateRegistryOwner", "jB", "[I", "position", "Landroidx/compose/ui/unit/IntSize;", "U", "J", "size", "P5", "Landroidx/core/view/WindowInsetsCompat;", "M7", "runUpdate", "p5", "runInvalidate", "eF", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "E", "M", "lastWidthMeasureSpec", "FX", "lastHeightMeasureSpec", "Landroidx/core/view/NestedScrollingParentHelper;", "B", "Landroidx/core/view/NestedScrollingParentHelper;", "nestedScrollingParentHelper", "isDrawing", "Landroidx/compose/ui/node/LayoutNode;", "D", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Vvq", "isValidOwnerScope", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,737:1\n677#1,6:776\n683#1,2:783\n685#1:791\n686#1:802\n687#1,7:807\n677#1,6:814\n683#1,2:821\n685#1:829\n686#1:840\n687#1,7:845\n1#2:738\n56#3,5:739\n30#4:744\n30#4:748\n30#4:758\n30#4:762\n30#4:766\n30#4:803\n30#4:841\n30#4:866\n53#5,3:745\n53#5,3:749\n60#5:753\n70#5:756\n53#5,3:759\n53#5,3:763\n53#5,3:767\n60#5:771\n70#5:774\n85#5:787\n90#5:790\n53#5,3:804\n85#5:825\n90#5:828\n53#5,3:842\n85#5:856\n90#5:859\n85#5:862\n90#5:865\n53#5,3:867\n65#6:752\n69#6:755\n65#6:770\n69#6:773\n22#7:754\n22#7:757\n22#7:772\n22#7:775\n105#8:782\n105#8:820\n105#8:852\n105#8:853\n105#8:870\n105#8:871\n105#8:872\n105#8:873\n105#8:874\n105#8:875\n61#9:785\n54#9:786\n63#9:788\n59#9:789\n54#9,10:792\n61#9:823\n54#9:824\n63#9:826\n59#9:827\n54#9,10:830\n61#9:854\n54#9:855\n63#9:857\n59#9:858\n61#9:860\n54#9:861\n63#9:863\n59#9:864\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder\n*L\n668#1:776,6\n668#1:783,2\n668#1:791\n668#1:802\n668#1:807,7\n672#1:814,6\n672#1:821,2\n672#1:829\n672#1:840\n672#1:845,7\n199#1:739,5\n594#1:744\n595#1:748\n612#1:758\n613#1:762\n622#1:766\n668#1:803\n672#1:841\n686#1:866\n594#1:745,3\n595#1:749,3\n598#1:753\n599#1:756\n612#1:759,3\n613#1:763,3\n622#1:767,3\n625#1:771\n626#1:774\n668#1:787\n668#1:790\n668#1:804,3\n672#1:825\n672#1:828\n672#1:842,3\n684#1:856\n684#1:859\n685#1:862\n685#1:865\n686#1:867,3\n598#1:752\n599#1:755\n625#1:770\n626#1:773\n598#1:754\n599#1:757\n625#1:772\n626#1:775\n668#1:782\n672#1:820\n682#1:852\n683#1:853\n687#1:870\n688#1:871\n699#1:872\n700#1:873\n701#1:874\n702#1:875\n668#1:785\n668#1:786\n668#1:788\n668#1:789\n668#1:792,10\n672#1:823\n672#1:824\n672#1:826\n672#1:827\n672#1:830,10\n684#1:854\n684#1:855\n684#1:857\n684#1:858\n685#1:860\n685#1:861\n685#1:863\n685#1:864\n*E\n"})
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final NestedScrollingParentHelper nestedScrollingParentHelper;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final int[] location;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private Modifier modifier;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private int lastHeightMeasureSpec;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean isDrawing;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Owner owner;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private int lastWidthMeasureSpec;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final Function0 runUpdate;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private Function1 onDensityChanged;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private WindowInsetsCompat insets;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Function0 reset;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private Density density;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private SavedStateRegistryOwner savedStateRegistryOwner;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Function1 onModifierChanged;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private Function1 onRequestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Function0 release;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final int[] position;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int compositeKeyHash;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean hasUpdateBlock;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Function0 runInvalidate;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Function0 update;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final NestedScrollDispatcher dispatcher;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f34177I = 8;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private static final Function1 f34176GR = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.f34198n;

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {639, 641}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f34215O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f34216n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f34217t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z2, AndroidViewHolder androidViewHolder, long j2, Continuation continuation) {
            super(2, continuation);
            this.f34217t = z2;
            this.f34215O = androidViewHolder;
            this.J2 = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f34217t, this.f34215O, this.J2, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r4.n(r5, r7, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r1.n(r2, r4, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f34216n;
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (!this.f34217t) {
                    NestedScrollDispatcher nestedScrollDispatcher = this.f34215O.dispatcher;
                    long jN = Velocity.INSTANCE.n();
                    long j2 = this.J2;
                    this.f34216n = 1;
                } else {
                    NestedScrollDispatcher nestedScrollDispatcher2 = this.f34215O.dispatcher;
                    long j3 = this.J2;
                    long jN2 = Velocity.INSTANCE.n();
                    this.f34216n = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {650}, m = "invokeSuspend", n = {}, s = {})
    static final class C15371 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f34218O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f34219n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15371(long j2, Continuation continuation) {
            super(2, continuation);
            this.f34218O = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AndroidViewHolder.this.new C15371(this.f34218O, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((C15371) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f34219n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.dispatcher;
                long j2 = this.f34218O;
                this.f34219n = 1;
                if (nestedScrollDispatcher.t(j2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean HI(View child, View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i2 = iArr[0];
        region.op(i2, iArr[1], i2 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i2, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        this.compositeKeyHash = i2;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.xMQ(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        ViewCompat.K(this, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.2
            {
                super(1);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsAnimationCompat.BoundsCompat J2(WindowInsetsAnimationCompat animation, WindowInsetsAnimationCompat.BoundsCompat bounds) {
                return AndroidViewHolder.this.g(bounds);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsCompat O(WindowInsetsCompat insets, List runningAnimations) {
                return AndroidViewHolder.this.te(insets);
            }
        });
        ViewCompat.Org(this, this);
        this.update = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.reset = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.release = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        Modifier.Companion companion = Modifier.INSTANCE;
        this.modifier = companion;
        this.density = DensityKt.rl(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = IntSize.INSTANCE.n();
        this.runUpdate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
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
                if (this.f34224n.hasUpdateBlock && this.f34224n.isAttachedToWindow()) {
                    ViewParent parent = this.f34224n.getView().getParent();
                    AndroidViewHolder androidViewHolder = this.f34224n;
                    if (parent == androidViewHolder) {
                        androidViewHolder.getSnapshotObserver().xMQ(this.f34224n, AndroidViewHolder.f34176GR, this.f34224n.getUpdate());
                    }
                }
            }
        };
        this.runInvalidate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
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
                this.f34223n.getLayoutNode().ER();
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        final LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.j(true);
        layoutNode.waP(this);
        final Modifier modifierN = OnGloballyPositionedModifierKt.n(DrawModifierKt.rl(GraphicsLayerModifierKt.t(PointerInteropFilter_androidKt.n(SemanticsModifierKt.t(NestedScrollModifierKt.n(companion, AndroidViewHolder_androidKt.f34226n, nestedScrollDispatcher), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                n(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), this), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null), new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                n(drawScope);
                return Unit.INSTANCE;
            }

            public final void n(DrawScope drawScope) {
                AndroidViewHolder androidViewHolder = this.f34211n;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder2 = this;
                Canvas canvasKN = drawScope.getDrawContext().KN();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.isDrawing = true;
                    Owner owner2 = layoutNode2.getOwner();
                    AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                    if (androidComposeView != null) {
                        androidComposeView.mYa(androidViewHolder2, AndroidCanvas_androidKt.nr(canvasKN));
                    }
                    androidViewHolder.isDrawing = false;
                }
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                n(layoutCoordinates);
                return Unit.INSTANCE;
            }

            public final void n(LayoutCoordinates layoutCoordinates) {
                WindowInsets windowInsetsNY;
                AndroidViewHolder_androidKt.J2(this.f34213n, layoutNode);
                this.f34213n.owner.qie(this.f34213n);
                int i3 = this.f34213n.position[0];
                int i5 = this.f34213n.position[1];
                this.f34213n.getView().getLocationOnScreen(this.f34213n.position);
                long j2 = this.f34213n.size;
                this.f34213n.size = layoutCoordinates.n();
                WindowInsetsCompat windowInsetsCompat = this.f34213n.insets;
                if (windowInsetsCompat != null) {
                    if ((i3 == this.f34213n.position[0] && i5 == this.f34213n.position[1] && IntSize.O(j2, this.f34213n.size)) || (windowInsetsNY = this.f34213n.te(windowInsetsCompat).nY()) == null) {
                        return;
                    }
                    this.f34213n.getView().dispatchApplyWindowInsets(windowInsetsNY);
                }
            }
        });
        layoutNode.J2(i2);
        layoutNode.az(this.modifier.Zmq(modifierN));
        this.onModifierChanged = new Function1<Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier) {
                n(modifier);
                return Unit.INSTANCE;
            }

            public final void n(Modifier modifier) {
                layoutNode.az(modifier.Zmq(modifierN));
            }
        };
        layoutNode.O(this.density);
        this.onDensityChanged = new Function1<Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Density density) {
                n(density);
                return Unit.INSTANCE;
            }

            public final void n(Density density) {
                layoutNode.O(density);
            }
        };
        layoutNode.EN(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Owner owner2) {
                n(owner2);
                return Unit.INSTANCE;
            }

            public final void n(Owner owner2) {
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.Mx(this.f34202n, layoutNode);
                }
                ViewParent parent = this.f34202n.getView().getParent();
                AndroidViewHolder androidViewHolder = this.f34202n;
                if (parent != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
            }
        });
        layoutNode.pS(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Owner owner2) {
                n(owner2);
                return Unit.INSTANCE;
            }

            public final void n(Owner owner2) {
                if (ComposeUiFlags.isViewFocusFixEnabled && this.f34204n.hasFocus()) {
                    owner2.getFocusOwner().S(true);
                }
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.p0N(this.f34204n);
                }
                this.f34204n.removeAllViewsInLayout();
            }
        });
        layoutNode.gh(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int n(int width) {
                AndroidViewHolder androidViewHolder = this.f34205n;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(androidViewHolder.E2(0, width, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.f34205n.getMeasuredHeight();
            }

            private final int t(int height) {
                AndroidViewHolder androidViewHolder = this.f34205n;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = this.f34205n;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.E2(0, height, layoutParams.height));
                return this.f34205n.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                if (this.f34205n.getChildCount() == 0) {
                    return MeasureScope.ER(measureScope, Constraints.ty(j2), Constraints.az(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        public final void n(Placeable.PlacementScope placementScope) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            n(placementScope);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
                if (Constraints.ty(j2) != 0) {
                    this.f34205n.getChildAt(0).setMinimumWidth(Constraints.ty(j2));
                }
                if (Constraints.az(j2) != 0) {
                    this.f34205n.getChildAt(0).setMinimumHeight(Constraints.az(j2));
                }
                AndroidViewHolder androidViewHolder = this.f34205n;
                int iTy = Constraints.ty(j2);
                int iQie = Constraints.qie(j2);
                ViewGroup.LayoutParams layoutParams = this.f34205n.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                int iE2 = androidViewHolder.E2(iTy, iQie, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = this.f34205n;
                int iAz = Constraints.az(j2);
                int iGh = Constraints.gh(j2);
                ViewGroup.LayoutParams layoutParams2 = this.f34205n.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2);
                androidViewHolder.measure(iE2, androidViewHolder2.E2(iAz, iGh, layoutParams2.height));
                int measuredWidth = this.f34205n.getMeasuredWidth();
                int measuredHeight = this.f34205n.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = this.f34205n;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.ER(measureScope, measuredWidth, measuredHeight, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        n(placementScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(Placeable.PlacementScope placementScope) {
                        AndroidViewHolder_androidKt.J2(androidViewHolder3, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int O(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                return t(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int Uo(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                return n(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int mUb(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                return n(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int xMQ(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                return t(i3);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E2(int min, int max, int preferred) {
        return (preferred >= 0 || min == max) ? View.MeasureSpec.makeMeasureSpec(RangesKt.coerceIn(preferred, min, max), 1073741824) : (preferred != -2 || max == Integer.MAX_VALUE) ? (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824) : View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsAnimationCompat.BoundsCompat g(WindowInsetsAnimationCompat.BoundsCompat bounds) {
        NodeCoordinator nodeCoordinatorE = this.layoutNode.E();
        if (nodeCoordinatorE.nr()) {
            long jNr = IntOffsetKt.nr(LayoutCoordinatesKt.J2(nodeCoordinatorE));
            int iGh = IntOffset.gh(jNr);
            if (iGh < 0) {
                iGh = 0;
            }
            int iQie = IntOffset.qie(jNr);
            int i2 = iQie < 0 ? 0 : iQie;
            long jN = LayoutCoordinatesKt.nr(nodeCoordinatorE).n();
            int i3 = (int) (jN >> 32);
            int i5 = (int) (jN & 4294967295L);
            long jN2 = nodeCoordinatorE.n();
            long jNr2 = IntOffsetKt.nr(nodeCoordinatorE.xg(Offset.O((4294967295L & ((long) Float.floatToRawIntBits((int) (jN2 & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (jN2 >> 32))) << 32))));
            int iGh2 = i3 - IntOffset.gh(jNr2);
            if (iGh2 < 0) {
                iGh2 = 0;
            }
            int iQie2 = i5 - IntOffset.qie(jNr2);
            int i7 = iQie2 >= 0 ? iQie2 : 0;
            if (iGh != 0 || i2 != 0 || iGh2 != 0 || i7 != 0) {
                int i8 = iGh;
                int i9 = iGh2;
                return new WindowInsetsAnimationCompat.BoundsCompat(nY(bounds.n(), i8, i2, i9, i7), nY(bounds.rl(), i8, i2, i9, i7));
            }
        }
        return bounds;
    }

    private final Insets nY(Insets insets, int i2, int i3, int i5, int i7) {
        int i8 = insets.f36410n - i2;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = insets.rl - i3;
        if (i9 < 0) {
            i9 = 0;
        }
        int i10 = insets.f36411t - i5;
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = insets.nr - i7;
        return Insets.t(i8, i9, i10, i11 >= 0 ? i11 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsCompat te(WindowInsetsCompat insets) {
        if (insets.ty()) {
            NodeCoordinator nodeCoordinatorE = this.layoutNode.E();
            if (nodeCoordinatorE.nr()) {
                long jNr = IntOffsetKt.nr(LayoutCoordinatesKt.J2(nodeCoordinatorE));
                int iGh = IntOffset.gh(jNr);
                if (iGh < 0) {
                    iGh = 0;
                }
                int iQie = IntOffset.qie(jNr);
                if (iQie < 0) {
                    iQie = 0;
                }
                long jN = LayoutCoordinatesKt.nr(nodeCoordinatorE).n();
                int i2 = (int) (jN >> 32);
                int i3 = (int) (jN & 4294967295L);
                long jN2 = nodeCoordinatorE.n();
                long jNr2 = IntOffsetKt.nr(nodeCoordinatorE.xg(Offset.O((((long) Float.floatToRawIntBits((int) (jN2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jN2 >> 32))) << 32))));
                int iGh2 = i2 - IntOffset.gh(jNr2);
                if (iGh2 < 0) {
                    iGh2 = 0;
                }
                int iQie2 = i3 - IntOffset.qie(jNr2);
                int i5 = iQie2 < 0 ? 0 : iQie2;
                if (iGh != 0 || iQie != 0 || iGh2 != 0 || i5 != 0) {
                    return insets.ck(iGh, iQie, iGh2, i5);
                }
            }
        }
        return insets;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void Uo() {
        this.reset.invoke();
        if (ComposeUiFlags.isRemoveFocusedViewFixEnabled && hasFocus() && isInTouchMode() && Build.VERSION.SDK_INT > 28) {
            findFocus().clearFocus();
        }
        removeAllViewsInLayout();
    }

    public final void e() {
        int i2;
        int i3 = this.lastWidthMeasureSpec;
        if (i3 == Integer.MIN_VALUE || (i2 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i3, i2);
    }

    public final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.n();
    }

    public final Function1<Density, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final Function0<Unit> getRelease() {
        return this.release;
    }

    public final Function0<Unit> getReset() {
        return this.reset;
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    public final void iF() {
        if (!this.isDrawing) {
            this.layoutNode.ER();
            return;
        }
        View view = this.view;
        final Function0 function0 = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.j
            @Override // java.lang.Runnable
            public final void run() {
                AndroidViewHolder.fD(function0);
            }
        });
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void mUb(View target, int type) {
        this.nestedScrollingParentHelper.O(target, type);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat n(View v2, WindowInsetsCompat insets) {
        this.insets = new WindowInsetsCompat(insets);
        return te(insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l2, int t3, int r2, int b2) {
        this.view.layout(0, 0, r2 - l2, b2 - t3);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void qie() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Function1 function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            Function1 function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            C1561ViewTreeLifecycleOwner.rl(this, lifecycleOwner);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            Function1 function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super Density, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super Modifier, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    protected final void setRelease(Function0<Unit> function0) {
        this.release = function0;
    }

    protected final void setReset(Function0<Unit> function0) {
        this.reset = function0;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            C1639ViewTreeSavedStateRegistryOwner.rl(this, savedStateRegistryOwner);
        }
    }

    protected final void setUpdate(Function0<Unit> function0) {
        this.update = function0;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void t() {
        this.release.invoke();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void xMQ(View child, View target, int axes, int type) {
        this.nestedScrollingParentHelper.t(child, target, axes, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fD(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.t("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean Vvq() {
        return isAttachedToWindow();
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void az(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (!isNestedScrollingEnabled()) {
            return;
        }
        NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
        float fUo = AndroidViewHolder_androidKt.Uo(dxConsumed);
        long jO = Offset.O((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.Uo(dyConsumed))) & 4294967295L) | (Float.floatToRawIntBits(fUo) << 32));
        float fUo2 = AndroidViewHolder_androidKt.Uo(dxUnconsumed);
        long jRl = nestedScrollDispatcher.rl(jO, Offset.O((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.Uo(dyUnconsumed))) & 4294967295L) | (Float.floatToRawIntBits(fUo2) << 32)), AndroidViewHolder_androidKt.xMQ(type));
        consumed[0] = NestedScrollInteropConnectionKt.J2(Float.intBitsToFloat((int) (jRl >> 32)));
        consumed[1] = NestedScrollInteropConnectionKt.J2(Float.intBitsToFloat((int) (jRl & 4294967295L)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void gh(View target, int dx, int dy, int[] consumed, int type) {
        if (!isNestedScrollingEnabled()) {
            return;
        }
        NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
        float fUo = AndroidViewHolder_androidKt.Uo(dx);
        long jNr = nestedScrollDispatcher.nr(Offset.O((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.Uo(dy))) & 4294967295L) | (Float.floatToRawIntBits(fUo) << 32)), AndroidViewHolder_androidKt.xMQ(type));
        consumed[0] = NestedScrollInteropConnectionKt.J2(Float.intBitsToFloat((int) (jNr >> 32)));
        consumed[1] = NestedScrollInteropConnectionKt.J2(Float.intBitsToFloat((int) (jNr & 4294967295L)));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        iF();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        super.onDescendantInvalidated(child, target);
        iF();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().n(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C.nr(this.dispatcher.O(), null, null, new AnonymousClass1(consumed, this, VelocityKt.n(AndroidViewHolder_androidKt.KN(velocityX), AndroidViewHolder_androidKt.KN(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C.nr(this.dispatcher.O(), null, null, new C15371(VelocityKt.n(AndroidViewHolder_androidKt.KN(velocityX), AndroidViewHolder_androidKt.KN(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void ty(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (!isNestedScrollingEnabled()) {
            return;
        }
        NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
        float fUo = AndroidViewHolder_androidKt.Uo(dxConsumed);
        long jO = Offset.O((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.Uo(dyConsumed))) & 4294967295L) | (Float.floatToRawIntBits(fUo) << 32));
        float fUo2 = AndroidViewHolder_androidKt.Uo(dxUnconsumed);
        nestedScrollDispatcher.rl(jO, Offset.O((((long) Float.floatToRawIntBits(AndroidViewHolder_androidKt.Uo(dyUnconsumed))) & 4294967295L) | (Float.floatToRawIntBits(fUo2) << 32)), AndroidViewHolder_androidKt.xMQ(type));
    }
}
