package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.collect.nKK;
import com.safedk.android.analytics.brandsafety.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzoc {
    private final Map zza;

    private final int zzg() {
        try {
            String str = (String) this.zza.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final Bundle zzf() {
        int iZzg;
        Map map = this.zza;
        if ("1".equals(map.get("GoogleConsent")) && (iZzg = zzg()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(zzjj.AD_STORAGE.zze, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(zzjj.AD_PERSONALIZATION.zze, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iZzg >= 4) {
                    String str3 = zzjj.AD_USER_DATA.zze;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzoc) {
            return zza().equalsIgnoreCase(((zzoc) obj).zza());
        }
        return false;
    }

    final String zza() {
        StringBuilder sb = new StringBuilder();
        nKK nkk = zzoe.zza;
        int size = nkk.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) nkk.get(i2);
            Map map = this.zza;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append(l.ae);
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzb() {
        zzfw zzfwVar = zzfx.zzaZ;
        if (((Boolean) zzfwVar.zzb(null)).booleanValue()) {
            Map map = this.zza;
            if ("1".equals(map.get("gdprApplies")) && "1".equals(map.get("EnableAdvertiserConsentMode"))) {
                if (!((Boolean) zzfwVar.zzb(null)).booleanValue()) {
                    return zzf();
                }
                Map map2 = this.zza;
                if (map2.get("Version") == null) {
                    return zzf();
                }
                if (zzg() >= 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString(zzjj.AD_STORAGE.zze, true != Objects.equals(map2.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                    bundle.putString(zzjj.AD_PERSONALIZATION.zze, (Objects.equals(map2.get("AuthorizePurpose3"), "1") && Objects.equals(map2.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                    if (zzg() >= 4) {
                        bundle.putString(zzjj.AD_USER_DATA.zze, (Objects.equals(map2.get("AuthorizePurpose1"), "1") && Objects.equals(map2.get("AuthorizePurpose7"), "1")) ? "granted" : "denied");
                    }
                    return bundle;
                }
            }
        } else {
            Map map3 = this.zza;
            if ("1".equals(map3.get("GoogleConsent")) && "1".equals(map3.get("gdprApplies")) && "1".equals(map3.get("EnableAdvertiserConsentMode"))) {
            }
        }
        return Bundle.EMPTY;
    }

    public final String zzc() {
        String str = (String) this.zza.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String zzd(zzoc zzocVar) {
        Map map = zzocVar.zza;
        String str = (map.isEmpty() || ((String) map.get("Version")) != null) ? "0" : "1";
        Bundle bundleZzb = zzb();
        Bundle bundleZzb2 = zzocVar.zzb();
        return str.concat((bundleZzb.size() == bundleZzb2.size() && Objects.equals(bundleZzb.getString("ad_storage"), bundleZzb2.getString("ad_storage")) && Objects.equals(bundleZzb.getString("ad_personalization"), bundleZzb2.getString("ad_personalization")) && Objects.equals(bundleZzb.getString("ad_user_data"), bundleZzb2.getString("ad_user_data"))) ? "0" : "1");
    }

    public final String zze() {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        int i2 = -1;
        try {
            String str = (String) this.zza.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i2 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        String str2 = QiDPjiOCZHDS.UkNIoEWEy;
        if (i2 < 0 || i2 > 4095) {
            sb.append("00");
        } else {
            sb.append(str2.charAt(i2 >> 6));
            sb.append(str2.charAt(i2 & 63));
        }
        int iZzg = zzg();
        if (iZzg < 0 || iZzg > 63) {
            sb.append("0");
        } else {
            sb.append(str2.charAt(iZzg));
        }
        Preconditions.checkArgument(true);
        Map map = this.zza;
        int i3 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean zEquals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i5 = i3 | 4;
        if (zEquals) {
            i5 = i3 | 12;
        }
        sb.append(str2.charAt(i5));
        return sb.toString();
    }

    zzoc(Map map) {
        HashMap map2 = new HashMap();
        this.zza = map2;
        map2.putAll(map);
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zza();
    }
}
