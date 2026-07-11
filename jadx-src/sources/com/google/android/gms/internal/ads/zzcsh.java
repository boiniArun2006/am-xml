package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcsh implements zzdbf, zzdct, zzdbz, com.google.android.gms.ads.internal.client.zza, zzdbv, zzdjd, zzdea {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfjc zze;
    private final zzfir zzf;
    private final zzfqg zzg;
    private final zzfjx zzh;
    private final zzazh zzi;
    private final zzbil zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;

    @Nullable
    private final zzdag zzm;
    private final zzddu zzn;
    private final zzczz zzo;
    private final Set zzp;
    private boolean zzq;
    private final AtomicBoolean zzr = new AtomicBoolean();
    private zzcdv zzs = null;

    zzcsh(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfjc zzfjcVar, zzfir zzfirVar, zzfqg zzfqgVar, zzfjx zzfjxVar, @Nullable View view, @Nullable zzcjl zzcjlVar, zzazh zzazhVar, zzbil zzbilVar, zzbin zzbinVar, zzfoo zzfooVar, @Nullable zzdag zzdagVar, zzddu zzdduVar, zzczz zzczzVar, Set set) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfjcVar;
        this.zzf = zzfirVar;
        this.zzg = zzfqgVar;
        this.zzh = zzfjxVar;
        this.zzi = zzazhVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcjlVar);
        this.zzj = zzbilVar;
        this.zzm = zzdagVar;
        this.zzn = zzdduVar;
        this.zzo = zzczzVar;
        this.zzp = set;
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final synchronized void zzg() {
        zzdag zzdagVar;
        try {
            if (this.zzq) {
                ArrayList arrayList = new ArrayList(zzp());
                zzfir zzfirVar = this.zzf;
                arrayList.addAll(zzfirVar.zzf);
                this.zzh.zza(this.zzg.zzb(this.zze, zzfirVar, true, null, null, arrayList, null, null), null);
            } else {
                zzfjx zzfjxVar = this.zzh;
                zzfqg zzfqgVar = this.zzg;
                zzfjc zzfjcVar = this.zze;
                zzfir zzfirVar2 = this.zzf;
                zzfjxVar.zza(zzfqgVar.zza(zzfjcVar, zzfirVar2, zzfirVar2.zzm), null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzex)).booleanValue() && (zzdagVar = this.zzm) != null) {
                    List list = zzdagVar.zzb().zzm;
                    String strZzg = zzdagVar.zzc().zzg();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zzfqg.zzd((String) it.next(), "@gw_adnetstatus@", strZzg));
                    }
                    long jZzh = zzdagVar.zzc().zzh();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(zzfqg.zzd((String) it2.next(), "@gw_ttr@", Long.toString(jZzh, 10)));
                    }
                    zzfjxVar.zza(zzfqgVar.zza(zzdagVar.zza(), zzdagVar.zzb(), arrayList3), null);
                }
                zzfjxVar.zza(zzfqgVar.zza(zzfjcVar, zzfirVar2, zzfirVar2.zzf), null);
            }
            this.zzq = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ Context zzq() {
        return this.zza;
    }

    final /* synthetic */ zzfjc zzr() {
        return this.zze;
    }

    final /* synthetic */ zzfir zzs() {
        return this.zzf;
    }

    final /* synthetic */ zzfqg zzt() {
        return this.zzg;
    }

    final /* synthetic */ zzfjx zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzddu zzv() {
        return this.zzn;
    }

    final /* synthetic */ zzczz zzw() {
        return this.zzo;
    }

    final /* synthetic */ zzcdv zzx() {
        return this.zzs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final List zzp() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmQ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zza;
            if (com.google.android.gms.ads.internal.util.zzs.zzG(context)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                Integer numZzw = com.google.android.gms.ads.internal.util.zzs.zzw(context);
                if (numZzw != null) {
                    int iMin = Math.min(numZzw.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    private final void zzy(final int i2, final int i3) {
        View view;
        if (i2 <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzo();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(i2, i3);
                }
            }, i3, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzo() {
        String strZzj;
        int i2;
        zzfir zzfirVar = this.zzf;
        List list = zzfirVar.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpj)).booleanValue() && this.zzs == null) {
            this.zzs = com.google.android.gms.ads.internal.zzt.zzh().zzr().zzn(this.zzp, this.zze.zza.zza.zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzes)).booleanValue()) {
            strZzj = this.zzi.zzb().zzj(this.zza, (View) this.zzk.get(), null);
        } else {
            strZzj = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaZ)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbjd.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzb(this.zze, zzfirVar, false, strZzj, null, zzp(), this.zzo, this.zzs), this.zzn);
            return;
        }
        if (((Boolean) zzbjd.zzg.zze()).booleanValue() && ((i2 = zzfirVar.zzb) == 1 || i2 == 2 || i2 == 5)) {
        }
        zzgzo.zzr((zzgzg) zzgzo.zzi(zzgzg.zzw(zzgzo.zza(null)), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbC)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcsb(this, strZzj), this.zzb);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaZ)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbjd.zzd.zze()).booleanValue()) {
            zzgzo.zzr((zzgzg) zzgzo.zzg(zzgzg.zzw(this.zzj.zzb()), Throwable.class, zzcsg.zza, zzcei.zzg), new zzcsa(this), this.zzb);
            return;
        }
        zzfjx zzfjxVar = this.zzh;
        zzfqg zzfqgVar = this.zzg;
        zzfjc zzfjcVar = this.zze;
        zzfir zzfirVar = this.zzf;
        zzfjxVar.zzb(zzfqgVar.zza(zzfjcVar, zzfirVar, zzfirVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzd(zzcag zzcagVar, String str, String str2) {
        zzfqg zzfqgVar = this.zzg;
        zzfjx zzfjxVar = this.zzh;
        zzfir zzfirVar = this.zzf;
        zzfjxVar.zza(zzfqgVar.zzc(zzfirVar, zzfirVar.zzh, zzcagVar), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        if (this.zzr.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeB)).intValue();
            if (iIntValue > 0) {
                zzy(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeC)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeA)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzl();
                    }
                });
            } else {
                zzo();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
        zzfqg zzfqgVar = this.zzg;
        zzfjc zzfjcVar = this.zze;
        zzfjx zzfjxVar = this.zzh;
        zzfir zzfirVar = this.zzf;
        zzfjxVar.zza(zzfqgVar.zza(zzfjcVar, zzfirVar, zzfirVar.zzg), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
        zzfqg zzfqgVar = this.zzg;
        zzfjc zzfjcVar = this.zze;
        zzfjx zzfjxVar = this.zzh;
        zzfir zzfirVar = this.zzf;
        zzfjxVar.zza(zzfqgVar.zza(zzfjcVar, zzfirVar, zzfirVar.zzi), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final void zzi() {
        zzfqg zzfqgVar = this.zzg;
        zzfjc zzfjcVar = this.zze;
        zzfjx zzfjxVar = this.zzh;
        zzfir zzfirVar = this.zzf;
        zzfjxVar.zza(zzfqgVar.zza(zzfjcVar, zzfirVar, zzfirVar.zzau), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcb)).booleanValue()) {
            int i2 = zzeVar.zza;
            zzfir zzfirVar = this.zzf;
            ArrayList arrayList = new ArrayList();
            for (String str : zzfirVar.zzo) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 2);
                sb.append("2.");
                sb.append(i2);
                arrayList.add(zzfqg.zzd(str, "@gw_mpe@", sb.toString()));
            }
            this.zzh.zza(this.zzg.zza(this.zze, zzfirVar, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final void zzk() {
        zzfir zzfirVar = this.zzf;
        if (zzfirVar.zze == 4) {
            this.zzh.zza(this.zzg.zza(this.zze, zzfirVar, zzfirVar.zzaA), null);
        }
    }

    final /* synthetic */ void zzl() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo();
            }
        });
    }

    final /* synthetic */ void zzm(final int i2, final int i3) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcse
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(i2, i3);
            }
        });
    }

    final /* synthetic */ void zzn(int i2, int i3) {
        zzy(i2 - 1, i3);
    }
}
