package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.Wre;
import com.google.firebase.auth.FirebaseAuth;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import oW.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaeh extends AsyncTask<Void, Void, zzaek> {
    private static final Logger zza = new Logger("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzaej> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final Wre zzg;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    @Nullable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzaek doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzaej zzaejVar = this.zzd.get();
            HttpURLConnection httpURLConnectionZza = zzaejVar.zza(url);
            httpURLConnectionZza.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnectionZza.setConnectTimeout(60000);
            new zzaew(zzaejVar.zza(), this.zzg, zzaeu.zza().zzb()).zza(httpURLConnectionZza);
            int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionZza);
            if (iHttpUrlConnectionGetResponseCode != 200) {
                String strZza = zza(httpURLConnectionZza);
                zza.e(String.format("Error getting project config. Failed with %s %s", strZza, Integer.valueOf(iHttpUrlConnectionGetResponseCode)), new Object[0]);
                return zzaek.zzb(strZza);
            }
            zzahi zzahiVar = new zzahi();
            zzahiVar.zza(new String(zza(AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnectionZza), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzahiVar.zza().contains(this.zzf) ? zzaek.zzb("UNAUTHORIZED_DOMAIN") : zzaek.zza(this.zzf);
            }
            for (String str : zzahiVar.zza()) {
                if (zza(str)) {
                    return zzaek.zza(str);
                }
            }
            return null;
        } catch (zzaci e2) {
            zza.e("ConversionException encountered: " + e2.getMessage(), new Object[0]);
            return null;
        } catch (IOException e3) {
            zza.e("IOException occurred: " + e3.getMessage(), new Object[0]);
            return null;
        } catch (NullPointerException e4) {
            zza.e("Null pointer encountered: " + e4.getMessage(), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(zzaek zzaekVar) {
        onPostExecute((zzaek) null);
    }

    public zzaeh(String str, String str2, Intent intent, Wre wre, zzaej zzaejVar) {
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zzg = (Wre) Preconditions.checkNotNull(wre);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(intent);
        String strCheckNotEmpty = Preconditions.checkNotEmpty(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder builderBuildUpon = Uri.parse(zzaejVar.zza(strCheckNotEmpty)).buildUpon();
        builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter("key", strCheckNotEmpty).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) Preconditions.checkNotNull(str2));
        this.zzc = builderBuildUpon.build().toString();
        this.zzd = new WeakReference<>(zzaejVar);
        this.zze = zzaejVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    @Nullable
    private static String zza(HttpURLConnection httpURLConnection) throws zzaci {
        try {
            if (AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection) < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
            }
            return (String) zzaep.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e2) {
            zza.w("Error parsing error message from response body in getErrorMessageFromBody. " + String.valueOf(e2), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzaek zzaekVar) {
        String strZza;
        String strZzb;
        Uri.Builder builder;
        zzaej zzaejVar = this.zzd.get();
        if (zzaekVar != null) {
            strZza = zzaekVar.zza();
            strZzb = zzaekVar.zzb();
        } else {
            strZza = null;
            strZzb = null;
        }
        if (zzaejVar == null) {
            zza.e("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(strZza) && (builder = this.zze) != null) {
            builder.authority(strZza);
            zzaejVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).k());
        } else {
            zzaejVar.zza(this.zzb, aC.n(strZzb));
        }
    }

    @VisibleForTesting
    private static boolean zza(String str) {
        try {
            String host = new URI(d.f62220u + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e2) {
            zza.e("Error parsing URL for auth domain check: " + str + ". " + e2.getMessage(), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i3);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
