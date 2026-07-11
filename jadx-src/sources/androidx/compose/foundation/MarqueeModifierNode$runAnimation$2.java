package androidx.compose.foundation;

import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
final class MarqueeModifierNode$runAnimation$2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16216n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ MarqueeModifierNode f16217t;

    /* JADX INFO: renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "contentWithSpacingWidth", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {416, 418, 422, 422}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
        final /* synthetic */ MarqueeModifierNode J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f16219O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f16220n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f16221t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MarqueeModifierNode marqueeModifierNode, Continuation continuation) {
            super(2, continuation);
            this.J2 = marqueeModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.J2, continuation);
            anonymousClass2.f16219O = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Float f3, Continuation continuation) {
            return ((AnonymousClass2) create(f3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
        
            if (r0.XQ(r1, r20) != r8) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Float f3;
            AnimationSpec animationSpec;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f16221t;
            try {
            } catch (Throwable th) {
                Animatable animatable = this.J2.offset;
                Float fBoxFloat = Boxing.boxFloat(0.0f);
                this.f16219O = th;
                this.f16220n = null;
                this.f16221t = 4;
                if (animatable.XQ(fBoxFloat, this) != coroutine_suspended) {
                    throw th;
                }
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                f3 = (Float) this.f16219O;
                if (f3 == null) {
                    return Unit.INSTANCE;
                }
                AnimationSpec animationSpecRl = BasicMarqueeKt.rl(this.J2.iterations, f3.floatValue(), this.J2.initialDelayMillis, this.J2.delayMillis, this.J2.velocity, DelegatableNodeKt.gh(this.J2));
                Animatable animatable2 = this.J2.offset;
                Float fBoxFloat2 = Boxing.boxFloat(0.0f);
                this.f16219O = f3;
                this.f16220n = animationSpecRl;
                this.f16221t = 1;
                if (animatable2.XQ(fBoxFloat2, this) != coroutine_suspended) {
                    animationSpec = animationSpecRl;
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                AnimationSpec animationSpec2 = (AnimationSpec) this.f16220n;
                Float f4 = (Float) this.f16219O;
                ResultKt.throwOnFailure(obj);
                animationSpec = animationSpec2;
                f3 = f4;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.f16219O;
                    ResultKt.throwOnFailure(obj);
                    throw th2;
                }
                ResultKt.throwOnFailure(obj);
                Animatable animatable3 = this.J2.offset;
                Float fBoxFloat3 = Boxing.boxFloat(0.0f);
                this.f16221t = 3;
            }
            Animatable animatable4 = this.J2.offset;
            this.f16219O = null;
            this.f16220n = null;
            this.f16221t = 2;
            if (Animatable.J2(animatable4, f3, animationSpec, null, null, this, 12, null) != coroutine_suspended) {
                Animatable animatable32 = this.J2.offset;
                Float fBoxFloat32 = Boxing.boxFloat(0.0f);
                this.f16221t = 3;
            }
            return coroutine_suspended;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarqueeModifierNode$runAnimation$2(MarqueeModifierNode marqueeModifierNode, Continuation continuation) {
        super(2, continuation);
        this.f16217t = marqueeModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarqueeModifierNode$runAnimation$2(this.f16217t, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((MarqueeModifierNode$runAnimation$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16216n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final MarqueeModifierNode marqueeModifierNode = this.f16217t;
            TFv.Wre wreIk = SnapshotStateKt.Ik(new Function0<Float>() { // from class: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Float invoke() {
                    if (marqueeModifierNode.jE() <= marqueeModifierNode.ZwA()) {
                        return null;
                    }
                    if (!MarqueeAnimationMode.O(marqueeModifierNode.WKb(), MarqueeAnimationMode.INSTANCE.n()) || marqueeModifierNode.eOa()) {
                        return Float.valueOf(marqueeModifierNode.jE() + marqueeModifierNode.i7());
                    }
                    return null;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f16217t, null);
            this.f16216n = 1;
            if (TFv.fuX.gh(wreIk, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
