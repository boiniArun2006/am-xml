package com.google.android.gms.internal.ads;

import YgZ.uQga.IYJfqUyym;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhbf {
    private final List zza = new ArrayList();
    private final zzhjr zzb = zzhjr.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzhbd) it.next()).zzd(false);
        }
    }

    public final zzhbk zzb() throws GeneralSecurityException {
        int i2;
        if (this.zzc) {
            throw new GeneralSecurityException(IYJfqUyym.icPxjMxrdjy);
        }
        this.zzc = true;
        List<zzhbd> list = this.zza;
        ArrayList arrayList = new ArrayList(list.size());
        int i3 = 0;
        while (i3 < list.size() - 1) {
            int i5 = i3 + 1;
            if (((zzhbd) list.get(i3)).zzg() == zzhbe.zza && ((zzhbd) list.get(i5)).zzg() != zzhbe.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i3 = i5;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzhbd zzhbdVar : list) {
            zzhbdVar.zze();
            if (zzhbdVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i7 = 3;
            if (zzhbdVar.zzg() == zzhbe.zza) {
                int i8 = 0;
                while (true) {
                    if (i8 != 0 && !hashSet.contains(Integer.valueOf(i8))) {
                        break;
                    }
                    int i9 = zzhln.zza;
                    i8 = 0;
                    while (i8 == 0) {
                        byte[] bArrZza = zzhle.zza(4);
                        i8 = (bArrZza[3] & UByte.MAX_VALUE) | ((bArrZza[0] & UByte.MAX_VALUE) << 24) | ((bArrZza[1] & UByte.MAX_VALUE) << 16) | ((bArrZza[2] & UByte.MAX_VALUE) << 8);
                    }
                }
                i2 = i8;
            } else {
                zzhbdVar.zzg();
                i2 = 0;
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (hashSet.contains(numValueOf)) {
                int i10 = i2;
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 31);
                sb.append("Id ");
                sb.append(i10);
                sb.append(" is used twice in the keyset");
                throw new GeneralSecurityException(sb.toString());
            }
            hashSet.add(numValueOf);
            zzhaz zzhazVarZzc = zzhjx.zza().zzc(zzhbdVar.zzf(), true != zzhbdVar.zzf().zza() ? null : numValueOf);
            zzhbb zzhbbVarZze = zzhbdVar.zze();
            zzhbb zzhbbVar = zzhbb.zza;
            if (!zzhbbVar.equals(zzhbbVarZze)) {
                if (zzhbb.zzb.equals(zzhbbVarZze)) {
                    i7 = 4;
                } else {
                    if (!zzhbb.zzc.equals(zzhbbVarZze)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i7 = 5;
                }
            }
            zzhbi zzhbiVar = new zzhbi(zzhazVarZzc, i7, i2, zzhbdVar.zzc(), false, zzhbi.zza, null);
            if (zzhbdVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzhbdVar.zze() != zzhbbVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzhbiVar);
        }
        if (num != null) {
            return zzhbk.zzh(new zzhbk(arrayList, this.zzb, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }

    public final zzhbf zza(zzhbd zzhbdVar) {
        if (zzhbdVar.zzh() == null) {
            if (zzhbdVar.zzc()) {
                zzc();
            }
            zzhbdVar.zzi(this);
            this.zza.add(zzhbdVar);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }
}
