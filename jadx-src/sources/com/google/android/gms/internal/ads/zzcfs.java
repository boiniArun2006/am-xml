package com.google.android.gms.internal.ads;

import aT.dE.JLZo;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.events.a;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzcfs extends FrameLayout implements zzcfj {

    @VisibleForTesting
    final zzcgg zza;
    private final zzcge zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbht zze;
    private final long zzf;

    @Nullable
    private final zzcfk zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.f63168h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzd() {
        zzI("pause", new String[0]);
        zzL();
        this.zzh = false;
    }

    @Nullable
    public final Integer zzl() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null) {
            return zzcfkVar.zzw();
        }
        return null;
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public zzcfs(Context context, zzcge zzcgeVar, int i2, boolean z2, zzbht zzbhtVar, zzcgd zzcgdVar, @Nullable zzdxz zzdxzVar) {
        zzcfk zzcfiVar;
        zzbht zzbhtVar2;
        zzcfk zzcjaVar;
        super(context);
        this.zzb = zzcgeVar;
        this.zze = zzbhtVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcgeVar.zzk());
        zzcfl zzcflVar = zzcgeVar.zzk().zza;
        zzcgf zzcgfVar = new zzcgf(context, zzcgeVar.zzs(), zzcgeVar.zzm(), zzbhtVar, zzcgeVar.zzi());
        if (i2 == 3) {
            zzcjaVar = new zzcja(context, zzcgfVar);
            zzbhtVar2 = zzbhtVar;
        } else {
            if (i2 == 2) {
                zzcfiVar = new zzcgw(context, zzcgfVar, zzcgeVar, z2, zzcfl.zza(zzcgeVar), zzcgdVar, zzdxzVar);
                zzbhtVar2 = zzbhtVar;
            } else {
                zzbhtVar2 = zzbhtVar;
                zzcfiVar = new zzcfi(context, zzcgeVar, z2, zzcfl.zza(zzcgeVar), zzcgdVar, new zzcgf(context, zzcgeVar.zzs(), zzcgeVar.zzm(), zzbhtVar, zzcgeVar.zzi()), zzdxzVar);
            }
            zzcjaVar = zzcfiVar;
        }
        this.zzg = zzcjaVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcjaVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzap)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzam)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzar)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzao)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbhtVar2 != null) {
            zzbhtVar2.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.zza = new zzcgg(this);
        zzcjaVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put(a.f62811a, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", map);
    }

    private final void zzL() {
        zzcge zzcgeVar = this.zzb;
        if (zzcgeVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzcgeVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcfk zzcfkVar = this.zzg;
            if (zzcfkVar != null) {
                zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcfkVar.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    public final void zzA(int i2) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzB(i2);
    }

    public final void zzB(int i2) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzC(i2);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        TextView textView = new TextView(zzcfkVar.getContext());
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        textView.setText(String.valueOf(resourcesZzf == null ? "AdMob - " : resourcesZzf.getString(R.string.watermark_label_prefix)).concat(zzcfkVar.zza()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null) {
            zzcfkVar.zzd();
        }
        zzL();
    }

    final void zzF() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        long jZzh = zzcfkVar.zzh();
        if (this.zzl == jZzh || jZzh <= 0) {
            return;
        }
        float f3 = jZzh / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue()) {
            zzI("timeupdate", JLZo.RFRmORTNcbP, String.valueOf(f3), "totalBytes", String.valueOf(zzcfkVar.zzo()), "qoeCachedBytes", String.valueOf(zzcfkVar.zzn()), "qoeLoadedBytes", String.valueOf(zzcfkVar.zzm()), "droppedFrames", String.valueOf(zzcfkVar.zzp()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f3));
        }
        this.zzl = jZzh;
    }

    final /* synthetic */ void zzG(boolean z2) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z2));
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zza() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfm(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzb() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null && this.zzm == 0) {
            zzI("canplaythrough", "duration", String.valueOf(zzcfkVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzcfkVar.zzk()), "videoHeight", String.valueOf(zzcfkVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcy)).booleanValue()) {
            this.zza.zzb();
        }
        zzcge zzcgeVar = this.zzb;
        if (zzcgeVar.zzj() != null && !this.zzi) {
            boolean z2 = (zzcgeVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z2;
            if (!z2) {
                zzcgeVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcy)).booleanValue()) {
            this.zza.zza();
        }
        zzI("ended", new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzf(String str, @Nullable String str2) {
        zzI(MRAIDPresenter.ERROR, "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzg(String str, @Nullable String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfn(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null || this.zzp == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzcfkVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (jElapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbht zzbhtVar = this.zze;
            if (zzbhtVar != null) {
                zzbhtVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzj(int i2, int i3) {
        if (this.zzk) {
            zzbgv zzbgvVar = zzbhe.zzaq;
            int iMax = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue(), 1);
            int iMax2 = Math.max(i3 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzk() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
    }

    public final void zzm(int i2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzap)).booleanValue()) {
            this.zzc.setBackgroundColor(i2);
            this.zzd.setBackgroundColor(i2);
        }
    }

    public final void zzp(float f3, float f4) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null) {
            zzcfkVar.zzj(f3, f4);
        }
    }

    public final void zzq(Integer num) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzcfkVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzf();
    }

    public final void zzs() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zze();
    }

    public final void zzt(int i2) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzi(i2);
    }

    public final void zzu() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzb.zza(true);
        zzcfkVar.zzq();
    }

    public final void zzv() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzb.zza(false);
        zzcfkVar.zzq();
    }

    public final void zzw(float f3) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzb.zzb(f3);
        zzcfkVar.zzq();
    }

    public final void zzx(int i2) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzy(i2);
    }

    public final void zzy(int i2) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzz(i2);
    }

    public final void zzz(int i2) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzA(i2);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(z2);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfj
    public final void onWindowVisibilityChanged(int i2) {
        boolean z2;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            this.zza.zzb();
            z2 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z2 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfo(this, z2));
    }

    public final void zzn(int i2, int i3, int i5, int i7) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i3).length() + 3 + String.valueOf(i5).length() + 3 + String.valueOf(i7).length());
            sb.append("Set video bounds to x:");
            sb.append(i2);
            sb.append(";y:");
            sb.append(i3);
            sb.append(";w:");
            sb.append(i5);
            sb.append(";h:");
            sb.append(i7);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (i5 != 0 && i7 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i7);
            layoutParams.setMargins(i2, i3, 0, 0);
            this.zzc.setLayoutParams(layoutParams);
            requestLayout();
        }
    }
}
