package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.MotionEvent;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import androidx.view.result.contract.ActivityResultContracts;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zze;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends ComponentActivity {
    private ResultReceiver J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ResultReceiver f47564O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ActivityResultLauncher f47565n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ActivityResultLauncher f47566t;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.android.billingclient", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f47565n = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.android.billingclient.api.rv6
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                this.f47641n.GR((ActivityResult) obj);
            }
        });
        this.f47566t = registerForActivityResult(new ActivityResultContracts.StartIntentSenderForResult(), new ActivityResultCallback() { // from class: com.android.billingclient.api.vd
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                this.f47644n.Nxk((ActivityResult) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f47564O = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.J2 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        zze.zzk("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f47564O = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f47565n.n(new IntentSenderRequest.Builder(pendingIntent).n());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.J2 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f47566t.n(new IntentSenderRequest.Builder(pendingIntent2).n());
        }
    }

    final void GR(ActivityResult activityResult) {
        Bundle extras;
        Intent data = activityResult.getData();
        int iRl = zze.zzf(data, "ProxyBillingActivityV2").rl();
        ResultReceiver resultReceiver = this.f47564O;
        if (resultReceiver != null) {
            if (data == null) {
                extras = null;
            } else {
                extras = data.getExtras();
            }
            resultReceiver.send(iRl, extras);
        }
        if (activityResult.getResultCode() != -1 || iRl != 0) {
            zze.zzl("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + iRl);
        }
        finish();
    }

    final void Nxk(ActivityResult activityResult) {
        Bundle extras;
        Intent data = activityResult.getData();
        int iRl = zze.zzf(data, "ProxyBillingActivityV2").rl();
        ResultReceiver resultReceiver = this.J2;
        if (resultReceiver != null) {
            if (data == null) {
                extras = null;
            } else {
                extras = data.getExtras();
            }
            resultReceiver.send(iRl, extras);
        }
        if (activityResult.getResultCode() != -1 || iRl != 0) {
            zze.zzl("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.getResultCode()), Integer.valueOf(iRl)));
        }
        finish();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f47564O;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.J2;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
