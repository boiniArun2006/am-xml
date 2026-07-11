package com.google.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeu;
import com.google.android.gms.internal.p002firebaseauthapi.zzagd;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class qz extends CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Bundle f60217n;

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final FirebaseAuth f60218n;
        private final Bundle rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Bundle f60219t;

        private j(String str, FirebaseAuth firebaseAuth) {
            Bundle bundle = new Bundle();
            this.rl = bundle;
            Bundle bundle2 = new Bundle();
            this.f60219t = bundle2;
            this.f60218n = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.KN().ck().rl());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzaeu.zza().zzb());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.az());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.KN().HI());
            bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.mUb());
        }

        public qz rl() {
            return new qz(this.rl);
        }

        public j t(List list) {
            this.rl.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
            return this;
        }

        public j n(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                this.f60219t.putString((String) entry.getKey(), (String) entry.getValue());
            }
            return this;
        }
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, ModuleDescriptor.MODULE_ID);
        p0.startActivity(p1);
    }

    private qz(Bundle bundle) {
        this.f60217n = bundle;
    }

    @Override // com.google.firebase.auth.CN3
    public final void n(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f60217n);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
    }

    @Override // com.google.firebase.auth.CN3
    public final void rl(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f60217n);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
    }

    public String t() {
        Bundle bundle = this.f60217n;
        if (bundle == null) {
            return null;
        }
        return bundle.getString("com.google.firebase.auth.KEY_PROVIDER_ID");
    }

    public static j nr(String str, FirebaseAuth firebaseAuth) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(firebaseAuth);
        if ("facebook.com".equals(str) && !zzagd.zza(firebaseAuth.KN())) {
            throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
        }
        return new j(str, firebaseAuth);
    }
}
