package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcs {
    private final List zza = new ArrayList();

    final zzcs zzb(zzcs zzcsVar) {
        Iterator it = zzcsVar.zza.iterator();
        while (it.hasNext()) {
            zza((zzdh) it.next());
        }
        return this;
    }

    public final zzct zzc() {
        zzck zzckVar = new zzck(this.zza.size());
        Collections.sort(this.zza, zzdg.zza);
        Iterator it = this.zza.iterator();
        zzcy zzcyVar = it instanceof zzcy ? (zzcy) it : new zzcy(it);
        while (zzcyVar.hasNext()) {
            zzdh zzdhVarZzc = (zzdh) zzcyVar.next();
            while (zzcyVar.hasNext()) {
                zzdh zzdhVar = (zzdh) zzcyVar.zza();
                if (zzdhVarZzc.zza.compareTo(zzdhVar.zzb) > 0 || zzdhVar.zza.compareTo(zzdhVarZzc.zzb) > 0) {
                    break;
                }
                zzbe.zzd(zzdhVarZzc.zzb(zzdhVar).zzd(), "Overlapping ranges not permitted but found %s overlapping %s", zzdhVarZzc, zzdhVar);
                zzdhVarZzc = zzdhVarZzc.zzc((zzdh) zzcyVar.next());
            }
            zzckVar.zzd(zzdhVarZzc);
        }
        zzco zzcoVarZze = zzckVar.zze();
        if (zzcoVarZze.isEmpty()) {
            return zzct.zzb();
        }
        if (zzcoVarZze.size() == 1) {
            zzdx zzdxVarListIterator = zzcoVarZze.listIterator(0);
            Object next = zzdxVarListIterator.next();
            if (zzdxVarListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder();
                sb.append("expected one element but was: <");
                sb.append(next);
                for (int i2 = 0; i2 < 4 && zzdxVarListIterator.hasNext(); i2++) {
                    sb.append(", ");
                    sb.append(zzdxVarListIterator.next());
                }
                if (zzdxVarListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append(Typography.greater);
                throw new IllegalArgumentException(sb.toString());
            }
            if (((zzdh) next).equals(zzdh.zza())) {
                return zzct.zza();
            }
        }
        return new zzct(zzcoVarZze);
    }

    public final zzcs zza(zzdh zzdhVar) {
        if (!zzdhVar.zzd()) {
            this.zza.add(zzdhVar);
            return this;
        }
        throw new IllegalArgumentException(zzbf.zza("range must not be empty, but was %s", zzdhVar));
    }
}
