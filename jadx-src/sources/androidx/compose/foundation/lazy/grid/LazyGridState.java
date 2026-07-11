package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
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
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002§\u0001B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192'\u0010 \u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001b¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0000¢\u0006\u0004\b&\u0010$J)\u0010+\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00152\b\b\u0002\u0010*\u001a\u00020\u0015H\u0000¢\u0006\u0004\b+\u0010,J\u001f\u00100\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0002H\u0000¢\u0006\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u00107\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b#\u00105\u001a\u0004\b5\u00106R(\u0010<\u001a\u0004\u0018\u00010'2\b\u00104\u001a\u0004\u0018\u00010'8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020'0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010BR\u001a\u0010I\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR$\u0010N\u001a\u00020\n2\u0006\u00104\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010V\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\"\u0010[\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u00105\u001a\u0004\bX\u00106\"\u0004\bY\u0010ZR(\u0010a\u001a\u0004\u0018\u00010\\2\b\u00104\u001a\u0004\u0018\u00010\\8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010f\u001a\u00020b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010l\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR \u0010r\u001a\b\u0012\u0004\u0012\u00020n0m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010w\u001a\u00020s8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010|\u001a\u00020x8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010y\u001a\u0004\bz\u0010{R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR \u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R%\u0010\u008b\u0001\u001a\u00030\u0087\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010B\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R$\u0010\u008d\u0001\u001a\u00030\u0087\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\b5\u0010B\u001a\u0006\b\u008c\u0001\u0010\u008a\u0001R-\u0010\u008f\u0001\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\bG\u0010B\u001a\u0004\bE\u00106\"\u0005\b\u008e\u0001\u0010ZR-\u0010\u0091\u0001\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\bp\u0010B\u001a\u0004\b>\u00106\"\u0005\b\u0090\u0001\u0010ZR\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0097\u0001\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010UR\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010UR\u0012\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010UR\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0098\u0001R\u0016\u0010\u009a\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010UR\u0017\u0010\u009d\u0001\u001a\u00030\u009b\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b~\u0010\u009c\u0001R!\u0010£\u0001\u001a\u00030\u009e\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b\u009f\u0001\u0010 \u0001*\u0006\b¡\u0001\u0010¢\u0001R\u0015\u0010¤\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0016\u0010¦\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010M\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¨\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "prefetchStrategy", "<init>", "(IILandroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;)V", "(II)V", "", "delta", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfo", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(FLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)V", "index", "scrollOffset", "nHg", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "forceRemeasure", "rV9", "(IIZ)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "O", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rl", "(F)F", "distance", "N", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "result", "isLookingAhead", "visibleItemsStayedTheSame", "qie", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;ZZ)V", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "firstItemIndex", "bzg", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I", c.f62177j, "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "<set-?>", "Z", "()Z", "hasLookaheadOccurred", "t", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "ty", "()Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "approachLayoutInfo", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "nr", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "scrollPosition", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "J2", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "XQ", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Uo", "F", "e", "()F", "scrollToBeConsumed", "KN", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "xMQ", "I", "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "mUb", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "Landroidx/compose/ui/layout/Remeasurement;", "gh", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/ui/layout/RemeasurementModifier;", "fD", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "az", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "HI", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "S", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "ck", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "iF", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;", "Ik", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchScope;", "prefetchScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "r", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "g", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "o", "te", "()Landroidx/compose/runtime/MutableState;", "placementScopeInvalidator", "aYN", "measurementScopeInvalidator", "v", "canScrollForward", "wTp", "canScrollBackward", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "WPU", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "_lazyLayoutScrollDeltaBetweenPasses", "nY", "numOfItemsToTeleport", "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "X", "slotsPerLine", "Landroidx/compose/ui/unit/Density;", "()Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/ranges/IntRange;", "ViF", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "E2", "scrollDeltaBetweenPasses", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,613:1\n85#2:614\n85#2:615\n113#2,2:616\n85#2:618\n113#2,2:619\n50#3,5:621\n1#4:626\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n300#1:614\n386#1:615\n386#1:616,2\n389#1:618\n389#1:619,2\n407#1:621,5\n*E\n"})
public final class LazyGridState implements ScrollableState {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final LazyGridPrefetchScope prefetchScope;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableInteractionSource internalInteractionSource;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final ScrollableState scrollableState;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState layoutInfoState;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final MutableState canScrollBackward;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private float scrollToBeConsumed;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final MutableState canScrollForward;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final MutableState measurementScopeInvalidator;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final LazyLayoutPrefetchState prefetchState;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private Remeasurement remeasurement;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyGridPrefetchStrategy prefetchStrategy;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final LazyGridScrollPosition scrollPosition;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableState placementScopeInvalidator;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final RemeasurementModifier remeasurementModifier;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutPinnedItemList pinnedItems;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private LazyGridMeasureResult approachLayoutInfo;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final LazyLayoutItemAnimator itemAnimator;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int numMeasurePasses;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver ViF = ListSaverKt.n(new Function2<SaverScope, LazyGridState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final List invoke(SaverScope saverScope, LazyGridState lazyGridState) {
            return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(lazyGridState.r()), Integer.valueOf(lazyGridState.o())});
        }
    }, new Function1<List<? extends Integer>, LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final LazyGridState invoke(List list) {
            return new LazyGridState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", c.f62177j, "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n() {
            return LazyGridState.ViF;
        }
    }

    public LazyGridState(final int i2, int i3, LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
        this.prefetchStrategy = lazyGridPrefetchStrategy;
        LazyGridScrollPosition lazyGridScrollPosition = new LazyGridScrollPosition(i2, i3);
        this.scrollPosition = lazyGridScrollPosition;
        this.layoutInfoState = SnapshotStateKt.xMQ(LazyGridStateKt.f18364n, SnapshotStateKt.gh());
        this.internalInteractionSource = InteractionSourceKt.n();
        this.scrollableState = ScrollableStateKt.n(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f3) {
                return n(f3.floatValue());
            }

            public final Float n(float f3) {
                return Float.valueOf(-this.f18363n.N(-f3));
            }
        });
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void VwL(Remeasurement remeasurement) {
                this.f18352n.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.itemAnimator = new LazyLayoutItemAnimator();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchState = new LazyLayoutPrefetchState(lazyGridPrefetchStrategy.rl(), new Function1<NestedPrefetchScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NestedPrefetchScope nestedPrefetchScope) {
                n(nestedPrefetchScope);
                return Unit.INSTANCE;
            }

            public final void n(NestedPrefetchScope nestedPrefetchScope) {
                LazyGridPrefetchStrategy lazyGridPrefetchStrategy2 = this.f18350n.prefetchStrategy;
                int i5 = i2;
                Snapshot.Companion companion = Snapshot.INSTANCE;
                Snapshot snapshotNr = companion.nr();
                companion.az(snapshotNr, companion.O(snapshotNr), snapshotNr != null ? snapshotNr.Uo() : null);
                lazyGridPrefetchStrategy2.n(nestedPrefetchScope, i5);
            }
        });
        this.prefetchScope = new LazyGridPrefetchScope() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchScope$1
            @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope
            public List n(int lineIndex) {
                ArrayList arrayList = new ArrayList();
                Snapshot.Companion companion = Snapshot.INSTANCE;
                LazyGridState lazyGridState = this.f18349n;
                Snapshot snapshotNr = companion.nr();
                Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
                Snapshot snapshotO = companion.O(snapshotNr);
                try {
                    LazyGridMeasureResult approachLayoutInfo = lazyGridState.getHasLookaheadOccurred() ? lazyGridState.getApproachLayoutInfo() : (LazyGridMeasureResult) lazyGridState.layoutInfoState.getValue();
                    if (approachLayoutInfo != null) {
                        List list = (List) approachLayoutInfo.getPrefetchInfoRetriever().invoke(Integer.valueOf(lineIndex));
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            Pair pair = (Pair) list.get(i5);
                            arrayList.add(lazyGridState.getPrefetchState().O(((Number) pair.getFirst()).intValue(), ((Constraints) pair.getSecond()).getValue()));
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    companion.az(snapshotNr, snapshotO, function1Uo);
                    return arrayList;
                } catch (Throwable th) {
                    companion.az(snapshotNr, snapshotO, function1Uo);
                    throw th;
                }
            }
        };
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.t(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.t(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public final float N(float distance) {
        LazyGridMeasureResult lazyGridMeasureResult;
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
            LazyGridMeasureResult lazyGridMeasureResultMUb = ((LazyGridMeasureResult) this.layoutInfoState.getValue()).mUb(iRoundToInt, !this.hasLookaheadOccurred);
            if (lazyGridMeasureResultMUb != null && (lazyGridMeasureResult = this.approachLayoutInfo) != null) {
                LazyGridMeasureResult lazyGridMeasureResultMUb2 = lazyGridMeasureResult != null ? lazyGridMeasureResult.mUb(iRoundToInt, true) : null;
                if (lazyGridMeasureResultMUb2 != null) {
                    this.approachLayoutInfo = lazyGridMeasureResultMUb2;
                } else {
                    lazyGridMeasureResultMUb = null;
                }
            }
            if (lazyGridMeasureResultMUb != null) {
                qie(lazyGridMeasureResultMUb, this.hasLookaheadOccurred, true);
                ObservableScopeInvalidator.J2(this.placementScopeInvalidator);
                T(f4 - this.scrollToBeConsumed, lazyGridMeasureResultMUb);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.KN();
                }
                T(f4 - this.scrollToBeConsumed, WPU());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f5 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f5;
    }

    private final void T(float delta, LazyGridLayoutInfo layoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.t(this.prefetchScope, delta, layoutInfo);
        }
    }

    public static /* synthetic */ void az(LazyGridState lazyGridState, LazyGridMeasureResult lazyGridMeasureResult, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        lazyGridState.qie(lazyGridMeasureResult, z2, z3);
    }

    public static /* synthetic */ Object s7N(LazyGridState lazyGridState, int i2, int i3, Continuation continuation, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        return lazyGridState.nHg(i2, i3, continuation);
    }

    private void v(boolean z2) {
        this.canScrollForward.setValue(Boolean.valueOf(z2));
    }

    private void wTp(boolean z2) {
        this.canScrollBackward.setValue(Boolean.valueOf(z2));
    }

    public final float E2() {
        return this._lazyLayoutScrollDeltaBetweenPasses.rl();
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    public final Density Ik() {
        return ((LazyGridMeasureResult) this.layoutInfoState.getValue()).getDensity();
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
        LazyGridState$scroll$1 lazyGridState$scroll$1;
        LazyGridState lazyGridState;
        if (continuation instanceof LazyGridState$scroll$1) {
            lazyGridState$scroll$1 = (LazyGridState$scroll$1) continuation;
            int i2 = lazyGridState$scroll$1.f18357o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyGridState$scroll$1.f18357o = i2 - Integer.MIN_VALUE;
            } else {
                lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, continuation);
            }
        }
        Object obj = lazyGridState$scroll$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = lazyGridState$scroll$1.f18357o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
            lazyGridState$scroll$1.f18356n = this;
            lazyGridState$scroll$1.f18359t = mutatePriority;
            lazyGridState$scroll$1.f18355O = function2;
            lazyGridState$scroll$1.f18357o = 1;
            if (awaitFirstLayoutModifier.rl(lazyGridState$scroll$1) != coroutine_suspended) {
                lazyGridState = this;
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
        function2 = (Function2) lazyGridState$scroll$1.f18355O;
        mutatePriority = (MutatePriority) lazyGridState$scroll$1.f18359t;
        lazyGridState = (LazyGridState) lazyGridState$scroll$1.f18356n;
        ResultKt.throwOnFailure(obj);
        ScrollableState scrollableState = lazyGridState.scrollableState;
        lazyGridState$scroll$1.f18356n = null;
        lazyGridState$scroll$1.f18359t = null;
        lazyGridState$scroll$1.f18355O = null;
        lazyGridState$scroll$1.f18357o = 2;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final LazyLayoutItemAnimator getItemAnimator() {
        return this.itemAnimator;
    }

    public final IntRange ViF() {
        return (IntRange) this.scrollPosition.getNearestRangeState().getValue();
    }

    public final LazyGridLayoutInfo WPU() {
        return (LazyGridLayoutInfo) this.layoutInfoState.getValue();
    }

    public final int X() {
        return ((LazyGridMeasureResult) this.layoutInfoState.getValue()).getSlotsPerLine();
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final MutableState getMeasurementScopeInvalidator() {
        return this.measurementScopeInvalidator;
    }

    public final int bzg(LazyGridItemProvider itemProvider, int firstItemIndex) {
        return this.scrollPosition.mUb(itemProvider, firstItemIndex);
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getScrollToBeConsumed() {
        return this.scrollToBeConsumed;
    }

    /* JADX INFO: renamed from: fD, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedItems() {
        return this.pinnedItems;
    }

    /* JADX INFO: renamed from: iF, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    public final Object nHg(int i2, int i3, Continuation continuation) {
        Object objN = ScrollableState.n(this, null, new LazyGridState$scrollToItem$2(this, i2, i3, null), continuation, 1, null);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean nr() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public final int o() {
        return this.scrollPosition.t();
    }

    public final void qie(LazyGridMeasureResult result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        wTp(result.gh());
        v(result.getCanScrollForward());
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.xMQ(result.getFirstVisibleLineScrollOffset());
        } else {
            this.scrollPosition.KN(result);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.nr(this.prefetchScope, result);
            }
        }
        if (isLookingAhead) {
            this._lazyLayoutScrollDeltaBetweenPasses.t(result.getScrollBackAmount(), result.getDensity(), result.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    public final int r() {
        return this.scrollPosition.n();
    }

    public final void rV9(int index, int scrollOffset, boolean forceRemeasure) {
        if (this.scrollPosition.n() != index || this.scrollPosition.t() != scrollOffset) {
            this.itemAnimator.ck();
        }
        this.scrollPosition.nr(index, scrollOffset);
        if (!forceRemeasure) {
            ObservableScopeInvalidator.J2(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.KN();
        }
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float rl(float delta) {
        return this.scrollableState.rl(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean t() {
        return this.scrollableState.t();
    }

    /* JADX INFO: renamed from: te, reason: from getter */
    public final MutableState getPlacementScopeInvalidator() {
        return this.placementScopeInvalidator;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final LazyGridMeasureResult getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int nY() {
        return X() * 100;
    }

    public LazyGridState(int i2, int i3) {
        this(i2, i3, LazyGridPrefetchStrategyKt.rl(0, 1, null));
    }
}
