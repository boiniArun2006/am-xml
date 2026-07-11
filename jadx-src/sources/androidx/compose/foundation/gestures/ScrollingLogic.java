package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001a\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u0012*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010 \u001a\u00020\u001c*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0017J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001c*\u00020\u0013ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0014\u0010)\u001a\u00020\u001c*\u00020\u001cø\u0001\u0000¢\u0006\u0004\b)\u0010\u0017J\u0014\u0010*\u001a\u00020\u0013*\u00020\u001cø\u0001\u0000¢\u0006\u0004\b*\u0010\u0015J\u0017\u0010+\u001a\u00020\u0012*\u00020\u0013ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010(J\u0011\u0010,\u001a\u00020\u0013*\u00020\u0013¢\u0006\u0004\b,\u0010-J\u0014\u0010.\u001a\u00020\u001c*\u00020\u001cø\u0001\u0000¢\u0006\u0004\b.\u0010\u0017J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J#\u00103\u001a\u0002022\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\n¢\u0006\u0004\b8\u00109JC\u0010A\u001a\u0002022\b\b\u0002\u0010;\u001a\u00020:2'\u0010@\u001a#\b\u0001\u0012\u0004\u0012\u00020=\u0012\n\u0012\b\u0012\u0004\u0012\u0002020>\u0012\u0006\u0012\u0004\u0018\u00010\u00010<¢\u0006\u0002\b?H\u0086@¢\u0006\u0004\bA\u0010BJ?\u0010C\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\n¢\u0006\u0004\bE\u00109R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010ER\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010Z\u001a\u00020\n2\u0006\u0010W\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bX\u0010E\u001a\u0004\bY\u00109R\u001c\u0010]\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010`\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR \u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "reverseDirection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Lkotlin/Function0;", "isScrollableNodeAttached", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/unit/Velocity;", "", "E2", "(J)F", "fD", "(J)J", "newValue", "nHg", "(JF)J", "Landroidx/compose/foundation/gestures/ScrollScope;", "Landroidx/compose/ui/geometry/Offset;", "delta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "WPU", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "scroll", "HI", "pixels", "g", "(F)Z", "X", "(F)J", "iF", "e", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "aYN", "(F)F", "ViF", "S", "initialVelocity", "isMouseWheel", "", "XQ", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "available", "ck", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "te", "()Z", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/NestedScrollScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "nY", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "N", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Z", "Z", c.f62177j, "Landroidx/compose/foundation/gestures/ScrollableState;", "Ik", "()Landroidx/compose/foundation/gestures/ScrollableState;", "setScrollableState", "(Landroidx/compose/foundation/gestures/ScrollableState;)V", "rl", "Landroidx/compose/foundation/OverscrollEffect;", "t", "Landroidx/compose/foundation/gestures/FlingBehavior;", "nr", "Landroidx/compose/foundation/gestures/Orientation;", "O", "J2", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Uo", "Lkotlin/jvm/functions/Function0;", "<set-?>", "KN", "o", "isFlinging", "xMQ", "I", "latestScrollSource", "mUb", "Landroidx/compose/foundation/gestures/ScrollScope;", "outerStateScope", "androidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1", "gh", "Landroidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1;", "nestedScrollScope", "Lkotlin/Function1;", "qie", "Lkotlin/jvm/functions/Function1;", "performScrollForOverscroll", "r", "shouldDispatchOverscroll", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollingLogic\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1037:1\n30#2:1038\n30#2:1042\n53#3,3:1039\n53#3,3:1043\n60#3:1047\n70#3:1050\n65#4:1046\n69#4:1049\n22#5:1048\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollingLogic\n*L\n646#1:1038\n647#1:1042\n646#1:1039,3\n647#1:1043,3\n653#1:1047\n653#1:1050\n653#1:1046\n653#1:1049\n653#1:1048\n*E\n"})
public final class ScrollingLogic {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private NestedScrollDispatcher nestedScrollDispatcher;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private boolean isFlinging;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Function0 isScrollableNodeAttached;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private ScrollableState scrollableState;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private OverscrollEffect overscrollEffect;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private FlingBehavior flingBehavior;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int latestScrollSource = NestedScrollSource.INSTANCE.rl();

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private ScrollScope outerStateScope = ScrollableKt.rl;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final ScrollingLogic$nestedScrollScope$1 nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        public long n(long offset, int source) {
            this.f17080n.latestScrollSource = source;
            OverscrollEffect overscrollEffect = this.f17080n.overscrollEffect;
            if (overscrollEffect != null && this.f17080n.r()) {
                return overscrollEffect.KN(offset, this.f17080n.latestScrollSource, this.f17080n.performScrollForOverscroll);
            }
            return this.f17080n.WPU(this.f17080n.outerStateScope, offset, source);
        }

        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        public long rl(long offset, int source) {
            return this.f17080n.WPU(this.f17080n.outerStateScope, offset, source);
        }
    };

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final Function1 performScrollForOverscroll = new Function1<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$performScrollForOverscroll$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
            return Offset.nr(n(offset.getPackedValue()));
        }

        public final long n(long j2) {
            ScrollScope scrollScope = this.f17084n.outerStateScope;
            ScrollingLogic scrollingLogic = this.f17084n;
            return scrollingLogic.WPU(scrollScope, j2, scrollingLogic.latestScrollSource);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(float pixels) {
        if (pixels <= 0.0f || this.scrollableState.J2()) {
            return (pixels < 0.0f && !this.scrollableState.nr()) || !((Boolean) this.isScrollableNodeAttached.invoke()).booleanValue();
        }
        return true;
    }

    public final long T(float f3) {
        return f3 == 0.0f ? Velocity.INSTANCE.n() : this.orientation == Orientation.f16970t ? VelocityKt.n(f3, 0.0f) : VelocityKt.n(0.0f, f3);
    }

    public final long X(float f3) {
        if (f3 == 0.0f) {
            return Offset.INSTANCE.t();
        }
        if (this.orientation == Orientation.f16970t) {
            return Offset.O((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
        }
        return Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float E2(long j2) {
        return this.orientation == Orientation.f16970t ? Velocity.KN(j2) : Velocity.xMQ(j2);
    }

    private final long HI(long scroll) {
        return X(aYN(this.scrollableState.rl(aYN(e(scroll)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long WPU(ScrollScope scrollScope, long j2, int i2) {
        long jNr = this.nestedScrollDispatcher.nr(j2, i2);
        long jCk = Offset.ck(j2, jNr);
        long jViF = ViF(X(scrollScope.nr(e(ViF(iF(jCk))))));
        return Offset.Ik(Offset.Ik(jNr, jViF), this.nestedScrollDispatcher.rl(jViF, Offset.ck(jCk, jViF), i2));
    }

    private final long fD(long j2) {
        return this.orientation == Orientation.f16970t ? Velocity.O(j2, 0.0f, 0.0f, 1, null) : Velocity.O(j2, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long nHg(long j2, float f3) {
        return this.orientation == Orientation.f16970t ? Velocity.O(j2, f3, 0.0f, 2, null) : Velocity.O(j2, 0.0f, f3, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r() {
        return this.scrollableState.J2() || this.scrollableState.nr();
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    public final boolean N(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean reverseDirection, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z2;
        boolean z3 = true;
        if (Intrinsics.areEqual(this.scrollableState, scrollableState)) {
            z2 = false;
        } else {
            this.scrollableState = scrollableState;
            z2 = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z2 = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z3 = z2;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z3;
    }

    public final long S(long scroll) {
        return this.scrollableState.t() ? Offset.INSTANCE.t() : HI(scroll);
    }

    public final long ViF(long j2) {
        return this.reverseDirection ? Offset.r(j2, -1.0f) : j2;
    }

    public final Object XQ(long j2, boolean z2, Continuation continuation) {
        if (z2 && !ScrollableKt.Uo(this.flingBehavior)) {
            return Unit.INSTANCE;
        }
        long jFD = fD(j2);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect == null || !r()) {
            Object objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.rl(jFD), continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
        }
        Object objXMQ = overscrollEffect.xMQ(jFD, scrollingLogic$onScrollStopped$performFling$1, continuation);
        return objXMQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objXMQ : Unit.INSTANCE;
    }

    public final boolean Z() {
        return this.orientation == Orientation.f16969n;
    }

    public final float aYN(float f3) {
        return this.reverseDirection ? f3 * (-1) : f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ck(long j2, Continuation continuation) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        ScrollingLogic scrollingLogic;
        Ref.LongRef longRef;
        if (continuation instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuation;
            int i2 = scrollingLogic$doFlingAnimation$1.f17070r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.f17070r = i2 - Integer.MIN_VALUE;
            } else {
                scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuation);
            }
        }
        Object obj = scrollingLogic$doFlingAnimation$1.f17068O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = scrollingLogic$doFlingAnimation$1.f17070r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.element = j2;
            this.isFlinging = true;
            MutatePriority mutatePriority = MutatePriority.f16227n;
            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this, longRef2, j2, null);
            scrollingLogic$doFlingAnimation$1.f17069n = this;
            scrollingLogic$doFlingAnimation$1.f17071t = longRef2;
            scrollingLogic$doFlingAnimation$1.f17070r = 1;
            if (nY(mutatePriority, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            scrollingLogic = this;
            longRef = longRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef = (Ref.LongRef) scrollingLogic$doFlingAnimation$1.f17071t;
            scrollingLogic = (ScrollingLogic) scrollingLogic$doFlingAnimation$1.f17069n;
            ResultKt.throwOnFailure(obj);
        }
        scrollingLogic.isFlinging = false;
        return Velocity.rl(longRef.element);
    }

    public final float e(long j2) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.f16970t ? j2 >> 32 : j2 & 4294967295L));
    }

    public final long iF(long j2) {
        return this.orientation == Orientation.f16970t ? Offset.Uo(j2, 0.0f, 0.0f, 1, null) : Offset.Uo(j2, 0.0f, 0.0f, 2, null);
    }

    public final Object nY(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objO = this.scrollableState.O(mutatePriority, new ScrollingLogic$scroll$2(this, function2, null), continuation);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsFlinging() {
        return this.isFlinging;
    }

    public final boolean te() {
        if (this.scrollableState.t()) {
            return true;
        }
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return overscrollEffect != null ? overscrollEffect.Uo() : false;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z2, NestedScrollDispatcher nestedScrollDispatcher, Function0 function0) {
        this.scrollableState = scrollableState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = z2;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.isScrollableNodeAttached = function0;
    }
}
