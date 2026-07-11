package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzxc;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzbs {
    private final List<zzbr> zza = new ArrayList();
    private zzoj zzb = zzoj.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb() {
        Iterator<zzbr> it = this.zza.iterator();
        while (it.hasNext()) {
            it.next().zza = false;
        }
    }

    public final zzbs zza(zzbr zzbrVar) {
        if (zzbrVar.zze != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzbrVar.zza) {
            zzb();
        }
        zzbrVar.zze = this;
        this.zza.add(zzbrVar);
        return this;
    }

    public final zzbq zza() throws GeneralSecurityException {
        int iZza;
        if (!this.zzc) {
            this.zzc = true;
            zzxc.zzb zzbVarZzc = zzxc.zzc();
            ArrayList arrayList = new ArrayList(this.zza.size());
            List<zzbr> list = this.zza;
            for (int i2 = 0; i2 < list.size() - 1; i2++) {
                if (list.get(i2).zzd == zzbu.zza && list.get(i2 + 1).zzd != zzbu.zza) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            HashSet hashSet = new HashSet();
            Integer numValueOf = null;
            for (zzbr zzbrVar : this.zza) {
                if (zzbrVar.zzb != null) {
                    if (zzbrVar.zzd != null) {
                        if (zzbrVar.zzd == zzbu.zza) {
                            iZza = 0;
                            while (true) {
                                if (iZza != 0 && !hashSet.contains(Integer.valueOf(iZza))) {
                                    break;
                                }
                                iZza = zzqq.zza();
                            }
                        } else {
                            iZza = zzbu.zza(zzbrVar.zzd);
                        }
                        int i3 = iZza;
                        if (!hashSet.contains(Integer.valueOf(i3))) {
                            hashSet.add(Integer.valueOf(i3));
                            zzbm zzbmVarZza = zzos.zza().zza(zzbrVar.zzc, zzbrVar.zzc.zza() ? Integer.valueOf(i3) : null);
                            zzbt zzbtVar = new zzbt(zzbmVarZza, zzbrVar.zzb, i3, zzbrVar.zza);
                            zzbVarZzc.zza(zzbq.zzb(zzbmVarZza, zzbrVar.zzb, i3));
                            if (zzbrVar.zza) {
                                if (numValueOf == null) {
                                    numValueOf = Integer.valueOf(i3);
                                    if (zzbrVar.zzb != zzbo.zza) {
                                        throw new GeneralSecurityException("Primary key is not enabled");
                                    }
                                } else {
                                    throw new GeneralSecurityException("Two primaries were set");
                                }
                            }
                            arrayList.add(zzbtVar);
                        } else {
                            throw new GeneralSecurityException("Id " + i3 + " is used twice in the keyset");
                        }
                    } else {
                        throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                    }
                } else {
                    throw new GeneralSecurityException("Key Status not set.");
                }
            }
            if (numValueOf != null) {
                zzbVarZzc.zza(numValueOf.intValue());
                zzxc zzxcVar = (zzxc) ((zzaky) zzbVarZzc.zze());
                zzbq.zzd(zzxcVar);
                return new zzbq(zzxcVar, arrayList, this.zzb);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
