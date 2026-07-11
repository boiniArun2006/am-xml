package androidx.compose.foundation.pager;

import GJW.C;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Stable
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\"\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00022\b\b\u0003\u0010\"\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u000e*\u00020%2\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0018H\u0000¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020\u000e2\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0003\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b-\u0010\nJ2\u00100\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00022\b\b\u0003\u0010\"\u001a\u00020\u00042\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040.H\u0086@¢\u0006\u0004\b0\u00101JA\u00109\u001a\u00020\u000e2\u0006\u00103\u001a\u0002022'\u00108\u001a#\b\u0001\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e05\u0012\u0006\u0012\u0004\u0018\u00010604¢\u0006\u0002\b7H\u0096@¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\rJ)\u0010>\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00182\b\b\u0002\u0010=\u001a\u00020\u0018H\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0018H\u0000¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u00020\u00022\u0006\u0010C\u001a\u00020B2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\bD\u0010ER$\u0010J\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010AR(\u0010N\u001a\u0004\u0018\u00010\u00112\b\u0010F\u001a\u0004\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010K\u001a\u0004\bL\u0010MR1\u0010V\u001a\u00020O2\u0006\u0010F\u001a\u00020O8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR$\u0010]\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b9\u0010#\u001a\u0004\b[\u0010\\R$\u0010`\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b^\u0010#\u001a\u0004\b_\u0010\\R\"\u0010e\u001a\u00020a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010-\u001a\u0004\bc\u0010S\"\u0004\bd\u0010UR\"\u0010i\u001a\u00020a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010-\u001a\u0004\bg\u0010S\"\u0004\bh\u0010UR\u0016\u0010l\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010kR\u0014\u0010q\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR$\u0010t\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\br\u0010#\u001a\u0004\bs\u0010\\R\u0016\u0010u\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010#R\"\u0010z\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010H\u001a\u0004\bw\u0010A\"\u0004\bx\u0010yR\u0016\u0010{\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010#R\u0018\u0010\u007f\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010HR\u001e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010QR)\u0010\u0089\u0001\u001a\u00030\u0083\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0015\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001f\u0010\u008e\u0001\u001a\u00030\u008a\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bH\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R1\u0010\u0094\u0001\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010\\\"\u0006\b\u0092\u0001\u0010\u0093\u0001R1\u0010\u0098\u0001\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0095\u0001\u0010\u0090\u0001\u001a\u0005\b\u0096\u0001\u0010\\\"\u0006\b\u0097\u0001\u0010\u0093\u0001R\u001f\u0010\u009c\u0001\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010\\R\u001e\u0010&\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u009a\u0001\u001a\u0005\b\u009d\u0001\u0010\\R\u001f\u0010¢\u0001\u001a\u00030\u009e\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b[\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u001f\u0010¦\u0001\u001a\u00030£\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b_\u0010¤\u0001\u001a\u0006\b\u008f\u0001\u0010¥\u0001R\u001f\u0010ª\u0001\u001a\u00030§\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u008c\u0001\u0010¨\u0001\u001a\u0005\bH\u0010©\u0001R7\u0010±\u0001\u001a\u0005\u0018\u00010«\u00012\t\u0010F\u001a\u0005\u0018\u00010«\u00018@@BX\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b¬\u0001\u0010Q\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R \u0010·\u0001\u001a\u00030²\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R,\u0010»\u0001\u001a\u00030¸\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\bc\u0010-\u001a\u0005\b¹\u0001\u0010S\"\u0005\bº\u0001\u0010UR \u0010Á\u0001\u001a\u00030¼\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001R$\u0010Å\u0001\u001a\u00030Â\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\bg\u0010Q\u001a\u0006\bÃ\u0001\u0010Ä\u0001R%\u0010Ç\u0001\u001a\u00030Â\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\bÆ\u0001\u0010Q\u001a\u0006\b½\u0001\u0010Ä\u0001R.\u0010Ê\u0001\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0014\n\u0005\bÈ\u0001\u0010Q\u001a\u0004\b^\u0010A\"\u0005\bÉ\u0001\u0010yR.\u0010Í\u0001\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0014\n\u0005\bË\u0001\u0010Q\u001a\u0004\bX\u0010A\"\u0005\bÌ\u0001\u0010yR\u001d\u0010Ï\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÎ\u0001\u0010QR\u001d\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÐ\u0001\u0010QR\u0016\u0010Ò\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010\\R\u0014\u0010Ô\u0001\u001a\u00020\u001b8F¢\u0006\b\u001a\u0006\b³\u0001\u0010Ó\u0001R\u0016\u0010Õ\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010\\R\u0016\u0010Ö\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010\\R\u0016\u0010×\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010\\R\u0017\u0010Ú\u0001\u001a\u00020\u00048@X\u0080\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010\\R\u0013\u0010\u0005\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010Ù\u0001R!\u0010ß\u0001\u001a\u00030Û\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bÆ\u0001\u0010Ü\u0001*\u0006\bÝ\u0001\u0010Þ\u0001R\u0015\u0010à\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010AR\u0016\u0010á\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006â\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "currentPage", "", "currentPageOffsetFraction", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "prefetchScheduler", "<init>", "(IFLandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "(IF)V", "delta", "B", "(F)F", "", "Ik", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "result", "xg", "(Landroidx/compose/foundation/pager/PagerMeasureResult;)V", "o", "(I)I", "scrollDelta", "", "eF", "(F)Z", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "info", "FX", "(FLandroidx/compose/foundation/pager/PagerLayoutInfo;)V", "r", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)V", "page", "pageOffsetFraction", "I", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/ScrollScope;", "targetPage", "pJg", "(Landroidx/compose/foundation/gestures/ScrollScope;I)V", "offsetFraction", "forceRemeasure", "eTf", "(IFZ)V", "J", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "az", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "O", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rl", "isLookingAhead", "visibleItemsStayedTheSame", "HI", "(Landroidx/compose/foundation/pager/PagerMeasureResult;ZZ)V", "E", "()Z", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "itemProvider", "M", "(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I", "<set-?>", c.f62177j, "Z", "getHasLookaheadOccurred$foundation_release", "hasLookaheadOccurred", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "getApproachLayoutInfo$foundation_release", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "approachLayoutInfo", "Landroidx/compose/ui/geometry/Offset;", "t", "Landroidx/compose/runtime/MutableState;", "p5", "()J", "m", "(J)V", "upDownDifference", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "nr", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "scrollPosition", "ViF", "()I", "firstVisiblePage", "J2", "nY", "firstVisiblePageOffset", "", "Uo", "fD", "setMaxScrollOffset$foundation_release", "maxScrollOffset", "KN", "e", "setMinScrollOffset$foundation_release", "minScrollOffset", "xMQ", "F", "accumulator", "mUb", "previousPassDelta", "gh", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "qie", "getLayoutWithMeasurement$foundation_release", "layoutWithMeasurement", "layoutWithoutMeasurement", "ty", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "ck", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentPrefetchHandle", "wasPrefetchingForward", "Landroidx/compose/runtime/MutableState;", "pagerLayoutInfoState", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Density;", "aYN", "()Landroidx/compose/ui/unit/Density;", "k", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "g", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "XQ", "Landroidx/compose/runtime/MutableIntState;", "Xw", "z", "(I)V", "programmaticScrollTargetPage", "S", "M7", "ijL", "settledPageState", "WPU", "Landroidx/compose/runtime/State;", "P5", "settledPage", "getTargetPage", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "bzg", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/ui/layout/Remeasurement;", "te", "jB", "()Landroidx/compose/ui/layout/Remeasurement;", "piY", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "iF", "Landroidx/compose/ui/layout/RemeasurementModifier;", "U", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/unit/Constraints;", "getPremeasureConstraints-msEJaDk$foundation_release", "dR0", "premeasureConstraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "E2", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "wTp", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedPages", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "v", "()Landroidx/compose/runtime/MutableState;", "placementScopeInvalidator", "X", "measurementScopeInvalidator", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Y", "canScrollForward", "N", "Nxk", "canScrollBackward", "nHg", "isLastScrollForwardState", "s7N", "isLastScrollBackwardState", "pageCount", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "layoutInfo", "pageSpacing", "pageSize", "pageSizeWithSpacing", "rV9", "()F", "positionThresholdFraction", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "lastScrolledForward", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 5 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,994:1\n96#2,5:995\n96#2,5:1027\n96#2,5:1070\n85#3:1000\n113#3,2:1001\n85#3:1021\n85#3:1022\n85#3:1023\n113#3,2:1024\n85#3:1026\n85#3:1032\n113#3,2:1033\n85#3:1035\n113#3,2:1036\n897#4,4:1003\n897#4,4:1007\n897#4,4:1011\n897#4,4:1038\n897#4,4:1042\n897#4,4:1047\n78#5:1015\n107#5,2:1016\n78#5:1018\n107#5,2:1019\n1#6:1046\n602#7,8:1051\n602#7,8:1075\n69#8:1059\n65#8:1062\n65#8:1065\n69#8:1068\n70#9:1060\n60#9:1063\n60#9:1066\n70#9:1069\n22#10:1061\n22#10:1064\n22#10:1067\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n178#1:995,5\n611#1:1027,5\n829#1:1070,5\n185#1:1000\n185#1:1001,2\n398#1:1021\n416#1:1022\n471#1:1023\n471#1:1024,2\n488#1:1026\n652#1:1032\n652#1:1033,2\n655#1:1035\n655#1:1036,2\n219#1:1003,4\n276#1:1007,4\n286#1:1011,4\n676#1:1038,4\n680#1:1042,4\n698#1:1047,4\n384#1:1015\n384#1:1016,2\n386#1:1018\n386#1:1019,2\n705#1:1051,8\n842#1:1075,8\n725#1:1059\n727#1:1062\n731#1:1065\n731#1:1068\n725#1:1060\n727#1:1063\n731#1:1066\n731#1:1069\n725#1:1061\n727#1:1064\n731#1:1067\n*E\n"})
public abstract class PagerState implements ScrollableState {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final LazyLayoutPinnedItemList pinnedPages;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private int indexToPrefetch;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private boolean wasPrefetchingForward;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int firstVisiblePageOffset;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private long minScrollOffset;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final MutableState canScrollBackward;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int firstVisiblePage;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final MutableIntState settledPageState;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final MutableState canScrollForward;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private long maxScrollOffset;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private final LazyLayoutPrefetchState prefetchState;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private final State settledPage;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final MutableState measurementScopeInvalidator;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final MutableIntState programmaticScrollTargetPage;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final MutableInteractionSource internalInteractionSource;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private final State targetPage;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private int layoutWithoutMeasurement;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MutableState placementScopeInvalidator;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private long premeasureConstraints;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final ScrollableState scrollableState;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private final RemeasurementModifier remeasurementModifier;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private float previousPassDelta;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* JADX INFO: renamed from: nHg, reason: from kotlin metadata */
    private final MutableState isLastScrollForwardState;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final PagerScrollPosition scrollPosition;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Density density;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private int layoutWithMeasurement;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private MutableState pagerLayoutInfoState;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private PagerMeasureResult approachLayoutInfo;

    /* JADX INFO: renamed from: s7N, reason: from kotlin metadata */
    private final MutableState isLastScrollBackwardState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState upDownDifference;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private final MutableState remeasurement;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private float accumulator;

    public PagerState(int i2, float f3, PrefetchScheduler prefetchScheduler) {
        double d2 = f3;
        boolean z2 = false;
        if (-0.5d <= d2 && d2 <= 0.5d) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.n("currentPageOffsetFraction " + f3 + " is not within the range -0.5 to 0.5");
        }
        this.upDownDifference = SnapshotStateKt__SnapshotStateKt.O(Offset.nr(Offset.INSTANCE.t()), null, 2, null);
        PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i2, f3, this);
        this.scrollPosition = pagerScrollPosition;
        this.firstVisiblePage = i2;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.scrollableState = ScrollableStateKt.n(new Function1<Float, Float>() { // from class: androidx.compose.foundation.pager.PagerState$scrollableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f4) {
                return n(f4.floatValue());
            }

            public final Float n(float f4) {
                return Float.valueOf(this.f19017n.B(f4));
            }
        });
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = SnapshotStateKt.xMQ(PagerStateKt.gh(), SnapshotStateKt.gh());
        this.density = PagerStateKt.f19021t;
        this.internalInteractionSource = InteractionSourceKt.n();
        this.programmaticScrollTargetPage = SnapshotIntStateKt.n(-1);
        this.settledPageState = SnapshotIntStateKt.n(i2);
        this.settledPage = SnapshotStateKt.nr(SnapshotStateKt.r(), new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return Integer.valueOf(this.f19018n.t() ? this.f19018n.M7() : this.f19018n.S());
            }
        });
        this.targetPage = SnapshotStateKt.nr(SnapshotStateKt.r(), new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return Integer.valueOf(this.f19019n.o(!this.f19019n.t() ? this.f19019n.S() : this.f19019n.Xw() != -1 ? this.f19019n.Xw() : Math.abs(this.f19019n.WPU()) >= Math.abs(this.f19019n.rV9()) ? this.f19019n.te() ? this.f19019n.getFirstVisiblePage() + 1 : this.f19019n.getFirstVisiblePage() : this.f19019n.S()));
            }
        });
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, new Function1<NestedPrefetchScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerState$prefetchState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NestedPrefetchScope nestedPrefetchScope) {
                n(nestedPrefetchScope);
                return Unit.INSTANCE;
            }

            public final void n(NestedPrefetchScope nestedPrefetchScope) {
                Snapshot.Companion companion = Snapshot.INSTANCE;
                PagerState pagerState = this.f19005n;
                Snapshot snapshotNr = companion.nr();
                Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
                Snapshot snapshotO = companion.O(snapshotNr);
                try {
                    nestedPrefetchScope.n(pagerState.getFirstVisiblePage());
                    Unit unit = Unit.INSTANCE;
                } finally {
                    companion.az(snapshotNr, snapshotO, function1Uo);
                }
            }
        });
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.remeasurement = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void VwL(Remeasurement remeasurement) {
                this.f19006n.piY(remeasurement);
            }
        };
        this.premeasureConstraints = ConstraintsKt.rl(0, 0, 0, 0, 15, null);
        this.pinnedPages = new LazyLayoutPinnedItemList();
        pagerScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.t(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.t(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object O(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        return a(this, mutatePriority, function2, continuation);
    }

    public abstract int T();

    public static /* synthetic */ void D(PagerState pagerState, int i2, float f3, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i3 & 2) != 0) {
            f3 = 0.0f;
        }
        pagerState.J(i2, f3);
    }

    private final void FX(float delta, PagerLayoutInfo info) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (this.prefetchingEnabled && !info.getVisiblePagesInfo().isEmpty()) {
            boolean z2 = delta > 0.0f;
            int index = z2 ? ((PageInfo) CollectionsKt.last(info.getVisiblePagesInfo())).getIndex() + info.getBeyondViewportPageCount() + 1 : (((PageInfo) CollectionsKt.first(info.getVisiblePagesInfo())).getIndex() - info.getBeyondViewportPageCount()) - 1;
            if (index < 0 || index >= T()) {
                return;
            }
            if (index != this.indexToPrefetch) {
                if (this.wasPrefetchingForward != z2 && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                    prefetchHandle3.cancel();
                }
                this.wasPrefetchingForward = z2;
                this.indexToPrefetch = index;
                this.currentPrefetchHandle = this.prefetchState.O(index, this.premeasureConstraints);
            }
            if (z2) {
                if ((((PageInfo) CollectionsKt.last(info.getVisiblePagesInfo())).getOffset() + (info.getPageSize() + info.getPageSpacing())) - info.getViewportEndOffset() >= delta || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
                    return;
                }
                prefetchHandle2.n();
                return;
            }
            if (info.getViewportStartOffset() - ((PageInfo) CollectionsKt.first(info.getVisiblePagesInfo())).getOffset() >= (-delta) || (prefetchHandle = this.currentPrefetchHandle) == null) {
                return;
            }
            prefetchHandle.n();
        }
    }

    public static /* synthetic */ Object GR(PagerState pagerState, int i2, float f3, Continuation continuation, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i3 & 2) != 0) {
            f3 = 0.0f;
        }
        return pagerState.I(i2, f3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Ik(Continuation continuation) {
        Object objRl = this.awaitLayoutModifier.rl(continuation);
        return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int M7() {
        return this.settledPageState.J2();
    }

    private final void Nxk(boolean z2) {
        this.canScrollBackward.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Xw() {
        return this.programmaticScrollTargetPage.J2();
    }

    private final void Y(boolean z2) {
        this.canScrollForward.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r8.O(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object a(PagerState pagerState, MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        PagerState$scroll$1 pagerState$scroll$1;
        if (continuation instanceof PagerState$scroll$1) {
            pagerState$scroll$1 = (PagerState$scroll$1) continuation;
            int i2 = pagerState$scroll$1.f19011o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pagerState$scroll$1.f19011o = i2 - Integer.MIN_VALUE;
            } else {
                pagerState$scroll$1 = new PagerState$scroll$1(pagerState, continuation);
            }
        }
        Object obj = pagerState$scroll$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pagerState$scroll$1.f19011o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            pagerState$scroll$1.f19010n = pagerState;
            pagerState$scroll$1.f19013t = mutatePriority;
            pagerState$scroll$1.f19009O = function2;
            pagerState$scroll$1.f19011o = 1;
            if (pagerState.Ik(pagerState$scroll$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pagerState = (PagerState) pagerState$scroll$1.f19010n;
            ResultKt.throwOnFailure(obj);
            pagerState.z(-1);
            return Unit.INSTANCE;
        }
        function2 = (Function2) pagerState$scroll$1.f19009O;
        mutatePriority = (MutatePriority) pagerState$scroll$1.f19013t;
        pagerState = (PagerState) pagerState$scroll$1.f19010n;
        ResultKt.throwOnFailure(obj);
        if (!pagerState.t()) {
            pagerState.ijL(pagerState.S());
        }
        ScrollableState scrollableState = pagerState.scrollableState;
        pagerState$scroll$1.f19010n = pagerState;
        pagerState$scroll$1.f19013t = null;
        pagerState$scroll$1.f19009O = null;
        pagerState$scroll$1.f19011o = 2;
    }

    public static /* synthetic */ void ck(PagerState pagerState, PagerMeasureResult pagerMeasureResult, boolean z2, boolean z3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        pagerState.HI(pagerMeasureResult, z2, z3);
    }

    private final void ijL(int i2) {
        this.settledPageState.KN(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void piY(Remeasurement remeasurement) {
        this.remeasurement.setValue(remeasurement);
    }

    private final void r(PagerLayoutInfo info) {
        if (this.indexToPrefetch == -1 || info.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != (this.wasPrefetchingForward ? ((PageInfo) CollectionsKt.last(info.getVisiblePagesInfo())).getIndex() + info.getBeyondViewportPageCount() + 1 : (((PageInfo) CollectionsKt.first(info.getVisiblePagesInfo())).getIndex() - info.getBeyondViewportPageCount()) - 1)) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    public static /* synthetic */ Object ty(PagerState pagerState, int i2, float f3, AnimationSpec animationSpec, Continuation continuation, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i3 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i3 & 4) != 0) {
            animationSpec = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.az(i2, f3, animationSpec, continuation);
    }

    private final void xg(PagerMeasureResult result) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotNr = companion.nr();
        Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
        Snapshot snapshotO = companion.O(snapshotNr);
        try {
            if (Math.abs(this.previousPassDelta) > 0.5f && this.prefetchingEnabled && eF(this.previousPassDelta)) {
                FX(this.previousPassDelta, result);
            }
            Unit unit = Unit.INSTANCE;
            companion.az(snapshotNr, snapshotO, function1Uo);
        } catch (Throwable th) {
            companion.az(snapshotNr, snapshotO, function1Uo);
            throw th;
        }
    }

    private final void z(int i2) {
        this.programmaticScrollTargetPage.KN(i2);
    }

    /* JADX INFO: renamed from: E2, reason: from getter */
    public final MutableState getMeasurementScopeInvalidator() {
        return this.measurementScopeInvalidator;
    }

    public final void HI(PagerMeasureResult result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.mUb(result.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.gh(result);
            r(result);
        }
        this.pagerLayoutInfoState.setValue(result);
        Y(result.getCanScrollForward());
        Nxk(result.ty());
        MeasuredPage measuredPageS = result.getFirstVisiblePage();
        if (measuredPageS != null) {
            this.firstVisiblePage = measuredPageS.getIndex();
        }
        this.firstVisiblePageOffset = result.getFirstVisiblePageScrollOffset();
        xg(result);
        this.maxScrollOffset = PagerStateKt.KN(result, T());
        this.minScrollOffset = PagerStateKt.xMQ(result, T());
    }

    public final Object I(int i2, float f3, Continuation continuation) {
        Object objN = ScrollableState.n(this, null, new PagerState$scrollToPage$2(this, f3, i2, null), continuation, 1, null);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean J2() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    public final int M(PagerLazyLayoutItemProvider itemProvider, int currentPage) {
        return this.scrollPosition.O(itemProvider, currentPage);
    }

    public final int N() {
        return ((PagerMeasureResult) this.pagerLayoutInfoState.getValue()).getPageSize();
    }

    public final int P5() {
        return ((Number) this.settledPage.getValue()).intValue();
    }

    public final int S() {
        return this.scrollPosition.rl();
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* JADX INFO: renamed from: ViF, reason: from getter */
    public final int getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    public final float WPU() {
        return this.scrollPosition.t();
    }

    public final IntRange X() {
        return (IntRange) this.scrollPosition.getNearestRangeState().getValue();
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollableState.n(r1, null, r3, r4, 1, null) == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object az(int i2, float f3, AnimationSpec animationSpec, Continuation continuation) {
        PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$1;
        PagerState pagerState;
        if (continuation instanceof PagerState$animateScrollToPage$1) {
            pagerState$animateScrollToPage$1 = (PagerState$animateScrollToPage$1) continuation;
            int i3 = pagerState$animateScrollToPage$1.f18994Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pagerState$animateScrollToPage$1.f18994Z = i3 - Integer.MIN_VALUE;
            } else {
                pagerState$animateScrollToPage$1 = new PagerState$animateScrollToPage$1(this, continuation);
            }
        }
        PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$12 = pagerState$animateScrollToPage$1;
        Object obj = pagerState$animateScrollToPage$12.f18997r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = pagerState$animateScrollToPage$12.f18994Z;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            if ((i2 == S() && WPU() == f3) || T() == 0) {
                return Unit.INSTANCE;
            }
            pagerState$animateScrollToPage$12.f18995n = this;
            pagerState$animateScrollToPage$12.f18998t = animationSpec;
            pagerState$animateScrollToPage$12.f18993O = i2;
            pagerState$animateScrollToPage$12.J2 = f3;
            pagerState$animateScrollToPage$12.f18994Z = 1;
            if (Ik(pagerState$animateScrollToPage$12) != coroutine_suspended) {
                pagerState = this;
            }
            return coroutine_suspended;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        f3 = pagerState$animateScrollToPage$12.J2;
        i2 = pagerState$animateScrollToPage$12.f18993O;
        animationSpec = (AnimationSpec) pagerState$animateScrollToPage$12.f18998t;
        pagerState = (PagerState) pagerState$animateScrollToPage$12.f18995n;
        ResultKt.throwOnFailure(obj);
        AnimationSpec animationSpec2 = animationSpec;
        double d2 = f3;
        if (!(-0.5d <= d2 && d2 <= 0.5d)) {
            InlineClassHelperKt.n("pageOffsetFraction " + f3 + " is not within the range -0.5 to 0.5");
        }
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(pagerState, pagerState.o(i2), f3 * pagerState.nHg(), animationSpec2, null);
        pagerState$animateScrollToPage$12.f18995n = null;
        pagerState$animateScrollToPage$12.f18998t = null;
        pagerState$animateScrollToPage$12.f18994Z = 2;
    }

    /* JADX INFO: renamed from: bzg, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    public final void dR0(long j2) {
        this.premeasureConstraints = j2;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getMinScrollOffset() {
        return this.minScrollOffset;
    }

    public final void eTf(int page, float offsetFraction, boolean forceRemeasure) {
        this.scrollPosition.J2(page, offsetFraction);
        if (!forceRemeasure) {
            ObservableScopeInvalidator.J2(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurementJB = jB();
        if (remeasurementJB != null) {
            remeasurementJB.KN();
        }
    }

    /* JADX INFO: renamed from: fD, reason: from getter */
    public final long getMaxScrollOffset() {
        return this.maxScrollOffset;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final PagerLayoutInfo iF() {
        return (PagerLayoutInfo) this.pagerLayoutInfoState.getValue();
    }

    public final Remeasurement jB() {
        return (Remeasurement) this.remeasurement.getValue();
    }

    public final void k(Density density) {
        this.density = density;
    }

    public final void m(long j2) {
        this.upDownDifference.setValue(Offset.nr(j2));
    }

    /* JADX INFO: renamed from: nY, reason: from getter */
    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean nr() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public final long p5() {
        return ((Offset) this.upDownDifference.getValue()).getPackedValue();
    }

    public final float rV9() {
        return Math.min(this.density.l(PagerStateKt.mUb()), N() / 2.0f) / N();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float rl(float delta) {
        return this.scrollableState.rl(delta);
    }

    public final int s7N() {
        return ((PagerMeasureResult) this.pagerLayoutInfoState.getValue()).getPageSpacing();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean t() {
        return this.scrollableState.t();
    }

    public boolean te() {
        return ((Boolean) this.isLastScrollForwardState.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final MutableState getPlacementScopeInvalidator() {
        return this.placementScopeInvalidator;
    }

    /* JADX INFO: renamed from: wTp, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedPages() {
        return this.pinnedPages;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float B(float delta) {
        boolean z2;
        Number numberValueOf;
        PagerMeasureResult pagerMeasureResult;
        PagerMeasureResult pagerMeasureResultAz;
        boolean z3;
        long jN = PagerScrollPositionKt.n(this);
        float f3 = this.accumulator + delta;
        long jRoundToLong = MathKt.roundToLong(f3);
        this.accumulator = f3 - jRoundToLong;
        if (Math.abs(delta) < 1.0E-4f) {
            return delta;
        }
        long j2 = jN + jRoundToLong;
        long jCoerceIn = RangesKt.coerceIn(j2, this.minScrollOffset, this.maxScrollOffset);
        boolean z4 = false;
        if (j2 != jCoerceIn) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j3 = jCoerceIn - jN;
        float f4 = j3;
        this.previousPassDelta = f4;
        if (Math.abs(j3) != 0) {
            MutableState mutableState = this.isLastScrollForwardState;
            if (f4 > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            mutableState.setValue(Boolean.valueOf(z3));
            MutableState mutableState2 = this.isLastScrollBackwardState;
            if (f4 < 0.0f) {
                z4 = true;
            }
            mutableState2.setValue(Boolean.valueOf(z4));
        }
        int i2 = (int) j3;
        int i3 = -i2;
        PagerMeasureResult pagerMeasureResultAz2 = ((PagerMeasureResult) this.pagerLayoutInfoState.getValue()).az(i3);
        if (pagerMeasureResultAz2 != null && (pagerMeasureResult = this.approachLayoutInfo) != null) {
            if (pagerMeasureResult != null) {
                pagerMeasureResultAz = pagerMeasureResult.az(i3);
            } else {
                pagerMeasureResultAz = null;
            }
            if (pagerMeasureResultAz != null) {
                this.approachLayoutInfo = pagerMeasureResultAz;
            } else {
                pagerMeasureResultAz2 = null;
            }
        }
        if (pagerMeasureResultAz2 != null) {
            HI(pagerMeasureResultAz2, this.hasLookaheadOccurred, true);
            ObservableScopeInvalidator.J2(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.n(i2);
            Remeasurement remeasurementJB = jB();
            if (remeasurementJB != null) {
                remeasurementJB.KN();
            }
            this.layoutWithMeasurement++;
        }
        if (z2) {
            numberValueOf = Long.valueOf(j3);
        } else {
            numberValueOf = Float.valueOf(delta);
        }
        return numberValueOf.floatValue();
    }

    private final boolean eF(float scrollDelta) {
        if (iF().getOrientation() == Orientation.f16969n) {
            if (Math.signum(scrollDelta) == Math.signum(-Float.intBitsToFloat((int) (p5() & 4294967295L)))) {
                return true;
            }
        } else if (Math.signum(scrollDelta) == Math.signum(-Float.intBitsToFloat((int) (p5() >> 32)))) {
            return true;
        }
        if (E()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o(int i2) {
        if (T() <= 0) {
            return 0;
        }
        return RangesKt.coerceIn(i2, 0, T() - 1);
    }

    public final boolean E() {
        if (((int) Float.intBitsToFloat((int) (p5() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p5() & 4294967295L))) == 0) {
            return true;
        }
        return false;
    }

    public final void J(int page, float pageOffsetFraction) {
        if (t()) {
            C.nr(((PagerMeasureResult) this.pagerLayoutInfoState.getValue()).getCoroutineScope(), null, null, new PagerState$requestScrollToPage$1(this, null), 3, null);
        }
        eTf(page, pageOffsetFraction, false);
    }

    public final int nHg() {
        return N() + s7N();
    }

    public final void pJg(ScrollScope scrollScope, int i2) {
        z(o(i2));
    }

    public PagerState(int i2, float f3) {
        this(i2, f3, null);
    }
}
