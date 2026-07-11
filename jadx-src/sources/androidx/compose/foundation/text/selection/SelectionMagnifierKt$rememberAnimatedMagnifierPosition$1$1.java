package androidx.compose.foundation.text.selection;

import GJW.C;
import GJW.vd;
import TFv.CN3;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ State f20881O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f20882n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f20883t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(State state, Animatable animatable, Continuation continuation) {
        super(2, continuation);
        this.f20881O = state;
        this.J2 = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(this.f20881O, this.J2, continuation);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.f20883t = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f20882n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final vd vdVar = (vd) this.f20883t;
            final State state = this.f20881O;
            TFv.Wre wreIk = SnapshotStateKt.Ik(new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.1
                {
                    super(0);
                }

                public final long n() {
                    return SelectionMagnifierKt.xMQ(state);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.nr(n());
                }
            });
            final Animatable animatable = this.J2;
            CN3 cn3 = new CN3() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.2

                /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ long f20887O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f20888n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Animatable f20889t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Animatable animatable, long j2, Continuation continuation) {
                        super(2, continuation);
                        this.f20889t = animatable;
                        this.f20887O = j2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass1(this.f20889t, this.f20887O, continuation);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(vd vdVar, Continuation continuation) {
                        return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                        return invoke2(vdVar, (Continuation) continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.f20888n;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            Animatable animatable = this.f20889t;
                            Offset offsetNr = Offset.nr(this.f20887O);
                            SpringSpec springSpecO = SelectionMagnifierKt.O();
                            this.f20888n = 1;
                            if (Animatable.J2(animatable, offsetNr, springSpecO, null, null, this, 12, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                public final Object n(long j2, Continuation continuation) {
                    if ((((Offset) animatable.ty()).getPackedValue() & 9223372034707292159L) == 9205357640488583168L || (j2 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((Offset) animatable.ty()).getPackedValue() & 4294967295L)) == Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                        Object objXQ = animatable.XQ(Offset.nr(j2), continuation);
                        return objXQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objXQ : Unit.INSTANCE;
                    }
                    C.nr(vdVar, null, null, new AnonymousClass1(animatable, j2, null), 3, null);
                    return Unit.INSTANCE;
                }

                @Override // TFv.CN3
                public /* bridge */ /* synthetic */ Object rl(Object obj2, Continuation continuation) {
                    return n(((Offset) obj2).getPackedValue(), continuation);
                }
            };
            this.f20882n = 1;
            if (wreIk.n(cn3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
