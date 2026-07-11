package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhbk implements zzhjj {
    private final List zza;
    private final zzhjr zzb;
    private final zzhbk zzc;

    private zzhbk(List list, zzhjr zzhjrVar, zzhbk zzhbkVar) {
        this.zza = list;
        this.zzb = zzhjrVar;
        this.zzc = zzhbkVar;
    }

    private final zzhbk zzj() {
        zzhbk zzhbkVar = this.zzc;
        return zzhbkVar == null ? this : zzhbkVar;
    }

    private static boolean zzl(int i2) {
        int i3 = i2 - 2;
        return i3 == 1 || i3 == 2 || i3 == 3;
    }

    public final Object zzg(zzhaw zzhawVar, Class cls) throws GeneralSecurityException {
        if (!(zzhawVar instanceof zzhix)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzhix zzhixVar = (zzhix) zzhawVar;
        zzhql zzhqlVarZzb = zzj().zzb();
        int i2 = zzhbw.zza;
        int iZza = zzhqlVarZzb.zza();
        boolean z2 = true;
        int i3 = 0;
        boolean z3 = false;
        for (zzhqk zzhqkVar : zzhqlVarZzb.zzb()) {
            if (zzhqkVar.zzk() == 3) {
                if (!zzhqkVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhqkVar.zzc())));
                }
                if (zzhqkVar.zzd() == zzhqy.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhqkVar.zzc())));
                }
                if (zzhqkVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhqkVar.zzc())));
                }
                if (zzhqkVar.zzc() == iZza) {
                    if (z3) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z3 = true;
                }
                z2 &= zzhqkVar.zzb().zzc() == zzhqb.ASYMMETRIC_PUBLIC;
                i3++;
            }
        }
        if (i3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z3 && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i5 = 0; i5 < zzd(); i5++) {
            List list = this.zza;
            if (((zzhbi) list.get(i5)).zzi() || !zzl(((zzhbi) list.get(i5)).zzj())) {
                String strZza = zzhqlVarZzb.zzd(i5).zzb().zza();
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 44 + String.valueOf(strZza).length() + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i5);
                sb.append(" and type_url ");
                sb.append(strZza);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhixVar.zza(zzj(), this.zzb, cls);
    }

    /* synthetic */ zzhbk(List list, zzhjr zzhjrVar, byte[] bArr) {
        this(list, zzhjrVar);
    }

    static final zzhbk zza(zzhql zzhqlVar) throws GeneralSecurityException {
        if (zzhqlVar == null || zzhqlVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzhbk(zzi(zzhqlVar), zzhjr.zza);
    }

    public static final zzhbk zzf(zzhbp zzhbpVar) throws GeneralSecurityException {
        zzhbf zzhbfVar = new zzhbf();
        zzhbd zzhbdVar = new zzhbd(zzhbpVar, null);
        zzhbdVar.zzb();
        zzhbdVar.zza();
        zzhbfVar.zza(zzhbdVar);
        return zzhbfVar.zzb();
    }

    static /* synthetic */ zzhbk zzh(final zzhbk zzhbkVar) {
        final zzhjr zzhjrVar = zzhbkVar.zzb;
        if (zzhjrVar.zza()) {
            return zzhbkVar;
        }
        zzhbg zzhbgVar = new zzhbg() { // from class: com.google.android.gms.internal.ads.zzhbj
            @Override // com.google.android.gms.internal.ads.zzhbg
            public final /* synthetic */ void zza(zzhbi zzhbiVar) {
                zzhkb.zza().zzb().zza(this.zza, zzhjrVar, "keyset_handle", "get_key");
            }
        };
        List<zzhbi> list = zzhbkVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhbi zzhbiVar : list) {
            arrayList.add(new zzhbi(zzhbiVar.zzf(), zzhbiVar.zzj(), zzhbiVar.zzg(), zzhbiVar.zzh(), zzhbiVar.zzi(), zzhbgVar, null));
        }
        return new zzhbk(arrayList, zzhjrVar, zzhbkVar);
    }

    private static List zzi(zzhql zzhqlVar) throws GeneralSecurityException {
        zzhaz zzhjoVar;
        boolean z2;
        ArrayList arrayList = new ArrayList(zzhqlVar.zzc());
        for (zzhqk zzhqkVar : zzhqlVar.zzb()) {
            int iZzc = zzhqkVar.zzc();
            try {
                zzhlb zzhlbVarZzk = zzk(zzhqkVar);
                zzhkg zzhkgVarZza = zzhkg.zza();
                zzhbt zzhbtVarZza = zzhbt.zza();
                zzhjoVar = !zzhkgVarZza.zzf(zzhlbVarZzk) ? new zzhjo(zzhlbVarZzk, zzhbtVarZza) : zzhkgVarZza.zzg(zzhlbVarZzk, zzhbtVarZza);
                z2 = false;
            } catch (GeneralSecurityException e2) {
                if (zzhib.zza.zza()) {
                    throw e2;
                }
                zzhjoVar = new zzhjo(zzk(zzhqkVar), zzhbt.zza());
                z2 = true;
            }
            if (zzhib.zza.zza() && !zzl(zzhqkVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z3 = true;
            int iZzk = zzhqkVar.zzk();
            if (iZzc != zzhqlVar.zza()) {
                z3 = false;
            }
            arrayList.add(new zzhbi(zzhjoVar, iZzk, iZzc, z3, z2, zzhbi.zza, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final zzhbi zzc() {
        for (zzhbi zzhbiVar : this.zza) {
            if (zzhbiVar != null && zzhbiVar.zzd()) {
                if (zzhbiVar.zzb() == zzhbb.zza) {
                    return zzhbiVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhjj
    public final int zzd() {
        return this.zza.size();
    }

    public final zzhbi zze(int i2) {
        if (i2 < 0 || i2 >= zzd()) {
            int iZzd = zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 34 + String.valueOf(iZzd).length());
            sb.append("Invalid index ");
            sb.append(i2);
            sb.append(" for keyset of size ");
            sb.append(iZzd);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        List list = this.zza;
        zzhbi zzhbiVar = (zzhbi) list.get(i2);
        if (!zzl(zzhbiVar.zzj())) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 42);
            sb2.append("Keyset-Entry at position ");
            sb2.append(i2);
            sb2.append(" has wrong status");
            throw new IllegalStateException(sb2.toString());
        }
        if (!zzhbiVar.zzi()) {
            return (zzhbi) list.get(i2);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 48);
        sb3.append("Keyset-Entry at position ");
        sb3.append(i2);
        sb3.append(" didn't parse correctly");
        throw new IllegalStateException(sb3.toString());
    }

    private zzhbk(List list, zzhjr zzhjrVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzhjrVar;
        if (zzhib.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean zZzd = false;
            while (it.hasNext()) {
                zzhbi zzhbiVar = (zzhbi) it.next();
                if (!hashSet.contains(Integer.valueOf(zzhbiVar.zzc()))) {
                    hashSet.add(Integer.valueOf(zzhbiVar.zzc()));
                    zZzd |= zzhbiVar.zzd();
                } else {
                    int iZzc = zzhbiVar.zzc();
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
                    sb.append("KeyID ");
                    sb.append(iZzc);
                    sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            if (!zZzd) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }

    private static zzhlb zzk(zzhqk zzhqkVar) throws GeneralSecurityException {
        Integer numValueOf;
        int iZzc = zzhqkVar.zzc();
        if (zzhqkVar.zzd() == zzhqy.RAW) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(iZzc);
        }
        return zzhlb.zza(zzhqkVar.zzb().zza(), zzhqkVar.zzb().zzb(), zzhqkVar.zzb().zzc(), zzhqkVar.zzd(), numValueOf);
    }

    public final String toString() {
        zzhql zzhqlVarZzb = zzb();
        int i2 = zzhbw.zza;
        zzhqm zzhqmVarZza = zzhqp.zza();
        zzhqmVarZza.zza(zzhqlVarZzb.zza());
        for (zzhqk zzhqkVar : zzhqlVarZzb.zzb()) {
            zzhqn zzhqnVarZza = zzhqo.zza();
            zzhqnVarZza.zza(zzhqkVar.zzb().zza());
            zzhqnVarZza.zzd(zzhqkVar.zzk());
            zzhqnVarZza.zzc(zzhqkVar.zzd());
            zzhqnVarZza.zzb(zzhqkVar.zzc());
            zzhqmVarZza.zzb((zzhqo) zzhqnVarZza.zzbu());
        }
        return ((zzhqp) zzhqmVarZza.zzbu()).toString();
    }

    final zzhql zzb() {
        try {
            zzhqi zzhqiVarZzh = zzhql.zzh();
            for (zzhbi zzhbiVar : this.zza) {
                zzhaz zzhazVarZza = zzhbiVar.zza();
                int iZzj = zzhbiVar.zzj();
                int iZzc = zzhbiVar.zzc();
                zzhlb zzhlbVar = (zzhlb) zzhkg.zza().zzh(zzhazVarZza, zzhlb.class, zzhbt.zza());
                Integer numZzb = zzhazVarZza.zzb();
                if (numZzb != null && numZzb.intValue() != iZzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhqj zzhqjVarZze = zzhqk.zze();
                zzhqa zzhqaVarZzd = zzhqc.zzd();
                zzhqaVarZzd.zza(zzhlbVar.zzg());
                zzhqaVarZzd.zzb(zzhlbVar.zzb());
                zzhqaVarZzd.zzc(zzhlbVar.zzc());
                zzhqjVarZze.zzb(zzhqaVarZzd);
                zzhqjVarZze.zze(iZzj);
                zzhqjVarZze.zzc(iZzc);
                zzhqjVarZze.zzd(zzhlbVar.zzd());
                zzhqiVarZzh.zzb((zzhqk) zzhqjVarZze.zzbu());
                if (zzhbiVar.zzd()) {
                    zzhqiVarZzh.zza(zzhbiVar.zzc());
                }
            }
            return (zzhql) zzhqiVarZzh.zzbu();
        } catch (GeneralSecurityException e2) {
            throw new zzhlm(e2);
        }
    }
}
