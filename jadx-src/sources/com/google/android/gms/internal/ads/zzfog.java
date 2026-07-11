package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfog implements zzfoe {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfot zzj = zzfot.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    final /* synthetic */ long zzA() {
        return this.zzb;
    }

    final /* synthetic */ long zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ int zzD() {
        return this.zze;
    }

    final /* synthetic */ String zzE() {
        return this.zzf;
    }

    final /* synthetic */ String zzF() {
        return this.zzg;
    }

    final /* synthetic */ String zzG() {
        return this.zzh;
    }

    final /* synthetic */ String zzH() {
        return this.zzi;
    }

    final /* synthetic */ zzfot zzI() {
        return this.zzj;
    }

    final /* synthetic */ String zzJ() {
        return this.zzk;
    }

    final /* synthetic */ String zzK() {
        return this.zzl;
    }

    final /* synthetic */ String zzL() {
        return this.zzm;
    }

    public final synchronized zzfog zzM(int i2) {
        this.zzq = i2;
        return this;
    }

    final /* synthetic */ int zzN() {
        return this.zzp;
    }

    final /* synthetic */ int zzO() {
        return this.zzq;
    }

    final /* synthetic */ int zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final synchronized boolean zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    @Nullable
    public final synchronized zzfoh zzm() {
        try {
            if (this.zzn) {
                return null;
            }
            this.zzn = true;
            if (!this.zzo) {
                zzq();
            }
            if (this.zzc < 0) {
                zzr();
            }
            return new zzfoh(this, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzfog zzq() {
        Configuration configuration;
        com.google.android.gms.ads.internal.util.zzz zzzVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        this.zze = zzzVarZzf.zzm(context);
        Resources resources = context.getResources();
        int i2 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i2 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i2;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        this.zzo = true;
        return this;
    }

    public final synchronized zzfog zzr() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        return this;
    }

    public final synchronized zzfog zzs(boolean z2) {
        this.zzd = z2;
        return this;
    }

    public final synchronized zzfog zzt(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfog zzu(zzfot zzfotVar) {
        this.zzj = zzfotVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r2.zzg = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzfog zzv(zzfjb zzfjbVar) {
        try {
            String str = zzfjbVar.zzb.zzb;
            if (!TextUtils.isEmpty(str)) {
                this.zzf = str;
            }
            Iterator it = zzfjbVar.zza.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = ((zzfir) it.next()).zzab;
                if (!TextUtils.isEmpty(str2)) {
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfog zzw(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            IBinder iBinder = zzeVar.zze;
            if (iBinder != null) {
                zzday zzdayVar = (zzday) iBinder;
                String strZzk = zzdayVar.zzk();
                if (!TextUtils.isEmpty(strZzk)) {
                    this.zzf = strZzk;
                }
                String strZzf = zzdayVar.zzf();
                if (!TextUtils.isEmpty(strZzf)) {
                    this.zzg = strZzf;
                }
            }
        } finally {
        }
        return this;
    }

    public final synchronized zzfog zzx(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfog zzy(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkf)).booleanValue()) {
            this.zzl = zzbyp.zzf(th);
            this.zzk = (String) zzgrr.zza(zzgqq.zzc('\n')).zzd(zzbyp.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfog zzz(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkf)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    zzfog(Context context, int i2) {
        this.zza = context;
        this.zzp = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zza() {
        zzq();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzc() {
        zzr();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzd(boolean z2) {
        zzs(z2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zze(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzf(zzfot zzfotVar) {
        zzu(zzfotVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzg(zzfjb zzfjbVar) {
        zzv(zzfjbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzi(String str) {
        zzx(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzj(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzk(String str) {
        zzz(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzp(int i2) {
        zzM(i2);
        return this;
    }
}
