package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaot {
    private final zzagh zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public final void zzc() {
        this.zzh = false;
    }

    public final void zzd(long j2, int i2, long j3, boolean z2) {
        this.zze = i2;
        this.zzg = j3;
        this.zzf = j2;
        this.zzl = z2;
    }

    public final void zza(zzgl zzglVar) {
        this.zzb.append(zzglVar.zzd, zzglVar);
    }

    public final void zzb(zzgk zzgkVar) {
        this.zzc.append(zzgkVar.zza, zzgkVar);
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
    public final boolean zze(long j2, int i2, boolean z2) {
        boolean z3 = false;
        if (this.zze == 9) {
            if (z2 && this.zzh) {
                long j3 = this.zzf;
                int i3 = i2 + ((int) (j2 - j3));
                long j4 = this.zzj;
                if (j4 != -9223372036854775807L) {
                    long j5 = this.zzi;
                    if (j3 != j5) {
                        this.zza.zze(j4, this.zzk ? 1 : 0, (int) (j3 - j5), i3, null);
                    }
                }
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        boolean z4 = this.zzl;
        boolean z5 = this.zzk;
        int i5 = this.zze;
        if (i5 == 5 || (z4 && i5 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.zzk = z6;
        this.zze = 24;
        return z6;
    }

    public zzaot(zzagh zzaghVar, boolean z2, boolean z3) {
        this.zza = zzaghVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzgn(bArr, 0, 0);
        this.zzh = false;
    }
}
