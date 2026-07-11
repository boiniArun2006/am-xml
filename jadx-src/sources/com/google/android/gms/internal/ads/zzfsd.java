package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfsd extends zzgtx {
    private final LinkedList zza = new LinkedList();

    @Override // com.google.android.gms.internal.ads.zzgtx
    public final Queue zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgtu, com.google.android.gms.internal.ads.zzgtw
    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgtx, com.google.android.gms.internal.ads.zzgtu
    public final /* synthetic */ Collection zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgtu, java.util.Collection, java.util.Queue
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzfro zzfroVar = (zzfro) obj;
        if (zzfroVar.zzf() != 3) {
            this.zza.add(zzfroVar);
            return true;
        }
        LinkedList linkedList = this.zza;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            zzfro zzfroVar2 = (zzfro) listIterator.next();
            if (zzfroVar2.zzf() == 3) {
                double dZze = zzfroVar2.zze();
                double dZze2 = zzfroVar.zze();
                if (dZze < dZze2 || (dZze == dZze2 && zzfroVar2.zzc() > zzfroVar.zzc())) {
                    listIterator.set(zzfroVar);
                    zzfroVar = zzfroVar2;
                }
            }
        }
        linkedList.add(zzfroVar);
        return true;
    }
}
