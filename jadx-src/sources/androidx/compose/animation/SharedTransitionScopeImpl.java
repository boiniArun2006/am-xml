package androidx.compose.animation;

import GJW.C;
import GJW.vd;
import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@ExperimentalSharedTransitionApi
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0002jkB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJO\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\nJ3\u0010'\u001a\u00020$*\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u0011H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0014\u0010)\u001a\u00020\"*\u00020\"H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u001aH\u0000¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u001aH\u0000¢\u0006\u0004\b2\u00101J\u0017\u00105\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\bH\u0000¢\u0006\u0004\b8\u0010\nJ9\u0010=\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u000b2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b092\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0;H\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u001dH\u0000¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR$\u0010I\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bG\u0010HR+\u0010N\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u00118V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bJ\u0010H\"\u0004\bL\u0010MR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\b0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010OR \u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010Y\u001a\u00020\"8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b2\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\\\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010T\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u0002030]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010^R \u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010f\u001a\u00020\"*\u00020d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010eR\u0014\u0010h\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010V\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006l"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl;", "Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "LGJW/vd;", "coroutineScope", "<init>", "(Landroidx/compose/ui/layout/LookaheadScope;LGJW/vd;)V", "", "g", "()V", "Landroidx/compose/animation/SharedElement;", "sharedElement", "Landroidx/compose/animation/BoundsAnimation;", "boundsAnimation", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "placeHolderSize", "", "renderOnlyWhenVisible", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "sharedContentState", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "clipInOverlayDuringTransition", "", "zIndexInOverlay", "renderInOverlayDuringTransition", "Landroidx/compose/animation/SharedElementInternalState;", "S", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/SharedTransitionScope$OverlayClip;FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedElementInternalState;", "", "key", "nY", "(Ljava/lang/Object;)Landroidx/compose/animation/SharedElement;", "qie", "Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "includeMotionFrameOfReference", "HI", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "r", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "scope", "xMQ", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "sharedElementState", "XQ", "(Landroidx/compose/animation/SharedElementInternalState;)V", "Z", "Landroidx/compose/animation/LayerRenderer;", "renderer", "ck", "(Landroidx/compose/animation/LayerRenderer;)V", "Ik", "ty", "Lkotlin/Function1;", "onValueChangedForScope", "Lkotlin/Function0;", "block", "az", "(Landroidx/compose/animation/SharedElement;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "KN", "(Ljava/lang/Object;)V", c.f62177j, "LGJW/vd;", "getCoroutineScope", "()LGJW/vd;", "<set-?>", "O", "getDisposed$animation_release", "()Z", "disposed", "J2", "Landroidx/compose/runtime/MutableState;", "ViF", "(Z)V", "isTransitionActive", "Lkotlin/jvm/functions/Function0;", "observeAnimatingBlock", "o", "Lkotlin/jvm/functions/Function1;", "updateTransitionActiveness", "Landroidx/compose/ui/layout/LayoutCoordinates;", "gh", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "aYN", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "root", "getNullableLookaheadRoot$animation_release", "WPU", "nullableLookaheadRoot", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "renderers", "Landroidx/collection/MutableScatterMap;", "E2", "Landroidx/collection/MutableScatterMap;", "sharedElements", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates", "mUb", "lookaheadRoot", "e", "Companion", "ShapeBasedClip", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1221:1\n85#2:1222\n113#2,2:1223\n1247#3,6:1225\n1247#3,6:1308\n385#4:1231\n357#4,4:1232\n329#4,6:1236\n339#4,3:1243\n342#4,9:1247\n361#4:1256\n386#4:1257\n357#4,4:1258\n329#4,6:1262\n339#4,3:1269\n342#4,9:1273\n361#4:1282\n357#4,4:1283\n329#4,6:1287\n339#4,3:1294\n342#4,9:1298\n361#4:1307\n1399#5:1242\n1270#5:1246\n1399#5:1268\n1270#5:1272\n1399#5:1293\n1270#5:1297\n1#6:1314\n1002#7,2:1315\n350#7,7:1323\n34#8,6:1317\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n*L\n673#1:1222\n673#1:1223,2\n875#1:1225,6\n992#1:1308,6\n887#1:1231\n887#1:1232,4\n887#1:1236,6\n887#1:1243,3\n887#1:1247,9\n887#1:1256\n887#1:1257\n891#1:1258,4\n891#1:1262,6\n891#1:1269,3\n891#1:1273,9\n891#1:1282\n894#1:1283,4\n894#1:1287,6\n894#1:1294,3\n894#1:1298,9\n894#1:1307\n887#1:1242\n887#1:1246\n891#1:1268\n891#1:1272\n894#1:1293\n894#1:1297\n1040#1:1315,2\n1070#1:1323,7\n1045#1:1317,6\n*E\n"})
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private LayoutCoordinates nullableLookaheadRoot;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public LayoutCoordinates root;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final vd coroutineScope;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ LookaheadScope f15318t;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final Lazy f15309X = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<SnapshotStateObserver>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new Function1<Function0<? extends Unit>, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
                    n(function0);
                    return Unit.INSTANCE;
                }

                public final void n(Function0 function0) {
                    function0.invoke();
                }
            });
            snapshotStateObserver.Z();
            return snapshotStateObserver;
        }
    });

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final MutableState isTransitionActive = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Function0 observeAnimatingBlock = new Function0<Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$observeAnimatingBlock$1
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
            MutableScatterMap mutableScatterMap = this.f15322n.sharedElements;
            Object[] objArr = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
            Object[] objArr2 = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i2 << 3) + i5;
                            Object obj = objArr[i7];
                            if (((SharedElement) objArr2[i7]).qie()) {
                                return;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Function1 updateTransitionActiveness = new Function1<SharedTransitionScope, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$updateTransitionActiveness$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharedTransitionScope sharedTransitionScope) {
            n(sharedTransitionScope);
            return Unit.INSTANCE;
        }

        public final void n(SharedTransitionScope sharedTransitionScope) {
            this.f15343n.g();
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList renderers = SnapshotStateKt.J2();

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final MutableScatterMap sharedElements = new MutableScatterMap(0, 1, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SharedTransitionObserver$delegate", "Lkotlin/Lazy;", "rl", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SharedTransitionObserver", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SnapshotStateObserver rl() {
            return (SnapshotStateObserver) SharedTransitionScopeImpl.f15309X.getValue();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl$ShapeBasedClip;", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "sharedContentState", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Path;", c.f62177j, "(Landroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/graphics/Shape;", "getClipShape", "()Landroidx/compose/ui/graphics/Shape;", "clipShape", "rl", "Landroidx/compose/ui/graphics/Path;", JavetError.PARAMETER_PATH, "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Shape clipShape;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final Path path;

        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public Path n(SharedTransitionScope.SharedContentState sharedContentState, Rect bounds, LayoutDirection layoutDirection, Density density) {
            this.path.reset();
            OutlineKt.n(this.path, this.clipShape.n(bounds.Ik(), layoutDirection, density));
            this.path.qie(bounds.Z());
            return this.path;
        }
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public long HI(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z2) {
        return this.f15318t.HI(layoutCoordinates, layoutCoordinates2, j2, z2);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates o(Placeable.PlacementScope placementScope) {
        return this.f15318t.o(placementScope);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates r(LayoutCoordinates layoutCoordinates) {
        return this.f15318t.r(layoutCoordinates);
    }

    private void ViF(boolean z2) {
        this.isTransitionActive.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        long j2;
        long j3;
        boolean z2;
        char c2;
        long j4;
        MutableScatterMap mutableScatterMap = this.sharedElements;
        Object[] objArr = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr2 = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        char c4 = 7;
        long j5 = -9187201950435737472L;
        if (length >= 0) {
            int i2 = 0;
            j2 = 128;
            loop0: while (true) {
                long j6 = jArr[i2];
                j3 = 255;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((j6 & 255) < 128) {
                            int i7 = (i2 << 3) + i5;
                            Object obj = objArr[i7];
                            if (((SharedElement) objArr2[i7]).qie()) {
                                z2 = true;
                                break loop0;
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        } else {
            j2 = 128;
            j3 = 255;
        }
        z2 = false;
        if (z2 != J2()) {
            ViF(z2);
            if (!z2) {
                MutableScatterMap mutableScatterMap2 = this.sharedElements;
                Object[] objArr3 = mutableScatterMap2.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
                Object[] objArr4 = mutableScatterMap2.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
                long[] jArr2 = mutableScatterMap2.metadata;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j7 = jArr2[i8];
                        c2 = c4;
                        j4 = j5;
                        if ((((~j7) << c2) & j7 & j4) != j4) {
                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j7 & j3) < j2) {
                                    int i11 = (i8 << 3) + i10;
                                    Object obj2 = objArr3[i11];
                                    ((SharedElement) objArr4[i11]).ty();
                                }
                                j7 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                            if (i8 == length2) {
                                break;
                            }
                            i8++;
                            c4 = c2;
                            j5 = j4;
                        }
                    }
                } else {
                    c2 = 7;
                    j4 = -9187201950435737472L;
                }
            }
        }
        MutableScatterMap mutableScatterMap3 = this.sharedElements;
        Object[] objArr5 = mutableScatterMap3.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr6 = mutableScatterMap3.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr3 = mutableScatterMap3.metadata;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j9 = jArr3[i12];
                if ((((~j9) << c2) & j9 & j4) != j4) {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j9 & j3) < j2) {
                            int i15 = (i12 << 3) + i14;
                            Object obj3 = objArr5[i15];
                            ((SharedElement) objArr6[i15]).o();
                        }
                        j9 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 == length3) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        qie();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement nY(Object key) {
        SharedElement sharedElement = (SharedElement) this.sharedElements.O(key);
        if (sharedElement != null) {
            return sharedElement;
        }
        SharedElement sharedElement2 = new SharedElement(key, this);
        this.sharedElements.aYN(key, sharedElement2);
        return sharedElement2;
    }

    private final void qie() {
        if (this.disposed) {
            return;
        }
        INSTANCE.rl().ck(this, this.updateTransitionActiveness, this.observeAnimatingBlock);
    }

    public final void Ik(LayerRenderer renderer) {
        this.renderers.remove(renderer);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public boolean J2() {
        return ((Boolean) this.isTransitionActive.getValue()).booleanValue();
    }

    public final void KN(Object scope) {
        INSTANCE.rl().qie(scope);
    }

    public final void WPU(LayoutCoordinates layoutCoordinates) {
        this.nullableLookaheadRoot = layoutCoordinates;
    }

    public final void aYN(LayoutCoordinates layoutCoordinates) {
        this.root = layoutCoordinates;
    }

    public final void az(SharedElement scope, Function1 onValueChangedForScope, Function0 block) {
        if (this.disposed) {
            return;
        }
        INSTANCE.rl().ck(scope, onValueChangedForScope, block);
    }

    public final void ck(LayerRenderer renderer) {
        this.renderers.add(renderer);
    }

    public final LayoutCoordinates gh() {
        LayoutCoordinates layoutCoordinates = this.root;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        Intrinsics.throwUninitializedPropertyAccessException("root");
        return null;
    }

    public final LayoutCoordinates mUb() {
        LayoutCoordinates layoutCoordinates = this.nullableLookaheadRoot;
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    public final void ty() {
        INSTANCE.rl().qie(this);
        this.disposed = true;
    }

    public final void xMQ(ContentDrawScope scope) {
        SnapshotStateList snapshotStateList = this.renderers;
        if (snapshotStateList.size() > 1) {
            CollectionsKt.sortWith(snapshotStateList, new Comparator() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    LayerRenderer layerRenderer = (LayerRenderer) obj;
                    LayerRenderer layerRenderer2 = (LayerRenderer) obj2;
                    return ComparisonsKt.compareValues(Float.valueOf((layerRenderer.n() == 0.0f && (layerRenderer instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer).getParentState() == null) ? -1.0f : layerRenderer.n()), Float.valueOf((layerRenderer2.n() == 0.0f && (layerRenderer2 instanceof SharedElementInternalState) && ((SharedElementInternalState) layerRenderer2).getParentState() == null) ? -1.0f : layerRenderer2.n()));
                }
            });
        }
        SnapshotStateList snapshotStateList2 = this.renderers;
        int size = snapshotStateList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((LayerRenderer) snapshotStateList2.get(i2)).rl(scope);
        }
    }

    public SharedTransitionScopeImpl(LookaheadScope lookaheadScope, vd vdVar) {
        this.coroutineScope = vdVar;
        this.f15318t = lookaheadScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElementInternalState S(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean z2, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.OverlayClip overlayClip, float f3, boolean z3, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(2066772852, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:991)");
        }
        Object objIF = composer.iF();
        if (objIF == Composer.INSTANCE.n()) {
            objIF = new SharedElementInternalState(sharedElement, boundsAnimation, placeHolderSize, z2, overlayClip, z3, sharedContentState, f3);
            composer.o(objIF);
        }
        SharedElementInternalState sharedElementInternalState = (SharedElementInternalState) objIF;
        sharedContentState.Uo(sharedElementInternalState);
        sharedElementInternalState.E2(sharedElement);
        sharedElementInternalState.fD(z2);
        sharedElementInternalState.XQ(boundsAnimation);
        sharedElementInternalState.te(placeHolderSize);
        sharedElementInternalState.nY(overlayClip);
        sharedElementInternalState.X(f3);
        sharedElementInternalState.iF(z3);
        sharedElementInternalState.e(sharedContentState);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return sharedElementInternalState;
    }

    public final void XQ(SharedElementInternalState sharedElementState) {
        SharedElement sharedElementCk = sharedElementState.ck();
        sharedElementCk.HI(sharedElementState);
        this.updateTransitionActiveness.invoke(this);
        sharedElementCk.getScope().qie();
        this.renderers.remove(sharedElementState);
        if (sharedElementCk.getStates().isEmpty()) {
            C.nr(sharedElementCk.getScope().coroutineScope, null, null, new SharedTransitionScopeImpl$onStateRemoved$1$1(sharedElementCk, null), 3, null);
        }
    }

    public final void Z(SharedElementInternalState sharedElementState) {
        SharedElementInternalState sharedElementInternalState;
        SharedElement sharedElementCk = sharedElementState.ck();
        sharedElementCk.rl(sharedElementState);
        this.updateTransitionActiveness.invoke(this);
        sharedElementCk.getScope().qie();
        Iterator<T> it = this.renderers.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                LayerRenderer layerRenderer = (LayerRenderer) it.next();
                SharedElement sharedElementCk2 = null;
                if (layerRenderer instanceof SharedElementInternalState) {
                    sharedElementInternalState = (SharedElementInternalState) layerRenderer;
                } else {
                    sharedElementInternalState = null;
                }
                if (sharedElementInternalState != null) {
                    sharedElementCk2 = sharedElementInternalState.ck();
                }
                if (Intrinsics.areEqual(sharedElementCk2, sharedElementState.ck())) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != this.renderers.size() - 1 && i2 != -1) {
            this.renderers.add(i2 + 1, sharedElementState);
        } else {
            this.renderers.add(sharedElementState);
        }
    }
}
