package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzzk extends zzbk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzzk() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    public final zzzk zzy(int i2, boolean z2) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i2) == z2) {
            return this;
        }
        if (z2) {
            sparseBooleanArray.put(i2, true);
            return this;
        }
        sparseBooleanArray.delete(i2);
        return this;
    }

    protected final zzzk zzx(zzbl zzblVar) {
        super.zza(zzblVar);
        return this;
    }

    /* synthetic */ zzzk(zzzl zzzlVar, byte[] bArr) {
        super(zzzlVar);
        this.zza = zzzlVar.zzK;
        this.zzb = zzzlVar.zzM;
        this.zzc = zzzlVar.zzO;
        this.zzd = zzzlVar.zzT;
        this.zze = zzzlVar.zzU;
        this.zzf = zzzlVar.zzV;
        this.zzg = zzzlVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        while (true) {
            SparseArray sparseArrayZze = zzzlVar.zze();
            if (i2 < sparseArrayZze.size()) {
                sparseArray.put(sparseArrayZze.keyAt(i2), new HashMap((Map) sparseArrayZze.valueAt(i2)));
                i2++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzzlVar.zzf().clone();
                return;
            }
        }
    }
}
