package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.MotionEvent;
import com.android.billingclient.api.Ml;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zze;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f47560O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ResultReceiver f47561n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f47562r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ResultReceiver f47563t;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.android.billingclient", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f47560O = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f47561n = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f47563t = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.J2 = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f47562r = bundle.getInt("activity_code", 100);
            return;
        }
        zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f47562r = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.J2 = true;
                this.f47562r = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f47561n = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f47563t = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f47562r = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f47560O = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f47562r, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e2) {
            zze.zzm("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e2);
            ResultReceiver resultReceiver = this.f47561n;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f47563t;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentRl = rl();
                    if (this.J2) {
                        intentRl.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentRl.putExtra("RESPONSE_CODE", 6);
                    intentRl.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentRl);
                }
            }
            this.f47560O = false;
            finish();
        }
    }

    private Intent n(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent rl() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onActivityResult(int i2, int i3, Intent intent) {
        ResultReceiver resultReceiver;
        Intent intentRl;
        super.onActivityResult(i2, i3, intent);
        Bundle extras = null;
        if (i2 != 100 && i2 != 110) {
            if (i2 == 101) {
                int iZza = zze.zza(intent, "ProxyBillingActivity");
                ResultReceiver resultReceiver2 = this.f47563t;
                if (resultReceiver2 != null) {
                    if (intent != null) {
                        extras = intent.getExtras();
                    }
                    resultReceiver2.send(iZza, extras);
                }
            } else {
                zze.zzl("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i2 + "; skipping...");
            }
        } else {
            int iRl = zze.zzf(intent, "ProxyBillingActivity").rl();
            if (i3 == -1) {
                if (iRl != 0) {
                    i3 = -1;
                    zze.zzl("ProxyBillingActivity", "Activity finished with resultCode " + i3 + " and billing's responseCode: " + iRl);
                    resultReceiver = this.f47561n;
                    if (resultReceiver != null) {
                    }
                } else {
                    iRl = 0;
                    resultReceiver = this.f47561n;
                    if (resultReceiver != null) {
                    }
                }
            } else {
                zze.zzl("ProxyBillingActivity", "Activity finished with resultCode " + i3 + " and billing's responseCode: " + iRl);
                resultReceiver = this.f47561n;
                if (resultReceiver != null) {
                    if (intent != null) {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(iRl, extras);
                } else {
                    if (intent != null) {
                        if (intent.getExtras() != null) {
                            String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                            if (string != null) {
                                intentRl = n(string);
                                intentRl.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            } else {
                                intentRl = rl();
                                intentRl.putExtras(intent.getExtras());
                                intentRl.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            }
                        } else {
                            intentRl = rl();
                            zze.zzl("ProxyBillingActivity", "Got null bundle!");
                            intentRl.putExtra("RESPONSE_CODE", 6);
                            intentRl.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                            Ml.j jVarT = Ml.t();
                            jVarT.t(6);
                            jVarT.rl("An internal error occurred.");
                            intentRl.putExtra("FAILURE_LOGGING_PAYLOAD", u.rl(22, 2, jVarT.n()).zzh());
                            intentRl.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        }
                    } else {
                        intentRl = rl();
                    }
                    if (i2 == 110) {
                        intentRl.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    sendBroadcast(intentRl);
                }
            }
        }
        this.f47560O = false;
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f47560O) {
            Intent intentRl = rl();
            intentRl.putExtra("RESPONSE_CODE", 1);
            intentRl.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i2 = this.f47562r;
            if (i2 == 110 || i2 == 100) {
                intentRl.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(intentRl);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f47561n;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f47563t;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f47560O);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.J2);
        bundle.putInt("activity_code", this.f47562r);
    }
}
