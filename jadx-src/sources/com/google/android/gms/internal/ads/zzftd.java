package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzftd extends ContentObserver {
    private final Handler zza;
    private final Context zzb;
    private final AudioManager zzc;
    private final AtomicReference zzd;
    private final AtomicBoolean zze;
    private final ExecutorService zzf;
    private final zzftp zzg;

    final /* synthetic */ Handler zzd() {
        return this.zza;
    }

    final /* synthetic */ AtomicReference zze() {
        return this.zzd;
    }

    final /* synthetic */ AtomicBoolean zzf() {
        return this.zze;
    }

    final /* synthetic */ zzftp zzg() {
        return this.zzg;
    }

    private final void zzh() {
        this.zzf.submit(new zzftc(this));
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        if (this.zze.getAndSet(true)) {
            return;
        }
        zzh();
    }

    public final void zzb() {
        this.zzb.getContentResolver().unregisterContentObserver(this);
    }

    final /* synthetic */ float zzc() {
        AudioManager audioManager = this.zzc;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f3 = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f3 = streamVolume / streamMaxVolume;
            if (f3 > 1.0f) {
                return 1.0f;
            }
        }
        return f3;
    }

    public zzftd(Handler handler, Context context, zzfsz zzfszVar, zzftp zzftpVar) {
        super(handler);
        this.zzd = new AtomicReference(Float.valueOf(-1.0f));
        this.zze = new AtomicBoolean(false);
        this.zzf = Executors.newSingleThreadExecutor();
        this.zza = handler;
        this.zzb = context;
        this.zzc = (AudioManager) context.getSystemService("audio");
        this.zzg = zzftpVar;
    }

    public final void zza() {
        zzh();
        this.zzb.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }
}
