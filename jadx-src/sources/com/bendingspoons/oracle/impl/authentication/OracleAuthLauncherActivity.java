package com.bendingspoons.oracle.impl.authentication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/bendingspoons/oracle/impl/authentication/OracleAuthLauncherActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStop", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", c.f62177j, "Z", "isAuthCompleted", "t", "hasBeenStopped", "O", "j", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOracleAuthLauncherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OracleAuthLauncherActivity.kt\ncom/bendingspoons/oracle/impl/authentication/OracleAuthLauncherActivity\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,85:1\n29#2:86\n*S KotlinDebug\n*F\n+ 1 OracleAuthLauncherActivity.kt\ncom/bendingspoons/oracle/impl/authentication/OracleAuthLauncherActivity\n*L\n33#1:86\n*E\n"})
public final class OracleAuthLauncherActivity extends Activity {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Function0 f51417r;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean isAuthCompleted;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean hasBeenStopped;
    public static final int J2 = 8;

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        p0.launchUrl(p1, p2);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            String stringExtra = getIntent().getStringExtra("auth_url");
            if (stringExtra != null) {
                CustomTabsIntent customTabsIntentN = new CustomTabsIntent.Builder().ty(true).ck(true).n();
                Intrinsics.checkNotNullExpressionValue(customTabsIntentN, "build(...)");
                safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(customTabsIntentN, this, Uri.parse(stringExtra));
            } else {
                Function0 function0 = f51417r;
                if (function0 != null) {
                    function0.invoke();
                }
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Uri data;
        super.onNewIntent(intent);
        if (intent != null) {
            data = intent.getData();
        } else {
            data = null;
        }
        if (data != null) {
            this.isAuthCompleted = true;
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.hasBeenStopped && !this.isAuthCompleted && !isFinishing()) {
            Function0 function0 = f51417r;
            if (function0 != null) {
                function0.invoke();
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.hasBeenStopped = true;
    }
}
