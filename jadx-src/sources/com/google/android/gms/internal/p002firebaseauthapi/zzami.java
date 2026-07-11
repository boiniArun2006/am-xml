package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzami<T> implements zzamv<T> {
    private final zzamc zza;
    private final zzano<?, ?> zzb;
    private final boolean zzc;
    private final zzakm<?> zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final int zza(T t3) {
        zzano<?, ?> zzanoVar = this.zzb;
        int iZzb = zzanoVar.zzb(zzanoVar.zzd(t3));
        return this.zzc ? iZzb + this.zzd.zza(t3).zza() : iZzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final int zzb(T t3) {
        int iHashCode = this.zzb.zzd(t3).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t3).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void zzd(T t3) {
        this.zzb.zzf(t3);
        this.zzd.zzc(t3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final boolean zze(T t3) {
        return this.zzd.zza(t3).zzg();
    }

    private zzami(zzano<?, ?> zzanoVar, zzakm<?> zzakmVar, zzamc zzamcVar) {
        this.zzb = zzanoVar;
        this.zzc = zzakmVar.zza(zzamcVar);
        this.zzd = zzakmVar;
        this.zza = zzamcVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final boolean zzb(T t3, T t4) {
        if (!this.zzb.zzd(t3).equals(this.zzb.zzd(t4))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t3).equals(this.zzd.zza(t4));
        }
        return true;
    }

    static <T> zzami<T> zza(zzano<?, ?> zzanoVar, zzakm<?> zzakmVar, zzamc zzamcVar) {
        return new zzami<>(zzanoVar, zzakmVar, zzamcVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final T zza() {
        zzamc zzamcVar = this.zza;
        if (zzamcVar instanceof zzaky) {
            return (T) ((zzaky) zzamcVar).zzo();
        }
        return (T) zzamcVar.zzq().zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void zza(T t3, T t4) {
        zzamx.zza(this.zzb, t3, t4);
        if (this.zzc) {
            zzamx.zza(this.zzd, t3, t4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[LOOP:0: B:47:0x000c->B:55:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t3, zzams zzamsVar, zzakk zzakkVar) throws IOException {
        boolean zZzt;
        zzano<?, ?> zzanoVar = this.zzb;
        zzakm<?> zzakmVar = this.zzd;
        Object objZzc = zzanoVar.zzc(t3);
        zzakr<T> zzakrVarZzb = zzakmVar.zzb(t3);
        while (zzamsVar.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = zzamsVar.zzd();
                int iZzj = 0;
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objZza = zzakmVar.zza(zzakkVar, this.zza, iZzd >>> 3);
                        if (objZza != null) {
                            zzakmVar.zza(zzamsVar, objZza, zzakkVar, zzakrVarZzb);
                        } else {
                            zZzt = zzanoVar.zza(objZzc, zzamsVar, 0);
                        }
                    } else {
                        zZzt = zzamsVar.zzt();
                    }
                    if (zZzt) {
                        zzanoVar.zzb(t3, objZzc);
                        return;
                    }
                } else {
                    Object objZza2 = null;
                    zzajp zzajpVarZzp = null;
                    while (zzamsVar.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = zzamsVar.zzd();
                        if (iZzd2 == 16) {
                            iZzj = zzamsVar.zzj();
                            objZza2 = zzakmVar.zza(zzakkVar, this.zza, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objZza2 != null) {
                                zzakmVar.zza(zzamsVar, objZza2, zzakkVar, zzakrVarZzb);
                            } else {
                                zzajpVarZzp = zzamsVar.zzp();
                            }
                        } else if (iZzd2 == 12 || !zzamsVar.zzt()) {
                            break;
                        }
                    }
                    if (zzamsVar.zzd() != 12) {
                        throw zzalf.zzb();
                    }
                    if (zzajpVarZzp != null) {
                        if (objZza2 != null) {
                            zzakmVar.zza(zzajpVarZzp, objZza2, zzakkVar, zzakrVarZzb);
                        } else {
                            zzanoVar.zza(objZzc, iZzj, zzajpVarZzp);
                        }
                    }
                }
                zZzt = true;
                if (zZzt) {
                }
            } catch (Throwable th) {
                zzanoVar.zzb(t3, objZzc);
                throw th;
            }
        }
        zzanoVar.zzb(t3, objZzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r12 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        r6.zza((r11 << 3) | 2, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        r12 = r13;
        r11 = r3;
        r13 = r5;
        r14 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1 A[EDGE_INSN: B:58:0x00a1->B:35:0x00a1 BREAK  A[LOOP:1: B:18:0x0059->B:63:0x0059], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t3, byte[] bArr, int i2, int i3, zzajk zzajkVar) throws IOException {
        int iZzc;
        zzaky zzakyVar = (zzaky) t3;
        zzann zzannVarZzd = zzakyVar.zzb;
        if (zzannVarZzd == zzann.zzc()) {
            zzannVarZzd = zzann.zzd();
            zzakyVar.zzb = zzannVarZzd;
        }
        zzann zzannVar = zzannVarZzd;
        ((zzaky.zzb) t3).zza();
        zzaky.zzd zzdVar = null;
        while (i2 < i3) {
            int iZzc2 = zzajl.zzc(bArr, i2, zzajkVar);
            int i5 = zzajkVar.zza;
            if (i5 == 11) {
                byte[] bArr2 = bArr;
                int i7 = i3;
                zzajk zzajkVar2 = zzajkVar;
                int i8 = 0;
                zzajp zzajpVar = null;
                while (true) {
                    if (iZzc2 >= i7) {
                        iZzc = iZzc2;
                        break;
                    }
                    iZzc = zzajl.zzc(bArr2, iZzc2, zzajkVar2);
                    int i9 = zzajkVar2.zza;
                    int i10 = i9 >>> 3;
                    int i11 = i9 & 7;
                    if (i10 != 2) {
                        if (i10 == 3) {
                            if (zzdVar != null) {
                                zzamr.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i11 == 2) {
                                iZzc2 = zzajl.zza(bArr2, iZzc, zzajkVar2);
                                zzajpVar = (zzajp) zzajkVar2.zzc;
                            }
                        }
                        if (i9 != 12) {
                            break;
                        } else {
                            iZzc2 = zzajl.zza(i9, bArr2, iZzc, i7, zzajkVar2);
                        }
                    } else if (i11 == 0) {
                        iZzc2 = zzajl.zzc(bArr2, iZzc, zzajkVar2);
                        i8 = zzajkVar2.zza;
                        zzdVar = (zzaky.zzd) this.zzd.zza(zzajkVar2.zzd, this.zza, i8);
                    } else if (i9 != 12) {
                    }
                }
            } else if ((i5 & 7) == 2) {
                zzdVar = (zzaky.zzd) this.zzd.zza(zzajkVar.zzd, this.zza, i5 >>> 3);
                if (zzdVar == null) {
                    i2 = zzajl.zza(i5, bArr, iZzc2, i3, zzannVar, zzajkVar);
                } else {
                    zzamr.zza();
                    throw new NoSuchMethodError();
                }
            } else {
                i2 = zzajl.zza(i5, bArr, iZzc2, i3, zzajkVar);
            }
        }
        if (i2 != i3) {
            throw zzalf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void zza(T t3, zzaof zzaofVar) throws IOException {
        Iterator itZzd = this.zzd.zza(t3).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzakt zzaktVar = (zzakt) entry.getKey();
            if (zzaktVar.zzc() == zzaod.MESSAGE && !zzaktVar.zze() && !zzaktVar.zzd()) {
                if (entry instanceof zzalj) {
                    zzaofVar.zza(zzaktVar.zza(), (Object) ((zzalj) entry).zza().zzb());
                } else {
                    zzaofVar.zza(zzaktVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzano<?, ?> zzanoVar = this.zzb;
        zzanoVar.zza(zzanoVar.zzd(t3), zzaofVar);
    }
}
