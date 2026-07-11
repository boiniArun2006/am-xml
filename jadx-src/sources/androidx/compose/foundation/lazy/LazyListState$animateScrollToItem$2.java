package androidx.compose.foundation.lazy;

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
@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", i = {}, l = {481}, m = "invokeSuspend", n = {}, s = {})
final class LazyListState$animateScrollToItem$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ LazyListState f18115O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f18116n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ int f18117r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f18118t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListState$animateScrollToItem$2(LazyListState lazyListState, int i2, int i3, Continuation continuation) {
        super(2, continuation);
        this.f18115O = lazyListState;
        this.J2 = i2;
        this.f18117r = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LazyListState$animateScrollToItem$2 lazyListState$animateScrollToItem$2 = new LazyListState$animateScrollToItem$2(this.f18115O, this.J2, this.f18117r, continuation);
        lazyListState$animateScrollToItem$2.f18118t = obj;
        return lazyListState$animateScrollToItem$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ScrollScope scrollScope, Continuation continuation) {
        return ((LazyListState$animateScrollToItem$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f18116n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            LazyLayoutScrollScope lazyLayoutScrollScopeN = LazyListScrollScopeKt.n(this.f18115O, (ScrollScope) this.f18118t);
            int i3 = this.J2;
            int i5 = this.f18117r;
            Density densityR = this.f18115O.r();
            this.f18116n = 1;
            if (LazyLayoutScrollScopeKt.rl(lazyLayoutScrollScopeN, i3, i5, 100, densityR, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
