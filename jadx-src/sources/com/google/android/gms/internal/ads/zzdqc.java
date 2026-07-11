package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdqc {
    private final zzduv zza;
    private final zzdtk zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdqc(zzduv zzduvVar, zzdtk zzdtkVar) {
        this.zza = zzduvVar;
        this.zzb = zzdtkVar;
    }

    public final View zza(@NonNull final View view, @NonNull final WindowManager windowManager) throws zzcka {
        zzcjl zzcjlVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zzcjlVarZza.zzE().setVisibility(4);
        zzcjlVarZza.zzE().setContentDescription("policy_validator");
        zzcjlVarZza.zzab("/sendMessageToSdk", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdqb
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcjl) obj, map);
            }
        });
        zzcjlVarZza.zzab("/hideValidatorOverlay", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpw
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzcjl) obj, map);
            }
        });
        zzcjlVarZza.zzab("/open", new zzbou(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zzcjlVarZza);
        zzboh zzbohVar = new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpx
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzd(view, windowManager, (zzcjl) obj, map);
            }
        };
        zzdtk zzdtkVar = this.zzb;
        zzdtkVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzbohVar);
        zzdtkVar.zzh(new WeakReference(zzcjlVarZza), "/showValidatorOverlay", zzdpy.zza);
        return zzcjlVarZza.zzE();
    }

    final /* synthetic */ void zzb(zzcjl zzcjlVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcjl zzcjlVar, Map map) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hide native ad policy validator overlay.");
        zzcjlVar.zzE().setVisibility(8);
        if (zzcjlVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzcjlVar.zzE());
        }
        zzcjlVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    final /* synthetic */ void zze(Map map, boolean z2, int i2, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", map2);
    }

    private static final int zzf(Context context, String str, int i2) {
        try {
            i2 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2);
    }

    final /* synthetic */ void zzd(final View view, final WindowManager windowManager, zzcjl zzcjlVar, final Map map) {
        int i2;
        final zzcjl zzcjlVar2;
        zzcjlVar.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdqa
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z2, int i3, String str, String str2) {
                this.zza.zze(map, z2, i3, str, str2);
            }
        });
        if (map != null) {
            Context context = view.getContext();
            int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjs)).intValue());
            int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjt)).intValue());
            int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
            int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
            zzcjlVar.zzaf(zzclv.zzc(iZzf, iZzf2));
            try {
                zzcjlVar.zzD().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzju)).booleanValue());
                zzcjlVar.zzD().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjv)).booleanValue());
            } catch (NullPointerException unused) {
            }
            final WindowManager.LayoutParams layoutParamsZzk = com.google.android.gms.ads.internal.util.zzbs.zzk();
            layoutParamsZzk.x = iZzf3;
            layoutParamsZzk.y = iZzf4;
            windowManager.updateViewLayout(zzcjlVar.zzE(), layoutParamsZzk);
            final String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                zzcjlVar2 = zzcjlVar;
            } else {
                if (!"1".equals(str) && !"2".equals(str)) {
                    i2 = rect.top;
                } else {
                    i2 = rect.bottom;
                }
                final int i3 = i2 - iZzf4;
                zzcjlVar2 = zzcjlVar;
                this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdpz
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final /* synthetic */ void onScrollChanged() {
                        Rect rect2 = new Rect();
                        if (view.getGlobalVisibleRect(rect2)) {
                            zzcjl zzcjlVar3 = zzcjlVar2;
                            if (zzcjlVar3.zzE().getWindowToken() == null) {
                                return;
                            }
                            int i5 = i3;
                            WindowManager.LayoutParams layoutParams = layoutParamsZzk;
                            String str2 = str;
                            if ("1".equals(str2) || "2".equals(str2)) {
                                layoutParams.y = rect2.bottom - i5;
                            } else {
                                layoutParams.y = rect2.top - i5;
                            }
                            windowManager.updateViewLayout(zzcjlVar3.zzE(), layoutParams);
                        }
                    }
                };
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.zzc);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzcjlVar2.loadUrl(str2);
            }
        }
    }
}
