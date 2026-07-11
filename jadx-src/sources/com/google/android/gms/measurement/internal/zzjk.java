package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.safedk.android.analytics.brandsafety.l;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzjk {
    public static final zzjk zza = new zzjk(null, null, 100);
    private final EnumMap zzb;
    private final int zzc;

    public zzjk(Boolean bool, Boolean bool2, int i2) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        this.zzb = enumMap;
        enumMap.put(zzjj.AD_STORAGE, zzh(null));
        enumMap.put(zzjj.ANALYTICS_STORAGE, zzh(null));
        this.zzc = i2;
    }

    static String zzd(int i2) {
        return i2 != -30 ? i2 != -20 ? i2 != -10 ? i2 != 0 ? i2 != 30 ? i2 != 90 ? i2 != 100 ? NativeAdContent.ViewTag.OTHER : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static boolean zzu(int i2, int i3) {
        int i5 = -30;
        if (i2 == -20) {
            if (i3 == -30) {
                return true;
            }
            i2 = -20;
        }
        if (i2 != -30) {
            i5 = i2;
        } else if (i3 == -20) {
            return true;
        }
        return i5 == i3 || i2 < i3;
    }

    public final int zzb() {
        return this.zzc;
    }

    public static zzjk zza(zzjh zzjhVar, zzjh zzjhVar2, int i2) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        enumMap.put(zzjj.AD_STORAGE, zzjhVar);
        enumMap.put(zzjj.ANALYTICS_STORAGE, zzjhVar2);
        return new zzjk(enumMap, -10);
    }

    public static zzjk zze(Bundle bundle, int i2) {
        if (bundle == null) {
            return new zzjk(null, null, i2);
        }
        EnumMap enumMap = new EnumMap(zzjj.class);
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            enumMap.put(zzjjVar, zzg(bundle.getString(zzjjVar.zze)));
        }
        return new zzjk(enumMap, i2);
    }

    public static zzjk zzf(String str, int i2) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        zzjj[] zzjjVarArrZza = zzji.STORAGE.zza();
        for (int i3 = 0; i3 < zzjjVarArrZza.length; i3++) {
            String str2 = str == null ? "" : str;
            zzjj zzjjVar = zzjjVarArrZza[i3];
            int i5 = i3 + 2;
            if (i5 < str2.length()) {
                enumMap.put(zzjjVar, zzj(str2.charAt(i5)));
            } else {
                enumMap.put(zzjjVar, zzjh.UNINITIALIZED);
            }
        }
        return new zzjk(enumMap, i2);
    }

    static zzjh zzg(String str) {
        return str == null ? zzjh.UNINITIALIZED : str.equals("granted") ? zzjh.GRANTED : str.equals("denied") ? zzjh.DENIED : zzjh.UNINITIALIZED;
    }

    static zzjh zzh(Boolean bool) {
        return bool == null ? zzjh.UNINITIALIZED : bool.booleanValue() ? zzjh.GRANTED : zzjh.DENIED;
    }

    static zzjh zzj(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? zzjh.UNINITIALIZED : zzjh.GRANTED : zzjh.DENIED : zzjh.POLICY;
    }

    static char zzm(zzjh zzjhVar) {
        if (zzjhVar == null) {
            return '-';
        }
        int iOrdinal = zzjhVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjk)) {
            return false;
        }
        zzjk zzjkVar = (zzjk) obj;
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            if (this.zzb.get(zzjjVar) != zzjkVar.zzb.get(zzjjVar)) {
                return false;
            }
        }
        return this.zzc == zzjkVar.zzc;
    }

    public final int hashCode() {
        Iterator it = this.zzb.values().iterator();
        int iHashCode = this.zzc * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((zzjh) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzd(this.zzc));
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            sb.append(",");
            sb.append(zzjjVar.zze);
            sb.append(l.ae);
            zzjh zzjhVar = (zzjh) this.zzb.get(zzjjVar);
            if (zzjhVar == null) {
                zzjhVar = zzjh.UNINITIALIZED;
            }
            sb.append(zzjhVar);
        }
        return sb.toString();
    }

    public final boolean zzc() {
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (((zzjh) it.next()) != zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzk() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zzjj zzjjVar : zzji.STORAGE.zza()) {
            zzjh zzjhVar = (zzjh) this.zzb.get(zzjjVar);
            char c2 = '-';
            if (zzjhVar != null && (iOrdinal = zzjhVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c2 = '1';
                } else if (iOrdinal == 2) {
                    c2 = '0';
                } else if (iOrdinal != 3) {
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String zzl() {
        StringBuilder sb = new StringBuilder("G1");
        for (zzjj zzjjVar : zzji.STORAGE.zza()) {
            sb.append(zzm((zzjh) this.zzb.get(zzjjVar)));
        }
        return sb.toString();
    }

    public final Bundle zzn() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzb.entrySet()) {
            String strZzi = zzi((zzjh) entry.getValue());
            if (strZzi != null) {
                bundle.putString(((zzjj) entry.getKey()).zze, strZzi);
            }
        }
        return bundle;
    }

    public final boolean zzo(zzjj zzjjVar) {
        return ((zzjh) this.zzb.get(zzjjVar)) != zzjh.DENIED;
    }

    public final zzjh zzp() {
        zzjh zzjhVar = (zzjh) this.zzb.get(zzjj.AD_STORAGE);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    public final zzjh zzq() {
        zzjh zzjhVar = (zzjh) this.zzb.get(zzjj.ANALYTICS_STORAGE);
        return zzjhVar == null ? zzjh.UNINITIALIZED : zzjhVar;
    }

    public final boolean zzr(zzjk zzjkVar) {
        EnumMap enumMap = this.zzb;
        for (zzjj zzjjVar : (zzjj[]) enumMap.keySet().toArray(new zzjj[0])) {
            zzjh zzjhVar = (zzjh) enumMap.get(zzjjVar);
            zzjh zzjhVar2 = (zzjh) zzjkVar.zzb.get(zzjjVar);
            zzjh zzjhVar3 = zzjh.DENIED;
            if (zzjhVar == zzjhVar3 && zzjhVar2 != zzjhVar3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjk zzs(zzjk zzjkVar) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            zzjh zzjhVar = (zzjh) this.zzb.get(zzjjVar);
            zzjh zzjhVar2 = (zzjh) zzjkVar.zzb.get(zzjjVar);
            if (zzjhVar != null) {
                if (zzjhVar2 != null) {
                    zzjh zzjhVar3 = zzjh.UNINITIALIZED;
                    if (zzjhVar != zzjhVar3) {
                        if (zzjhVar2 != zzjhVar3) {
                            zzjh zzjhVar4 = zzjh.POLICY;
                            if (zzjhVar == zzjhVar4) {
                                zzjhVar = zzjhVar2;
                            } else if (zzjhVar2 != zzjhVar4) {
                                zzjh zzjhVar5 = zzjh.DENIED;
                                zzjhVar = (zzjhVar == zzjhVar5 || zzjhVar2 == zzjhVar5) ? zzjhVar5 : zzjh.GRANTED;
                            }
                        }
                    }
                }
            }
            if (zzjhVar != null) {
                enumMap.put(zzjjVar, zzjhVar);
            }
        }
        return new zzjk(enumMap, 100);
    }

    public final zzjk zzt(zzjk zzjkVar) {
        EnumMap enumMap = new EnumMap(zzjj.class);
        for (zzjj zzjjVar : zzji.STORAGE.zzb()) {
            zzjh zzjhVar = (zzjh) this.zzb.get(zzjjVar);
            if (zzjhVar == zzjh.UNINITIALIZED) {
                zzjhVar = (zzjh) zzjkVar.zzb.get(zzjjVar);
            }
            if (zzjhVar != null) {
                enumMap.put(zzjjVar, zzjhVar);
            }
        }
        return new zzjk(enumMap, this.zzc);
    }

    static String zzi(zzjh zzjhVar) {
        int iOrdinal = zzjhVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return null;
            }
            return "granted";
        }
        return "denied";
    }

    private zzjk(EnumMap enumMap, int i2) {
        EnumMap enumMap2 = new EnumMap(zzjj.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i2;
    }
}
