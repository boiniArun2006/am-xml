package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import com.google.android.gms.internal.p002firebaseauthapi.zzxc;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzbq implements zzoa {
    private final zzxc zza;
    private final List<zzbt> zzb;
    private final zzoj zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoa
    public final /* synthetic */ zzod zzc() {
        for (zzbt zzbtVar : this.zzb) {
            if (zzbtVar != null && zzbtVar.zzd()) {
                if (zzbtVar.zzc() == zzbo.zza) {
                    return zzbtVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    final zzxc zzd() {
        return this.zza;
    }

    private zzbq(zzxc zzxcVar, List<zzbt> list, zzoj zzojVar) throws GeneralSecurityException {
        this.zza = zzxcVar;
        this.zzb = list;
        this.zzc = zzojVar;
        if (zzit.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzxc.zza zzaVar : zzxcVar.zze()) {
                if (hashSet.contains(Integer.valueOf(zzaVar.zza()))) {
                    throw new GeneralSecurityException("KeyID " + zzaVar.zza() + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                }
                hashSet.add(Integer.valueOf(zzaVar.zza()));
            }
            if (!hashSet.contains(Integer.valueOf(zzxcVar.zzb()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(zzxc zzxcVar) throws GeneralSecurityException {
        if (zzxcVar == null || zzxcVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return zzcl.zza(this.zza).toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoa
    public final int zza() {
        return this.zzb.size();
    }

    public final zzbq zzb() throws GeneralSecurityException {
        zzxc.zza zzaVarZzb;
        zzbt zzbtVar;
        if (this.zza == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        zzxc.zzb zzbVarZzc = zzxc.zzc();
        ArrayList arrayList = new ArrayList(this.zzb.size());
        int i2 = 0;
        for (zzbt zzbtVar2 : this.zzb) {
            if (zzbtVar2 == null || !(zzbtVar2.zzb() instanceof zzcd)) {
                zzxc.zza zzaVarZza = this.zza.zza(i2);
                zzws zzwsVarZzb = zzaVarZza.zzb();
                if (zzwsVarZzb.zzb() != zzws.zza.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
                zzaVarZzb = (zzxc.zza) ((zzaky) zzaVarZza.zzn().zza(zzch.zza(zzwsVarZzb.zzf(), zzwsVarZzb.zze())).zze());
                try {
                    zzbm zzbmVarZza = zza(zzaVarZzb);
                    int iZza = zzaVarZzb.zza();
                    zzbtVar = new zzbt(zzbmVarZza, zza(zzaVarZzb.zzc()), iZza, iZza == this.zza.zzb());
                } catch (GeneralSecurityException unused) {
                    zzbtVar = null;
                }
            } else {
                zzbm zzbmVarZzc = ((zzcd) zzbtVar2.zzb()).zzc();
                zzbtVar = new zzbt(zzbmVarZzc, zzbtVar2.zzc(), zzbtVar2.zza(), zzbtVar2.zzd());
                zzaVarZzb = zzb(zzbmVarZzc, zzbtVar2.zzc(), zzbtVar2.zza());
            }
            zzbVarZzc.zza(zzaVarZzb);
            arrayList.add(zzbtVar);
            i2++;
        }
        zzbVarZzc.zza(this.zza.zzb());
        return new zzbq((zzxc) ((zzaky) zzbVarZzc.zze()), arrayList, this.zzc);
    }

    private static zzbm zza(zzxc.zza zzaVar) throws GeneralSecurityException {
        zzqe zzqeVarZza = zzqe.zza(zzaVar.zzb().zzf(), zzaVar.zzb().zze(), zzaVar.zzb().zzb(), zzaVar.zzf(), zzaVar.zzf() == zzxu.RAW ? null : Integer.valueOf(zzaVar.zza()));
        zzpc zzpcVarZza = zzpc.zza();
        zzck zzckVarZza = zzck.zza();
        if (!zzpcVarZza.zzb(zzqeVarZza)) {
            return new zzoe(zzqeVarZza, zzckVarZza);
        }
        return zzpcVarZza.zza(zzqeVarZza, zzckVarZza);
    }

    private static List<zzbt> zzc(zzxc zzxcVar) throws GeneralSecurityException {
        ArrayList arrayList = new ArrayList(zzxcVar.zza());
        for (zzxc.zza zzaVar : zzxcVar.zze()) {
            int iZza = zzaVar.zza();
            try {
                arrayList.add(new zzbt(zza(zzaVar), zza(zzaVar.zzc()), iZza, iZza == zzxcVar.zzb()));
            } catch (GeneralSecurityException e2) {
                if (!zzit.zza.zza()) {
                    arrayList.add(null);
                } else {
                    throw new GeneralSecurityException("Parsing of a single key failed (maybe wrong status?) and Tink is configured via validateKeysetsOnParsing to reject such keysets.", e2);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static zzbo zza(zzwt zzwtVar) throws GeneralSecurityException {
        int i2 = zzbp.zza[zzwtVar.ordinal()];
        if (i2 == 1) {
            return zzbo.zza;
        }
        if (i2 == 2) {
            return zzbo.zzb;
        }
        if (i2 == 3) {
            return zzbo.zzc;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    static final zzbq zza(zzxc zzxcVar) throws GeneralSecurityException {
        zzd(zzxcVar);
        return new zzbq(zzxcVar, zzc(zzxcVar), zzoj.zza);
    }

    public static final zzbq zza(zzbn zzbnVar) throws GeneralSecurityException {
        return new zzbs().zza(new zzbr(zzbnVar.zza()).zzb().zza()).zza();
    }

    @Deprecated
    public static final zzbq zza(zzby zzbyVar, zzbe zzbeVar, byte[] bArr) throws GeneralSecurityException, IOException {
        zzvq zzvqVarZza = zzbyVar.zza();
        if (zzvqVarZza != null && zzvqVarZza.zzc().zzb() != 0) {
            return zza(zza(zzvqVarZza, zzbeVar, bArr));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzxc.zza zzb(zzbm zzbmVar, zzbo zzboVar, int i2) throws GeneralSecurityException {
        zzwt zzwtVar;
        zzqe zzqeVar = (zzqe) zzpc.zza().zza(zzbmVar, zzqe.class, zzck.zza());
        Integer numZze = zzqeVar.zze();
        if (numZze != null && numZze.intValue() != i2) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        if (zzbo.zza.equals(zzboVar)) {
            zzwtVar = zzwt.ENABLED;
        } else if (zzbo.zzb.equals(zzboVar)) {
            zzwtVar = zzwt.DISABLED;
        } else if (zzbo.zzc.equals(zzboVar)) {
            zzwtVar = zzwt.DESTROYED;
        } else {
            throw new IllegalStateException("Unknown key status");
        }
        return (zzxc.zza) ((zzaky) zzxc.zza.zzd().zza(zzws.zza().zza(zzqeVar.zzf()).zza(zzqeVar.zzd()).zza(zzqeVar.zza())).zza(zzwtVar).zza(i2).zza(zzqeVar.zzc()).zze());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoa
    public final /* synthetic */ zzod zza(int i2) {
        if (i2 >= 0 && i2 < zza()) {
            if (this.zzb.get(i2) != null) {
                return this.zzb.get(i2);
            }
            throw new IllegalStateException("Keyset-Entry at position " + i2 + " has wrong status or key parsing failed");
        }
        throw new IndexOutOfBoundsException("Invalid index " + i2 + " for keyset of size " + zza());
    }

    private static zzxc zza(zzvq zzvqVar, zzbe zzbeVar, byte[] bArr) throws GeneralSecurityException {
        try {
            zzxc zzxcVarZza = zzxc.zza(zzbeVar.zza(zzvqVar.zzc().zzd(), bArr), zzakk.zza());
            zzd(zzxcVarZza);
            return zzxcVarZza;
        } catch (zzalf unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final <P> P zza(zzbf zzbfVar, Class<P> cls) throws GeneralSecurityException {
        if (zzbfVar instanceof zzno) {
            zzno zznoVar = (zzno) zzbfVar;
            zzcl.zzb(this.zza);
            for (int i2 = 0; i2 < zza(); i2++) {
                if (this.zzb.get(i2) == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i2 + " and type_url " + this.zza.zza(i2).zzb().zzf() + " failed, unable to get primitive");
                }
            }
            return (P) zznoVar.zza(this, this.zzc, cls);
        }
        throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
    }

    @Deprecated
    public final void zza(zzbx zzbxVar) throws GeneralSecurityException, IOException {
        for (zzxc.zza zzaVar : this.zza.zze()) {
            if (zzaVar.zzb().zzb() == zzws.zza.UNKNOWN_KEYMATERIAL || zzaVar.zzb().zzb() == zzws.zza.SYMMETRIC || zzaVar.zzb().zzb() == zzws.zza.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzaVar.zzb().zzb().name(), zzaVar.zzb().zzf()));
            }
        }
        zzbxVar.zza(this.zza);
    }

    @Deprecated
    public final void zza(zzbx zzbxVar, zzbe zzbeVar, byte[] bArr) throws GeneralSecurityException, IOException {
        zzxc zzxcVar = this.zza;
        zzbxVar.zza((zzvq) ((zzaky) zzvq.zza().zza(zzajp.zza(zzbeVar.zzb(zzxcVar.zzk(), bArr))).zza(zzcl.zza(zzxcVar)).zze()));
    }
}
