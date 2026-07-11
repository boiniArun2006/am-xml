package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class zzor extends zzok {
    private boolean zza;

    final boolean zzax() {
        return this.zza;
    }

    protected abstract boolean zzbb();

    public final void zzaz() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzbb();
        this.zzg.zzae();
        this.zza = true;
    }

    zzor(zzpf zzpfVar) {
        super(zzpfVar);
        this.zzg.zzad();
    }

    protected final void zzay() {
        if (zzax()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }
}
