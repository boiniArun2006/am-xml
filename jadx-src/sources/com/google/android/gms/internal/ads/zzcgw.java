package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.utils.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcgw extends zzcfk implements TextureView.SurfaceTextureListener, zzcfu {
    private final zzcge zzc;
    private final zzcgf zzd;
    private final zzcgd zze;

    @Nullable
    private final zzdxz zzf;
    private zzcfj zzg;
    private Surface zzh;
    private zzcfv zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcgc zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    private final boolean zzT() {
        zzcfv zzcfvVar = this.zzi;
        return (zzcfvVar == null || !zzcfvVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.f63168h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzb(zzcfj zzcfjVar) {
        this.zzg = zzcfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzp() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    @Nullable
    public final Integer zzw() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzj();
        }
        return null;
    }

    private final void zzV(boolean z2, @Nullable Integer num) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null && !z2) {
            zzcfvVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z2) {
            if (!zzT()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcfvVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzchr zzchrVarZzr = this.zzc.zzr(this.zzj);
            if (zzchrVarZzr instanceof zzcia) {
                zzcfv zzcfvVarZza = ((zzcia) zzchrVarZzr).zza();
                this.zzi = zzcfvVarZza;
                zzcfvVarZza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzchrVarZzr instanceof zzchx)) {
                    String strValueOf = String.valueOf(this.zzj);
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                zzchx zzchxVar = (zzchx) zzchrVarZzr;
                String strZzF = zzF();
                ByteBuffer byteBufferZzu = zzchxVar.zzu();
                boolean zZzt = zzchxVar.zzt();
                String strZzs = zzchxVar.zzs();
                if (strZzs == null) {
                    int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache URL is null.");
                    return;
                } else {
                    zzcfv zzcfvVarZzE = zzE(num);
                    this.zzi = zzcfvVarZzE;
                    zzcfvVarZzE.zzr(new Uri[]{Uri.parse(strZzs)}, strZzF, byteBufferZzu, zZzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i8 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i8 >= strArr.length) {
                    break;
                }
                uriArr[i8] = Uri.parse(strArr[i8]);
                i8++;
            }
            this.zzi.zzq(uriArr, strZzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int iZzC = this.zzi.zzC();
            this.zzm = iZzC;
            if (iZzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            zzcfv zzcfvVar = this.zzi;
            if (zzcfvVar != null) {
                zzcfvVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(Surface surface, boolean z2) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcfvVar.zzu(surface, z2);
        } catch (IOException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e2);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i2, int i3) {
        float f3 = i3 > 0 ? i2 / i3 : 1.0f;
        if (this.zzt != f3) {
            this.zzt = f3;
            requestLayout();
        }
    }

    private final void zzac() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzM(true);
        }
    }

    private final void zzad() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzM(false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzdxz zzdxzVar;
        if (this.zzo) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoK)).booleanValue() && (zzdxzVar = this.zzf) != null) {
                zzdxy zzdxyVarZza = zzdxzVar.zza();
                zzdxyVarZza.zzc(FileUploadManager.f61572j, "svp_aepv");
                zzdxyVarZza.zzd();
            }
            zzcgc zzcgcVar = new zzcgc(getContext());
            this.zzn = zzcgcVar;
            zzcgcVar.zzb(surfaceTexture, i2, i3);
            zzcgc zzcgcVar2 = this.zzn;
            zzcgcVar2.start();
            SurfaceTexture surfaceTextureZze = zzcgcVar2.zze();
            if (surfaceTextureZze != null) {
                surfaceTexture = surfaceTextureZze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i2, i3);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i2, final int i3) {
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzc(i2, i3);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzN(i2, i3);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzA(int i2) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzy(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzB(int i2) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzz(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzC(int i2) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzA(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        });
    }

    final zzcfv zzE(@Nullable Integer num) {
        zzcgd zzcgdVar = this.zze;
        zzcge zzcgeVar = this.zzc;
        zzcit zzcitVar = new zzcit(zzcgeVar.getContext(), zzcgdVar, zzcgeVar, num);
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        return zzcitVar;
    }

    final String zzF() {
        zzcge zzcgeVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzc().zze(zzcgeVar.getContext(), zzcgeVar.zzs().afmaVersion);
    }

    final /* synthetic */ void zzG() {
        float fZzc = this.zzb.zzc();
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcfvVar.zzv(fZzc, false);
        } catch (IOException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e2);
        }
    }

    final /* synthetic */ void zzH() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzb();
        }
    }

    final /* synthetic */ void zzI() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zze();
        }
    }

    final /* synthetic */ void zzJ(String str) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzK() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzc();
        }
    }

    final /* synthetic */ void zzL() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzd();
        }
    }

    final /* synthetic */ void zzM() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zza();
        }
    }

    final /* synthetic */ void zzN(int i2, int i3) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzj(i2, i3);
        }
    }

    final /* synthetic */ void zzO() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzh();
        }
    }

    final /* synthetic */ void zzP(int i2) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.onWindowVisibilityChanged(i2);
        }
    }

    final /* synthetic */ void zzQ(boolean z2, long j2) {
        this.zzc.zzu(z2, j2);
    }

    final /* synthetic */ void zzR(String str) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzS() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzc(@Nullable String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzj(float f3, float f4) {
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzf(f3, f4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzm() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzn() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzo() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgh
    public final void zzq() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzr(final boolean z2, final long j2) {
        if (this.zzc != null) {
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzQ(z2, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzs(int i2) {
        if (this.zzm != i2) {
            this.zzm = i2;
            if (i2 == 3) {
                zzY();
                return;
            }
            if (i2 != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzt(int i2, int i3) {
        this.zzr = i2;
        this.zzs = i3;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzv(String str, Exception exc) {
        final String strZzZ = zzZ("onLoadException", exc);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strZzZ);
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR(strZzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzx(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z2 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z2 = true;
        }
        this.zzj = str;
        zzV(z2, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzy(int i2) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzF(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzz(int i2) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzG(i2);
        }
    }

    public zzcgw(Context context, zzcgf zzcgfVar, zzcge zzcgeVar, boolean z2, boolean z3, zzcgd zzcgdVar, @Nullable zzdxz zzdxzVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzcgeVar;
        this.zzd = zzcgfVar;
        this.zzo = z2;
        this.zze = zzcgdVar;
        zzcgfVar.zza(this);
        this.zzf = zzdxzVar;
    }

    private static String zzZ(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = this.zzt;
        if (f3 != 0.0f && this.zzn == null) {
            float f4 = measuredWidth;
            float f5 = f4 / measuredHeight;
            if (f3 > f5) {
                measuredHeight = (int) (f4 / f3);
            }
            if (f3 < f5) {
                measuredWidth = (int) (measuredHeight * f3);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO();
            }
        });
        return true;
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzP(i2);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzcgf zzcgfVar = this.zzd;
        zzcgfVar.zzf();
        this.zzb.zze();
        zzcgfVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zze() {
        if (zzU()) {
            if (this.zze.zza) {
                zzac();
            }
            this.zzi.zzE(true);
            this.zzd.zze();
            this.zzb.zzd();
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzK();
                }
            });
            return;
        }
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzi(int i2) {
        if (zzU()) {
            this.zzi.zzx(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzu(String str, Exception exc) {
        final String strZzZ = zzZ(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strZzZ);
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(strZzZ);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onError");
    }
}
