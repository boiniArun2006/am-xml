package com.google.android.recaptcha.internal;

import GJW.vd;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzal extends SuspendLambda implements Function2 {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzan zzd;
    final /* synthetic */ zzen zze;
    final /* synthetic */ Ref.ObjectRef zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzal(zzan zzanVar, zzen zzenVar, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzanVar;
        this.zze = zzenVar;
        this.zzf = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzal(this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((vd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (GJW.yg.rl(r4, r7) != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[Catch: Exception -> 0x001c, TRY_ENTER, TryCatch #0 {Exception -> 0x001c, blocks: (B:14:0x0026, B:16:0x0032, B:8:0x0018), top: B:41:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:13:0x0024). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007c -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j2;
        boolean z2;
        boolean z3;
        int errorCode;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.zzc;
        if (i2 != 0) {
            if (i2 != 1) {
                z3 = this.zzb;
                j2 = this.zza;
                ResultKt.throwOnFailure(obj);
                z2 = z3;
                j2 += j2;
                if (z2) {
                    zzan zzanVar = this.zzd;
                    this.zza = j2;
                    this.zzc = 1;
                    obj = zzanVar.zzi(this);
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                j2 = this.zza;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e2) {
                    this.zzf.element = e2;
                    if (!(e2 instanceof StandardIntegrityException) || ((errorCode = ((StandardIntegrityException) e2).getErrorCode()) != -100 && errorCode != -18 && errorCode != -12 && errorCode != -8 && errorCode != -3)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        this.zza = j2;
                        this.zzb = true;
                        this.zzc = 2;
                    } else {
                        throw e2;
                    }
                }
                this.zzd.zzf().eF((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
                this.zzd.zze = zzao.zzc;
                this.zze.zza();
                z2 = false;
                if (z2) {
                }
            }
        } else {
            ResultKt.throwOnFailure(obj);
            j2 = 1000;
            z2 = true;
            if (z2) {
            }
        }
    }
}
