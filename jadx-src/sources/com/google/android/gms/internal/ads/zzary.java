package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class zzary implements Comparable {
    private final zzasj zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;

    @Nullable
    @GuardedBy
    private final zzasc zzf;
    private Integer zzg;
    private zzasb zzh;

    @GuardedBy
    private boolean zzi;

    @Nullable
    private zzarh zzj;

    @GuardedBy
    private zzarx zzk;
    private final zzarm zzl;

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final zzary zzf(zzasb zzasbVar) {
        this.zzh = zzasbVar;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final zzary zzj(zzarh zzarhVar) {
        this.zzj = zzarhVar;
        return this;
    }

    @Nullable
    public final zzarh zzk() {
        return this.zzj;
    }

    public byte[] zzn() throws zzarg {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    protected abstract zzase zzr(zzaru zzaruVar);

    protected abstract void zzs(Object obj);

    final /* synthetic */ zzasj zzx() {
        return this.zza;
    }

    public final zzarm zzy() {
        return this.zzl;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzary) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb = new StringBuilder(length + 5 + strConcat.length() + 8 + length2);
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(strConcat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }

    public final void zzc(String str) {
        if (zzasj.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    final void zzd(String str) {
        zzasb zzasbVar = this.zzh;
        if (zzasbVar != null) {
            zzasbVar.zzc(this);
        }
        if (zzasj.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzarw(this, str, id));
                return;
            }
            zzasj zzasjVar = this.zza;
            zzasjVar.zza(str, id);
            zzasjVar.zzb(toString());
        }
    }

    final void zze(int i2) {
        zzasb zzasbVar = this.zzh;
        if (zzasbVar != null) {
            zzasbVar.zzd(this, i2);
        }
    }

    public final String zzi() {
        int i2 = this.zzb;
        String str = this.zzc;
        if (i2 == 0) {
            return str;
        }
        String string = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append("-");
        sb.append(str);
        return sb.toString();
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzarg {
        return Collections.EMPTY_MAP;
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z2;
        synchronized (this.zze) {
            z2 = this.zzi;
        }
        return z2;
    }

    public final void zzt(zzash zzashVar) {
        zzasc zzascVar;
        synchronized (this.zze) {
            zzascVar = this.zzf;
        }
        zzascVar.zza(zzashVar);
    }

    final void zzu(zzarx zzarxVar) {
        synchronized (this.zze) {
            this.zzk = zzarxVar;
        }
    }

    final void zzv(zzase zzaseVar) {
        zzarx zzarxVar;
        synchronized (this.zze) {
            zzarxVar = this.zzk;
        }
        if (zzarxVar != null) {
            zzarxVar.zza(this, zzaseVar);
        }
    }

    final void zzw() {
        zzarx zzarxVar;
        synchronized (this.zze) {
            zzarxVar = this.zzk;
        }
        if (zzarxVar != null) {
            zzarxVar.zzb(this);
        }
    }

    public zzary(int i2, String str, @Nullable zzasc zzascVar) {
        zzasj zzasjVar;
        Uri uri;
        String host;
        if (zzasj.zza) {
            zzasjVar = new zzasj();
        } else {
            zzasjVar = null;
        }
        this.zza = zzasjVar;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i2;
        this.zzc = str;
        this.zzf = zzascVar;
        this.zzl = new zzarm();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    public final zzary zzg(int i2) {
        this.zzg = Integer.valueOf(i2);
        return this;
    }
}
