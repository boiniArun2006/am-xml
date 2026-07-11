package com.google.android.recaptcha.internal;

import GJW.C;
import GJW.P;
import GJW.ci;
import GJW.r;
import GJW.vd;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Timer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import yB.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzan {
    public r zza;
    private final vd zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final yB.j zzg = CN3.rl(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(Continuation continuation) throws Exception {
        zzag zzagVar;
        if (continuation instanceof zzag) {
            zzagVar = (zzag) continuation;
            int i2 = zzagVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzagVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzagVar = new zzag(this, continuation);
            }
        }
        Object obj = zzagVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzagVar.zzc;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        P pZza = zzbx.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
        zzagVar.zzc = 1;
        Object objAwait = pZza.await(zzagVar);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, Continuation continuation) throws Exception {
        zzah zzahVar;
        if (continuation instanceof zzah) {
            zzahVar = (zzah) continuation;
            int i2 = zzahVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzahVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzahVar = new zzah(this, continuation);
            }
        }
        Object objAwait = zzahVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzahVar.zzc;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAwait);
            r rVarZzf = zzf();
            zzahVar.zzd = str;
            zzahVar.zzc = 1;
            objAwait = rVarZzf.await(zzahVar);
            if (objAwait != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
            return ((StandardIntegrityManager.StandardIntegrityToken) objAwait).token();
        }
        str = zzahVar.zzd;
        ResultKt.throwOnFailure(objAwait);
        P pZza = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) objAwait).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzahVar.zzd = null;
        zzahVar.zzc = 2;
        objAwait = pZza.await(zzahVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[PHI: r2 r7
      0x0069: PHI (r2v6 com.google.android.recaptcha.internal.zzan) = (r2v3 com.google.android.recaptcha.internal.zzan), (r2v8 com.google.android.recaptcha.internal.zzan) binds: [B:29:0x0066, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0069: PHI (r7v4 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String) binds: [B:29:0x0066, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, Continuation continuation) throws Exception {
        zzaf zzafVar;
        zzan zzanVar;
        if (continuation instanceof zzaf) {
            zzafVar = (zzaf) continuation;
            int i2 = zzafVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzafVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzafVar = new zzaf(this, continuation);
            }
        }
        Object objZzj = zzafVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzafVar.zzc;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objZzj);
            try {
                zzafVar.zzd = this;
                zzafVar.zze = str;
                zzafVar.zzc = 1;
                objZzj = zzj(str, zzafVar);
                if (objZzj != coroutine_suspended) {
                    zzanVar = this;
                }
            } catch (Exception unused) {
                zzanVar = this;
                zzafVar.zzd = zzanVar;
                zzafVar.zze = str;
                zzafVar.zzc = 2;
                if (zzanVar.zze(zzafVar) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            str = zzafVar.zze;
            zzanVar = zzafVar.zzd;
            try {
                ResultKt.throwOnFailure(objZzj);
            } catch (Exception unused2) {
                zzafVar.zzd = zzanVar;
                zzafVar.zze = str;
                zzafVar.zzc = 2;
                if (zzanVar.zze(zzafVar) != coroutine_suspended) {
                    zzafVar.zzd = null;
                    zzafVar.zze = null;
                    zzafVar.zzc = 3;
                    objZzj = zzanVar.zzj(str, zzafVar);
                }
                return coroutine_suspended;
            }
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objZzj);
                return (String) objZzj;
            }
            str = zzafVar.zze;
            zzanVar = zzafVar.zzd;
            ResultKt.throwOnFailure(objZzj);
            zzafVar.zzd = null;
            zzafVar.zze = null;
            zzafVar.zzc = 3;
            objZzj = zzanVar.zzj(str, zzafVar);
        }
        return (String) objZzj;
    }

    public final Object zzd(long j2, Continuation continuation) {
        this.zzf = j2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(Continuation continuation) {
        zzak zzakVar;
        yB.j jVar;
        zzan zzanVar;
        if (continuation instanceof zzak) {
            zzakVar = (zzak) continuation;
            int i2 = zzakVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzakVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzakVar = new zzak(this, continuation);
            }
        }
        Object obj = zzakVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzakVar.zzd;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.zzg;
                zzakVar.zze = this;
                zzakVar.zza = jVar;
                zzakVar.zzd = 1;
                if (jVar.Z(null, zzakVar) != coroutine_suspended) {
                    zzanVar = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            jVar = (yB.j) zzakVar.zza;
            zzanVar = zzakVar.zze;
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(zzanVar.zze, zzao.zza)) {
                Unit unit = Unit.INSTANCE;
                jVar.T(null);
                return unit;
            }
            zzanVar.zze = zzao.zzb;
            Unit unit2 = Unit.INSTANCE;
            jVar.T(null);
            zzek zzekVar = zzanVar.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzekVar.zzb(2);
            zzen zzenVarZzf = zzekVar.zzf(38);
            zzanVar.zza = ci.t(null, 1, null);
            C.nr(zzanVar.zzb, null, null, new zzam(zzanVar, zzenVarZzf, null), 3, null);
            zzakVar.zze = null;
            zzakVar.zza = null;
            zzakVar.zzd = 2;
            if (!zzanVar.zzh) {
                new Timer().schedule(new zzai(zzanVar), 28800000L, 28800000L);
                zzanVar.zzh = true;
            }
        } catch (Throwable th) {
            jVar.T(null);
            throw th;
        }
    }

    public final r zzf() {
        r rVar = this.zza;
        if (rVar != null) {
            return rVar;
        }
        return null;
    }

    public zzan(Context context, vd vdVar, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j2) {
        this.zzb = vdVar;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }
}
