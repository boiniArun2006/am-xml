package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdzc {
    private final Map zza = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:8:0x0019, B:10:0x0032, B:12:0x0038, B:14:0x0041, B:18:0x0049, B:25:0x0068, B:29:0x009c, B:31:0x00a6, B:32:0x00ae, B:33:0x00b5, B:35:0x00bb, B:36:0x00bf, B:38:0x00d4, B:39:0x00dd, B:41:0x00e3, B:43:0x00f1, B:45:0x00f7, B:46:0x0109, B:48:0x010f, B:50:0x0121, B:52:0x0129, B:56:0x013a, B:58:0x0142, B:60:0x0148, B:62:0x0151, B:63:0x015a, B:26:0x0079, B:27:0x008a), top: B:70:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zza(long j2, int i2, long j3) {
        int iIntValue;
        ArrayDeque arrayDeque;
        Long l2;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue()) {
                if (i2 == 2) {
                    zzdza zzdzaVar = new zzdza();
                    zzdzaVar.zza(j2);
                    zzdzaVar.zzb(1);
                    zzdzf zzdzfVarZzc = zzdzaVar.zzc();
                    Map map = this.zza;
                    ArrayDeque arrayDeque2 = (ArrayDeque) map.get(zzdzfVarZzc);
                    if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                        arrayDeque2.removeFirst();
                        if (arrayDeque2.isEmpty()) {
                            map.remove(zzdzfVarZzc);
                        }
                    }
                    i2 = 2;
                }
                zzdza zzdzaVar2 = new zzdza();
                zzdzaVar2.zza(j2);
                zzdzaVar2.zzb(i2);
                zzdzf zzdzfVarZzc2 = zzdzaVar2.zzc();
                int iZzb = zzdzfVarZzc2.zzb();
                if (iZzb == 0) {
                    iIntValue = 0;
                    if (iIntValue > 0) {
                        Map map2 = this.zza;
                        ArrayDeque arrayDeque3 = (ArrayDeque) map2.get(zzdzfVarZzc2);
                        if (arrayDeque3 == null) {
                            arrayDeque3 = new ArrayDeque();
                            map2.put(zzdzfVarZzc2, arrayDeque3);
                        }
                        arrayDeque3.addLast(Long.valueOf(j3));
                        while (arrayDeque3.size() > iIntValue) {
                            arrayDeque3.removeFirst();
                        }
                        zzc();
                        int iIntValue2 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziY)).intValue();
                        if (iIntValue2 <= 0) {
                            map2.clear();
                            return;
                        }
                        while (true) {
                            Iterator it = map2.values().iterator();
                            int size = 0;
                            while (it.hasNext()) {
                                size += ((ArrayDeque) it.next()).size();
                            }
                            if (size <= iIntValue2) {
                                break;
                            }
                            if (!map2.isEmpty()) {
                                Long l5 = Long.MAX_VALUE;
                                Map.Entry entry = null;
                                for (Map.Entry entry2 : map2.entrySet()) {
                                    ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                                    if (!arrayDeque4.isEmpty() && (l2 = (Long) arrayDeque4.peekFirst()) != null && l2.longValue() < l5.longValue()) {
                                        entry = entry2;
                                        l5 = l2;
                                    }
                                }
                                if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                    arrayDeque.removeFirst();
                                    if (arrayDeque.isEmpty()) {
                                        map2.remove(entry.getKey());
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (iZzb == 1) {
                        iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziV)).intValue();
                    } else if (iZzb == 2) {
                        iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziW)).intValue();
                    } else if (iZzb == 3) {
                        iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziX)).intValue();
                    }
                    if (iIntValue > 0) {
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized Map zzb() {
        HashMap map;
        map = new HashMap();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                map.put((zzdzf) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return map;
    }

    zzdzc() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzc() {
        long jLongValue;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        Iterator it = this.zza.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzdzf zzdzfVar = (zzdzf) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int iZzb = zzdzfVar.zzb();
            if (iZzb != 0) {
                if (iZzb != 1) {
                    if (iZzb != 2) {
                        if (iZzb == 3) {
                            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziU)).longValue();
                        }
                    } else {
                        jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziT)).longValue();
                    }
                } else {
                    jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziS)).longValue();
                }
            } else {
                jLongValue = 0;
            }
            if (jLongValue == 0) {
                it.remove();
                jLongValue = 0;
            }
            if (jLongValue > 0) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext() && jCurrentTimeMillis - ((Long) it2.next()).longValue() > jLongValue) {
                    it2.remove();
                }
                if (arrayDeque.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
