package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzeak {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdvp zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdyk zzl;
    private final VersionInfoParcel zzm;
    private final zzdil zzo;
    private final zzfor zzp;
    private boolean zza = false;
    private boolean zzb = false;

    @GuardedBy
    private boolean zzc = false;
    private final zzcen zze = new zzcen();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();

    private final synchronized com.google.common.util.concurrent.Xo zzu() {
        String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
        if (!TextUtils.isEmpty(strZzd)) {
            return zzgzo.zza(strZzd);
        }
        final zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new Runnable() { // from class: com.google.android.gms.internal.ads.zzead
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(zzcenVar);
            }
        });
        return zzcenVar;
    }

    public final void zza() {
        this.zzq = false;
    }

    public final boolean zze() {
        return this.zzb;
    }

    final /* synthetic */ void zzh() {
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                zzm("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzd));
                this.zzl.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void zzi(Object obj, zzcen zzcenVar, String str, long j2, zzfoe zzfoeVar) {
        synchronized (obj) {
            try {
                if (!zzcenVar.isDone()) {
                    zzm(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j2));
                    this.zzl.zzc(str, "timeout");
                    this.zzo.zzc(str, "timeout");
                    zzfor zzforVar = this.zzp;
                    zzfoeVar.zzk("Timeout");
                    zzfoeVar.zzd(false);
                    zzforVar.zzb(zzfoeVar.zzm());
                    zzcenVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void zzn(boolean z2) {
        this.zzc = true;
    }

    final /* synthetic */ long zzo() {
        return this.zzd;
    }

    final /* synthetic */ zzcen zzp() {
        return this.zze;
    }

    final /* synthetic */ Executor zzq() {
        return this.zzi;
    }

    final /* synthetic */ zzdyk zzr() {
        return this.zzl;
    }

    final /* synthetic */ zzdil zzs() {
        return this.zzo;
    }

    final /* synthetic */ zzfor zzt() {
        return this.zzp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzm(String str, boolean z2, String str2, int i2) {
        this.zzn.put(str, new zzbqg(str, z2, i2, str2));
    }

    public final void zzb(final zzbqn zzbqnVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzbqnVar.zzb(this.zza.zzd());
                } catch (RemoteException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                }
            }
        }, this.zzj);
    }

    public final void zzc() {
        if (!((Boolean) zzbjk.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzct)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zze();
                        this.zzo.zze();
                        zzcen zzcenVar = this.zze;
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeac
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzf();
                            }
                        };
                        Executor executor = this.zzi;
                        zzcenVar.addListener(runnable, executor);
                        this.zza = true;
                        com.google.common.util.concurrent.Xo xoZzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeae
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzh();
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcv)).longValue(), TimeUnit.SECONDS);
                        zzgzo.zzr(xoZzu, new zzeaa(this), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzm("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final List zzd() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzbqg zzbqgVar = (zzbqg) map.get(str);
            arrayList.add(new zzbqg(str, zzbqgVar.zzb, zzbqgVar.zzc, zzbqgVar.zzd));
        }
        return arrayList;
    }

    final /* synthetic */ void zzf() {
        this.zzl.zzf();
        this.zzo.zzf();
        this.zzb = true;
    }

    final /* synthetic */ void zzg(final zzcen zzcenVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeai
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                String strZzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
                boolean zIsEmpty = TextUtils.isEmpty(strZzd);
                zzcen zzcenVar2 = zzcenVar;
                if (!zIsEmpty) {
                    zzcenVar2.zzc(strZzd);
                } else {
                    zzcenVar2.zzd(new Exception());
                }
            }
        });
    }

    final /* synthetic */ Object zzj(zzfoe zzfoeVar) {
        this.zze.zzc(Boolean.TRUE);
        zzfoeVar.zzd(true);
        this.zzp.zzb(zzfoeVar.zzm());
        return null;
    }

    final /* synthetic */ void zzk(String str, zzbqk zzbqkVar, zzfki zzfkiVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbqkVar.zze();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfkiVar.zzA(context, zzbqkVar, list);
            } catch (RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            }
        } catch (RemoteException e3) {
            throw new zzgsa(e3);
        } catch (zzfjr unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            zzbqkVar.zzf(sb.toString());
        }
    }

    final /* synthetic */ void zzl(String str) {
        final zzeak zzeakVar = this;
        Context context = zzeakVar.zzf;
        int i2 = 5;
        final zzfoe zzfoeVarZzn = zzfoe.zzn(context, 5);
        zzfoeVarZzn.zza();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfoe zzfoeVarZzn2 = zzfoe.zzn(context, i2);
                zzfoeVarZzn2.zza();
                zzfoeVarZzn2.zzi(next);
                final Object obj = new Object();
                final zzcen zzcenVar = new zzcen();
                com.google.common.util.concurrent.Xo xoZzi = zzgzo.zzi(zzcenVar, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcu)).longValue(), TimeUnit.SECONDS, zzeakVar.zzk);
                zzeakVar.zzl.zza(next);
                zzeakVar.zzo.zza(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                xoZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi(obj, zzcenVar, next, jElapsedRealtime, zzfoeVarZzn2);
                    }
                }, zzeakVar.zzi);
                arrayList.add(xoZzi);
                try {
                    try {
                        final zzeab zzeabVar = new zzeab(this, obj, next, jElapsedRealtime, zzfoeVarZzn2, zzcenVar);
                        zzeakVar = this;
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (jSONObjectOptJSONObject != null) {
                            try {
                                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                                int i3 = 0;
                                while (i3 < jSONArray.length()) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                    String strOptString = jSONObject2.optString("format", "");
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                        while (itKeys2.hasNext()) {
                                            String next2 = itKeys2.next();
                                            bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                            jSONArray = jSONArray;
                                        }
                                    }
                                    JSONArray jSONArray2 = jSONArray;
                                    arrayList2.add(new zzbqq(strOptString, bundle));
                                    i3++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        zzeakVar.zzm(next, false, "", 0);
                        try {
                            final zzfki zzfkiVarZza = zzeakVar.zzh.zza(next, new JSONObject());
                            zzeakVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeah
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzk(next, zzeabVar, zzfkiVarZza, arrayList2);
                                }
                            });
                        } catch (zzfjr e2) {
                            try {
                                String string = "Failed to create Adapter.";
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzox)).booleanValue()) {
                                    String message = e2.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                    sb.append("Failed to create Adapter.");
                                    sb.append(" ");
                                    sb.append(message);
                                    string = sb.toString();
                                }
                                zzeabVar.zzf(string);
                            } catch (RemoteException e3) {
                                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
                            }
                        }
                        i2 = 5;
                    } catch (JSONException e4) {
                        e = e4;
                        zzeakVar = this;
                        com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
                        zzeakVar.zzo.zzd("MalformedJson");
                        zzeakVar.zzl.zzd("MalformedJson");
                        zzeakVar.zze.zzd(e);
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterInitializer.updateAdapterStatus");
                        zzfor zzforVar = zzeakVar.zzp;
                        zzfoeVarZzn.zzj(e);
                        zzfoeVarZzn.zzd(false);
                        zzforVar.zzb(zzfoeVarZzn.zzm());
                    }
                } catch (JSONException e5) {
                    e = e5;
                    zzeakVar = this;
                }
            }
            zzgzo.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeag
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    this.zza.zzj(zzfoeVarZzn);
                    return null;
                }
            }, zzeakVar.zzi);
        } catch (JSONException e6) {
            e = e6;
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
            zzeakVar.zzo.zzd("MalformedJson");
            zzeakVar.zzl.zzd("MalformedJson");
            zzeakVar.zze.zzd(e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdapterInitializer.updateAdapterStatus");
            zzfor zzforVar2 = zzeakVar.zzp;
            zzfoeVarZzn.zzj(e);
            zzfoeVarZzn.zzd(false);
            zzforVar2.zzb(zzfoeVarZzn.zzm());
        }
    }

    public zzeak(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdvp zzdvpVar, ScheduledExecutorService scheduledExecutorService, zzdyk zzdykVar, VersionInfoParcel versionInfoParcel, zzdil zzdilVar, zzfor zzforVar) {
        this.zzh = zzdvpVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdykVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdilVar;
        this.zzp = zzforVar;
        zzm("com.google.android.gms.ads.MobileAds", false, "", 0);
    }
}
