package VV;

import GJW.vd;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import x0.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: VV.j$j, reason: collision with other inner class name */
    static final class C0389j extends SuspendLambda implements Function2 {
        final /* synthetic */ boolean E2;
        final /* synthetic */ n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f10956O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ float f10957S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ boolean f10958Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ MutableState f10959e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Dsr f10960g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10961n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f10962o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ FQq.Dsr f10963r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f10964t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0389j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0389j(boolean z2, boolean z3, n nVar, FQq.Dsr dsr, int i2, boolean z4, float f3, aC aCVar, Dsr dsr2, boolean z5, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f10964t = z2;
            this.f10956O = z3;
            this.J2 = nVar;
            this.f10963r = dsr;
            this.f10962o = i2;
            this.f10958Z = z4;
            this.f10957S = f3;
            this.f10960g = dsr2;
            this.E2 = z5;
            this.f10959e = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0389j(this.f10964t, this.f10956O, this.J2, this.f10963r, this.f10962o, this.f10958Z, this.f10957S, null, this.f10960g, this.E2, this.f10959e, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        
            if (VV.n.j.n(r0, r2, 0, r3, r4, r5, null, r7, false, r9, false, r11, r16, 514, null) == r15) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f10961n;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f10964t && !j.nr(this.f10959e) && this.f10956O) {
                    n nVar = this.J2;
                    this.f10961n = 1;
                    if (Ml.O(nVar, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            j.O(this.f10959e, this.f10964t);
            if (!this.f10964t) {
                return Unit.INSTANCE;
            }
            n nVar2 = this.J2;
            FQq.Dsr dsr = this.f10963r;
            int i3 = this.f10962o;
            boolean z2 = this.f10958Z;
            float f3 = this.f10957S;
            float fT = nVar2.t();
            Dsr dsr2 = this.f10960g;
            boolean z3 = this.E2;
            this.f10961n = 2;
        }
    }

    public static final fuX t(FQq.Dsr dsr, boolean z2, boolean z3, boolean z4, aC aCVar, float f3, int i2, Dsr dsr2, boolean z5, boolean z6, Composer composer, int i3, int i5) {
        composer.te(683659508);
        boolean z7 = (i5 & 2) != 0 ? true : z2;
        boolean z9 = (i5 & 4) != 0 ? true : z3;
        boolean z10 = (i5 & 8) != 0 ? false : z4;
        aC aCVar2 = (i5 & 16) != 0 ? null : aCVar;
        float fJ2 = (i5 & 32) != 0 ? 1.0f : f3;
        int i7 = (i5 & 64) != 0 ? 1 : i2;
        Dsr dsr3 = (i5 & 128) != 0 ? Dsr.f10886n : dsr2;
        boolean z11 = (i5 & 256) != 0 ? false : z5;
        boolean z12 = (i5 & 512) != 0 ? false : z6;
        if (ComposerKt.v()) {
            ComposerKt.p5(683659508, i3, -1, "com.airbnb.lottie.compose.animateLottieCompositionAsState (animateLottieCompositionAsState.kt:54)");
        }
        if (i7 <= 0) {
            throw new IllegalArgumentException(("Iterations must be a positive number (" + i7 + ").").toString());
        }
        if (Float.isInfinite(fJ2) || Float.isNaN(fJ2)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + fJ2 + ".").toString());
        }
        n nVarNr = Ml.nr(composer, 0);
        composer.te(-180606964);
        Object objIF = composer.iF();
        if (objIF == Composer.INSTANCE.n()) {
            objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(z7), null, 2, null);
            composer.o(objIF);
        }
        MutableState mutableState = (MutableState) objIF;
        composer.M7();
        composer.te(-180606834);
        if (!z11) {
            fJ2 /= eO.J2((Context) composer.ty(AndroidCompositionLocals_androidKt.Uo()));
        }
        float f4 = fJ2;
        composer.M7();
        EffectsKt.Uo(new Object[]{dsr, Boolean.valueOf(z7), aCVar2, Float.valueOf(f4), Integer.valueOf(i7)}, new C0389j(z7, z9, nVarNr, dsr, i7, z10, f4, aCVar2, dsr3, z12, mutableState, null), composer, 72);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.M7();
        return nVarNr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nr(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
