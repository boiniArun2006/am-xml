package com.google.android.recaptcha.internal;

import GJW.vd;
import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzil extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzil(zzja zzjaVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzjaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzil(this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzil) create((vd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[PHI: r7
      0x0057: PHI (r7v15 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:16:0x0055, B:7:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.zzb;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    ResultKt.throwOnFailure(obj);
                    if (i2 == 3) {
                        ((WebView) obj).addJavascriptInterface(this.zzc.zzq(), "RN");
                        zzja zzjaVar = this.zzc;
                        this.zzb = 4;
                        obj = zzjaVar.zzw(this);
                    }
                    ((WebView) obj).setWebViewClient(new zzik(this.zzc));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                ((WebView) obj).getSettings().setJavaScriptEnabled(true);
                zzja zzjaVar2 = this.zzc;
                this.zza = null;
                this.zzb = 3;
                obj = zzjaVar2.zzw(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            zzja zzjaVar3 = this.zzc;
            this.zzb = 1;
            obj = zzjaVar3.zzw(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        ((WebView) obj).removeJavascriptInterface("RN");
        zzja zzjaVar4 = this.zzc;
        this.zza = zzjaVar4;
        this.zzb = 2;
        obj = zzjaVar4.zzw(this);
        if (obj != coroutine_suspended) {
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            zzja zzjaVar22 = this.zzc;
            this.zza = null;
            this.zzb = 3;
            obj = zzjaVar22.zzw(this);
            if (obj != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
