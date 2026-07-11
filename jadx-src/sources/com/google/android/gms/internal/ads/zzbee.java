package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import cS.Zv.SzFNXybiSxdx;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzbee extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbdv zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    @VisibleForTesting
    final zzbed zzc(@Nullable View view, zzbdu zzbduVar) {
        if (view == null) {
            return new zzbed(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbed(this, 0, 0);
            }
            zzbduVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbed(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcjl)) {
            WebView webView = (WebView) view;
            zzbduVar.zze();
            webView.post(new zzbec(this, zzbduVar, webView, globalVisibleRect));
            return new zzbed(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzbed(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i2 = 0;
        int i3 = 0;
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            zzbed zzbedVarZzc = zzc(viewGroup.getChildAt(i5), zzbduVar);
            i2 += zzbedVarZzc.zza;
            i3 += zzbedVarZzc.zzb;
        }
        return new zzbed(this, i2, i3);
    }

    public zzbee() {
        zzbdv zzbdvVar = new zzbdv();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbdvVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbiv.zzd.zze()).intValue();
        this.zzg = ((Long) zzbiv.zza.zze()).intValue();
        this.zzh = ((Long) zzbiv.zze.zze()).intValue();
        this.zzi = ((Long) zzbiv.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaC)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaD)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaE)).intValue();
        this.zze = ((Long) zzbiv.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaG);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaH)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaI)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaJ)).getClass();
        setName("ContentFetchTask");
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    final void zzb(View view) {
        try {
            zzbdu zzbduVar = new zzbdu(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZze = com.google.android.gms.ads.internal.zzt.zzg().zze();
            if (contextZze != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(contextZze.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaF), SzFNXybiSxdx.dLZkuzfTq, contextZze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzbed zzbedVarZzc = zzc(view, zzbduVar);
            zzbduVar.zzi();
            if (zzbedVarZzc.zza == 0 && zzbedVarZzc.zzb == 0) {
                return;
            }
            int i2 = zzbedVarZzc.zzb;
            if (i2 != 0) {
                if (i2 == 0) {
                }
                this.zzd.zzc(zzbduVar);
            } else if (zzbduVar.zzl() == 0) {
                return;
            }
            if (this.zzd.zza(zzbduVar)) {
                return;
            }
            this.zzd.zzc(zzbduVar);
        } catch (Exception e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception in fetchContentOnUIThread", e2);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "ContentFetchTask.fetchContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = ");
            sb.append(true);
            String string = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzt.zzg().zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchThread: no activity. Sleeping.");
        zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, "ContentFetchTask.extractContent");
        r2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00e8->B:73:0x00e8, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        Context contextZze;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        View viewFindViewById;
        while (true) {
            try {
                contextZze = com.google.android.gms.ads.internal.zzt.zzg().zze();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "ContentFetchTask.isInForeground");
            }
            if (contextZze != null) {
                ActivityManager activityManager = (ActivityManager) contextZze.getSystemService("activity");
                KeyguardManager keyguardManager = (KeyguardManager) contextZze.getSystemService("keyguard");
                if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (Process.myPid() == next.pid) {
                            break;
                        }
                    }
                    Thread.sleep(this.zze * 1000);
                }
                obj = this.zzc;
                synchronized (obj) {
                    while (this.zzb) {
                        try {
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchTask: waiting");
                            obj.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchTask: sleeping");
            zze();
            Thread.sleep(this.zze * 1000);
            obj = this.zzc;
            synchronized (obj) {
            }
        }
        if (viewFindViewById != null) {
            viewFindViewById.post(new zzbea(this, viewFindViewById));
        }
        Thread.sleep(this.zze * 1000);
        obj = this.zzc;
        synchronized (obj) {
        }
    }

    @VisibleForTesting
    final void zzd(zzbdu zzbduVar, WebView webView, String str, boolean z2) {
        zzbdu zzbduVar2;
        zzbduVar.zzd();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (!this.zzn && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    zzbduVar.zzf(sb.toString(), z2, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzbduVar2 = zzbduVar;
                } else {
                    zzbduVar2 = zzbduVar;
                    zzbduVar2.zzf(strOptString, z2, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            } else {
                zzbduVar2 = zzbduVar;
            }
            if (zzbduVar2.zza()) {
                this.zzd.zzb(zzbduVar2);
            }
        } catch (JSONException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Json string may be malformed.");
        } catch (Throwable th) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "ContentFetchTask.processWebViewContent");
        }
    }
}
