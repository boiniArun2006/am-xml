package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbww extends zzbwx implements zzboh {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcjl zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbgl zzk;
    private float zzl;
    private int zzm;

    public zzbww(zzcjl zzcjlVar, Context context, zzbgl zzbglVar) {
        super(zzcjlVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcjlVar;
        this.zzi = context;
        this.zzk = zzbglVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics2, displayMetrics2.heightPixels);
        zzcjl zzcjlVar = this.zzh;
        Activity activityZzj = zzcjlVar.zzj();
        if (activityZzj == null || activityZzj.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            int[] iArrZzX = com.google.android.gms.ads.internal.util.zzs.zzX(activityZzj);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, iArrZzX[0]);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, iArrZzX[1]);
        }
        if (zzcjlVar.zzN().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzcjlVar.measure(0, 0);
        }
        zzl(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbwv zzbwvVar = new zzbwv();
        zzbgl zzbglVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbwvVar.zzb(zzbglVar.zzc(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbwvVar.zza(zzbglVar.zzc(intent2));
        zzbwvVar.zzc(zzbglVar.zzb());
        zzbwvVar.zzd(zzbglVar.zza());
        zzbwvVar.zze(true);
        boolean zZzf = zzbwvVar.zzf();
        boolean zZzg = zzbwvVar.zzg();
        boolean zZzh = zzbwvVar.zzh();
        boolean zZzi = zzbwvVar.zzi();
        try {
            jSONObjectPut = new JSONObject().put("sms", zZzf).put("tel", zZzg).put("calendar", zZzh).put("storePicture", zZzi).put("inlineVideo", zzbwvVar.zzj());
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining the MRAID capabilities.", e2);
            jSONObjectPut = null;
        }
        zzcjlVar.zzd("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        zzcjlVar.getLocationOnScreen(iArr);
        Context context = this.zzi;
        zzb(com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[0]), com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Dispatching Ready Event.");
        }
        zzh(zzcjlVar.zzs().afmaVersion);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[PHI: r4
      0x0060: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x003f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(int i2, int i3) {
        int i5;
        Context context = this.zzi;
        int i7 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzc();
            i5 = com.google.android.gms.ads.internal.util.zzs.zzY((Activity) context)[0];
        } else {
            i5 = 0;
        }
        zzcjl zzcjlVar = this.zzh;
        if (zzcjlVar.zzN() == null || !zzcjlVar.zzN().zzg()) {
            int width = zzcjlVar.getWidth();
            int height = zzcjlVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaA)).booleanValue()) {
                if (width == 0) {
                    width = zzcjlVar.zzN() != null ? zzcjlVar.zzN().zzb : 0;
                }
                if (height == 0) {
                    if (zzcjlVar.zzN() != null) {
                        i7 = zzcjlVar.zzN().zza;
                    }
                }
                this.zzf = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, width);
                this.zzg = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, i7);
            } else {
                i7 = height;
                this.zzf = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, width);
                this.zzg = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, i7);
            }
        }
        zzj(i2, i3 - i5, this.zzf, this.zzg);
        zzcjlVar.zzP().zzP(i2, i3);
    }
}
