package androidx.compose.material3.pulltorefresh;

import GJW.C;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010!\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J*\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b?\u0010$\u001a\u0004\b@\u0010\u0019\"\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER+\u0010L\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010\u0019\"\u0004\bK\u0010BR+\u0010P\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010I\u001a\u0004\bN\u0010\u0019\"\u0004\bO\u0010BR\u0014\u0010R\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0019R\u0014\u0010V\u001a\u00020S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "isRefreshing", "Lkotlin/Function0;", "", "onRefresh", "enabled", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "Landroidx/compose/ui/unit/Dp;", "threshold", "<init>", "(ZLkotlin/jvm/functions/Function0;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Offset;", "available", "kC", "(J)J", "", "velocity", "cAB", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jE", "()F", "ZwA", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WKb", "c", "()V", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "tEO", "(JI)J", "consumed", "F", "(JJI)J", "Landroidx/compose/ui/unit/Velocity;", "lS", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ai", "jB", "Z", "f11", "()Z", "H6M", "(Z)V", "U", "Lkotlin/jvm/functions/Function0;", "getOnRefresh", "()Lkotlin/jvm/functions/Function0;", "Bha", "(Lkotlin/jvm/functions/Function0;)V", "P5", "getEnabled", "yUZ", "M7", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "R3E", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "YE", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;)V", "p5", "getThreshold-D9Ej5fM", "hu", "(F)V", "Landroidx/compose/ui/node/DelegatableNode;", "eF", "Landroidx/compose/ui/node/DelegatableNode;", "nestedScrollNode", "<set-?>", "E", "Landroidx/compose/runtime/MutableFloatState;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "ENe", "verticalOffset", "M", "i7", "kR", "distancePulled", "eOa", "adjustedDistancePulled", "", "Yq", "()I", "thresholdPx", "VK2", "progress", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,678:1\n76#2:679\n109#2,2:680\n76#2:682\n109#2,2:683\n1#3:685\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode\n*L\n271#1:679\n271#1:680,2\n272#1:682\n272#1:683,2\n*E\n"})
public final class PullToRefreshModifierNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, NestedScrollConnection {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState verticalOffset;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState distancePulled;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private PullToRefreshState state;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Function0 onRefresh;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private DelegatableNode nestedScrollNode;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean isRefreshing;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private float threshold;

