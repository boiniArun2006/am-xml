package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Stable
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00ad\u00012\u00020\u0001:\u0002º\u0001B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%JA\u0010.\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&2'\u0010-\u001a#\b\u0001\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140*\u0012\u0006\u0012\u0004\u0018\u00010+0(¢\u0006\u0002\b,H\u0096@¢\u0006\u0004\b.\u0010/J\"\u00102\u001a\u00020\u00142\u0006\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\tH\u0086@¢\u0006\u0004\b2\u00103J'\u00105\u001a\u00020\u00142\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u00104\u001a\u00020\"H\u0000¢\u0006\u0004\b5\u00106J\u001f\u0010:\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u0002H\u0000¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010\u0010J)\u0010?\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010>\u001a\u00020\"H\u0000¢\u0006\u0004\b?\u0010@R$\u0010F\u001a\u00020\"2\u0006\u0010A\u001a\u00020\"8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER(\u0010J\u001a\u0004\u0018\u00010\u00122\b\u0010A\u001a\u0004\u0018\u00010\u00128\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b<\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010P\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00120Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010Y\u001a\u00020U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010V\u001a\u0004\bW\u0010XR+\u0010]\u001a\u00020\"2\u0006\u0010A\u001a\u00020\"8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010S\u001a\u0004\bZ\u0010E\"\u0004\b[\u0010\\R+\u0010`\u001a\u00020\"2\u0006\u0010A\u001a\u00020\"8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010S\u001a\u0004\bR\u0010E\"\u0004\b_\u0010\\R(\u0010f\u001a\u0004\u0018\u00010a2\b\u0010A\u001a\u0004\u0018\u00010a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010l\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010r\u001a\u00020m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010w\u001a\u00020s8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010t\u001a\u0004\bu\u0010vR\"\u0010{\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bx\u0010C\u001a\u0004\by\u0010E\"\u0004\bz\u0010\\R\u001b\u0010\u0080\u0001\u001a\u00020|8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010}\u001a\u0004\b~\u0010\u007fR\u0016\u0010\u0082\u0001\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0010\u0083\u0001R(\u0010\u008a\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bH\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010\u0085\u0001R$\u0010\u008f\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u008d\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bu\u0010\u008e\u0001R \u0010\u0095\u0001\u001a\u00030\u0090\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001f\u0010\u009a\u0001\u001a\u00030\u0096\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bC\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R&\u0010 \u0001\u001a\n\u0012\u0005\u0012\u00030\u009c\u00010\u009b\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bD\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R%\u0010¤\u0001\u001a\u00030¡\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u009e\u0001\u0010S\u001a\u0006\b¢\u0001\u0010£\u0001R%\u0010§\u0001\u001a\u00030¡\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b¥\u0001\u0010S\u001a\u0006\b¦\u0001\u0010£\u0001R\u0017\u0010ª\u0001\u001a\u00030¨\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bW\u0010©\u0001R\u0014\u0010«\u0001\u001a\u00020\t8F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0087\u0001R\u0013\u0010¬\u0001\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bC\u0010\u0087\u0001R\u0014\u0010¯\u0001\u001a\u00020\u001b8F¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010\u001f\u001a\u00020\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010\u0087\u0001R!\u0010µ\u0001\u001a\u00030°\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b±\u0001\u0010²\u0001*\u0006\b³\u0001\u0010´\u0001R\u0015\u0010¶\u0001\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010ER\u0017\u0010¹\u0001\u001a\u00020\r8@X\u0080\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006»\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "initialFirstVisibleItems", "initialFirstVisibleOffsets", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "prefetchScheduler", "<init>", "([I[ILandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "", "initialFirstVisibleItemIndex", "initialFirstVisibleItemOffset", "(II)V", "", "distance", "s7N", "(F)F", "delta", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "info", "", "N", "(FLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V", "", "prefetchHandlesUsed", "ty", "(Ljava/util/Set;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "az", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)V", "itemIndex", "laneCount", "HI", "(II)[I", "", "isLookingAhead", "wTp", "(Z)F", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "O", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "index", "scrollOffset", "v", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceRemeasure", "jB", "(IIZ)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "firstItemIndex", "U", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I", "rl", "result", "visibleItemsStayedTheSame", "gh", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;ZZ)V", "<set-?>", c.f62177j, "Z", "XQ", "()Z", "hasLookaheadOccurred", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "ck", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "approachLayoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "t", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "scrollPosition", "Landroidx/compose/runtime/MutableState;", "nr", "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "aYN", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "J2", "Xw", "(Z)V", "canScrollForward", "Uo", "bzg", "canScrollBackward", "Landroidx/compose/ui/layout/Remeasurement;", "KN", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "xMQ", "Landroidx/compose/ui/layout/RemeasurementModifier;", "e", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "mUb", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Ik", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "r", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "qie", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "prefetchingEnabled", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "E2", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "F", "scrollToBeConsumed", "I", "getMeasurePassCount$foundation_release", "()I", "setMeasurePassCount$foundation_release", "(I)V", "measurePassCount", "prefetchBaseIndex", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Ljava/util/Map;", "currentItemPrefetchHandles", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "o", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "g", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "mutableInteractionSource", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "iF", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "S", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "fD", "()Landroidx/compose/runtime/MutableState;", "placementScopeInvalidator", "WPU", "nY", "measurementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "_lazyLayoutScrollDeltaBetweenPasses", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "ViF", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "layoutInfo", "Lkotlin/ranges/IntRange;", "te", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "X", "()F", "scrollDeltaBetweenPasses", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,639:1\n85#2:640\n113#2,2:641\n85#2:643\n113#2,2:644\n85#2:646\n50#3,5:647\n96#3,5:654\n1855#4,2:652\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n157#1:640\n157#1:641,2\n160#1:643\n160#1:644,2\n235#1:646\n267#1:647,5\n598#1:654,5\n535#1:652,2\n*E\n"})
public final class LazyStaggeredGridState implements ScrollableState {

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver nY = ListSaverKt.n(new Function2<SaverScope, LazyStaggeredGridState, List<? extends int[]>>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final List invoke(SaverScope saverScope, LazyStaggeredGridState lazyStaggeredGridState) {
            return CollectionsKt.listOf((Object[]) new int[][]{lazyStaggeredGridState.getScrollPosition().getIndices(), lazyStaggeredGridState.getScrollPosition().getScrollOffsets()});
        }
    }, new Function1<List<? extends int[]>, LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final LazyStaggeredGridState invoke(List list) {
            return new LazyStaggeredGridState((int[]) list.get(0), (int[]) list.get(1), null);
        }
    });

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private float scrollToBeConsumed;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private int prefetchBaseIndex;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableState canScrollForward;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Remeasurement remeasurement;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final LazyStaggeredGridLaneInfo laneInfo;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final MutableState placementScopeInvalidator;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableState canScrollBackward;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private final MutableState measurementScopeInvalidator;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final LazyLayoutItemAnimator itemAnimator;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutPinnedItemList pinnedItems;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final LazyLayoutPrefetchState prefetchState;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private int measurePassCount;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState layoutInfoState;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableInteractionSource mutableInteractionSource;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Map currentItemPrefetchHandles;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private LazyStaggeredGridMeasureResult approachLayoutInfo;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final LazyStaggeredGridScrollPosition scrollPosition;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final ScrollableState scrollableState;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final RemeasurementModifier remeasurementModifier;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", c.f62177j, "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n() {
            return LazyStaggeredGridState.nY;
        }
    }

    public LazyStaggeredGridState(int[] iArr, int[] iArr2, PrefetchScheduler prefetchScheduler) {
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.scrollPosition = lazyStaggeredGridScrollPosition;
        this.layoutInfoState = SnapshotStateKt.xMQ(LazyStaggeredGridMeasureResultKt.rl(), SnapshotStateKt.gh());
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void VwL(Remeasurement remeasurement) {
                this.f18790n.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, null, 2, null);
        this.scrollableState = ScrollableStateKt.n(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f3) {
                return n(f3.floatValue());
            }

            public final Float n(float f3) {
                return Float.valueOf(-this.f18801n.s7N(-f3));
            }
        });
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.mutableInteractionSource = InteractionSourceKt.n();
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.itemAnimator = new LazyLayoutItemAnimator();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.t(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.t(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float s7N(float distance) {
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult;
        if ((distance < 0.0f && !J2()) || (distance > 0.0f && !nr())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            InlineClassHelperKt.t("entered drag with non-zero pending scroll");
        }
        float f3 = this.scrollToBeConsumed + distance;
        this.scrollToBeConsumed = f3;
        if (Math.abs(f3) > 0.5f) {
            float f4 = this.scrollToBeConsumed;
            int iRoundToInt = MathKt.roundToInt(f4);
            LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultO = ((LazyStaggeredGridMeasureResult) this.layoutInfoState.getValue()).O(iRoundToInt, !this.hasLookaheadOccurred);
            if (lazyStaggeredGridMeasureResultO != null && (lazyStaggeredGridMeasureResult = this.approachLayoutInfo) != null) {
                LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultO2 = lazyStaggeredGridMeasureResult != null ? lazyStaggeredGridMeasureResult.O(iRoundToInt, true) : null;
                if (lazyStaggeredGridMeasureResultO2 != null) {
                    this.approachLayoutInfo = lazyStaggeredGridMeasureResultO2;
                } else {
                    lazyStaggeredGridMeasureResultO = null;
                }
            }
            if (lazyStaggeredGridMeasureResultO != null) {
                gh(lazyStaggeredGridMeasureResultO, this.hasLookaheadOccurred, true);
                ObservableScopeInvalidator.J2(this.placementScopeInvalidator);
                N(f4 - this.scrollToBeConsumed, lazyStaggeredGridMeasureResultO);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.KN();
                }
                nHg(this, f4 - this.scrollToBeConsumed, null, 2, null);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f5 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] HI(int itemIndex, int laneCount) {
        int[] iArr = new int[laneCount];
        if (((LazyStaggeredGridMeasureResult) this.layoutInfoState.getValue()).getSpanProvider().n(itemIndex)) {
            ArraysKt.fill$default(iArr, itemIndex, 0, 0, 6, (Object) null);
            return iArr;
        }
        this.laneInfo.nr(itemIndex + laneCount);
        int iKN = this.laneInfo.KN(itemIndex);
        if (iKN != -2 && iKN != -1) {
            if ((iKN >= 0 ? 1 : 0) == 0) {
                InlineClassHelperKt.n("Expected positive lane number, got " + iKN + " instead.");
            }
            iMin = Math.min(iKN, laneCount);
        }
        int i2 = iMin;
        int i3 = i2 - 1;
        int iJ2 = itemIndex;
        while (true) {
            if (-1 >= i3) {
                break;
            }
            iJ2 = this.laneInfo.J2(iJ2, i3);
            iArr[i3] = iJ2;
            if (iJ2 == -1) {
                ArraysKt.fill$default(iArr, -1, 0, i3, 2, (Object) null);
                break;
            }
            i3--;
        }
        iArr[i2] = itemIndex;
        for (int i5 = i2 + 1; i5 < laneCount; i5++) {
            itemIndex = this.laneInfo.O(itemIndex, i5);
            iArr[i5] = itemIndex;
        }
        return iArr;
    }

    private final void N(float delta, LazyStaggeredGridMeasureResult info) {
        int i2;
        if (!this.prefetchingEnabled || info.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z2 = delta < 0.0f;
        int index = z2 ? ((LazyStaggeredGridMeasuredItem) CollectionsKt.last(info.getVisibleItemsInfo())).getIndex() : ((LazyStaggeredGridMeasuredItem) CollectionsKt.first(info.getVisibleItemsInfo())).getIndex();
        if (index == this.prefetchBaseIndex) {
            return;
        }
        this.prefetchBaseIndex = index;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LazyStaggeredGridSlots slots = info.getSlots();
        int length = slots.getSizes().length;
        for (int i3 = 0; i3 < length; i3++) {
            index = z2 ? this.laneInfo.O(index, i3) : this.laneInfo.J2(index, i3);
            if (index < 0 || index >= info.getTotalItemsCount() || linkedHashSet.contains(Integer.valueOf(index))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(index));
            if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(index))) {
                boolean zN = info.getSpanProvider().n(index);
                int i5 = zN ? 0 : i3;
                int i7 = zN ? length : 1;
                if (i7 == 1) {
                    i2 = slots.getSizes()[i5];
                } else {
                    int i8 = slots.getPositions()[i5];
                    int i9 = (i5 + i7) - 1;
                    i2 = (slots.getPositions()[i9] + slots.getSizes()[i9]) - i8;
                }
                this.currentItemPrefetchHandles.put(Integer.valueOf(index), this.prefetchState.O(index, info.getOrientation() == Orientation.f16969n ? Constraints.INSTANCE.O(i2) : Constraints.INSTANCE.nr(i2)));
            }
        }
        ty(linkedHashSet);
    }

    private void Xw(boolean z2) {
        this.canScrollForward.setValue(Boolean.valueOf(z2));
    }

    private void bzg(boolean z2) {
        this.canScrollBackward.setValue(Boolean.valueOf(z2));
    }

    static /* synthetic */ void nHg(LazyStaggeredGridState lazyStaggeredGridState, float f3, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lazyStaggeredGridMeasureResult = (LazyStaggeredGridMeasureResult) lazyStaggeredGridState.layoutInfoState.getValue();
        }
        lazyStaggeredGridState.N(f3, lazyStaggeredGridMeasureResult);
    }

    public static /* synthetic */ void qie(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        lazyStaggeredGridState.gh(lazyStaggeredGridMeasureResult, z2, z3);
    }

    public static /* synthetic */ Object rV9(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, Continuation continuation, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        return lazyStaggeredGridState.v(i2, i3, continuation);
    }

    private final void ty(Set prefetchHandlesUsed) {
        Iterator it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!prefetchHandlesUsed.contains(entry.getKey())) {
                ((LazyLayoutPrefetchState.PrefetchHandle) entry.getValue()).cancel();
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: E2, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean J2() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8.O(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        LazyStaggeredGridState$scroll$1 lazyStaggeredGridState$scroll$1;
        LazyStaggeredGridState lazyStaggeredGridState;
        if (continuation instanceof LazyStaggeredGridState$scroll$1) {
            lazyStaggeredGridState$scroll$1 = (LazyStaggeredGridState$scroll$1) continuation;
            int i2 = lazyStaggeredGridState$scroll$1.f18795o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyStaggeredGridState$scroll$1.f18795o = i2 - Integer.MIN_VALUE;
            } else {
                lazyStaggeredGridState$scroll$1 = new LazyStaggeredGridState$scroll$1(this, continuation);
            }
        }
        Object obj = lazyStaggeredGridState$scroll$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = lazyStaggeredGridState$scroll$1.f18795o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
            lazyStaggeredGridState$scroll$1.f18794n = this;
            lazyStaggeredGridState$scroll$1.f18797t = mutatePriority;
            lazyStaggeredGridState$scroll$1.f18793O = function2;
            lazyStaggeredGridState$scroll$1.f18795o = 1;
            if (awaitFirstLayoutModifier.rl(lazyStaggeredGridState$scroll$1) != coroutine_suspended) {
                lazyStaggeredGridState = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        function2 = (Function2) lazyStaggeredGridState$scroll$1.f18793O;
        mutatePriority = (MutatePriority) lazyStaggeredGridState$scroll$1.f18797t;
        lazyStaggeredGridState = (LazyStaggeredGridState) lazyStaggeredGridState$scroll$1.f18794n;
        ResultKt.throwOnFailure(obj);
        ScrollableState scrollableState = lazyStaggeredGridState.scrollableState;
        lazyStaggeredGridState$scroll$1.f18794n = null;
        lazyStaggeredGridState$scroll$1.f18797t = null;
        lazyStaggeredGridState$scroll$1.f18793O = null;
        lazyStaggeredGridState$scroll$1.f18795o = 2;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final LazyLayoutItemAnimator getItemAnimator() {
        return this.itemAnimator;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final LazyStaggeredGridScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    public final int[] U(LazyLayoutItemProvider itemProvider, int[] firstItemIndex) {
        return this.scrollPosition.ty(itemProvider, firstItemIndex);
    }

    public final LazyStaggeredGridLayoutInfo ViF() {
        return (LazyStaggeredGridLayoutInfo) this.layoutInfoState.getValue();
    }

    public final int WPU() {
        return ((LazyStaggeredGridMeasureResult) this.layoutInfoState.getValue()).getSlots().getSizes().length;
    }

    public final float X() {
        return this._lazyLayoutScrollDeltaBetweenPasses.rl();
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    public final int Z() {
        return this.scrollPosition.J2();
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final LazyStaggeredGridMeasureResult getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* JADX INFO: renamed from: fD, reason: from getter */
    public final MutableState getPlacementScopeInvalidator() {
        return this.placementScopeInvalidator;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final MutableInteractionSource getMutableInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final void gh(LazyStaggeredGridMeasureResult result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.az(result.getFirstVisibleItemScrollOffsets());
        } else {
            this.scrollPosition.qie(result);
            az(result);
        }
        bzg(result.KN());
        Xw(result.getCanScrollForward());
        if (isLookingAhead) {
            this._lazyLayoutScrollDeltaBetweenPasses.t(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
        }
        this.measurePassCount++;
    }

    /* JADX INFO: renamed from: iF, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    public final void jB(int index, int scrollOffset, boolean forceRemeasure) {
        boolean z2 = (this.scrollPosition.t() == index && this.scrollPosition.J2() == scrollOffset) ? false : true;
        if (z2) {
            this.itemAnimator.ck();
        }
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult = (LazyStaggeredGridMeasureResult) this.layoutInfoState.getValue();
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfoN = LazyStaggeredGridMeasureResultKt.n(lazyStaggeredGridMeasureResult, index);
        if (lazyStaggeredGridItemInfoN == null || !z2) {
            this.scrollPosition.KN(index, scrollOffset);
        } else {
            int iQie = (lazyStaggeredGridMeasureResult.getOrientation() == Orientation.f16969n ? IntOffset.qie(lazyStaggeredGridItemInfoN.getOffset()) : IntOffset.gh(lazyStaggeredGridItemInfoN.getOffset())) + scrollOffset;
            int length = lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets().length;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets()[i2] + iQie;
            }
            this.scrollPosition.az(iArr);
        }
        if (!forceRemeasure) {
            ObservableScopeInvalidator.J2(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.KN();
        }
    }

    /* JADX INFO: renamed from: nY, reason: from getter */
    public final MutableState getMeasurementScopeInvalidator() {
        return this.measurementScopeInvalidator;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean nr() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public final int o() {
        return this.scrollPosition.t();
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float rl(float delta) {
        return this.scrollableState.rl(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean t() {
        return this.scrollableState.t();
    }

    public final IntRange te() {
        return (IntRange) this.scrollPosition.getNearestRangeState().getValue();
    }

    public final Object v(int i2, int i3, Continuation continuation) {
        Object objN = ScrollableState.n(this, null, new LazyStaggeredGridState$scrollToItem$2(this, i2, i3, null), continuation, 1, null);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public final float wTp(boolean isLookingAhead) {
        return (isLookingAhead || !this.hasLookaheadOccurred) ? this.scrollToBeConsumed : X();
    }

    private final void az(LazyStaggeredGridLayoutInfo info) {
        List visibleItemsInfo = info.getVisibleItemsInfo();
        if (this.prefetchBaseIndex != -1 && !visibleItemsInfo.isEmpty()) {
            int index = ((LazyStaggeredGridItemInfo) CollectionsKt.first(visibleItemsInfo)).getIndex();
            int index2 = ((LazyStaggeredGridItemInfo) CollectionsKt.last(visibleItemsInfo)).getIndex();
            int i2 = this.prefetchBaseIndex;
            if (index <= i2 && i2 <= index2) {
                return;
            }
            this.prefetchBaseIndex = -1;
            Iterator it = this.currentItemPrefetchHandles.values().iterator();
            while (it.hasNext()) {
                ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
            }
            this.currentItemPrefetchHandles.clear();
        }
    }

    public LazyStaggeredGridState(int i2, int i3) {
        this(new int[]{i2}, new int[]{i3}, null);
    }
}
