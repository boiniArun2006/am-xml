package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbwr extends zzbwx {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcjl zzj;
    private final Activity zzk;
    private zzclv zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbwy zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    public final void zze(int i2, int i3) {
        this.zzc = i2;
        this.zzd = i3;
    }

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", TtmlNode.CENTER, "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbwr(zzcjl zzcjlVar, zzbwy zzbwyVar) {
        super(zzcjlVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcjlVar;
        this.zzk = zzcjlVar.zzj();
        this.zzo = zzbwyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmn)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmo)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmp)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcjl zzcjlVar = this.zzj;
                    viewGroup2.addView((View) zzcjlVar);
                    zzcjlVar.zzaf(this.zzl);
                } catch (IllegalStateException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e2);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcjl zzcjlVar2 = this.zzj;
                viewGroup3.addView((View) zzcjlVar2);
                zzcjlVar2.zzaf(this.zzl);
            }
        }
        if (z2) {
            zzk("default");
            zzbwy zzbwyVar = this.zzo;
            if (zzbwyVar != null) {
                zzbwyVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019b A[PHI: r18
      0x019b: PHI (r18v12 int) = (r18v5 int), (r18v6 int), (r18v7 int), (r18v8 int), (r18v9 int), (r18v10 int), (r18v13 int) binds: [B:85:0x0197, B:82:0x018a, B:79:0x017e, B:76:0x0172, B:73:0x0166, B:70:0x015a, B:68:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Map map) {
        int i2;
        int i3;
        byte b2;
        int i5;
        int i7;
        int i8;
        int i9;
        synchronized (this.zzi) {
            try {
                Activity activity = this.zzk;
                if (activity == null) {
                    zzg("Not an activity context. Cannot resize.");
                    return;
                }
                zzcjl zzcjlVar = this.zzj;
                if (zzcjlVar.zzN() == null) {
                    zzg("Webview is not yet available, size is not set.");
                    return;
                }
                if (zzcjlVar.zzN().zzg()) {
                    zzg("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (zzcjlVar.zzW()) {
                    zzg("Cannot resize an expanded banner.");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzh = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zze = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzf = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzg = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str)) {
                    this.zza = str;
                }
                if (this.zzh < 0 || this.zze < 0) {
                    zzg("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = activity.getWindow();
                if (window != null && window.getDecorView() != null) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    int[] iArrZzac = com.google.android.gms.ads.internal.util.zzs.zzac(activity);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    int[] iArrZzY = com.google.android.gms.ads.internal.util.zzs.zzY(activity);
                    int i10 = iArrZzac[0];
                    int i11 = iArrZzac[1];
                    int i12 = this.zzh;
                    int[] iArr = null;
                    if (i12 < 50 || i12 > i10) {
                        i2 = 50;
                        int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Width is too small or too large.");
                    } else {
                        int i14 = this.zze;
                        if (i14 < 50 || i14 > i11) {
                            i2 = 50;
                            int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Height is too small or too large.");
                        } else if (i14 == i11 && i12 == i10) {
                            int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot resize to a full-screen ad.");
                            i2 = 50;
                        } else if (this.zzb) {
                            String str2 = this.zza;
                            switch (str2.hashCode()) {
                                case -1364013995:
                                    i2 = 50;
                                    b2 = !str2.equals(TtmlNode.CENTER) ? (byte) -1 : (byte) 2;
                                    break;
                                case -1012429441:
                                    i2 = 50;
                                    if (str2.equals("top-left")) {
                                        b2 = 0;
                                        break;
                                    }
                                    break;
                                case -655373719:
                                    i2 = 50;
                                    if (str2.equals("bottom-left")) {
                                        b2 = 3;
                                        break;
                                    }
                                    break;
                                case 1163912186:
                                    i2 = 50;
                                    if (str2.equals("bottom-right")) {
                                        b2 = 5;
                                        break;
                                    }
                                    break;
                                case 1288627767:
                                    i2 = 50;
                                    if (str2.equals("bottom-center")) {
                                        b2 = 4;
                                        break;
                                    }
                                    break;
                                case 1755462605:
                                    i2 = 50;
                                    if (str2.equals("top-center")) {
                                        b2 = 1;
                                        break;
                                    }
                                    break;
                                default:
                                    i2 = 50;
                                    break;
                            }
                            if (b2 == 0) {
                                i5 = this.zzc + this.zzf;
                                i7 = this.zzd;
                            } else if (b2 != 1) {
                                if (b2 != 2) {
                                    if (b2 == 3) {
                                        i5 = this.zzc + this.zzf;
                                        i9 = this.zzd;
                                    } else if (b2 == 4) {
                                        i5 = ((this.zzc + this.zzf) + (i12 >> 1)) - 25;
                                        i9 = this.zzd;
                                    } else if (b2 != 5) {
                                        i5 = ((this.zzc + this.zzf) + i12) - 50;
                                        i7 = this.zzd;
                                    } else {
                                        i5 = ((this.zzc + this.zzf) + i12) - 50;
                                        i9 = this.zzd;
                                    }
                                    i8 = ((i9 + this.zzg) + i14) - 50;
                                } else {
                                    i5 = ((this.zzc + this.zzf) + (i12 >> 1)) - 25;
                                    i8 = ((this.zzd + this.zzg) + (i14 >> 1)) - 25;
                                }
                                if (i5 >= 0 && i5 + 50 <= i10 && i8 >= iArrZzY[0] && i8 + 50 <= iArrZzY[1]) {
                                    iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                                }
                            } else {
                                i5 = ((this.zzc + this.zzf) + (i12 >> 1)) - 25;
                                i7 = this.zzd;
                            }
                            i8 = i7 + this.zzg;
                            if (i5 >= 0) {
                                iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            }
                        } else {
                            i2 = 50;
                            com.google.android.gms.ads.internal.zzt.zzc();
                            int[] iArrZzac2 = com.google.android.gms.ads.internal.util.zzs.zzac(activity);
                            com.google.android.gms.ads.internal.zzt.zzc();
                            int[] iArrZzY2 = com.google.android.gms.ads.internal.util.zzs.zzY(activity);
                            int i17 = iArrZzac2[0];
                            int i18 = this.zzc + this.zzf;
                            int i19 = this.zzd + this.zzg;
                            if (i18 < 0) {
                                i3 = 0;
                            } else {
                                int i20 = this.zzh;
                                i3 = i18 + i20 > i17 ? i17 - i20 : i18;
                            }
                            int i21 = iArrZzY2[0];
                            if (i19 < i21) {
                                i19 = i21;
                            } else {
                                int i22 = this.zze;
                                int i23 = i19 + i22;
                                int i24 = iArrZzY2[1];
                                if (i23 > i24) {
                                    i19 = i24 - i22;
                                }
                            }
                            iArr = new int[]{i3, i19};
                        }
                    }
                    if (iArr == null) {
                        zzg("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int iZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int iZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                    ViewParent parent = ((View) zzcjlVar).getParent();
                    if (!(parent instanceof ViewGroup)) {
                        zzg("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.removeView((View) zzcjlVar);
                    PopupWindow popupWindow = this.zzp;
                    if (popupWindow == null) {
                        this.zzr = viewGroup;
                        com.google.android.gms.ads.internal.zzt.zzc();
                        ((View) zzcjlVar).setDrawingCacheEnabled(true);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) zzcjlVar).getDrawingCache());
                        ((View) zzcjlVar).setDrawingCacheEnabled(false);
                        ImageView imageView = new ImageView(activity);
                        this.zzm = imageView;
                        imageView.setImageBitmap(bitmapCreateBitmap);
                        this.zzl = zzcjlVar.zzN();
                        this.zzr.addView(this.zzm);
                    } else {
                        popupWindow.dismiss();
                    }
                    RelativeLayout relativeLayout = new RelativeLayout(activity);
                    this.zzq = relativeLayout;
                    relativeLayout.setBackgroundColor(0);
                    this.zzq.setLayoutParams(new ViewGroup.LayoutParams(iZzC, iZzC2));
                    com.google.android.gms.ads.internal.zzt.zzc();
                    PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, iZzC, iZzC2, false);
                    this.zzp = popupWindow2;
                    popupWindow2.setOutsideTouchable(false);
                    this.zzp.setTouchable(true);
                    this.zzp.setClippingEnabled(!this.zzb);
                    byte b4 = -1;
                    this.zzq.addView((View) zzcjlVar, -1, -1);
                    this.zzn = new LinearLayout(activity);
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int i25 = i2;
                    int iZzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, i25);
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iZzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, i25));
                    String str3 = this.zza;
                    switch (str3.hashCode()) {
                        case -1364013995:
                            if (str3.equals(TtmlNode.CENTER)) {
                                b4 = 2;
                            }
                            break;
                        case -1012429441:
                            if (str3.equals("top-left")) {
                                b4 = 0;
                            }
                            break;
                        case -655373719:
                            if (str3.equals("bottom-left")) {
                                b4 = 3;
                            }
                            break;
                        case 1163912186:
                            if (str3.equals("bottom-right")) {
                                b4 = 5;
                            }
                            break;
                        case 1288627767:
                            if (str3.equals("bottom-center")) {
                                b4 = 4;
                            }
                            break;
                        case 1755462605:
                            if (str3.equals("top-center")) {
                                b4 = 1;
                            }
                            break;
                    }
                    if (b4 == 0) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(9);
                    } else if (b4 == 1) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(14);
                    } else if (b4 == 2) {
                        layoutParams.addRule(13);
                    } else if (b4 == 3) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                    } else if (b4 == 4) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(14);
                    } else if (b4 != 5) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                    } else {
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                    }
                    this.zzn.setOnClickListener(new zzbwp(this));
                    this.zzn.setContentDescription("Close button");
                    this.zzq.addView(this.zzn, layoutParams);
                    try {
                        PopupWindow popupWindow3 = this.zzp;
                        View decorView = window.getDecorView();
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        int iZzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[0]);
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        popupWindow3.showAtLocation(decorView, 0, iZzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[1]));
                        int i26 = iArr[0];
                        int i27 = iArr[1];
                        zzbwy zzbwyVar = this.zzo;
                        if (zzbwyVar != null) {
                            zzbwyVar.zza(i26, i27, this.zzh, this.zze);
                        }
                        this.zzj.zzaf(zzclv.zzc(iZzC, iZzC2));
                        int i28 = iArr[0];
                        int i29 = iArr[1];
                        com.google.android.gms.ads.internal.zzt.zzc();
                        zzi(i28, i29 - com.google.android.gms.ads.internal.util.zzs.zzY(this.zzk)[0], this.zzh, this.zze);
                        zzk("resized");
                        return;
                    } catch (RuntimeException e2) {
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                        sb.append("Cannot show popup window: ");
                        sb.append(message);
                        zzg(sb.toString());
                        RelativeLayout relativeLayout2 = this.zzq;
                        zzcjl zzcjlVar2 = this.zzj;
                        relativeLayout2.removeView((View) zzcjlVar2);
                        ViewGroup viewGroup2 = this.zzr;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(this.zzm);
                            this.zzr.addView((View) zzcjlVar2);
                            zzcjlVar2.zzaf(this.zzl);
                        }
                        return;
                    }
                }
                zzg("Activity context is not ready, cannot get window or decor view.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(final boolean z2) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmm)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzf(z2);
                    } else {
                        zzcei.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwq
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzf(z2);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(int i2, int i3, boolean z2) {
        synchronized (this.zzi) {
            this.zzc = i2;
            this.zzd = i3;
        }
    }

    public final boolean zzd() {
        boolean z2;
        synchronized (this.zzi) {
            z2 = this.zzp != null;
        }
        return z2;
    }
}