    public /* synthetic */ PullToRefreshModifierNode(boolean z2, Function0 function0, boolean z3, PullToRefreshState pullToRefreshState, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, function0, z3, pullToRefreshState, f3);
    }

    private PullToRefreshModifierNode(boolean z2, Function0 function0, boolean z3, PullToRefreshState pullToRefreshState, float f3) {
        this.isRefreshing = z2;
        this.onRefresh = function0;
        this.enabled = z3;
        this.state = pullToRefreshState;
        this.threshold = f3;
        this.nestedScrollNode = NestedScrollNodeKt.t(this, null);
        this.verticalOffset = PrimitiveSnapshotStateKt.n(0.0f);
        this.distancePulled = PrimitiveSnapshotStateKt.n(0.0f);
    }

    private final void ENe(float f3) {
        this.verticalOffset.Z(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float G() {
        return this.verticalOffset.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WKb(Continuation continuation) {
        PullToRefreshModifierNode$animateToHidden$1 pullToRefreshModifierNode$animateToHidden$1;
        PullToRefreshModifierNode pullToRefreshModifierNode;
        if (continuation instanceof PullToRefreshModifierNode$animateToHidden$1) {
            pullToRefreshModifierNode$animateToHidden$1 = (PullToRefreshModifierNode$animateToHidden$1) continuation;
            int i2 = pullToRefreshModifierNode$animateToHidden$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pullToRefreshModifierNode$animateToHidden$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                pullToRefreshModifierNode$animateToHidden$1 = new PullToRefreshModifierNode$animateToHidden$1(this, continuation);
            }
        }
        Object obj = pullToRefreshModifierNode$animateToHidden$1.f29364t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pullToRefreshModifierNode$animateToHidden$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            PullToRefreshState pullToRefreshState = this.state;
            pullToRefreshModifierNode$animateToHidden$1.f29363n = this;
            pullToRefreshModifierNode$animateToHidden$1.J2 = 1;
            if (pullToRefreshState.rl(pullToRefreshModifierNode$animateToHidden$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pullToRefreshModifierNode = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pullToRefreshModifierNode = (PullToRefreshModifierNode) pullToRefreshModifierNode$animateToHidden$1.f29363n;
            ResultKt.throwOnFailure(obj);
        }
        pullToRefreshModifierNode.kR(0.0f);
        pullToRefreshModifierNode.ENe(0.0f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ZwA(Continuation continuation) {
        PullToRefreshModifierNode$animateToThreshold$1 pullToRefreshModifierNode$animateToThreshold$1;
        PullToRefreshModifierNode pullToRefreshModifierNode;
        if (continuation instanceof PullToRefreshModifierNode$animateToThreshold$1) {
            pullToRefreshModifierNode$animateToThreshold$1 = (PullToRefreshModifierNode$animateToThreshold$1) continuation;
            int i2 = pullToRefreshModifierNode$animateToThreshold$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pullToRefreshModifierNode$animateToThreshold$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                pullToRefreshModifierNode$animateToThreshold$1 = new PullToRefreshModifierNode$animateToThreshold$1(this, continuation);
            }
        }
        Object obj = pullToRefreshModifierNode$animateToThreshold$1.f29367t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pullToRefreshModifierNode$animateToThreshold$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            PullToRefreshState pullToRefreshState = this.state;
            pullToRefreshModifierNode$animateToThreshold$1.f29366n = this;
            pullToRefreshModifierNode$animateToThreshold$1.J2 = 1;
            if (pullToRefreshState.O(pullToRefreshModifierNode$animateToThreshold$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pullToRefreshModifierNode = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pullToRefreshModifierNode = (PullToRefreshModifierNode) pullToRefreshModifierNode$animateToThreshold$1.f29366n;
            ResultKt.throwOnFailure(obj);
        }
        pullToRefreshModifierNode.kR(pullToRefreshModifierNode.Yq());
        pullToRefreshModifierNode.ENe(pullToRefreshModifierNode.Yq());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cAB(float f3, Continuation continuation) {
        PullToRefreshModifierNode$onRelease$1 pullToRefreshModifierNode$onRelease$1;
        PullToRefreshModifierNode pullToRefreshModifierNode;
        if (continuation instanceof PullToRefreshModifierNode$onRelease$1) {
            pullToRefreshModifierNode$onRelease$1 = (PullToRefreshModifierNode$onRelease$1) continuation;
            int i2 = pullToRefreshModifierNode$onRelease$1.f29377r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pullToRefreshModifierNode$onRelease$1.f29377r = i2 - Integer.MIN_VALUE;
            } else {
                pullToRefreshModifierNode$onRelease$1 = new PullToRefreshModifierNode$onRelease$1(this, continuation);
            }
        }
        Object obj = pullToRefreshModifierNode$onRelease$1.f29375O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pullToRefreshModifierNode$onRelease$1.f29377r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.isRefreshing) {
                return Boxing.boxFloat(0.0f);
            }
            if (eOa() > Yq()) {
                pullToRefreshModifierNode$onRelease$1.f29376n = this;
                pullToRefreshModifierNode$onRelease$1.f29378t = f3;
                pullToRefreshModifierNode$onRelease$1.f29377r = 1;
                if (ZwA(pullToRefreshModifierNode$onRelease$1) != coroutine_suspended) {
                    pullToRefreshModifierNode = this;
                    pullToRefreshModifierNode.onRefresh.invoke();
                }
            } else {
                pullToRefreshModifierNode$onRelease$1.f29376n = this;
                pullToRefreshModifierNode$onRelease$1.f29378t = f3;
                pullToRefreshModifierNode$onRelease$1.f29377r = 2;
                if (WKb(pullToRefreshModifierNode$onRelease$1) != coroutine_suspended) {
                    pullToRefreshModifierNode = this;
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            f3 = pullToRefreshModifierNode$onRelease$1.f29378t;
            pullToRefreshModifierNode = (PullToRefreshModifierNode) pullToRefreshModifierNode$onRelease$1.f29376n;
            ResultKt.throwOnFailure(obj);
            pullToRefreshModifierNode.onRefresh.invoke();
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f3 = pullToRefreshModifierNode$onRelease$1.f29378t;
            pullToRefreshModifierNode = (PullToRefreshModifierNode) pullToRefreshModifierNode$onRelease$1.f29376n;
            ResultKt.throwOnFailure(obj);
        }
        if (pullToRefreshModifierNode.i7() == 0.0f || f3 < 0.0f) {
            f3 = 0.0f;
        }
        pullToRefreshModifierNode.kR(0.0f);
        return Boxing.boxFloat(f3);
    }

    private final float i7() {
        return this.distancePulled.n();
    }

    private final long kC(long available) {
        float fI7;
        if (this.isRefreshing) {
            fI7 = 0.0f;
        } else {
            float fCoerceAtLeast = RangesKt.coerceAtLeast(i7() + Offset.ty(available), 0.0f);
            fI7 = fCoerceAtLeast - i7();
            kR(fCoerceAtLeast);
            ENe(jE());
        }
        return OffsetKt.n(0.0f, fI7);
    }

    private final void kR(float f3) {
        this.distancePulled.Z(f3);
    }

    public final void Bha(Function0 function0) {
        this.onRefresh = function0;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long F(long consumed, long available, int source) {
        if (this.state.t()) {
            return Offset.INSTANCE.t();
        }
        if (!this.enabled) {
            return Offset.INSTANCE.t();
        }
        if (!NestedScrollSource.O(source, NestedScrollSource.INSTANCE.rl())) {
            return Offset.INSTANCE.t();
        }
        long jKC = kC(available);
        C.nr(Xli(), null, null, new PullToRefreshModifierNode$onPostScroll$1(this, null), 3, null);
        return jKC;
    }

    public final void H6M(boolean z2) {
        this.isRefreshing = z2;
    }

    /* JADX INFO: renamed from: R3E, reason: from getter */
    public final PullToRefreshState getState() {
        return this.state;
    }

    public final void YE(PullToRefreshState pullToRefreshState) {
        this.state = pullToRefreshState;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        UR(this.nestedScrollNode);
        C.nr(Xli(), null, null, new PullToRefreshModifierNode$onAttach$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: f11, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    public final void hu(float f3) {
        this.threshold = f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object lS(long j2, Continuation continuation) {
        PullToRefreshModifierNode$onPreFling$1 pullToRefreshModifierNode$onPreFling$1;
        float f3;
        if (continuation instanceof PullToRefreshModifierNode$onPreFling$1) {
            pullToRefreshModifierNode$onPreFling$1 = (PullToRefreshModifierNode$onPreFling$1) continuation;
            int i2 = pullToRefreshModifierNode$onPreFling$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pullToRefreshModifierNode$onPreFling$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                pullToRefreshModifierNode$onPreFling$1 = new PullToRefreshModifierNode$onPreFling$1(this, continuation);
            }
        }
        Object objCAB = pullToRefreshModifierNode$onPreFling$1.f29374t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pullToRefreshModifierNode$onPreFling$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objCAB);
            float fXMQ = Velocity.xMQ(j2);
            pullToRefreshModifierNode$onPreFling$1.f29373n = 0.0f;
            pullToRefreshModifierNode$onPreFling$1.J2 = 1;
            objCAB = cAB(fXMQ, pullToRefreshModifierNode$onPreFling$1);
            if (objCAB == coroutine_suspended) {
                return coroutine_suspended;
            }
            f3 = 0.0f;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f3 = pullToRefreshModifierNode$onPreFling$1.f29373n;
            ResultKt.throwOnFailure(objCAB);
        }
        return Velocity.rl(VelocityKt.n(f3, ((Number) objCAB).floatValue()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long tEO(long available, int source) {
        return this.state.t() ? Offset.INSTANCE.t() : !this.enabled ? Offset.INSTANCE.t() : (!NestedScrollSource.O(source, NestedScrollSource.INSTANCE.rl()) || Offset.ty(available) >= 0.0f) ? Offset.INSTANCE.t() : kC(available);
    }

    public final void yUZ(boolean z2) {
        this.enabled = z2;
    }

    private final float VK2() {
        return eOa() / Yq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Yq() {
        return ((Density) CompositionLocalConsumerModifierNodeKt.n(this, CompositionLocalsKt.J2())).How(this.threshold);
    }

    private final float eOa() {
        return i7() * 0.5f;
    }

    private final float jE() {
        if (eOa() <= Yq()) {
            return eOa();
        }
        float fCoerceIn = RangesKt.coerceIn(Math.abs(VK2()) - 1.0f, 0.0f, 2.0f);
        return Yq() + (Yq() * (fCoerceIn - (((float) Math.pow(fCoerceIn, 2)) / 4)));
    }

    public final void Ai() {
        C.nr(Xli(), null, null, new PullToRefreshModifierNode$update$1(this, null), 3, null);
    }
}
