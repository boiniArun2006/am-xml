package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdpg {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfjk zzc;
    private final zzdom zzd;
    private final zzdoh zze;

    @Nullable
    private final zzdpu zzf;

    @Nullable
    private final zzdqc zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbkh zzj;
    private final zzdoe zzk;

    public zzdpg(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfjk zzfjkVar, zzdom zzdomVar, zzdoh zzdohVar, @Nullable zzdpu zzdpuVar, @Nullable zzdqc zzdqcVar, Executor executor, Executor executor2, zzdoe zzdoeVar) {
        this.zzb = zzgVar;
        this.zzc = zzfjkVar;
        this.zzj = zzfjkVar.zzj;
        this.zzd = zzdomVar;
        this.zze = zzdohVar;
        this.zzf = zzdpuVar;
        this.zzg = zzdqcVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdoeVar;
    }

    public final boolean zzd(@NonNull ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(@NonNull ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzf(zzdqe zzdqeVar) {
        ViewGroup viewGroup;
        View viewZzA;
        final ViewGroup viewGroup2;
        zzbkp zzbkpVarZza;
        Drawable drawable;
        zzdom zzdomVar = this.zzd;
        if (zzdomVar.zze() || zzdomVar.zzc()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i2 = 0; i2 < 2; i2++) {
                View viewZzm = zzdqeVar.zzm(strArr[i2]);
                if (viewZzm instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewZzm;
                    break;
                }
            }
            viewGroup = null;
        } else {
            viewGroup = null;
        }
        Context context = zzdqeVar.zzdE().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdoh zzdohVar = this.zze;
        if (zzdohVar.zzA() != null) {
            viewZzA = zzdohVar.zzA();
            zzbkh zzbkhVar = this.zzj;
            if (zzbkhVar != null && viewGroup == null) {
                zzh(layoutParams, zzbkhVar.zze);
                viewZzA.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdohVar.zzz() instanceof zzbka) {
            zzbka zzbkaVar = (zzbka) zzdohVar.zzz();
            if (viewGroup == null) {
                zzh(layoutParams, zzbkaVar.zzi());
                viewGroup = null;
            }
            View zzbkbVar = new zzbkb(context, zzbkaVar, layoutParams);
            zzbkbVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeH));
            viewZzA = zzbkbVar;
        } else {
            viewZzA = null;
        }
        if (viewZzA != null) {
            if (viewZzA.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewZzA.getParent()).removeView(viewZzA);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewZzA);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdqeVar.zzdE().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(viewZzA);
                FrameLayout frameLayoutZzdA = zzdqeVar.zzdA();
                if (frameLayoutZzdA != null) {
                    frameLayoutZzdA.addView(zzaVar);
                }
            }
            zzdqeVar.zzi(zzdqeVar.zzn(), viewZzA, true);
        }
        zzguf zzgufVar = zzdpc.zza;
        int size = zzgufVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                viewGroup2 = null;
                break;
            }
            View viewZzm2 = zzdqeVar.zzm((String) zzgufVar.get(i3));
            i3++;
            if (viewZzm2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewZzm2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpe
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            if (zzdohVar.zzT() != null) {
                zzdohVar.zzT().zzaq(new zzdpd(zzdqeVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlx)).booleanValue() && zzi(viewGroup2, false)) {
            if (zzdohVar.zzU() != null) {
                zzdohVar.zzU().zzaq(new zzdpd(zzdqeVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewZzdE = zzdqeVar.zzdE();
        Context context2 = viewZzdE != null ? viewZzdE.getContext() : null;
        if (context2 == null || (zzbkpVarZza = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper iObjectWrapperZzg = zzbkpVarZza.zzg();
            if (iObjectWrapperZzg == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzg)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper iObjectWrapperZzo = zzdqeVar.zzo();
            if (iObjectWrapperZzo != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhe)).booleanValue()) {
                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzo));
                } else {
                    imageView.setScaleType(zza);
                }
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get main image drawable");
        }
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i2) {
        if (i2 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i2 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(@NonNull ViewGroup viewGroup, boolean z2) {
        View viewZzJ = z2 ? this.zze.zzJ() : this.zze.zzK();
        if (viewZzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzJ.getParent()).removeView(viewZzJ);
        }
        viewGroup.addView(viewZzJ, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeJ)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final zzdqe zzdqeVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(zzdqeVar);
            }
        });
    }

    public final void zzb(@Nullable zzdqe zzdqeVar) {
        zzdpu zzdpuVar;
        if (zzdqeVar == null || (zzdpuVar = this.zzf) == null || zzdqeVar.zzdA() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdqeVar.zzdA().addView(zzdpuVar.zza());
        } catch (zzcka e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e2);
        }
    }

    public final void zzc(@Nullable zzdqe zzdqeVar) {
        if (zzdqeVar == null) {
            return;
        }
        Context context = zzdqeVar.zzdE().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            zzdqc zzdqcVar = this.zzg;
            if (zzdqcVar == null || zzdqeVar.zzdA() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdqcVar.zza(zzdqeVar.zzdA(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (zzcka e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e2);
            }
        }
    }

    final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdoh zzdohVar = this.zze;
        if (zzdohVar.zzJ() != null) {
            boolean z2 = viewGroup != null;
            if (zzdohVar.zzx() == 2 || zzdohVar.zzx() == 1) {
                this.zzb.zzr(this.zzc.zzg, String.valueOf(zzdohVar.zzx()), z2);
            } else if (zzdohVar.zzx() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
                String str = this.zzc.zzg;
                zzgVar.zzr(str, "2", z2);
                zzgVar.zzr(str, "1", z2);
            }
        }
    }
}
