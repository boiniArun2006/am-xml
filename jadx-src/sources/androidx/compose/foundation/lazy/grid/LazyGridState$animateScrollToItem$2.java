package androidx.compose.foundation.lazy.grid;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2", f = "LazyGridState.kt", i = {}, l = {492}, m = "invokeSuspend", n = {}, s = {})
final class LazyGridState$animateScrollToItem$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ LazyGridState f18345O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f18346n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ int f18347r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f18348t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridState$animateScrollToItem$2(LazyGridState lazyGridState, int i2, int i3, Continuation continuation) {
        super(2, continuation);
        this.f18345O = lazyGridState;
        this.J2 = i2;
        this.f18347r = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LazyGridState$animateScrollToItem$2 lazyGridState$animateScrollToItem$2 = new LazyGridState$animateScrollToItem$2(this.f18345O, this.J2, this.f18347r, continuation);
        lazyGridState$animateScrollToItem$2.f18348t = obj;
        return lazyGridState$animateScrollToItem$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ScrollScope scrollScope, Continuation continuation) {
        return ((LazyGridState$animateScrollToItem$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f18346n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            LazyLayoutScrollScope lazyLayoutScrollScopeN = LazyGridScrollScopeKt.n(this.f18345O, (ScrollScope) this.f18348t);
            int i3 = this.J2;
            int i5 = this.f18347r;
            int iNY = this.f18345O.nY();
            Density densityIk = this.f18345O.Ik();
            this.f18346n = 1;
            if (LazyLayoutScrollScopeKt.rl(lazyLayoutScrollScopeN, i3, i5, iNY, densityIk, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
