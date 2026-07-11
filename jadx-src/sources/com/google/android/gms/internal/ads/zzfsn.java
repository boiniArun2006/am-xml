package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfsn extends zzfsj {
    private final zzfsl zza;
    private zzfuy zzc;
    private zzftx zzd;
    private final String zzg;
    private final zzftl zzb = new zzftl();
    private boolean zze = false;
    private boolean zzf = false;

    public final List zzf() {
        return this.zzb.zza();
    }

    public final zzftx zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }

    private final void zzk(@Nullable View view) {
        this.zzc = new zzfuy(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final void zza() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        zzfth.zza().zzc(this);
        this.zzd.zzo(zzftp.zza().zzg());
        this.zzd.zzn(zzftf.zza().zzb());
        this.zzd.zzk(this, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final void zzb(@Nullable View view) {
        if (this.zzf || zzi() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzp();
        Collection<zzfsn> collectionZze = zzfth.zza().zze();
        if (collectionZze == null || collectionZze.isEmpty()) {
            return;
        }
        for (zzfsn zzfsnVar : collectionZze) {
            if (zzfsnVar != this && zzfsnVar.zzi() == view) {
                zzfsnVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zzm();
        zzfth.zza().zzd(this);
        this.zzd.zzb();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final void zzd(View view, zzfsq zzfsqVar, @Nullable String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfsqVar, "Ad overlay");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzi() {
        return (View) this.zzc.get();
    }

    zzfsn(zzfsk zzfskVar, zzfsl zzfslVar, String str) {
        this.zza = zzfslVar;
        this.zzg = str;
        zzk(null);
        if (zzfslVar.zzi() != zzfsm.HTML && zzfslVar.zzi() != zzfsm.JAVASCRIPT) {
            this.zzd = new zzfub(str, zzfslVar.zze(), null);
        } else {
            this.zzd = new zzfty(str, zzfslVar.zzf());
        }
        this.zzd.zza();
        zzfth.zza().zzb(this);
        this.zzd.zzj(zzfskVar);
    }
}
