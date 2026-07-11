package com.google.android.gms.internal.p002firebaseauthapi;

import Dh.Ml;
import Ip.Dsr;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.Wre;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaew {
    private Context zza;
    private zzafp zzb;
    private String zzc;
    private final Wre zzd;
    private boolean zze;
    private String zzf;

    public zzaew(Wre wre, String str) {
        this(wre.qie(), wre, str);
    }

    private static String zza(Wre wre) {
        InterfaceC2436n interfaceC2436n = (InterfaceC2436n) FirebaseAuth.getInstance(wre).k().get();
        if (interfaceC2436n == null) {
            return null;
        }
        try {
            Ml ml = (Ml) Tasks.await(interfaceC2436n.n(false));
            if (ml.n() != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(ml.n()));
            }
            return ml.rl();
        } catch (InterruptedException e2) {
            e = e2;
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e.getMessage());
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e.getMessage());
            return null;
        }
    }

    private static String zzb(Wre wre) {
        Dsr dsr = (Dsr) FirebaseAuth.getInstance(wre).dR0().get();
        if (dsr != null) {
            try {
                return (String) Tasks.await(dsr.n());
            } catch (InterruptedException | ExecutionException e2) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e2.getMessage());
            }
        }
        return null;
    }

    public zzaew(Context context, Wre wre, String str) {
        this.zze = false;
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzd = (Wre) Preconditions.checkNotNull(wre);
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        if (this.zze) {
            str = this.zzc + "/FirebaseUI-Android";
        } else {
            str = this.zzc + "/FirebaseCore-Android";
        }
        if (this.zzb == null) {
            this.zzb = new zzafp(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzaev.zza());
        uRLConnection.setRequestProperty("X-Client-Version", str);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.ck().t());
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String strZza = zza(this.zzd);
        if (!TextUtils.isEmpty(strZza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", strZza);
        }
        this.zzf = null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
