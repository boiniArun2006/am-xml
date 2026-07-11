package androidx.compose.material3;

import GJW.C;
import GJW.vd;
import TFv.CN3;
import TFv.Wre;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.PredictiveBack;
import androidx.view.BackEventCompat;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTFv/Wre;", "Landroidx/activity/BackEventCompat;", "Lkotlin/jvm/JvmSuppressWildcards;", "progress", "", "<anonymous>", "(LTFv/Wre;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1", f = "NavigationDrawer.android.kt", i = {}, l = {60, 86, 86, 86}, m = "invokeSuspend", n = {}, s = {})
final class NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 extends SuspendLambda implements Function2<Wre, Continuation<? super Unit>, Object> {
    final /* synthetic */ vd J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ DrawerPredictiveBackState f26640O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f26641S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f26642Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f26643g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f26644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ boolean f26645o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ DrawerState f26646r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f26647t;

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1$2", f = "NavigationDrawer.android.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f26652n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ DrawerPredictiveBackState f26653t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DrawerPredictiveBackState drawerPredictiveBackState, Continuation continuation) {
            super(2, continuation);
            this.f26653t = drawerPredictiveBackState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.f26653t, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f26652n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    anonymousClass2 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                float fRl = this.f26653t.rl();
                final DrawerPredictiveBackState drawerPredictiveBackState = this.f26653t;
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.material3.NavigationDrawer_androidKt.DrawerPredictiveBackHandler.2.1.2.1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Float f3, Float f4) {
                        n(f3.floatValue(), f4.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(float f3, float f4) {
                        drawerPredictiveBackState.O(f3);
                    }
                };
                this.f26652n = 1;
                anonymousClass2 = this;
                if (SuspendAnimationKt.O(fRl, 0.0f, 0.0f, null, function2, anonymousClass2, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            anonymousClass2.f26653t.n();
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(this.f26640O, this.J2, this.f26646r, this.f26645o, this.f26642Z, this.f26641S, this.f26643g, continuation);
        navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1.f26647t = obj;
        return navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(DrawerPredictiveBackState drawerPredictiveBackState, vd vdVar, DrawerState drawerState, boolean z2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ref.FloatRef floatRef3, Continuation continuation) {
        super(2, continuation);
        this.f26640O = drawerPredictiveBackState;
        this.J2 = vdVar;
        this.f26646r = drawerState;
        this.f26645o = z2;
        this.f26642Z = floatRef;
        this.f26641S = floatRef2;
        this.f26643g = floatRef3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r14.nr(r13) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r14.nr(r13) != r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f26644n;
        try {
            try {
            } catch (CancellationException unused) {
                this.f26640O.n();
                if (this.f26640O.nr()) {
                    C.nr(this.J2, null, null, new AnonymousClass2(this.f26640O, null), 3, null);
                }
                DrawerState drawerState = this.f26646r;
                this.f26644n = 3;
            }
        } catch (Throwable th) {
            if (this.f26640O.nr()) {
                C.nr(this.J2, null, null, new AnonymousClass2(this.f26640O, null), 3, null);
            }
            DrawerState drawerState2 = this.f26646r;
            this.f26647t = th;
            this.f26644n = 4;
            if (drawerState2.nr(this) != coroutine_suspended) {
                throw th;
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.f26647t;
                    ResultKt.throwOnFailure(obj);
                    throw th2;
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            Wre wre = (Wre) this.f26647t;
            final DrawerPredictiveBackState drawerPredictiveBackState = this.f26640O;
            final boolean z2 = this.f26645o;
            final Ref.FloatRef floatRef = this.f26642Z;
            final Ref.FloatRef floatRef2 = this.f26641S;
            final Ref.FloatRef floatRef3 = this.f26643g;
            CN3 cn3 = new CN3() { // from class: androidx.compose.material3.NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1.1
                @Override // TFv.CN3
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object rl(BackEventCompat backEventCompat, Continuation continuation) {
                    drawerPredictiveBackState.KN(PredictiveBack.f29233n.n(backEventCompat.getProgress()), backEventCompat.getSwipeEdge() == 0, z2, floatRef.element, floatRef2.element, floatRef3.element);
                    return Unit.INSTANCE;
                }
            };
            this.f26644n = 1;
            if (wre.n(cn3, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (this.f26640O.nr()) {
            C.nr(this.J2, null, null, new AnonymousClass2(this.f26640O, null), 3, null);
        }
        DrawerState drawerState3 = this.f26646r;
        this.f26644n = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Wre wre, Continuation continuation) {
        return ((NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1) create(wre, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
