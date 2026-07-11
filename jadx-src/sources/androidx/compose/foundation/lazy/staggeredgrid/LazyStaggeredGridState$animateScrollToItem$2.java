package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2", f = "LazyStaggeredGridState.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
final class LazyStaggeredGridState$animateScrollToItem$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ LazyStaggeredGridState f18784O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ LazyStaggeredGridMeasureResult f18785Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f18786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f18787o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ int f18788r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f18789t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridState$animateScrollToItem$2(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, int i5, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, Continuation continuation) {
        super(2, continuation);
        this.f18784O = lazyStaggeredGridState;
        this.J2 = i2;
        this.f18788r = i3;
        this.f18787o = i5;
        this.f18785Z = lazyStaggeredGridMeasureResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LazyStaggeredGridState$animateScrollToItem$2 lazyStaggeredGridState$animateScrollToItem$2 = new LazyStaggeredGridState$animateScrollToItem$2(this.f18784O, this.J2, this.f18788r, this.f18787o, this.f18785Z, continuation);
        lazyStaggeredGridState$animateScrollToItem$2.f18789t = obj;
        return lazyStaggeredGridState$animateScrollToItem$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ScrollScope scrollScope, Continuation continuation) {
        return ((LazyStaggeredGridState$animateScrollToItem$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f18786n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            LazyLayoutScrollScope lazyLayoutScrollScopeN = LazyStaggeredGridScrollScopeKt.n(this.f18784O, (ScrollScope) this.f18789t);
            int i3 = this.J2;
            int i5 = this.f18788r;
            int i7 = this.f18787o;
            Density density = this.f18785Z.getDensity();
            this.f18786n = 1;
            if (LazyLayoutScrollScopeKt.rl(lazyLayoutScrollScopeN, i3, i5, i7, density, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
