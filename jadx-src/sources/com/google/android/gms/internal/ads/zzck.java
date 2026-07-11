package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzck {
    private final zzguf zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z2;
        do {
            int i2 = 0;
            z2 = false;
            while (i2 <= zzj()) {
                if (!this.zzc[i2].hasRemaining()) {
                    List list = this.zzb;
                    zzco zzcoVar = (zzco) list.get(i2);
                    if (!zzcoVar.zzg()) {
                        ByteBuffer byteBuffer2 = i2 > 0 ? this.zzc[i2 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzco.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcoVar.zzd(byteBuffer2);
                        this.zzc[i2] = zzcoVar.zzf();
                        boolean z3 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i2].hasRemaining()) {
                            z3 = false;
                        }
                        z2 |= z3;
                    } else if (!this.zzc[i2].hasRemaining() && i2 < zzj()) {
                        ((zzco) list.get(i2 + 1)).zze();
                    }
                }
                i2++;
            }
        } while (z2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzguf zzgufVar = this.zza;
        int size = zzgufVar.size();
        zzguf zzgufVar2 = ((zzck) obj).zza;
        if (size != zzgufVar2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < zzgufVar.size(); i2++) {
            if (zzgufVar.get(i2) != zzgufVar2.get(i2)) {
                return false;
            }
        }
        return true;
    }

    public final void zzh() {
        int i2 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i2 >= zzgufVar.size()) {
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            } else {
                zzco zzcoVar = (zzco) zzgufVar.get(i2);
                zzcoVar.zzi(zzcm.zza);
                zzcoVar.zzj();
                i2++;
            }
        }
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) throws zzcn {
        if (zzclVar.equals(zzcl.zza)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i2 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i2 >= zzgufVar.size()) {
                return zzclVar;
            }
            zzco zzcoVar = (zzco) zzgufVar.get(i2);
            zzcl zzclVarZzb = zzcoVar.zzb(zzclVar);
            if (zzcoVar.zzc()) {
                zzgrc.zzi(!zzclVarZzb.equals(r0));
                zzclVar = zzclVarZzb;
            }
            i2++;
        }
    }

    public final void zzb(zzcm zzcmVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        long jZza = zzcmVar.zzb;
        int i2 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i2 >= zzgufVar.size()) {
                break;
            }
            zzco zzcoVar = (zzco) zzgufVar.get(i2);
            zzcoVar.zzi(new zzcm(jZza));
            if (zzcoVar.zzc()) {
                jZza = zzcoVar.zza(jZza);
                zzgrc.zzi(jZza >= 0);
                list.add(zzcoVar);
            }
            i2++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i3 = 0; i3 <= zzj(); i3++) {
            this.zzc[i3] = ((zzco) list.get(i3)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final boolean zzg() {
        return this.zzd && ((zzco) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public zzck(zzguf zzgufVar) {
        this.zza = zzgufVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (zzc() && !this.zzd) {
            zzi(byteBuffer);
        }
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzco.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzco.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (zzc() && !this.zzd) {
            this.zzd = true;
            ((zzco) this.zzb.get(0)).zze();
        }
    }
}
