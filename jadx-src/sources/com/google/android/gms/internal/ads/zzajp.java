package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzajp implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private final zzer zzb;
    private final zzafr zzc;
    private final zzafn zzd;
    private final zzafp zze;
    private final zzagh zzf;
    private zzaex zzg;
    private zzagh zzh;
    private zzagh zzi;
    private int zzj;

    @Nullable
    private zzap zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzajr zzq;
    private boolean zzr;

    static {
        int i2 = zzajn.zza;
    }

    public zzajp() {
        throw null;
    }

    private static boolean zzn(int i2, long j2) {
        return ((long) (i2 & (-128000))) == (j2 & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return zzk(zzaevVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        this.zzj = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = 0L;
        this.zzp = 0;
        this.zzo = -1L;
        if (this.zzq instanceof zzajl) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public final void zzh() {
        this.zzr = true;
    }

    public zzajp(int i2) {
        this.zzb = new zzer(10);
        this.zzc = new zzafr();
        this.zzd = new zzafn();
        this.zzl = -9223372036854775807L;
        this.zze = new zzafp();
        zzaer zzaerVar = new zzaer();
        this.zzf = zzaerVar;
        this.zzi = zzaerVar;
        this.zzo = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0234  */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45, types: [com.google.android.gms.internal.ads.zzafy] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50, types: [com.google.android.gms.internal.ads.zzafy, com.google.android.gms.internal.ads.zzajr] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.google.android.gms.internal.ads.zzaex] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzi(zzaev zzaevVar) throws Throwable {
        long j2;
        Throwable th;
        zzafn zzafnVar;
        long j3;
        int i2;
        Object zzajkVar;
        int i3;
        int i5;
        zzap zzapVar;
        long jZzn;
        zzaiq zzaiqVar;
        Object objZzd;
        ?? zzajqVar;
        zzajs zzajsVar;
        if (this.zzj == 0) {
            try {
                zzk(zzaevVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzafr zzafrVar = this.zzc;
            zzer zzerVar = new zzer(zzafrVar.zzc);
            zzaevVar.zzi(zzerVar.zzi(), 0, zzafrVar.zzc);
            int i7 = 21;
            if ((zzafrVar.zza & 1) != 0) {
                if (zzafrVar.zze != 1) {
                    i7 = 36;
                }
            } else if (zzafrVar.zze == 1) {
                i7 = 13;
            }
            j2 = -9223372036854775807L;
            if (zzerVar.zze() >= i7 + 4) {
                zzerVar.zzh(i7);
                int iZzB = zzerVar.zzB();
                if (iZzB != 1483304551) {
                    if (iZzB == 1231971951) {
                        iZzB = 1231971951;
                    } else if (zzerVar.zze() >= 40) {
                        zzerVar.zzh(36);
                        iZzB = zzerVar.zzB() == 1447187017 ? 1447187017 : 0;
                    }
                }
                if (iZzB == 1231971951) {
                    zzajt zzajtVarZza = zzajt.zza(zzafrVar, zzerVar);
                    zzafnVar = this.zzd;
                    if (!zzafnVar.zzb() && (i3 = zzajtVarZza.zzd) != -1 && (i5 = zzajtVarZza.zze) != -1) {
                        zzafnVar.zza = i3;
                        zzafnVar.zzb = i5;
                    }
                    long jZzn2 = zzaevVar.zzn();
                    if (zzaevVar.zzo() == -1) {
                        long j4 = zzajtVarZza.zzc;
                        if (j4 != -1) {
                            long j5 = j4 + jZzn2;
                            if (zzaevVar.zzo() != j5) {
                                j3 = -1;
                                long jZzo = zzaevVar.zzo();
                                th = null;
                                StringBuilder sb = new StringBuilder(String.valueOf(jZzo).length() + 53 + String.valueOf(j5).length() + 20);
                                sb.append("Data size mismatch between stream (");
                                sb.append(jZzo);
                                sb.append(") and Xing frame (");
                                sb.append(j5);
                                sb.append("), using Xing value.");
                                zzee.zzb("Mp3Extractor", sb.toString());
                            } else {
                                j3 = -1;
                                th = null;
                            }
                            zzaevVar.zzf(zzafrVar.zzc);
                            if (iZzB == 1483304551) {
                                zzajkVar = zzaju.zzd(zzajtVarZza, jZzn2);
                            } else {
                                long jZzo2 = zzaevVar.zzo();
                                long jZzb = zzajtVarZza.zzb();
                                if (jZzb == -9223372036854775807L) {
                                    zzajkVar = th;
                                } else {
                                    long j6 = zzajtVarZza.zzc;
                                    if (j6 != j3) {
                                        jZzo2 = jZzn2 + j6;
                                        i2 = zzajtVarZza.zza.zzc;
                                    } else {
                                        if (jZzo2 != j3) {
                                            j6 = jZzo2 - jZzn2;
                                            i2 = zzajtVarZza.zza.zzc;
                                        }
                                        zzajkVar = th;
                                    }
                                    long j7 = j6 - ((long) i2);
                                    long j9 = jZzo2;
                                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                                    zzajkVar = new zzajk(j9, jZzn2 + ((long) zzajtVarZza.zza.zzc), zzgxz.zza(zzfj.zzt(j7, 8000000L, jZzb, roundingMode)), zzgxz.zza(zzgxu.zza(j7, zzajtVarZza.zzb, roundingMode)), false);
                                }
                            }
                            zzapVar = this.zzk;
                            jZzn = zzaevVar.zzn();
                            if (zzapVar != null && (zzaiqVar = (zzaiq) zzapVar.zzc(zzaiq.class, zzgrg.zza())) != null) {
                                zzais zzaisVar = (zzais) zzapVar.zzc(zzais.class, zzajo.zza);
                                objZzd = zzajm.zzd(jZzn, zzaiqVar, zzaisVar != null ? -9223372036854775807L : zzfj.zzq(Long.parseLong((String) zzaisVar.zzb.get(0))));
                            } else {
                                objZzd = th;
                            }
                            ?? zzajkVar2 = zzajkVar;
                            if (this.zzr) {
                                if (objZzd != null) {
                                    zzajkVar2 = objZzd;
                                } else if (zzajkVar == null) {
                                    zzajkVar2 = th;
                                }
                                if (zzajkVar2 == 0) {
                                    zzer zzerVar2 = this.zzb;
                                    zzaevVar.zzi(zzerVar2.zzi(), 0, 4);
                                    zzerVar2.zzh(0);
                                    zzafrVar.zza(zzerVar2.zzB());
                                    zzajkVar2 = new zzajk(zzaevVar.zzo(), zzaevVar.zzn(), zzafrVar.zzf, zzafrVar.zzc, false);
                                }
                                this.zzh.zzN(zzajkVar2.zza());
                                zzajqVar = zzajkVar2;
                            } else {
                                zzajqVar = new zzajq();
                            }
                            this.zzq = zzajqVar;
                            this.zzg.zzw(zzajqVar);
                            zzt zztVar = new zzt();
                            zztVar.zzl("audio/mpeg");
                            zztVar.zzm(zzafrVar.zzb);
                            zztVar.zzn(4096);
                            zztVar.zzE(zzafrVar.zze);
                            zztVar.zzF(zzafrVar.zzd);
                            zzafn zzafnVar2 = this.zzd;
                            zztVar.zzH(zzafnVar2.zza);
                            zztVar.zzI(zzafnVar2.zzb);
                            zztVar.zzk(this.zzk);
                            if (this.zzq.zzg() != -2147483647) {
                                zztVar.zzh(this.zzq.zzg());
                            }
                            this.zzi.zzz(zztVar.zzM());
                            this.zzn = zzaevVar.zzn();
                        }
                    }
                } else {
                    if (iZzB != 1447187017) {
                        if (iZzB != 1483304551) {
                            zzaevVar.zzl();
                            zzajsVar = null;
                        }
                        zzajt zzajtVarZza2 = zzajt.zza(zzafrVar, zzerVar);
                        zzafnVar = this.zzd;
                        if (!zzafnVar.zzb()) {
                            zzafnVar.zza = i3;
                            zzafnVar.zzb = i5;
                        }
                        long jZzn22 = zzaevVar.zzn();
                        if (zzaevVar.zzo() == -1) {
                        }
                    } else {
                        zzajs zzajsVarZzd = zzajs.zzd(zzaevVar.zzo(), zzaevVar.zzn(), zzafrVar, zzerVar);
                        zzaevVar.zzf(zzafrVar.zzc);
                        zzajsVar = zzajsVarZzd;
                    }
                    th = null;
                    zzajkVar = zzajsVar;
                    zzapVar = this.zzk;
                    jZzn = zzaevVar.zzn();
                    if (zzapVar != null) {
                        zzais zzaisVar2 = (zzais) zzapVar.zzc(zzais.class, zzajo.zza);
                        objZzd = zzajm.zzd(jZzn, zzaiqVar, zzaisVar2 != null ? -9223372036854775807L : zzfj.zzq(Long.parseLong((String) zzaisVar2.zzb.get(0))));
                        ?? zzajkVar22 = zzajkVar;
                        if (this.zzr) {
                        }
                        this.zzq = zzajqVar;
                        this.zzg.zzw(zzajqVar);
                        zzt zztVar2 = new zzt();
                        zztVar2.zzl("audio/mpeg");
                        zztVar2.zzm(zzafrVar.zzb);
                        zztVar2.zzn(4096);
                        zztVar2.zzE(zzafrVar.zze);
                        zztVar2.zzF(zzafrVar.zzd);
                        zzafn zzafnVar22 = this.zzd;
                        zztVar2.zzH(zzafnVar22.zza);
                        zztVar2.zzI(zzafnVar22.zzb);
                        zztVar2.zzk(this.zzk);
                        if (this.zzq.zzg() != -2147483647) {
                        }
                        this.zzi.zzz(zztVar2.zzM());
                        this.zzn = zzaevVar.zzn();
                    }
                }
            }
        } else {
            j2 = -9223372036854775807L;
            th = null;
            long j10 = this.zzn;
            if (j10 != 0) {
                long jZzn3 = zzaevVar.zzn();
                if (jZzn3 < j10) {
                    zzaevVar.zzf((int) (j10 - jZzn3));
                }
            }
        }
        int i8 = this.zzp;
        if (i8 == 0) {
            zzaevVar.zzl();
            if (zzl(zzaevVar)) {
                return -1;
            }
            zzer zzerVar3 = this.zzb;
            zzerVar3.zzh(0);
            int iZzB2 = zzerVar3.zzB();
            if (!zzn(iZzB2, this.zzj) || zzafs.zza(iZzB2) == -1) {
                zzaevVar.zzf(1);
                this.zzj = 0;
                return 0;
            }
            zzafr zzafrVar2 = this.zzc;
            zzafrVar2.zza(iZzB2);
            if (this.zzl == j2) {
                this.zzl = this.zzq.zze(zzaevVar.zzn());
            }
            i8 = zzafrVar2.zzc;
            this.zzp = i8;
            this.zzo = zzaevVar.zzn() + ((long) i8);
            if (this.zzq instanceof zzajl) {
                zzj(this.zzm + ((long) zzafrVar2.zzg));
                throw th;
            }
        }
        int iZza = this.zzi.zza(zzaevVar, i8, true);
        if (iZza == -1) {
            return -1;
        }
        int i9 = this.zzp - iZza;
        this.zzp = i9;
        if (i9 > 0) {
            return 0;
        }
        zzagh zzaghVar = this.zzi;
        long jZzj = zzj(this.zzm);
        zzafr zzafrVar3 = this.zzc;
        zzaghVar.zze(jZzj, 1, zzafrVar3.zzc, 0, null);
        this.zzm += (long) zzafrVar3.zzg;
        this.zzp = 0;
        return 0;
    }

    private final long zzj(long j2) {
        return this.zzl + ((j2 * 1000000) / ((long) this.zzc.zzd));
    }

    private final boolean zzl(zzaev zzaevVar) throws IOException {
        zzajr zzajrVar = this.zzq;
        if (zzajrVar != null) {
            long jZzf = zzajrVar.zzf();
            if (jZzf != -1 && zzaevVar.zzm() > jZzf - 4) {
                return true;
            }
        }
        try {
            return !zzaevVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzajr zzajrVar = this.zzq;
        if ((zzajrVar instanceof zzajk) && zzajrVar.zzb()) {
            long j2 = this.zzo;
            if (j2 == -1 || j2 == this.zzq.zzf()) {
                return;
            }
            this.zzq = ((zzajk) this.zzq).zzh(this.zzo);
            zzaex zzaexVar = this.zzg;
            zzaexVar.getClass();
            zzaexVar.zzw(this.zzq);
            this.zzh.getClass();
            this.zzq.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzg = zzaexVar;
        zzagh zzaghVarZzu = zzaexVar.zzu(0, 1);
        this.zzh = zzaghVarZzu;
        this.zzi = zzaghVarZzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws Throwable {
        this.zzh.getClass();
        String str = zzfj.zza;
        int iZzi = zzi(zzaevVar);
        if (iZzi == -1 && (this.zzq instanceof zzajl)) {
            if (this.zzq.zza() != zzj(this.zzm)) {
                throw null;
            }
        }
        return iZzi;
    }

    private final boolean zzk(zzaev zzaevVar, boolean z2) throws IOException {
        int iZzm;
        int i2;
        int iZza;
        zzaevVar.zzl();
        if (zzaevVar.zzn() == 0) {
            zzap zzapVarZza = this.zze.zza(zzaevVar, null, 131072);
            this.zzk = zzapVarZza;
            if (zzapVarZza != null) {
                this.zzd.zza(zzapVarZza);
            }
            iZzm = (int) zzaevVar.zzm();
            if (!z2) {
                zzaevVar.zzf(iZzm);
            }
            i2 = 0;
        } else {
            iZzm = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i5 = i3;
        while (true) {
            if (zzl(zzaevVar)) {
                if (i3 <= 0) {
                    zzm();
                    throw new EOFException();
                }
            } else {
                zzer zzerVar = this.zzb;
                zzerVar.zzh(0);
                int iZzB = zzerVar.zzB();
                if ((i2 != 0 && !zzn(iZzB, i2)) || (iZza = zzafs.zza(iZzB)) == -1) {
                    int i7 = i5 + 1;
                    if (i5 == 131072) {
                        if (z2) {
                            return false;
                        }
                        zzm();
                        throw new EOFException();
                    }
                    if (z2) {
                        zzaevVar.zzl();
                        zzaevVar.zzk(iZzm + i7);
                    } else {
                        zzaevVar.zzf(1);
                    }
                    i3 = 0;
                    i5 = i7;
                    i2 = 0;
                } else {
                    i3++;
                    if (i3 == 1) {
                        this.zzc.zza(iZzB);
                        i2 = iZzB;
                    } else if (i3 == 4) {
                        break;
                    }
                    zzaevVar.zzk(iZza - 4);
                }
            }
        }
        if (z2) {
            zzaevVar.zzf(iZzm + i5);
        } else {
            zzaevVar.zzl();
        }
        this.zzj = i2;
        return true;
    }
}
