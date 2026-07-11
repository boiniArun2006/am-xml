package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfqg {
    private final zzenr zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfjd zzf;
    private final zzfje zzg;
    private final Clock zzh;
    private final zzazh zzi;

    @VisibleForTesting
    public zzfqg(zzenr zzenrVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, @Nullable zzfjd zzfjdVar, @Nullable zzfje zzfjeVar, Clock clock, zzazh zzazhVar) {
        this.zza = zzenrVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfjdVar;
        this.zzg = zzfjeVar;
        this.zzh = clock;
        this.zzi = zzazhVar;
    }

    public static String zzd(String str, String str2, @Nullable String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zza(zzfjc zzfjcVar, @Nullable zzfir zzfirVar, List list) {
        return zzb(zzfjcVar, zzfirVar, false, "", "", list, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzb(zzfjc zzfjcVar, @Nullable zzfir zzfirVar, boolean z2, @Nullable String str, @Nullable String str2, List list, @Nullable zzczz zzczzVar, @Nullable zzcdv zzcdvVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z3 = true;
            String strZzd = zzd(zzd(zzd((String) it.next(), "@gw_adlocid@", zzfjcVar.zza.zza.zzg), "@gw_adnetrefresh@", true != z2 ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfirVar != null) {
                String strZzd2 = zzd(zzd(zzd(strZzd, "@gw_qdata@", zzfirVar.zzy), "@gw_adnetid@", zzfirVar.zzx), "@gw_allocid@", zzfirVar.zzw);
                Context context = this.zze;
                strZzd = zzccs.zza(strZzd2, context, zzfirVar.zzW, zzfirVar.zzaw);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoY)).booleanValue() && zzfirVar.zze == 4) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    strZzd = zzd(strZzd, "@gw_aps@", true != com.google.android.gms.ads.internal.util.zzs.zzL(context) ? "0" : "1");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpj)).booleanValue() && zzcdvVar != null) {
                    int i2 = zzcdvVar.zza;
                    String strZzd3 = zzd(strZzd, "@gw_is@", i2 >= 0 ? Integer.toString(i2) : "");
                    int i3 = zzcdvVar.zzb;
                    String strZzd4 = zzd(strZzd3, "@gw_fis@", i3 >= 0 ? Integer.toString(i3) : "");
                    int i5 = zzcdvVar.zzc;
                    strZzd = zzd(strZzd4, "@gw_sfis@", i5 >= 0 ? Integer.toString(i5) : "");
                }
            }
            zzenr zzenrVar = this.zza;
            String strZzd5 = zzd(zzd(zzd(zzd(strZzd, "@gw_adnetstatus@", zzenrVar.zzg()), "@gw_ttr@", Long.toString(zzenrVar.zzh(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzph)).booleanValue()) {
                strZzd5 = (zzczzVar == null || zzczzVar.zza() <= 0) ? zzd(strZzd5, "@gw_placement_id@", "") : zzd(strZzd5, "@gw_placement_id@", Long.toString(zzczzVar.zza(), 10));
            }
            boolean z4 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzes)).booleanValue() && !TextUtils.isEmpty(str)) {
                z4 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z5 = !zIsEmpty;
            if (z4) {
                z3 = z5;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strZzd5);
            }
            if (this.zzi.zza(Uri.parse(strZzd5))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzd5).buildUpon();
                if (z4) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzd5 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzd5);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[LOOP:0: B:13:0x005a->B:15:0x0060, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzc(zzfir zzfirVar, List list, zzcag zzcagVar) {
        zzfjd zzfjdVar;
        zzgra zzgraVarZzd;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String strZzb = zzcagVar.zzb();
            String string = Integer.toString(zzcagVar.zzc());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzet)).booleanValue()) {
                zzfje zzfjeVar = this.zzg;
                if (zzfjeVar == null) {
                    zzgraVarZzd = zzgra.zzc();
                    String str = (String) zzgraVarZzd.zzb(zzfqf.zza).zza("");
                    String str2 = (String) zzgraVarZzd.zzb(zzfqe.zza).zza("");
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzccs.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfirVar.zzW, zzfirVar.zzaw));
                    }
                    return arrayList;
                }
                zzfjdVar = zzfjeVar.zza;
            } else {
                zzfjdVar = this.zzf;
            }
            zzgraVarZzd = zzgra.zzd(zzfjdVar);
            String str3 = (String) zzgraVarZzd.zzb(zzfqf.zza).zza("");
            String str22 = (String) zzgraVarZzd.zzb(zzfqe.zza).zza("");
            it = list.iterator();
            while (it.hasNext()) {
            }
            return arrayList;
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to determine award type and amount.", e2);
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static String zzg(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            return "fakeForAdDebugLog";
        }
        return str;
    }
}
