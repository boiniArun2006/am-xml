package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.annotation.UiThread;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UiThread
public final class zzbv extends WebView {
    private final Handler zza;
    private final zzcb zzb;
    private boolean zzc;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.f63168h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    static /* bridge */ /* synthetic */ boolean zzf(zzbv zzbvVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzc() {
        final zzcb zzcbVar = this.zzb;
        Objects.requireNonNull(zzcbVar);
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbs
            @Override // java.lang.Runnable
            public final void run() {
                zzcbVar.zzd();
            }
        });
    }

    public final void zzd(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbr
            @Override // java.lang.Runnable
            public final void run() {
                zzct.zza(this.zza, str3);
            }
        });
    }

    public zzbv(zzbx zzbxVar, Handler handler, zzcb zzcbVar) {
        super(zzbxVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzcbVar;
    }
}
