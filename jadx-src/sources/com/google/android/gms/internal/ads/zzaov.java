package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaov {
    private final zzagh zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzaov(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzb(long j2, int i2, int i3, long j3, boolean z2) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j3;
        this.zzd = 0;
        this.zzb = j2;
        if (i3 >= 32 && i3 != 40) {
            if (this.zzi && !this.zzj) {
                if (z2) {
                    zze(i2);
                }
                this.zzi = false;
            }
            if (i3 <= 35 || i3 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z3 = i3 >= 16 && i3 <= 21;
        this.zzc = z3;
        this.zzf = z3 || i3 <= 9;
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
    private final void zze(int i2) {
        long j2 = this.zzl;
        if (j2 != -9223372036854775807L) {
            long j3 = this.zzb;
            long j4 = this.zzk;
            if (j3 == j4) {
                return;
            }
            int i3 = (int) (j3 - j4);
            this.zza.zze(j2, this.zzm ? 1 : 0, i3, i2, null);
        }
    }

    public final void zzc(byte[] bArr, int i2, int i3) {
        if (this.zzf) {
            int i5 = this.zzd;
            int i7 = (i2 + 2) - i5;
            if (i7 >= i3) {
                this.zzd = i5 + (i3 - i2);
            } else {
                this.zzg = (bArr[i7] & ByteCompanionObject.MIN_VALUE) != 0;
                this.zzf = false;
            }
        }
    }

    public final void zzd(long j2, int i2, boolean z2) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z2 && this.zzi) {
                zze(i2 + ((int) (j2 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }
}
