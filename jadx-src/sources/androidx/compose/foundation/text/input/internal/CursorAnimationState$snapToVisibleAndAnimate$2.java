package androidx.compose.foundation.text.input.internal;

import GJW.AbstractC1363t;
import GJW.xuv;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements Function2<GJW.vd, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CursorAnimationState f20105O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f20106n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f20107t;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, 79, 81}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<GJW.vd, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ CursorAnimationState f20108O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f20109n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ xuv f20110t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f20110t, this.f20108O, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(xuv xuvVar, CursorAnimationState cursorAnimationState, Continuation continuation) {
            super(2, continuation);
            this.f20110t = xuvVar;
            this.f20108O = cursorAnimationState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
        
            if (GJW.yg.rl(500, r10) != r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:36:0x0076, B:30:0x005f, B:33:0x0068, B:14:0x0027, B:15:0x002b, B:28:0x0059, B:29:0x005e, B:23:0x0043, B:25:0x0050), top: B:40:0x000f }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0073 -> B:36:0x0076). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f20109n;
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    ResultKt.throwOnFailure(obj);
                                    this.f20108O.J2(1.0f);
                                    this.f20109n = 3;
                                    if (GJW.yg.rl(500L, this) != coroutine_suspended) {
                                        this.f20108O.J2(0.0f);
                                        this.f20109n = 4;
                                    }
                                    return coroutine_suspended;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.f20108O.J2(0.0f);
                            this.f20109n = 4;
                        } else {
                            ResultKt.throwOnFailure(obj);
                            throw new KotlinNothingValueException();
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    xuv xuvVar = this.f20110t;
                    if (xuvVar != null) {
                        this.f20109n = 1;
                        if (AbstractC1363t.Uo(xuvVar, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    this.f20109n = 3;
                    if (GJW.yg.rl(500L, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                this.f20108O.J2(1.0f);
                if (!this.f20108O.getAnimate()) {
                    this.f20109n = 2;
                    if (GJW.yg.n(this) == coroutine_suspended) {
                    }
                    throw new KotlinNothingValueException();
                }
                this.f20109n = 3;
                if (GJW.yg.rl(500L, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                this.f20108O.J2(0.0f);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CursorAnimationState$snapToVisibleAndAnimate$2(CursorAnimationState cursorAnimationState, Continuation continuation) {
        super(2, continuation);
        this.f20105O = cursorAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.f20105O, continuation);
        cursorAnimationState$snapToVisibleAndAnimate$2.f20107t = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<? super Boolean> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f20106n == 0) {
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(androidx.compose.animation.core.fuX.n(this.f20105O.animationJob, null, GJW.C.nr((GJW.vd) this.f20107t, null, null, new AnonymousClass1((xuv) this.f20105O.animationJob.getAndSet(null), this.f20105O, null), 3, null)));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
