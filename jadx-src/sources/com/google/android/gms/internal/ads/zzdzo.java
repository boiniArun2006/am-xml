package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdzo extends zzbpj {
    private final zzdzr zza;
    private final zzdzm zzb;
    private final Map zzc = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.gms.ads.internal.client.zzm zzc(Map map) {
        com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "extras":
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zznVar.zzb(bundle);
                        break;
                    case "keywords":
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zznVar.zzc(arrayList);
                        break;
                    case "isTestDevice":
                        zznVar.zzd(jsonReader.nextBoolean());
                        break;
                    case "tagForChildDirectedTreatment":
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zze(0);
                            break;
                        } else {
                            zznVar.zze(1);
                            break;
                        }
                        break;
                    case "tagForUnderAgeOfConsent":
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zzf(0);
                            break;
                        } else {
                            zznVar.zzf(1);
                            break;
                        }
                        break;
                    case "maxAdContentRating":
                        String strNextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(strNextString)) {
                            break;
                        } else {
                            zznVar.zzg(strNextString);
                            break;
                        }
                        break;
                    case "httpTimeoutMillis":
                        zznVar.zzh(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm zzmVarZza = zznVar.zza();
        Bundle bundle2 = zzmVarZza.zzm;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = zzmVarZza.zzc;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new com.google.android.gms.ads.internal.client.zzm(zzmVarZza.zza, zzmVarZza.zzb, bundle3, zzmVarZza.zzd, zzmVarZza.zze, zzmVarZza.zzf, zzmVarZza.zzg, zzmVarZza.zzh, zzmVarZza.zzi, zzmVarZza.zzj, zzmVarZza.zzk, zzmVarZza.zzl, bundle2, zzmVarZza.zzn, zzmVarZza.zzo, zzmVarZza.zzp, zzmVarZza.zzq, zzmVarZza.zzr, zzmVarZza.zzs, zzmVarZza.zzt, zzmVarZza.zzu, zzmVarZza.zzv, zzmVarZza.zzw, zzmVarZza.zzx, zzmVarZza.zzy, zzmVarZza.zzz, zzmVarZza.zzA);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    @Override // com.google.android.gms.internal.ads.zzbpk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(String str) throws RemoteException {
        byte b2;
        long j2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzls)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            com.google.android.gms.ads.internal.zzt.zzc();
            Map mapZzV = com.google.android.gms.ads.internal.util.zzs.zzV(uri);
            String str2 = (String) mapZzV.get(FileUploadManager.f61572j);
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                b2 = (iHashCode == 871091088 && str2.equals("initialize")) ? (byte) 0 : (byte) -1;
            } else if (str2.equals("dispose_all")) {
                b2 = 1;
            }
            if (b2 == 0) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (b2 == 1) {
                Map map = this.zzc;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzdzi) it.next()).zzc();
                }
                map.clear();
                return;
            }
            String str3 = (String) mapZzV.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                j2 = Long.parseLong(str3);
                switch (str2) {
                    case "create_interstitial_ad":
                        Map map2 = this.zzc;
                        if (map2.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlt)).intValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(j2);
                            break;
                        } else {
                            Long lValueOf = Long.valueOf(j2);
                            if (!map2.containsKey(lValueOf)) {
                                String str4 = (String) mapZzV.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzdzj zzdzjVarZzc = this.zza.zzc();
                                    zzdzjVarZzc.zzc(j2);
                                    zzdzjVarZzc.zzb(str4);
                                    map2.put(lValueOf, zzdzjVarZzc.zza().zza());
                                    this.zzb.zzb(j2);
                                    StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 39 + String.valueOf(str4).length());
                                    sb.append("Created H5 interstitial #");
                                    sb.append(j2);
                                    sb.append(" with ad unit ");
                                    sb.append(str4);
                                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(j2);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(j2);
                            }
                            break;
                        }
                        break;
                    case "load_interstitial_ad":
                        zzdzi zzdziVar = (zzdzi) this.zzc.get(Long.valueOf(j2));
                        if (zzdziVar == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzd(j2);
                            break;
                        } else {
                            zzdziVar.zza(zzc(mapZzV));
                            break;
                        }
                        break;
                    case "show_interstitial_ad":
                        zzdzi zzdziVar2 = (zzdzi) this.zzc.get(Long.valueOf(j2));
                        if (zzdziVar2 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzd(j2);
                            break;
                        } else {
                            zzdziVar2.zzb();
                            break;
                        }
                        break;
                    case "create_rewarded_ad":
                        Map map3 = this.zzc;
                        if (map3.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlt)).intValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(j2);
                            break;
                        } else {
                            Long lValueOf2 = Long.valueOf(j2);
                            if (!map3.containsKey(lValueOf2)) {
                                String str5 = (String) mapZzV.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    zzdzj zzdzjVarZzc2 = this.zza.zzc();
                                    zzdzjVarZzc2.zzc(j2);
                                    zzdzjVarZzc2.zzb(str5);
                                    map3.put(lValueOf2, zzdzjVarZzc2.zza().zzb());
                                    this.zzb.zzb(j2);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 35 + String.valueOf(str5).length());
                                    sb2.append("Created H5 rewarded #");
                                    sb2.append(j2);
                                    sb2.append(" with ad unit ");
                                    sb2.append(str5);
                                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(j2);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(j2);
                            }
                            break;
                        }
                        break;
                    case "load_rewarded_ad":
                        zzdzi zzdziVar3 = (zzdzi) this.zzc.get(Long.valueOf(j2));
                        if (zzdziVar3 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzj(j2);
                            break;
                        } else {
                            zzdziVar3.zza(zzc(mapZzV));
                            break;
                        }
                        break;
                    case "show_rewarded_ad":
                        zzdzi zzdziVar4 = (zzdzi) this.zzc.get(Long.valueOf(j2));
                        if (zzdziVar4 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzj(j2);
                            break;
                        } else {
                            zzdziVar4.zzb();
                            break;
                        }
                        break;
                    case "dispose":
                        Map map4 = this.zzc;
                        Long lValueOf3 = Long.valueOf(j2);
                        zzdzi zzdziVar5 = (zzdzi) map4.get(lValueOf3);
                        if (zzdziVar5 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not dispose H5 ad, object ID does not exist");
                            break;
                        } else {
                            zzdziVar5.zzc();
                            map4.remove(lValueOf3);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j2).length() + 16);
                            sb3.append("Disposed H5 ad #");
                            sb3.append(j2);
                            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                            break;
                        }
                        break;
                    default:
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg contained invalid action: ".concat(str2));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() {
        this.zzc.clear();
    }

    zzdzo(zzdzr zzdzrVar, zzdzm zzdzmVar) {
        this.zza = zzdzrVar;
        this.zzb = zzdzmVar;
    }
}
