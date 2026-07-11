package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaop implements zzaon {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzagh zzb;

    @Nullable
    private final zzaqf zzd;
    private final String zze;

    @Nullable
    private final zzer zzf;

    @Nullable
    private final zzape zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzaoo zzi = new zzaoo(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i2) {
        this.zzn = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        zzgm.zzj(this.zzh);
        this.zzi.zza();
        zzape zzapeVar = this.zzg;
        if (zzapeVar != null) {
            zzapeVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzer zzerVar) {
        char c2;
        boolean z2;
        boolean z3;
        int i2;
        float f3;
        int i3;
        int i5;
        char c4 = 3;
        this.zzb.getClass();
        int iZzg = zzerVar.zzg();
        int iZze = zzerVar.zze();
        byte[] bArrZzi = zzerVar.zzi();
        this.zzj += (long) zzerVar.zzd();
        this.zzb.zzc(zzerVar, zzerVar.zzd());
        while (true) {
            int iZzi = zzgm.zzi(bArrZzi, iZzg, iZze, this.zzh);
            if (iZzi == iZze) {
                break;
            }
            int i7 = iZzi + 3;
            int i8 = zzerVar.zzi()[i7] & UByte.MAX_VALUE;
            int i9 = iZzi - iZzg;
            if (this.zzl) {
                c2 = c4;
            } else {
                if (i9 > 0) {
                    this.zzi.zzc(bArrZzi, iZzg, iZzi);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                zzaoo zzaooVar = this.zzi;
                if (zzaooVar.zzb(i8, i10)) {
                    String str = this.zza;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] bArrCopyOf = Arrays.copyOf(zzaooVar.zzc, zzaooVar.zza);
                    int i11 = bArrCopyOf[4] & UByte.MAX_VALUE;
                    byte b2 = bArrCopyOf[5];
                    int i12 = b2 & UByte.MAX_VALUE;
                    int i13 = bArrCopyOf[6] & UByte.MAX_VALUE;
                    int i14 = (i11 << 4) | (i12 >> 4);
                    int i15 = (bArrCopyOf[7] & 240) >> 4;
                    int i16 = ((b2 & 15) << 8) | i13;
                    if (i15 != 2) {
                        if (i15 == 3) {
                            i3 = i16 * 16;
                            i5 = i14 * 9;
                        } else if (i15 != 4) {
                            f3 = 1.0f;
                            c2 = 3;
                        } else {
                            i3 = i16 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            i5 = i14 * 100;
                        }
                        f3 = i3 / i5;
                        c2 = 3;
                    } else {
                        c2 = 3;
                        f3 = (i16 * 4) / (i14 * 3);
                    }
                    zzt zztVar = new zzt();
                    zztVar.zza(str);
                    zztVar.zzl(str2);
                    zztVar.zzm("video/mpeg2");
                    zztVar.zzt(i14);
                    zztVar.zzu(i16);
                    zztVar.zzz(f3);
                    zztVar.zzp(Collections.singletonList(bArrCopyOf));
                    zzv zzvVarZzM = zztVar.zzM();
                    int i17 = (bArrCopyOf[7] & 15) - 1;
                    long j2 = 0;
                    if (i17 >= 0 && i17 < 8) {
                        double d2 = zzc[i17];
                        byte b4 = bArrCopyOf[zzaooVar.zzb + 9];
                        int i18 = (b4 & 96) >> 5;
                        int i19 = b4 & 31;
                        if (i18 != i19) {
                            d2 *= (((double) i18) + 1.0d) / ((double) (i19 + 1));
                        }
                        j2 = (long) (1000000.0d / d2);
                    }
                    Pair pairCreate = Pair.create(zzvVarZzM, Long.valueOf(j2));
                    this.zzb.zzz((zzv) pairCreate.first);
                    this.zzm = ((Long) pairCreate.second).longValue();
                    this.zzl = true;
                }
            }
            zzape zzapeVar = this.zzg;
            if (zzapeVar != null) {
                if (i9 > 0) {
                    zzapeVar.zzd(bArrZzi, iZzg, iZzi);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (zzapeVar.zze(i2)) {
                    int iZza = zzgm.zza(zzapeVar.zza, zzapeVar.zzb);
                    zzer zzerVar2 = this.zzf;
                    String str3 = zzfj.zza;
                    zzerVar2.zzb(zzapeVar.zza, iZza);
                    this.zzd.zzb(this.zzp, zzerVar2);
                }
                if (i8 == 178) {
                    if (zzerVar.zzi()[iZzi + 2] == 1) {
                        zzapeVar.zzc(178);
                    }
                    i8 = 178;
                }
            }
            if (i8 == 0 || i8 == 179) {
                int i20 = iZze - iZzi;
                if (this.zzr && this.zzl) {
                    long j3 = this.zzp;
                    if (j3 != -9223372036854775807L) {
                        this.zzb.zze(j3, this.zzq ? 1 : 0, ((int) (this.zzj - this.zzo)) - i20, i20, null);
                    }
                }
                if (!this.zzk || this.zzr) {
                    this.zzo = this.zzj - ((long) i20);
                    long j4 = this.zzn;
                    if (j4 == -9223372036854775807L) {
                        long j5 = this.zzp;
                        j4 = j5 != -9223372036854775807L ? j5 + this.zzm : -9223372036854775807L;
                    }
                    this.zzp = j4;
                    z2 = false;
                    this.zzq = false;
                    this.zzn = -9223372036854775807L;
                    z3 = true;
                    this.zzk = true;
                } else {
                    z2 = false;
                    z3 = true;
                }
                this.zzr = i8 == 0 ? z3 : z2;
            } else if (i8 == 184) {
                this.zzq = true;
            }
            iZzg = i7;
            c4 = c2;
        }
        if (!this.zzl) {
            this.zzi.zzc(bArrZzi, iZzg, iZze);
        }
        zzape zzapeVar2 = this.zzg;
        if (zzapeVar2 != null) {
            zzapeVar2.zzd(bArrZzi, iZzg, iZze);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z2) {
        zzagh zzaghVar = this.zzb;
        zzaghVar.getClass();
        if (z2) {
            boolean z3 = this.zzq;
            long j2 = this.zzj - this.zzo;
            zzaghVar.zze(this.zzp, z3 ? 1 : 0, (int) j2, 0, null);
        }
    }

    zzaop(@Nullable zzaqf zzaqfVar, String str) {
        zzer zzerVar;
        this.zzd = zzaqfVar;
        this.zze = str;
        if (zzaqfVar != null) {
            this.zzg = new zzape(178, 128);
            zzerVar = new zzer();
        } else {
            zzerVar = null;
            this.zzg = null;
        }
        this.zzf = zzerVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zza = zzaqbVar.zzc();
        this.zzb = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        zzaqf zzaqfVar = this.zzd;
        if (zzaqfVar != null) {
            zzaqfVar.zza(zzaexVar, zzaqbVar);
        }
    }
}
