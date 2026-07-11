package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzaor {
    private final zzagh zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzaor(zzagh zzaghVar) {
        this.zza = zzaghVar;
    }

    public final void zza() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }

    public final void zzb(int i2, long j2) {
        boolean z2;
        this.zze = i2;
        this.zzd = false;
        if (i2 == 182) {
            z2 = true;
        } else if (i2 == 179) {
            i2 = 179;
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = i2 == 182;
        this.zzf = 0;
        this.zzh = j2;
    }

    public final void zzc(byte[] bArr, int i2, int i3) {
        if (this.zzc) {
            int i5 = this.zzf;
            int i7 = (i2 + 1) - i5;
            if (i7 >= i3) {
                this.zzf = i5 + (i3 - i2);
            } else {
                this.zzd = ((bArr[i7] & 192) >> 6) == 0;
                this.zzc = false;
            }
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
    public final void zzd(long j2, int i2, boolean z2) {
        zzgrc.zzi(this.zzh != -9223372036854775807L);
        if (this.zze == 182 && z2 && this.zzb) {
            this.zza.zze(this.zzh, this.zzd ? 1 : 0, (int) (j2 - this.zzg), i2, null);
        }
        if (this.zze != 179) {
            this.zzg = j2;
        }
    }
}
