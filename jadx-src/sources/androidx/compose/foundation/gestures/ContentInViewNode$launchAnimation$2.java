package androidx.compose.foundation.gestures;

import GJW.AbstractC1363t;
import GJW.cA;
import GJW.vd;
import GJW.xuv;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE}, m = "invokeSuspend", n = {}, s = {})
final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ UpdatableAnimationState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ ContentInViewNode f16592O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16593n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ BringIntoViewSpec f16594r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f16595t;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ContentInViewNode J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ UpdatableAnimationState f16596O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f16597n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ xuv f16598o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ BringIntoViewSpec f16599r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f16600t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f16596O, this.J2, this.f16599r, this.f16598o, continuation);
            anonymousClass1.f16600t = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NestedScrollScope nestedScrollScope, Continuation continuation) {
            return ((AnonymousClass1) create(nestedScrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, xuv xuvVar, Continuation continuation) {
            super(2, continuation);
            this.f16596O = updatableAnimationState;
            this.J2 = contentInViewNode;
            this.f16599r = bringIntoViewSpec;
            this.f16598o = xuvVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f16597n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.f16600t;
                this.f16596O.mUb(this.J2.b(this.f16599r));
                final UpdatableAnimationState updatableAnimationState = this.f16596O;
                final ContentInViewNode contentInViewNode = this.J2;
                final xuv xuvVar = this.f16598o;
                Function1<Float, Unit> function1 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                        n(f3.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(float f3) {
                        float f4 = contentInViewNode.reverseDirection ? 1.0f : -1.0f;
                        ScrollingLogic scrollingLogic = contentInViewNode.scrollingLogic;
                        float fE2 = f4 * scrollingLogic.e(scrollingLogic.ViF(nestedScrollScope.rl(scrollingLogic.ViF(scrollingLogic.X(f4 * f3)), NestedScrollSource.INSTANCE.rl())));
                        if (Math.abs(fE2) < Math.abs(f3)) {
                            cA.O(xuvVar, "Scroll animation cancelled because scroll was not consumed (" + fE2 + " < " + f3 + ')', null, 2, null);
                        }
                    }
                };
                final ContentInViewNode contentInViewNode2 = this.J2;
                final UpdatableAnimationState updatableAnimationState2 = this.f16596O;
                final BringIntoViewSpec bringIntoViewSpec = this.f16599r;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode2.bringIntoViewRequests;
                        ContentInViewNode contentInViewNode3 = contentInViewNode2;
                        while (true) {
                            if (bringIntoViewRequestPriorityQueue.requests.getSize() != 0) {
                                Rect rect = (Rect) ((ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.requests.ty()).getCurrentBounds().invoke();
                                if (!(rect == null ? true : ContentInViewNode.R3E(contentInViewNode3, rect, 0L, 1, null))) {
                                    break;
                                } else {
                                    ((ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.requests.r(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation().resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                                }
                            } else {
                                break;
                            }
                        }
                        if (contentInViewNode2.trackingFocusedChild) {
                            Rect rectEOa = contentInViewNode2.eOa();
                            if (rectEOa != null && ContentInViewNode.R3E(contentInViewNode2, rectEOa, 0L, 1, null)) {
                                contentInViewNode2.trackingFocusedChild = false;
                            }
                        }
                        updatableAnimationState2.mUb(contentInViewNode2.b(bringIntoViewSpec));
                    }
                };
                this.f16597n = 1;
                if (updatableAnimationState.KN(function1, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, Continuation continuation) {
        super(2, continuation);
        this.f16592O = contentInViewNode;
        this.J2 = updatableAnimationState;
        this.f16594r = bringIntoViewSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.f16592O, this.J2, this.f16594r, continuation);
        contentInViewNode$launchAnimation$2.f16595t = obj;
        return contentInViewNode$launchAnimation$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((ContentInViewNode$launchAnimation$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16593n;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    xuv xuvVarAz = AbstractC1363t.az(((vd) this.f16595t).getCoroutineContext());
                    this.f16592O.isAnimationRunning = true;
                    ScrollingLogic scrollingLogic = this.f16592O.scrollingLogic;
                    MutatePriority mutatePriority = MutatePriority.f16227n;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.J2, this.f16592O, this.f16594r, xuvVarAz, null);
                    this.f16593n = 1;
                    if (scrollingLogic.nY(mutatePriority, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f16592O.bringIntoViewRequests.nr();
                this.f16592O.isAnimationRunning = false;
                this.f16592O.bringIntoViewRequests.rl(null);
                this.f16592O.trackingFocusedChild = false;
                return Unit.INSTANCE;
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Throwable th) {
            this.f16592O.isAnimationRunning = false;
            this.f16592O.bringIntoViewRequests.rl(null);
            this.f16592O.trackingFocusedChild = false;
            throw th;
        }
    }
}
