package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\u0018B\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "anim", "<init>", "(Landroidx/compose/animation/core/Animatable;)V", "()V", "", "O", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rl", "targetValue", "nr", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "Landroidx/compose/animation/core/Animatable;", "()F", "distanceFraction", "", "t", "()Z", "isAnimating", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PullToRefreshStateImpl implements PullToRefreshState {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Saver f29381t = SaverKt.n(new Function2<SaverScope, PullToRefreshStateImpl, Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Float invoke(SaverScope saverScope, PullToRefreshStateImpl pullToRefreshStateImpl) {
            return (Float) pullToRefreshStateImpl.anim.ty();
        }
    }, new Function1<Float, PullToRefreshStateImpl>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ PullToRefreshStateImpl invoke(Float f3) {
            return n(f3.floatValue());
        }

        public final PullToRefreshStateImpl n(float f3) {
            return new PullToRefreshStateImpl(new Animatable(Float.valueOf(f3), VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE), null, null, 12, null), null);
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Animatable anim;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "", "Saver", "Landroidx/compose/runtime/saveable/Saver;", c.f62177j, "()Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n() {
            return PullToRefreshStateImpl.f29381t;
        }
    }

    public /* synthetic */ PullToRefreshStateImpl(Animatable animatable, DefaultConstructorMarker defaultConstructorMarker) {
        this(animatable);
    }

    private PullToRefreshStateImpl(Animatable animatable) {
        this.anim = animatable;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object O(Continuation continuation) {
        Object objJ2 = Animatable.J2(this.anim, Boxing.boxFloat(1.0f), null, null, null, continuation, 14, null);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public float n() {
        return ((Number) this.anim.ty()).floatValue();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object nr(float f3, Continuation continuation) {
        Object objXQ = this.anim.XQ(Boxing.boxFloat(f3), continuation);
        return objXQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objXQ : Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object rl(Continuation continuation) {
        Object objJ2 = Animatable.J2(this.anim, Boxing.boxFloat(0.0f), null, null, null, continuation, 14, null);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public boolean t() {
        return this.anim.Ik();
    }

    public PullToRefreshStateImpl() {
        this(new Animatable(Float.valueOf(0.0f), VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE), null, null, 12, null));
    }
}
