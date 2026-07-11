package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.safedk.android.analytics.brandsafety.l;
import com.vungle.ads.internal.protos.Sdk;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzaz {
    public static final zzaz zza = new zzaz((Boolean) null, 100, (Boolean) null, (String) null);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap zzf;

    zzaz(Boolean bool, int i2, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        this.zzf = enumMap;
        enumMap.put(zzjj.AD_USER_DATA, zzjk.zzh(bool));
        this.zzb = i2;
        this.zzc = zzl();
        this.zzd = bool2;
        this.zze = str;
    }

    public static zzaz zzh(Bundle bundle, int i2) {
        if (bundle == null) {
            return new zzaz((Boolean) null, i2, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjj.class);
        for (zzjj zzjjVar : zzji.DMA.zza()) {
            enumMap.put(zzjjVar, zzjk.zzg(bundle.getString(zzjjVar.zze)));
        }
        return new zzaz(enumMap, i2, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final int zzb() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzc;
    }

    public final Boolean zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zze;
    }

    static zzaz zza(zzjh zzjhVar, int i2) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        enumMap.put(zzjj.AD_USER_DATA, zzjhVar);
        return new zzaz(enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzaz zzg(String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] strArrSplit = str.split(":");
        int i2 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzjj.class);
        zzjj[] zzjjVarArrZza = zzji.DMA.zza();
        int length = zzjjVarArrZza.length;
        int i3 = 1;
        int i5 = 0;
        while (i5 < length) {
            enumMap.put(zzjjVarArrZza[i5], zzjk.zzj(strArrSplit[i3].charAt(0)));
            i5++;
            i3++;
        }
        return new zzaz(enumMap, i2, (Boolean) null, (String) null);
    }

    public static Boolean zzi(Bundle bundle) {
        zzjh zzjhVarZzg;
        if (bundle == null || (zzjhVarZzg = zzjk.zzg(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = zzjhVarZzg.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String zzl() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zzjj zzjjVar : zzji.DMA.zza()) {
            sb.append(":");
            sb.append(zzjk.zzm((zzjh) this.zzf.get(zzjjVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaz)) {
            return false;
        }
        zzaz zzazVar = (zzaz) obj;
        if (this.zzc.equalsIgnoreCase(zzazVar.zzc) && Objects.equals(this.zzd, zzazVar.zzd)) {
            return Objects.equals(this.zze, zzazVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.zzd;
        int i2 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.zze;
        return this.zzc.hashCode() + (i2 * 29) + ((str == null ? 17 : str.hashCode()) * Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzjk.zzd(this.zzb));
        for (zzjj zzjjVar : zzji.DMA.zza()) {
            sb.append(",");
            sb.append(zzjjVar.zze);
            sb.append(l.ae);
            zzjh zzjhVar = (zzjh) this.zzf.get(zzjjVar);
            if (zzjhVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = zzjhVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append(HrvQKfmFZJudBc.sPm);
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.zze;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public final zzjh zzc() {
        zzjh zzjhVar = (zzjh) this.zzf.get(zzjj.AD_USER_DATA);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    public final boolean zzd() {
        Iterator it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (((zzjh) it.next()) != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final Bundle zzf() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzf.entrySet()) {
            String strZzi = zzjk.zzi((zzjh) entry.getValue());
            if (strZzi != null) {
                bundle.putString(((zzjj) entry.getKey()).zze, strZzi);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    private zzaz(EnumMap enumMap, int i2, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjj.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i2;
        this.zzc = zzl();
        this.zzd = bool;
        this.zze = str;
    }
}
