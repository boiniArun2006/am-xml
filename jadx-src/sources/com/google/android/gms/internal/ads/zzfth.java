package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfth {
    private static final zzfth zza = new zzfth();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    public static zzfth zza() {
        return zza;
    }

    public final void zzb(zzfsn zzfsnVar) {
        this.zzb.add(zzfsnVar);
    }

    public final void zzc(zzfsn zzfsnVar) {
        ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzfsnVar);
        if (zZzg) {
            return;
        }
        zzftp.zza().zzc();
    }

    public final void zzd(zzfsn zzfsnVar) {
        ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzfsnVar);
        this.zzc.remove(zzfsnVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzftp.zza().zze();
    }

    public final Collection zze() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final Collection zzf() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }

    private zzfth() {
    }
}
