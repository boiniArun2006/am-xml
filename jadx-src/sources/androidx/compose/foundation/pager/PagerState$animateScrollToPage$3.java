package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", i = {}, l = {619}, m = "invokeSuspend", n = {}, s = {})
final class PagerState$animateScrollToPage$3 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ PagerState f18999O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f19000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f19001o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ float f19002r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f19003t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$animateScrollToPage$3(PagerState pagerState, int i2, float f3, AnimationSpec animationSpec, Continuation continuation) {
        super(2, continuation);
        this.f18999O = pagerState;
        this.J2 = i2;
        this.f19002r = f3;
        this.f19001o = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this.f18999O, this.J2, this.f19002r, this.f19001o, continuation);
        pagerState$animateScrollToPage$3.f19003t = obj;
        return pagerState$animateScrollToPage$3;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ScrollScope scrollScope, Continuation continuation) {
        return ((PagerState$animateScrollToPage$3) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f19000n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            LazyLayoutScrollScope lazyLayoutScrollScopeN = PagerScrollScopeKt.n(this.f18999O, (ScrollScope) this.f19003t);
            int i3 = this.J2;
            float f3 = this.f19002r;
            AnimationSpec animationSpec = this.f19001o;
            final PagerState pagerState = this.f18999O;
            Function2<ScrollScope, Integer, Unit> function2 = new Function2<ScrollScope, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3.1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ScrollScope scrollScope, Integer num) {
                    n(scrollScope, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(ScrollScope scrollScope, int i5) {
                    pagerState.pJg(scrollScope, i5);
                }
            };
            this.f19000n = 1;
            if (PagerStateKt.O(lazyLayoutScrollScopeN, i3, f3, animationSpec, function2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
