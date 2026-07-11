package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {814}, m = "invokeSuspend", n = {}, s = {})
final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    long f17072O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ long f17073S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Ref.LongRef f17074Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f17075n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ ScrollingLogic f17076o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private /* synthetic */ Object f17077r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f17078t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref.LongRef longRef, long j2, Continuation continuation) {
        super(2, continuation);
        this.f17076o = scrollingLogic;
        this.f17074Z = longRef;
        this.f17073S = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.f17076o, this.f17074Z, this.f17073S, continuation);
        scrollingLogic$doFlingAnimation$2.f17077r = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(NestedScrollScope nestedScrollScope, Continuation continuation) {
        return ((ScrollingLogic$doFlingAnimation$2) create(nestedScrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        Ref.LongRef longRef;
        ScrollingLogic scrollingLogic2;
        long j2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.J2;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = this.f17072O;
                longRef = (Ref.LongRef) this.f17078t;
                scrollingLogic = (ScrollingLogic) this.f17075n;
                scrollingLogic2 = (ScrollingLogic) this.f17077r;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.f17077r;
            final ScrollingLogic scrollingLogic3 = this.f17076o;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float nr(float pixels) {
                    if (ComposeFoundationFlags.NewNestedFlingPropagationEnabled && Math.abs(pixels) != 0.0f && scrollingLogic3.g(pixels)) {
                        throw new FlingCancellationException();
                    }
                    ScrollingLogic scrollingLogic4 = scrollingLogic3;
                    return scrollingLogic4.aYN(scrollingLogic4.e(nestedScrollScope.n(scrollingLogic4.ViF(scrollingLogic4.X(pixels)), NestedScrollSource.INSTANCE.n())));
                }
            };
            scrollingLogic = this.f17076o;
            Ref.LongRef longRef2 = this.f17074Z;
            long j3 = this.f17073S;
            FlingBehavior flingBehavior = scrollingLogic.flingBehavior;
            long j4 = longRef2.element;
            float fAYN = scrollingLogic.aYN(scrollingLogic.E2(j3));
            this.f17077r = scrollingLogic;
            this.f17075n = scrollingLogic;
            this.f17078t = longRef2;
            this.f17072O = j4;
            this.J2 = 1;
            Object objN = flingBehavior.n(scrollScope, fAYN, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            longRef = longRef2;
            obj = objN;
            scrollingLogic2 = scrollingLogic;
            j2 = j4;
        }
        longRef.element = scrollingLogic.nHg(j2, scrollingLogic2.aYN(((Number) obj).floatValue()));
        return Unit.INSTANCE;
    }
}
