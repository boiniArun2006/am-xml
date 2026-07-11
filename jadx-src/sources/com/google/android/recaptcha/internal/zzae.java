package com.google.android.recaptcha.internal;

import GJW.Lu;
import GJW.vd;
import android.content.Context;
import java.nio.charset.StandardCharsets;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzae implements zzy {
    private final zzek zza;
    private final Context zzb;
    private final zzan zzc;
    private boolean zzd = true;
    private String zze = "";
    private final zzbs zzf;

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, Continuation continuation) {
        return Lu.J2(new zzac(this, str, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r12.zze(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(zzse zzseVar, Continuation continuation) {
        zzad zzadVar;
        zzae zzaeVar;
        zzen zzenVar;
        if (continuation instanceof zzad) {
            zzadVar = (zzad) continuation;
            int i2 = zzadVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzadVar.zzd = i2 - Integer.MIN_VALUE;
            } else {
                zzadVar = new zzad(this, continuation);
            }
        }
        Object obj = zzadVar.zzb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = zzadVar.zzd;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            zzen zzenVarZzc = zzz.zzc(this);
            if (this.zzf.zza(this.zzb) != 3 || zzseVar.zzf() == 0) {
                this.zzd = false;
                zzenVarZzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
                return Unit.INSTANCE;
            }
            this.zze = zzi(zzseVar.zzg());
            zzan zzanVar = this.zzc;
            long jZzf = zzseVar.zzf();
            zzadVar.zza = this;
            zzadVar.zze = zzenVarZzc;
            zzadVar.zzd = 1;
            if (zzanVar.zzd(jZzf, zzadVar) != coroutine_suspended) {
                zzaeVar = this;
                zzenVar = zzenVarZzc;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = (zzen) zzadVar.zza;
            ResultKt.throwOnFailure(obj);
            zzenVar.zza();
            return Unit.INSTANCE;
        }
        zzenVar = zzadVar.zze;
        zzaeVar = (zzae) zzadVar.zza;
        ResultKt.throwOnFailure(obj);
        zzan zzanVar2 = zzaeVar.zzc;
        zzadVar.zza = zzenVar;
        zzadVar.zze = null;
        zzadVar.zzd = 2;
    }

    public zzae(zzek zzekVar, Context context, vd vdVar, zzan zzanVar, zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzkhVarZzg = zzkh.zzg();
        byte[] bArrZzl = zzleVar.zzl();
        byte[] bArrZzd = zzjz.zza().zza(zzkhVarZzg.zzi(bArrZzl, 0, bArrZzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzleVarZzk = zzle.zzk(bArrZzd, 0, bArrZzd.length);
        zzkh zzkhVarZzh = zzkh.zzh();
        byte[] bArrZzl2 = zzleVarZzk.zzl();
        return zzkhVarZzh.zzi(bArrZzl2, 0, bArrZzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }
}
