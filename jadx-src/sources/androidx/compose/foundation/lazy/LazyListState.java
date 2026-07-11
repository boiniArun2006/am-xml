package androidx.compose.foundation.lazy;

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
import androidx.compose.ui.unit.Density;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Stable
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u0096\u00012\u00020\u0001:\u0002¤\u0001B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192'\u0010 \u001a#\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001b¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0000¢\u0006\u0004\b&\u0010$J$\u0010'\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b'\u0010\u0014J)\u0010,\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00152\b\b\u0002\u0010+\u001a\u00020\u0015H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0002H\u0000¢\u0006\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u00109\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b#\u00106\u001a\u0004\b7\u00108R(\u0010>\u001a\u0004\u0018\u00010(2\b\u00105\u001a\u0004\u0018\u00010(8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020(0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010DR\u001a\u0010K\u001a\u00020F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR$\u0010P\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010X\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\"\u0010]\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u00106\u001a\u0004\bZ\u00108\"\u0004\b[\u0010\\R(\u0010b\u001a\u0004\u0018\u00010^2\b\u00105\u001a\u0004\u0018\u00010^8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b'\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010h\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010m\u001a\u00020i8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010j\u001a\u0004\bk\u0010lR \u0010t\u001a\b\u0012\u0004\u0012\u00020o0n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001a\u0010y\u001a\u00020u8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010~\u001a\u00020z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010{\u001a\u0004\b|\u0010}R\u0016\u0010\u0081\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bw\u0010\u0080\u0001R \u0010\u0087\u0001\u001a\u00030\u0082\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R%\u0010\u008c\u0001\u001a\u00030\u0088\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u0089\u0001\u0010D\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R-\u0010\u008e\u0001\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\b6\u0010D\u001a\u0004\bG\u00108\"\u0005\b\u008d\u0001\u0010\\R-\u0010\u0090\u0001\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00158V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\b7\u0010D\u001a\u0004\b@\u00108\"\u0005\b\u008f\u0001\u0010\\R$\u0010\u0092\u0001\u001a\u00030\u0088\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\bI\u0010D\u001a\u0006\b\u0091\u0001\u0010\u008b\u0001R\u0017\u0010\u0095\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\br\u0010\u0094\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010WR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b6\u0010WR\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0098\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0099\u0001R!\u0010 \u0001\u001a\u00030\u009b\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001*\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0015\u0010¡\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0016\u0010£\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¥\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "prefetchStrategy", "<init>", "(IILandroidx/compose/foundation/lazy/LazyListPrefetchStrategy;)V", "(II)V", "", "delta", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "", "X", "(FLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)V", "index", "scrollOffset", "N", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "forceRemeasure", "v", "(IIZ)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "O", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rl", "(F)F", "distance", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "gh", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "result", "isLookingAhead", "visibleItemsStayedTheSame", "az", "(Landroidx/compose/foundation/lazy/LazyListMeasureResult;ZZ)V", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "firstItemIndex", "rV9", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;I)I", c.f62177j, "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "<set-?>", "Z", "XQ", "()Z", "hasLookaheadOccurred", "t", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "HI", "()Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "approachLayoutInfo", "Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "nr", "Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "scrollPosition", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "J2", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "S", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Uo", "F", "e", "()F", "scrollToBeConsumed", "KN", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "xMQ", "I", "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "mUb", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "qie", "Landroidx/compose/ui/layout/RemeasurementModifier;", "fD", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "ck", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "ty", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "WPU", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "Ik", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "iF", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/LazyListPrefetchScope;", "Landroidx/compose/foundation/lazy/LazyListPrefetchScope;", "prefetchScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "r", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "g", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "o", "ViF", "()Landroidx/compose/runtime/MutableState;", "measurementScopeInvalidator", "wTp", "canScrollForward", "s7N", "canScrollBackward", "te", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "_lazyLayoutScrollDeltaBetweenPasses", "aYN", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/ui/unit/Density;", "()Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/ranges/IntRange;", "nY", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/LazyListState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "E2", "scrollDeltaBetweenPasses", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,603:1\n85#2:604\n85#2:605\n113#2,2:606\n85#2:608\n113#2,2:609\n50#3,5:611\n26#4:616\n1#5:617\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n*L\n285#1:604\n374#1:605\n374#1:606,2\n377#1:608\n377#1:609,2\n397#1:611,5\n407#1:616\n*E\n"})
public final class LazyListState implements ScrollableState {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final LazyListPrefetchScope prefetchScope;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableInteractionSource internalInteractionSource;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final ScrollableState scrollableState;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState layoutInfoState;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final MutableState placementScopeInvalidator;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private float scrollToBeConsumed;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final MutableState canScrollBackward;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final MutableState canScrollForward;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final LazyLayoutPrefetchState prefetchState;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private Remeasurement remeasurement;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyListPrefetchStrategy prefetchStrategy;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final LazyListScrollPosition scrollPosition;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableState measurementScopeInvalidator;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final RemeasurementModifier remeasurementModifier;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutPinnedItemList pinnedItems;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private LazyListMeasureResult approachLayoutInfo;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final LazyLayoutItemAnimator itemAnimator;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int numMeasurePasses;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver ViF = ListSaverKt.n(new Function2<SaverScope, LazyListState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final List invoke(SaverScope saverScope, LazyListState lazyListState) {
            return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(lazyListState.o()), Integer.valueOf(lazyListState.Z())});
        }
    }, new Function1<List<? extends Integer>, LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final LazyListState invoke(List list) {
            return new LazyListState(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/LazyListState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", c.f62177j, "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n() {
            return LazyListState.ViF;
        }
    }

    public LazyListState(final int i2, int i3, LazyListPrefetchStrategy lazyListPrefetchStrategy) {
        this.prefetchStrategy = lazyListPrefetchStrategy;
        LazyListScrollPosition lazyListScrollPosition = new LazyListScrollPosition(i2, i3);
        this.scrollPosition = lazyListScrollPosition;
        this.layoutInfoState = SnapshotStateKt.xMQ(LazyListStateKt.f18135n, SnapshotStateKt.gh());
        this.internalInteractionSource = InteractionSourceKt.n();
        this.scrollableState = ScrollableStateKt.n(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.LazyListState$scrollableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f3) {
                return n(f3.floatValue());
            }

            public final Float n(float f3) {
                return Float.valueOf(-this.f18134n.T(-f3));
            }
        });
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void VwL(Remeasurement remeasurement) {
                this.f18122n.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.itemAnimator = new LazyLayoutItemAnimator();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchState = new LazyLayoutPrefetchState(lazyListPrefetchStrategy.rl(), new Function1<NestedPrefetchScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListState$prefetchState$1
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
                LazyListPrefetchStrategy lazyListPrefetchStrategy2 = this.f18120n.prefetchStrategy;
                int i5 = i2;
                Snapshot.Companion companion = Snapshot.INSTANCE;
                Snapshot snapshotNr = companion.nr();
                companion.az(snapshotNr, companion.O(snapshotNr), snapshotNr != null ? snapshotNr.Uo() : null);
                lazyListPrefetchStrategy2.n(nestedPrefetchScope, i5);
            }
        });
        this.prefetchScope = new LazyListPrefetchScope() { // from class: androidx.compose.foundation.lazy.LazyListState$prefetchScope$1
            @Override // androidx.compose.foundation.lazy.LazyListPrefetchScope
            public LazyLayoutPrefetchState.PrefetchHandle n(int index) {
                Snapshot.Companion companion = Snapshot.INSTANCE;
                LazyListState lazyListState = this.f18119n;
                Snapshot snapshotNr = companion.nr();
                Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
                Snapshot snapshotO = companion.O(snapshotNr);
                try {
                    long childConstraints = ((LazyListMeasureResult) lazyListState.layoutInfoState.getValue()).getChildConstraints();
                    companion.az(snapshotNr, snapshotO, function1Uo);
                    return this.f18119n.getPrefetchState().O(index, childConstraints);
                } catch (Throwable th) {
                    companion.az(snapshotNr, snapshotO, function1Uo);
                    throw th;
                }
            }
        };
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyListScrollPosition.getNearestRangeState();
        this.measurementScopeInvalidator = ObservableScopeInvalidator.t(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.O(bool, null, 2, null);
        this.placementScopeInvalidator = ObservableScopeInvalidator.t(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public final float T(float distance) {
        LazyListMeasureResult lazyListMeasureResult;
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
            int iRound = Math.round(f4);
            LazyListMeasureResult lazyListMeasureResultMUb = ((LazyListMeasureResult) this.layoutInfoState.getValue()).mUb(iRound, !this.hasLookaheadOccurred);
            if (lazyListMeasureResultMUb != null && (lazyListMeasureResult = this.approachLayoutInfo) != null) {
                LazyListMeasureResult lazyListMeasureResultMUb2 = lazyListMeasureResult != null ? lazyListMeasureResult.mUb(iRound, true) : null;
                if (lazyListMeasureResultMUb2 != null) {
                    this.approachLayoutInfo = lazyListMeasureResultMUb2;
                } else {
                    lazyListMeasureResultMUb = null;
                }
            }
            if (lazyListMeasureResultMUb != null) {
                az(lazyListMeasureResultMUb, this.hasLookaheadOccurred, true);
                ObservableScopeInvalidator.J2(this.placementScopeInvalidator);
                X(f4 - this.scrollToBeConsumed, lazyListMeasureResultMUb);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.KN();
                }
                X(f4 - this.scrollToBeConsumed, aYN());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return distance;
        }
        float f5 = distance - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f5;
    }

    private final void X(float delta, LazyListLayoutInfo layoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.t(this.prefetchScope, delta, layoutInfo);
        }
    }

    public static /* synthetic */ Object nHg(LazyListState lazyListState, int i2, int i3, Continuation continuation, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        return lazyListState.N(i2, i3, continuation);
    }

    public static /* synthetic */ Object qie(LazyListState lazyListState, int i2, int i3, Continuation continuation, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        return lazyListState.gh(i2, i3, continuation);
    }

    private void s7N(boolean z2) {
        this.canScrollBackward.setValue(Boolean.valueOf(z2));
    }

    public static /* synthetic */ void ty(LazyListState lazyListState, LazyListMeasureResult lazyListMeasureResult, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        lazyListState.az(lazyListMeasureResult, z2, z3);
    }

    private void wTp(boolean z2) {
        this.canScrollForward.setValue(Boolean.valueOf(z2));
    }

    public final float E2() {
        return this._lazyLayoutScrollDeltaBetweenPasses.rl();
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final LazyListMeasureResult getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean J2() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    public final Object N(int i2, int i3, Continuation continuation) {
        Object objN = ScrollableState.n(this, null, new LazyListState$scrollToItem$2(this, i2, i3, null), continuation, 1, null);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
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
        LazyListState$scroll$1 lazyListState$scroll$1;
        LazyListState lazyListState;
        if (continuation instanceof LazyListState$scroll$1) {
            lazyListState$scroll$1 = (LazyListState$scroll$1) continuation;
            int i2 = lazyListState$scroll$1.f18128o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lazyListState$scroll$1.f18128o = i2 - Integer.MIN_VALUE;
            } else {
                lazyListState$scroll$1 = new LazyListState$scroll$1(this, continuation);
            }
        }
        Object obj = lazyListState$scroll$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = lazyListState$scroll$1.f18128o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            AwaitFirstLayoutModifier awaitFirstLayoutModifier = this.awaitLayoutModifier;
            lazyListState$scroll$1.f18127n = this;
            lazyListState$scroll$1.f18130t = mutatePriority;
            lazyListState$scroll$1.f18126O = function2;
            lazyListState$scroll$1.f18128o = 1;
            if (awaitFirstLayoutModifier.rl(lazyListState$scroll$1) != coroutine_suspended) {
                lazyListState = this;
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
        function2 = (Function2) lazyListState$scroll$1.f18126O;
        mutatePriority = (MutatePriority) lazyListState$scroll$1.f18130t;
        lazyListState = (LazyListState) lazyListState$scroll$1.f18127n;
        ResultKt.throwOnFailure(obj);
        ScrollableState scrollableState = lazyListState.scrollableState;
        lazyListState$scroll$1.f18127n = null;
        lazyListState$scroll$1.f18130t = null;
        lazyListState$scroll$1.f18126O = null;
        lazyListState$scroll$1.f18128o = 2;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    /* JADX INFO: renamed from: ViF, reason: from getter */
    public final MutableState getMeasurementScopeInvalidator() {
        return this.measurementScopeInvalidator;
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final LazyLayoutItemAnimator getItemAnimator() {
        return this.itemAnimator;
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    public final int Z() {
        return this.scrollPosition.t();
    }

    public final LazyListLayoutInfo aYN() {
        return (LazyListLayoutInfo) this.layoutInfoState.getValue();
    }

    public final void az(LazyListMeasureResult result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        s7N(result.gh());
        wTp(result.getCanScrollForward());
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.xMQ(result.getFirstVisibleItemScrollOffset());
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

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
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

    public final Object gh(int i2, int i3, Continuation continuation) {
        Object objN = ScrollableState.n(this, null, new LazyListState$animateScrollToItem$2(this, i2, i3, null), continuation, 1, null);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: iF, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    public final IntRange nY() {
        return (IntRange) this.scrollPosition.getNearestRangeState().getValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean nr() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public final int o() {
        return this.scrollPosition.n();
    }

    public final Density r() {
        return ((LazyListMeasureResult) this.layoutInfoState.getValue()).getDensity();
    }

    public final int rV9(LazyListItemProvider itemProvider, int firstItemIndex) {
        return this.scrollPosition.mUb(itemProvider, firstItemIndex);
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

    public final void v(int index, int scrollOffset, boolean forceRemeasure) {
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

    public /* synthetic */ LazyListState(int i2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3);
    }

    public LazyListState(int i2, int i3) {
        this(i2, i3, LazyListPrefetchStrategyKt.rl(0, 1, null));
    }
}
