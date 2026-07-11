package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public final class zzgq {
    private final zzgp zza;
    private final ArrayDeque zzb = new ArrayDeque();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;

    @Nullable
    private zzgo zzf;

    public final int zzb() {
        return this.zze;
    }

    public final void zze() {
        zzf(0);
    }

    private final void zzf(int i2) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.zzd;
            if (priorityQueue.size() <= i2) {
                return;
            }
            zzgo zzgoVar = (zzgo) priorityQueue.poll();
            String str = zzfj.zza;
            int i3 = 0;
            while (true) {
                list = zzgoVar.zza;
                if (i3 >= list.size()) {
                    break;
                }
                this.zza.zza(zzgoVar.zzb, (zzer) list.get(i3));
                this.zzb.push((zzer) list.get(i3));
                i3++;
            }
            list.clear();
            zzgo zzgoVar2 = this.zzf;
            if (zzgoVar2 != null && zzgoVar2.zzb == zzgoVar.zzb) {
                this.zzf = null;
            }
            this.zzc.push(zzgoVar);
        }
    }

    public final void zza(int i2) {
        zzgrc.zzi(i2 >= 0);
        this.zze = i2;
        zzf(i2);
    }

    public final void zzd() {
        this.zzd.clear();
    }

    public zzgq(zzgp zzgpVar) {
        this.zza = zzgpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 < r0.zzb) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(long j2, zzer zzerVar) {
        zzer zzerVar2;
        zzgo zzgoVar;
        if (j2 != -9223372036854775807L) {
            int i2 = this.zze;
            if (i2 != 0) {
                if (i2 != -1) {
                    PriorityQueue priorityQueue = this.zzd;
                    if (priorityQueue.size() >= this.zze) {
                        zzgo zzgoVar2 = (zzgo) priorityQueue.peek();
                        String str = zzfj.zza;
                    }
                }
                ArrayDeque arrayDeque = this.zzb;
                if (arrayDeque.isEmpty()) {
                    zzerVar2 = new zzer();
                } else {
                    zzerVar2 = (zzer) arrayDeque.pop();
                }
                zzerVar2.zza(zzerVar.zzd());
                System.arraycopy(zzerVar.zzi(), zzerVar.zzg(), zzerVar2.zzi(), 0, zzerVar2.zzd());
                zzgo zzgoVar3 = this.zzf;
                if (zzgoVar3 != null && j2 == zzgoVar3.zzb) {
                    zzgoVar3.zza.add(zzerVar2);
                    return;
                }
                ArrayDeque arrayDeque2 = this.zzc;
                if (arrayDeque2.isEmpty()) {
                    zzgoVar = new zzgo();
                } else {
                    zzgoVar = (zzgo) arrayDeque2.pop();
                }
                List list = zzgoVar.zza;
                zzgrc.zzi(list.isEmpty());
                zzgoVar.zzb = j2;
                list.add(zzerVar2);
                this.zzd.add(zzgoVar);
                this.zzf = zzgoVar;
                int i3 = this.zze;
                if (i3 != -1) {
                    zzf(i3);
                    return;
                }
                return;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        this.zza.zza(j2, zzerVar);
    }
}
