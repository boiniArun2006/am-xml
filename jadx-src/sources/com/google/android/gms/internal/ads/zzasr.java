package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@VisibleForTesting
final class zzasr {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzasr(String str, String str2, long j2, long j3, long j4, long j5, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    zzasr(String str, zzarh zzarhVar) {
        String str2 = zzarhVar.zzb;
        long j2 = zzarhVar.zzc;
        long j3 = zzarhVar.zzd;
        long j4 = zzarhVar.zze;
        long j5 = zzarhVar.zzf;
        List arrayList = zzarhVar.zzh;
        if (arrayList == null) {
            Map map = zzarhVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzarq((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j2, j3, j4, j5, arrayList);
    }

    static zzasr zza(zzass zzassVar) throws IOException {
        List arrayList;
        if (zzasu.zzi(zzassVar) == 538247942) {
            String strZzm = zzasu.zzm(zzassVar);
            String strZzm2 = zzasu.zzm(zzassVar);
            long jZzk = zzasu.zzk(zzassVar);
            long jZzk2 = zzasu.zzk(zzassVar);
            long jZzk3 = zzasu.zzk(zzassVar);
            long jZzk4 = zzasu.zzk(zzassVar);
            int iZzi = zzasu.zzi(zzassVar);
            if (iZzi >= 0) {
                if (iZzi == 0) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i2 = 0; i2 < iZzi; i2++) {
                    list.add(new zzarq(zzasu.zzm(zzassVar).intern(), zzasu.zzm(zzassVar).intern()));
                }
                return new zzasr(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, list);
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iZzi).length() + 20);
            sb.append("readHeaderList size=");
            sb.append(iZzi);
            throw new IOException(sb.toString());
        }
        throw new IOException();
    }
}
