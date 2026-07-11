package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcvr extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.f63168h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    public static zzcvr zza(Context context, View view, zzfir zzfirVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcvr zzcvrVar = new zzcvr(context);
        List list = zzfirVar.zzu;
        if (!list.isEmpty() && (resources = zzcvrVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f3 = ((zzfis) list.get(0)).zza;
            float f4 = displayMetrics.density;
            zzcvrVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f3 * f4), (int) (r4.zzb * f4)));
        }
        zzcvrVar.zzb = view;
        zzcvrVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcev.zzb(zzcvrVar, zzcvrVar);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcev.zza(zzcvrVar, zzcvrVar);
        JSONObject jSONObject = zzfirVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcvrVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcvrVar.zzb(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcvrVar.zzb(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcvrVar.addView(relativeLayout);
        return zzcvrVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i2) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzc = zzc(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzc, 0, iZzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i2);
        relativeLayout.addView(textView, layoutParams);
    }

    private zzcvr(Context context) {
        super(context);
        this.zza = context;
    }

    private final int zzc(double d2) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(this.zza, (int) d2);
    }
}
