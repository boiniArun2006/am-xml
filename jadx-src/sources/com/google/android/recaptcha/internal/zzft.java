package com.google.android.recaptcha.internal;

import GJW.C;
import GJW.Lu;
import GJW.vd;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzft implements zzfo {
    private final vd zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, Continuation continuation) {
        Object objJ2 = Lu.J2(new zzfq(zzgdVar, list, this, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, Continuation continuation) {
        Object objJ2 = Lu.J2(new zzfr(exc, zzgdVar, this, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        C.nr(this.zza, null, null, new zzfs(new zzgd(this.zzb), this, str, null), 3, null);
    }

    public zzft(vd vdVar, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = vdVar;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        int iZza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar != null) {
            int iZzg = zzufVar.zzg();
            zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
            zzgxVar.zza(iZzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
            if (iZza == zzgdVar.zza()) {
                zzgdVar.zzg(zzgdVar.zza() + 1);
            }
            zzjhVarZzb.zzf();
            long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
            int i2 = zzbk.zza;
            int iZzk = zzufVar.zzk();
            if (iZzk != 1) {
                zzbk.zza(iZzk - 2, jZza);
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        throw new zzce(5, 2, null);
    }
}
