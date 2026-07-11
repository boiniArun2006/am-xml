package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbhe;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzah zzb;

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

    final /* synthetic */ ImageButton zzb() {
        return this.zza;
    }

    private final void zzc() {
        String str = (String) zzbd.zzc().zzd(zzbhe.zzbI);
        if (TextUtils.isEmpty(str) || "default".equals(str)) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (resourcesZzf == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesZzf.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = resourcesZzf.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross);
            }
        } catch (Resources.NotFoundException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        ImageButton imageButton = this.zza;
        imageButton.setImageDrawable(drawable);
        imageButton.setScaleType(ImageView.ScaleType.CENTER);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzah zzahVar = this.zzb;
        if (zzahVar != null) {
            zzahVar.zzd();
        }
    }

    public final void zza(boolean z2) {
        if (!z2) {
            this.zza.setVisibility(0);
            return;
        }
        ImageButton imageButton = this.zza;
        imageButton.setVisibility(8);
        if (((Long) zzbd.zzc().zzd(zzbhe.zzbJ)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }

    public zzu(Context context, zzt zztVar, @Nullable zzah zzahVar) {
        zzs zzsVar;
        super(context);
        this.zzb = zzahVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzbb.zza();
        int iZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zza);
        zzbb.zza();
        int iZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, 0);
        zzbb.zza();
        int iZzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zzb);
        zzbb.zza();
        imageButton.setPadding(iZzC, iZzC2, iZzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzbb.zza();
        int iZzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zzd + zztVar.zza + zztVar.zzb);
        zzbb.zza();
        addView(imageButton, new FrameLayout.LayoutParams(iZzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(context, zztVar.zzd + zztVar.zzc), 17));
        long jLongValue = ((Long) zzbd.zzc().zzd(zzbhe.zzbJ)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbK)).booleanValue()) {
            zzsVar = new zzs(this);
        } else {
            zzsVar = null;
        }
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(zzsVar);
    }
}
