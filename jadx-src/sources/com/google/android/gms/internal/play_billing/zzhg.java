package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzhg;
import com.google.android.gms.internal.play_billing.zzhk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class zzhg<MessageType extends zzhk<MessageType, BuilderType>, BuilderType extends zzhg<MessageType, BuilderType>> extends zzfu<MessageType, BuilderType> {
    protected zzhk zza;
    private final zzhk zzb;

    @Override // com.google.android.gms.internal.play_billing.zzin
    public final /* bridge */ /* synthetic */ zzim zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzhg zzb() {
        zzhg zzhgVar = (zzhg) this.zzb.zzd(5, null, null);
        zzhgVar.zza = zzh();
        return zzhgVar;
    }

    public final zzhg zze(zzhk zzhkVar) {
        if (!this.zzb.equals(zzhkVar)) {
            if (!this.zza.zzA()) {
                zzk();
            }
            zza(this.zza, zzhkVar);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.zzil
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public MessageType zzh() {
        if (!this.zza.zzA()) {
            return (MessageType) this.zza;
        }
        this.zza.zzv();
        return (MessageType) this.zza;
    }

    protected final void zzj() {
        if (this.zza.zzA()) {
            return;
        }
        zzk();
    }

    protected void zzk() {
        zzhk zzhkVarZzp = this.zzb.zzp();
        zza(zzhkVarZzp, this.zza);
        this.zza = zzhkVarZzp;
    }

    @Override // com.google.android.gms.internal.play_billing.zzin
    public final boolean zzl() {
        return zzhk.zzz(this.zza, false);
    }

    protected zzhg(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzA()) {
            this.zza = messagetype.zzp();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zziu.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    public final MessageType zzf() {
        MessageType messagetype = (MessageType) zzh();
        if (zzhk.zzz(messagetype, true)) {
            return messagetype;
        }
        throw new zzji(messagetype);
    }
}
