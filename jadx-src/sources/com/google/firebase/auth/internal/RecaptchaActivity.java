package com.google.firebase.auth.internal;

import P0j.rYHL.xkISd;
import P1.GLd.KDyatQ;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaej;
import com.google.android.gms.internal.p002firebaseauthapi.zzaem;
import com.google.android.gms.internal.p002firebaseauthapi.zzaev;
import com.google.android.gms.internal.p002firebaseauthapi.zzaga;
import com.google.android.gms.internal.p002firebaseauthapi.zzagd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.UUID;
import oW.KH;
import oW.Md;
import oW.P;
import oW.aC;
import oW.gnv;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class RecaptchaActivity extends FragmentActivity implements zzaej {
    public static final P J2 = P.J2();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static long f60168O = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f60169t = "RecaptchaActivity";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f60170n = false;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, ModuleDescriptor.MODULE_ID);
        p0.startActivity(p1);
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, ModuleDescriptor.MODULE_ID);
        p0.launchUrl(p1, p2);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(ModuleDescriptor.MODULE_ID, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, InvocationTargetException {
        KDyatQ.MKy.invoke(null, this, bundle);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, InvocationTargetException {
        xkISd.tuelIyfWZrk.invoke(null, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final Context zza() {
        return getApplicationContext();
    }

    public static /* synthetic */ void eTf(RecaptchaActivity recaptchaActivity, String str, Task task) {
        if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e(f60169t, "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaem.zzb(recaptchaActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            CustomTabsIntent customTabsIntentN = new CustomTabsIntent.Builder().n();
            customTabsIntentN.intent.addFlags(1073741824);
            customTabsIntentN.intent.addFlags(268435456);
            safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(customTabsIntentN, recaptchaActivity, (Uri) task.getResult());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
        intent.putExtra("com.android.browser.application_id", str);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(recaptchaActivity, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Status status) {
        f60168O = 0L;
        this.f60170n = false;
        Intent intent = new Intent();
        Md.t(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        xg(intent);
        J2.n(this);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pJg() {
        f60168O = 0L;
        this.f60170n = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        xg(intent);
        J2.n(this);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Uri.Builder piY(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        com.google.firebase.Wre wreTy = com.google.firebase.Wre.ty(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(wreTy);
        gnv.rl().nr(getApplicationContext(), str, string, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String strN = KH.t(getApplicationContext(), wreTy.Ik()).n();
        if (TextUtils.isEmpty(strN)) {
            Log.e(f60169t, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            m(aC.n("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.qie()) ? firebaseAuth.qie() : zzaev.zza()).appendQueryParameter("eventId", string).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", TtmlNode.TAG_P).appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strN);
        return builder;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return piY(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    public static /* synthetic */ Uri ijL(Uri uri, Task task) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            Dh.Ml ml = (Dh.Ml) task.getResult();
            if (ml.n() != null) {
                Log.w(f60169t, "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(ml.n()));
            }
            builderBuildUpon.fragment("fac=" + ml.rl());
        } else {
            Log.e(f60169t, "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return builderBuildUpon.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean xg(Intent intent) {
        return LocalBroadcastManager.rl(this).nr(intent);
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f60170n);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final String zza(String str) {
        String strZza = zzaga.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza)) {
            return zzagd.zzb(str);
        }
        Log.e(f60169t, "Found hermetic configuration for identityToolkit URL: " + strZza);
        return strZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzaej.zza.e("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(String str, Status status) {
        if (status == null) {
            pJg();
        } else {
            m(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(final Uri uri, final String str, oSp.n nVar) {
        Task taskForResult;
        InterfaceC2436n interfaceC2436n = (InterfaceC2436n) nVar.get();
        if (interfaceC2436n != null) {
            taskForResult = interfaceC2436n.n(false).continueWith(new Continuation() { // from class: com.google.firebase.auth.internal.CN3
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return RecaptchaActivity.ijL(uri, task);
                }
            });
        } else {
            taskForResult = Tasks.forResult(uri);
        }
        taskForResult.addOnCompleteListener(new OnCompleteListener() { // from class: oW.Ew
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                RecaptchaActivity.eTf(this.f71454n, str, task);
            }
        });
    }
}
