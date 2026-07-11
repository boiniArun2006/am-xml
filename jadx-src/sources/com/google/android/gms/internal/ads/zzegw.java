package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzegw extends zzbzg {
    private final Context zza;
    private final zzgzy zzb;
    private final zzehe zzc;
    private final zzcqi zzd;
    private final ArrayDeque zze;
    private final zzfor zzf;
    private final zzcac zzg;

    private final synchronized void zzp() {
        int iIntValue = ((Long) zzbjl.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzq(zzegr zzegrVar) {
        zzp();
        this.zze.addLast(zzegrVar);
    }

    @Nullable
    private final synchronized zzegr zzr(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzegr zzegrVar = (zzegr) it.next();
            if (zzegrVar.zzc.equals(str)) {
                it.remove();
                return zzegrVar;
            }
        }
        return null;
    }

    private static com.google.common.util.concurrent.Xo zzm(final zzbzu zzbzuVar, zzfnu zzfnuVar, final zzfbz zzfbzVar) {
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzegk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return zzfbzVar.zzc().zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbzuVar.zzm, false);
            }
        };
        return zzfnuVar.zza(zzfno.GMS_SIGNALS, zzgzo.zza(zzbzuVar.zza)).zzc(zzgywVar).zzb(zzegl.zza).zzi();
    }

    private static com.google.common.util.concurrent.Xo zzn(com.google.common.util.concurrent.Xo xo, zzfnu zzfnuVar, zzbsz zzbszVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzbsp zzbspVarZza = zzbszVar.zza("AFMA_getAdDictionary", zzbsw.zza, zzegq.zza);
        zzfon.zzb(xo, zzfoeVar);
        zzfnb zzfnbVarZzi = zzfnuVar.zza(zzfno.BUILD_URL, xo).zzc(zzbspVarZza).zzi();
        zzfon.zzf(zzfnbVarZzi, zzfooVar, zzfoeVar);
        return zzfnbVarZzi;
    }

    private final void zzo(com.google.common.util.concurrent.Xo xo, zzbzl zzbzlVar, zzbzu zzbzuVar) {
        zzgzo.zzr(zzgzo.zzj(xo, new zzgyw(this) { // from class: com.google.android.gms.internal.ads.zzego
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return zzgzo.zza(zzfkl.zza((InputStream) obj));
            }
        }, zzcei.zza), new zzegh(this, zzbzuVar, zzbzlVar), zzcei.zzg);
    }

    public final com.google.common.util.concurrent.Xo zzb(final zzbzu zzbzuVar, int i2) {
        zzegr zzegrVarZzr;
        zzfnb zzfnbVarZzi;
        zzbsq zzbsqVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbsz zzbszVarZza = zzbsqVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfbz zzfbzVarZzy = this.zzd.zzy(zzbzuVar, i2);
        zzbsp zzbspVarZza = zzbszVarZza.zza("google.afma.response.normalize", zzegt.zzd, zzbsw.zzb);
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            zzegrVarZzr = zzr(zzbzuVar.zzh);
            if (zzegrVarZzr == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbzuVar.zzj;
            zzegrVarZzr = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzegr zzegrVar = zzegrVarZzr;
        zzfoe zzfoeVarZzn = zzegrVar == null ? zzfoe.zzn(context, 9) : zzegrVar.zzd;
        zzfoo zzfooVarZzf = zzfbzVarZzy.zzf();
        zzfooVarZzf.zzb(zzbzuVar.zza.getStringArrayList("ad_types"));
        zzehd zzehdVar = new zzehd(zzbzuVar.zzg, zzfooVarZzf, zzfoeVarZzn);
        zzeha zzehaVar = new zzeha(context, zzbzuVar.zzb.afmaVersion, this.zzg, i2, null);
        zzfnu zzfnuVarZze = zzfbzVarZzy.zze();
        zzfoe zzfoeVarZzn2 = zzfoe.zzn(context, 11);
        if (zzegrVar == null) {
            final com.google.common.util.concurrent.Xo xoZzm = zzm(zzbzuVar, zzfnuVarZze, zzfbzVarZzy);
            final com.google.common.util.concurrent.Xo xoZzn = zzn(xoZzm, zzfnuVarZze, zzbszVarZza, zzfooVarZzf, zzfoeVarZzn);
            zzfoe zzfoeVarZzn3 = zzfoe.zzn(context, 10);
            final zzfnb zzfnbVarZzi2 = zzfnuVarZze.zzb(zzfno.HTTP, xoZzn, xoZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegp
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzbzw zzbzwVar = (zzbzw) xoZzn.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
                        bundle.putLong(zzdxh.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbzwVar.zzj());
                        bundle.putLong(zzdxh.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbzwVar.zzk());
                    }
                    return new zzehc((JSONObject) xoZzm.get(), zzbzwVar);
                }
            }).zzb(zzehdVar).zzb(zzfon.zzc(zzfoeVarZzn3)).zzb(zzehaVar).zzi();
            zzfon.zzd(zzfnbVarZzi2, zzfooVarZzf, zzfoeVarZzn3);
            zzfon.zzb(zzfnbVarZzi2, zzfoeVarZzn2);
            zzfnbVarZzi = zzfnuVarZze.zzb(zzfno.PRE_PROCESS, xoZzm, xoZzn, zzfnbVarZzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegi
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
                        bundle.putLong(zzdxh.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    return new zzegt((zzegz) zzfnbVarZzi2.get(), (JSONObject) xoZzm.get(), (zzbzw) xoZzn.get());
                }
            }).zzc(zzbspVarZza).zzi();
        } else {
            zzehc zzehcVar = new zzehc(zzegrVar.zzb, zzegrVar.zza);
            zzfoe zzfoeVarZzn4 = zzfoe.zzn(context, 10);
            final zzfnb zzfnbVarZzi3 = zzfnuVarZze.zza(zzfno.HTTP, zzgzo.zza(zzehcVar)).zzb(zzehdVar).zzb(zzfon.zzc(zzfoeVarZzn4)).zzb(zzehaVar).zzi();
            zzfon.zzd(zzfnbVarZzi3, zzfooVarZzf, zzfoeVarZzn4);
            final com.google.common.util.concurrent.Xo xoZza = zzgzo.zza(zzegrVar);
            zzfon.zzb(zzfnbVarZzi3, zzfoeVarZzn2);
            zzfnbVarZzi = zzfnuVarZze.zzb(zzfno.PRE_PROCESS, zzfnbVarZzi3, xoZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzegz zzegzVar = (zzegz) zzfnbVarZzi3.get();
                    com.google.common.util.concurrent.Xo xo = xoZza;
                    return new zzegt(zzegzVar, ((zzegr) xo.get()).zzb, ((zzegr) xo.get()).zza);
                }
            }).zzc(zzbspVarZza).zzi();
        }
        zzfon.zzd(zzfnbVarZzi, zzfooVarZzf, zzfoeVarZzn2);
        return zzfnbVarZzi;
    }

    public final com.google.common.util.concurrent.Xo zzc(final zzbzu zzbzuVar, int i2) {
        if (!((Boolean) zzbjl.zza.zze()).booleanValue()) {
            return zzgzo.zzc(new Exception("Split request is disabled."));
        }
        zzflg zzflgVar = zzbzuVar.zzi;
        if (zzflgVar == null) {
            return zzgzo.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzflgVar.zzc == 0 || zzflgVar.zzd == 0) {
            return zzgzo.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbsz zzbszVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfbz zzfbzVarZzy = this.zzd.zzy(zzbzuVar, i2);
        zzfnu zzfnuVarZze = zzfbzVarZzy.zze();
        final com.google.common.util.concurrent.Xo xoZzm = zzm(zzbzuVar, zzfnuVarZze, zzfbzVarZzy);
        zzfoo zzfooVarZzf = zzfbzVarZzy.zzf();
        final zzfoe zzfoeVarZzn = zzfoe.zzn(context, 9);
        final com.google.common.util.concurrent.Xo xoZzn = zzn(xoZzm, zzfnuVarZze, zzbszVarZza, zzfooVarZzf, zzfoeVarZzn);
        return zzfnuVarZze.zzb(zzfno.GET_URL_AND_CACHE_KEY, xoZzm, xoZzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(xoZzn, xoZzm, zzbzuVar, zzfoeVarZzn);
            }
        }).zzi();
    }

    public final com.google.common.util.concurrent.Xo zzd(String str) {
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            return zzr(str) == null ? zzgzo.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgzo.zza(new zzegg(this));
        }
        return zzgzo.zzc(new Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zze(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
            bundle.putLong(zzdxh.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.common.util.concurrent.Xo xoZzb = zzb(zzbzuVar, Binder.getCallingUid());
        zzo(xoZzb, zzbzlVar, zzbzuVar);
        if (((Boolean) zzbje.zzi.zze()).booleanValue()) {
            final zzehe zzeheVar = this.zzc;
            Objects.requireNonNull(zzeheVar);
            xoZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeheVar.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
            bundle.putLong(zzdxh.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzo(zzk(zzbzuVar, Binder.getCallingUid()), zzbzlVar, zzbzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzi(String str) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpz)).booleanValue()) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpA);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> iterableZzd = zzgrr.zza(zzgqq.zzc(',')).zzd(str2);
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            for (String str3 : iterableZzd) {
                Context context = this.zza;
                zzeha zzehaVar = new zzeha(context, str, this.zzg, callingUid, "HEAD");
                HashMap map = new HashMap();
                map.put(dpcnwfoVOnrtRA.gpbFEulaqjUtt, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                try {
                    zzegz zzegzVarZzb = zzehaVar.zza(new zzegy(str3, 30000, map, new byte[0], "", false));
                    if (zzegzVarZzb.zza != 200) {
                        int i2 = zzegzVarZzb.zza;
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 32);
                        sb.append("Unexpected preconnect response: ");
                        sb.append(i2);
                        throw new RemoteException(sb.toString());
                    }
                } catch (Exception e2) {
                    throw new RemoteException(e2.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzj(zzbzd zzbzdVar, zzbzm zzbzmVar) {
        if (((Boolean) zzbjt.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzbzdVar.zza;
            zzgzo.zzr(zzgzo.zza(null), new zzegf(this, zzbzmVar, zzbzdVar), zzcei.zzg);
        } else {
            try {
                zzbzmVar.zze("", zzbzdVar);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
            }
        }
    }

    public zzegw(Context context, zzgzy zzgzyVar, zzcac zzcacVar, zzcqi zzcqiVar, zzehe zzeheVar, ArrayDeque arrayDeque, zzehb zzehbVar, zzfor zzforVar) {
        zzbhe.zza(context);
        this.zza = context;
        this.zzb = zzgzyVar;
        this.zzg = zzcacVar;
        this.zzc = zzeheVar;
        this.zzd = zzcqiVar;
        this.zze = arrayDeque;
        this.zzf = zzforVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        zzo(zzc(zzbzuVar, Binder.getCallingUid()), zzbzlVar, zzbzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzh(String str, zzbzl zzbzlVar) {
        zzo(zzd(str), zzbzlVar, null);
    }

    public final com.google.common.util.concurrent.Xo zzk(final zzbzu zzbzuVar, int i2) {
        zzbsq zzbsqVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbsz zzbszVarZza = zzbsqVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbjr.zza.zze()).booleanValue()) {
            return zzgzo.zzc(new Exception("Signal collection disabled."));
        }
        zzfbz zzfbzVarZzy = this.zzd.zzy(zzbzuVar, i2);
        final zzfba zzfbaVarZzd = zzfbzVarZzy.zzd();
        zzbsp zzbspVarZza = zzbszVarZza.zza("google.afma.request.getSignals", zzbsw.zza, zzbsw.zzb);
        zzfoe zzfoeVarZzn = zzfoe.zzn(context, 22);
        zzfnu zzfnuVarZze = zzfbzVarZzy.zze();
        zzfno zzfnoVar = zzfno.GET_SIGNALS;
        Bundle bundle = zzbzuVar.zza;
        zzfnb zzfnbVarZzi = zzfnuVarZze.zza(zzfnoVar, zzgzo.zza(bundle)).zzb(zzfon.zzc(zzfoeVarZzn)).zzc(new zzgyw() { // from class: com.google.android.gms.internal.ads.zzegn
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) throws JSONException {
                return zzfbaVarZzd.zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbzuVar.zzm, false);
            }
        }).zzj(zzfno.JS_SIGNALS).zzc(zzbspVarZza).zzi();
        zzfoo zzfooVarZzf = zzfbzVarZzy.zzf();
        zzfooVarZzf.zzb(bundle.getStringArrayList("ad_types"));
        zzfooVarZzf.zzd(bundle.getBundle("extras"));
        zzfon.zze(zzfnbVarZzi, zzfooVarZzf, zzfoeVarZzn);
        if (((Boolean) zzbje.zzj.zze()).booleanValue()) {
            final zzehe zzeheVar = this.zzc;
            Objects.requireNonNull(zzeheVar);
            zzfnbVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeheVar.zza();
                }
            }, this.zzb);
        }
        return zzfnbVarZzi;
    }

    final /* synthetic */ InputStream zzl(com.google.common.util.concurrent.Xo xo, com.google.common.util.concurrent.Xo xo2, zzbzu zzbzuVar, zzfoe zzfoeVar) {
        String strZzi = ((zzbzw) xo.get()).zzi();
        zzq(new zzegr((zzbzw) xo.get(), (JSONObject) xo2.get(), zzbzuVar.zzh, strZzi, zzfoeVar));
        return new ByteArrayInputStream(strZzi.getBytes(StandardCharsets.UTF_8));
    }
}
