package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.Constraints;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.TimeSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "subcomposeLayoutState", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "executor", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "", "index", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "nr", "(IJLandroidx/compose/foundation/lazy/layout/PrefetchMetrics;)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "t", "(IJLandroidx/compose/foundation/lazy/layout/PrefetchMetrics;)Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", c.f62177j, "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "rl", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "HandleAndRequestImpl", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PrefetchHandleProvider {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LazyLayoutItemContentFactory itemContentFactory;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final SubcomposeLayoutState subcomposeLayoutState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final PrefetchScheduler executor;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001@B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0014J\u0019\u0010 \u001a\f\u0018\u00010\u001eR\u00060\u0000R\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u0016J\u0013\u0010%\u001a\u00020\u000e*\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00102R\u0016\u00104\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0016\u00105\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00102R \u00107\u001a\f\u0018\u00010\u001eR\u00060\u0000R\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00106R\u0016\u00108\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0016\u0010:\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010+R\u001c\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u0010+R\u0014\u0010?\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "", "index", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "prefetchMetrics", "<init>", "(Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;IJLandroidx/compose/foundation/lazy/layout/PrefetchMetrics;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "available", "average", "", "xMQ", "(JJ)Z", "availableTimeNanos", "", "Uo", "(J)V", "mUb", "()V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "", "contentType", "O", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;)V", "J2", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController;", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "KN", "()Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController;", "cancel", c.f62177j, "Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "rl", "(Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;)Z", "", "toString", "()Ljava/lang/String;", "I", "J", "t", "Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "nr", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precomposeHandle", "Z", "isMeasured", "isCanceled", "hasResolvedNestedPrefetches", "Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController;", "nestedPrefetchController", "isUrgent", "gh", "elapsedTimeNanos", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "qie", "startTime", "()Z", "isComposed", "NestedPrefetchController", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ExperimentalFoundationApi
    @SourceDebugExtension({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl\n+ 2 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,541:1\n26#2,5:542\n26#2,5:547\n26#2,5:553\n1#3:552\n96#4,5:558\n96#4,5:563\n96#4,5:568\n107#4,7:573\n107#4,7:580\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl\n*L\n339#1:542,5\n361#1:547,5\n385#1:553,5\n401#1:558,5\n408#1:563,5\n412#1:568,5\n415#1:573,7\n425#1:580,7\n*E\n"})
    private final class HandleAndRequestImpl implements LazyLayoutPrefetchState.PrefetchHandle, PrefetchRequest {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private boolean isCanceled;

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private NestedPrefetchController nestedPrefetchController;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private boolean isMeasured;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private boolean hasResolvedNestedPrefetches;

        /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
        private long elapsedTimeNanos;

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
        private long availableTimeNanos;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;

        /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
        private long startTime;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final long constraints;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final PrefetchMetrics prefetchMetrics;

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private boolean isUrgent;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController;", "", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "states", "<init>", "(Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl;Ljava/util/List;)V", "Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "", c.f62177j, "(Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;)Z", "Ljava/util/List;", "", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "rl", "[Ljava/util/List;", "requestsByState", "", "t", "I", "stateIndex", "nr", "requestIndex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n96#2,5:542\n50#2,5:547\n26#3,5:552\n1#4:557\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchHandleProvider$HandleAndRequestImpl$NestedPrefetchController\n*L\n454#1:542,5\n463#1:547,5\n467#1:552,5\n*E\n"})
        private final class NestedPrefetchController {

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private final List states;

            /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
            private int requestIndex;

            /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
            private final List[] requestsByState;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
            private int stateIndex;

            public NestedPrefetchController(List list) {
                this.states = list;
                this.requestsByState = new List[list.size()];
                if (list.isEmpty()) {
                    InlineClassHelperKt.n("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean n(PrefetchRequestScope prefetchRequestScope) {
                if (this.stateIndex >= this.states.size()) {
                    return false;
                }
                if (HandleAndRequestImpl.this.isCanceled) {
                    InlineClassHelperKt.t("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.stateIndex < this.states.size()) {
                    try {
                        if (this.requestsByState[this.stateIndex] == null) {
                            if (prefetchRequestScope.n() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List[] listArr = this.requestsByState;
                            int i2 = this.stateIndex;
                            listArr[i2] = ((LazyLayoutPrefetchState) this.states.get(i2)).rl();
                        }
                        List list = this.requestsByState[this.stateIndex];
                        Intrinsics.checkNotNull(list);
                        while (this.requestIndex < list.size()) {
                            if (((PrefetchRequest) list.get(this.requestIndex)).rl(prefetchRequestScope)) {
                                Trace.endSection();
                                return true;
                            }
                            this.requestIndex++;
                        }
                        this.requestIndex = 0;
                        this.stateIndex++;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Unit unit = Unit.INSTANCE;
                Trace.endSection();
                return false;
            }
        }

        public /* synthetic */ HandleAndRequestImpl(PrefetchHandleProvider prefetchHandleProvider, int i2, long j2, PrefetchMetrics prefetchMetrics, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, j2, prefetchMetrics);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void n() {
            this.isUrgent = true;
        }

        private HandleAndRequestImpl(int i2, long j2, PrefetchMetrics prefetchMetrics) {
            this.index = i2;
            this.constraints = j2;
            this.prefetchMetrics = prefetchMetrics;
            this.startTime = TimeSource.Monotonic.INSTANCE.m1761markNowz9LOYto();
        }

        private final void J2(long constraints) {
            if (this.isCanceled) {
                InlineClassHelperKt.n("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.isMeasured) {
                InlineClassHelperKt.n("Request was already measured!");
            }
            this.isMeasured = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.rl("performComposition() must be called before performMeasure()");
                throw new KotlinNothingValueException();
            }
            int iT = precomposedSlotHandle.t();
            for (int i2 = 0; i2 < iT; i2++) {
                precomposedSlotHandle.nr(i2, constraints);
            }
        }

        private final NestedPrefetchController KN() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.rl("Should precompose before resolving nested prefetch states");
                throw new KotlinNothingValueException();
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            precomposedSlotHandle.rl("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new Function1<TraversableNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
                    T tMutableListOf;
                    Intrinsics.checkNotNull(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                    LazyLayoutPrefetchState prefetchState = ((TraversablePrefetchStateNode) traversableNode).getPrefetchState();
                    Ref.ObjectRef objectRef2 = objectRef;
                    List list = (List) objectRef2.element;
                    if (list != null) {
                        list.add(prefetchState);
                        tMutableListOf = list;
                    } else {
                        tMutableListOf = CollectionsKt.mutableListOf(prefetchState);
                    }
                    objectRef2.element = tMutableListOf;
                    return TraversableNode.Companion.TraverseDescendantsAction.f32654t;
                }
            });
            List list = (List) objectRef.element;
            if (list != null) {
                return new NestedPrefetchController(list);
            }
            return null;
        }

        private final void O(LazyLayoutItemProvider itemProvider, Object contentType) {
            if (!(this.precomposeHandle == null)) {
                InlineClassHelperKt.n("Request was already composed!");
            }
            Object objNr = itemProvider.nr(this.index);
            this.precomposeHandle = PrefetchHandleProvider.this.subcomposeLayoutState.xMQ(objNr, PrefetchHandleProvider.this.itemContentFactory.rl(this.index, objNr, contentType));
        }

        private final void Uo(long availableTimeNanos) {
            this.availableTimeNanos = availableTimeNanos;
            this.startTime = TimeSource.Monotonic.INSTANCE.m1761markNowz9LOYto();
            this.elapsedTimeNanos = 0L;
        }

        private final void mUb() {
            long jM1761markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1761markNowz9LOYto();
            long jM1665getInWholeNanosecondsimpl = Duration.m1665getInWholeNanosecondsimpl(TimeSource.Monotonic.ValueTimeMark.m1772minus6eNON_k(jM1761markNowz9LOYto, this.startTime));
            this.elapsedTimeNanos = jM1665getInWholeNanosecondsimpl;
            this.availableTimeNanos -= jM1665getInWholeNanosecondsimpl;
            this.startTime = jM1761markNowz9LOYto;
        }

        private final boolean nr() {
            return this.precomposeHandle != null;
        }

        private final boolean xMQ(long available, long average) {
            return (this.isUrgent && available > 0) || average < available;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.n();
            }
            this.precomposeHandle = null;
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequest
        public boolean rl(PrefetchRequestScope prefetchRequestScope) {
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) PrefetchHandleProvider.this.itemContentFactory.getItemProvider().invoke();
            if (!this.isCanceled) {
                int iN = lazyLayoutItemProvider.n();
                int i2 = this.index;
                if (i2 >= 0 && i2 < iN) {
                    Object objJ2 = lazyLayoutItemProvider.J2(i2);
                    Uo(prefetchRequestScope.n());
                    if (!nr()) {
                        if (!xMQ(this.availableTimeNanos, this.prefetchMetrics.rl(objJ2))) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            O(lazyLayoutItemProvider, objJ2);
                            Unit unit = Unit.INSTANCE;
                            Trace.endSection();
                            mUb();
                            this.prefetchMetrics.nr(objJ2, this.elapsedTimeNanos);
                        } finally {
                        }
                    }
                    if (!this.isUrgent) {
                        if (!this.hasResolvedNestedPrefetches) {
                            if (this.availableTimeNanos <= 0) {
                                return true;
                            }
                            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                            try {
                                this.nestedPrefetchController = KN();
                                this.hasResolvedNestedPrefetches = true;
                                Unit unit2 = Unit.INSTANCE;
                            } finally {
                            }
                        }
                        NestedPrefetchController nestedPrefetchController = this.nestedPrefetchController;
                        if (nestedPrefetchController != null ? nestedPrefetchController.n(prefetchRequestScope) : false) {
                            return true;
                        }
                        mUb();
                    }
                    if (!this.isMeasured && !Constraints.ck(this.constraints)) {
                        if (!xMQ(this.availableTimeNanos, this.prefetchMetrics.t(objJ2))) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            J2(this.constraints);
                            Unit unit3 = Unit.INSTANCE;
                            Trace.endSection();
                            mUb();
                            this.prefetchMetrics.O(objJ2, this.elapsedTimeNanos);
                        } finally {
                        }
                    }
                }
            }
            return false;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.index + ", constraints = " + ((Object) Constraints.Ik(this.constraints)) + ", isComposed = " + nr() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }
    }

    public final LazyLayoutPrefetchState.PrefetchHandle nr(int index, long constraints, PrefetchMetrics prefetchMetrics) {
        HandleAndRequestImpl handleAndRequestImpl = new HandleAndRequestImpl(this, index, constraints, prefetchMetrics, null);
        this.executor.n(handleAndRequestImpl);
        return handleAndRequestImpl;
    }

    public final PrefetchRequest t(int index, long constraints, PrefetchMetrics prefetchMetrics) {
        return new HandleAndRequestImpl(this, index, constraints, prefetchMetrics, null);
    }

    public PrefetchHandleProvider(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.executor = prefetchScheduler;
    }
}
