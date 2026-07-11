package com.google.android.recaptcha.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgr extends Lambda implements Function2 {
    final /* synthetic */ zzgd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgr(zzgd zzgdVar, String str, int i2) {
        super(2);
        this.zza = zzgdVar;
        this.zzb = str;
        this.zzc = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i2 = this.zzc;
        if (i2 != -1) {
            this.zza.zzc().zze(i2, objArr);
        }
        return Unit.INSTANCE;
    }
}
