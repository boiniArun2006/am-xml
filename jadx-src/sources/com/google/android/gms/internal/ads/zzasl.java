package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzasl implements zzarx {
    private final Map zza = new HashMap();

    @Nullable
    private final zzark zzb;

    @Nullable
    private final BlockingQueue zzc;
    private final zzarp zzd;

    @Override // com.google.android.gms.internal.ads.zzarx
    public final synchronized void zzb(zzary zzaryVar) {
        try {
            Map map = this.zza;
            String strZzi = zzaryVar.zzi();
            List list = (List) map.remove(strZzi);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzask.zzb) {
                zzask.zza("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzi);
            }
            zzary zzaryVar2 = (zzary) list.remove(0);
            map.put(strZzi, list);
            zzaryVar2.zzu(this);
            try {
                this.zzc.put(zzaryVar2);
            } catch (InterruptedException e2) {
                zzask.zzc("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.zzb.zza();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized boolean zzc(zzary zzaryVar) {
        try {
            Map map = this.zza;
            String strZzi = zzaryVar.zzi();
            if (!map.containsKey(strZzi)) {
                map.put(strZzi, null);
                zzaryVar.zzu(this);
                if (zzask.zzb) {
                    zzask.zzb("new request, sending to network %s", strZzi);
                }
                return false;
            }
            List arrayList = (List) map.get(strZzi);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            zzaryVar.zzc("waiting-for-response");
            arrayList.add(zzaryVar);
            map.put(strZzi, arrayList);
            if (zzask.zzb) {
                zzask.zzb("Request for cacheKey=%s is in flight, putting on hold.", strZzi);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zza(zzary zzaryVar, zzase zzaseVar) {
        List list;
        zzarh zzarhVar = zzaseVar.zzb;
        if (zzarhVar == null || zzarhVar.zza(System.currentTimeMillis())) {
            zzb(zzaryVar);
            return;
        }
        String strZzi = zzaryVar.zzi();
        synchronized (this) {
            list = (List) this.zza.remove(strZzi);
        }
        if (list != null) {
            if (zzask.zzb) {
                zzask.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzi);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zza((zzary) it.next(), zzaseVar, null);
            }
        }
    }

    zzasl(@NonNull zzark zzarkVar, @NonNull BlockingQueue blockingQueue, zzarp zzarpVar) {
        this.zzd = zzarpVar;
        this.zzb = zzarkVar;
        this.zzc = blockingQueue;
    }
}
