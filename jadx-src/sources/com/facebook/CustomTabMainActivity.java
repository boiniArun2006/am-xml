package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.vd;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "", "resultCode", "Landroid/content/Intent;", "resultIntent", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(ILandroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "", "Z", "shouldCloseCustomTab", "Landroid/content/BroadcastReceiver;", "t", "Landroid/content/BroadcastReceiver;", "redirectReceiver", "O", "j", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCloseCustomTab = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public BroadcastReceiver redirectReceiver;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String J2 = CustomTabMainActivity.class.getSimpleName() + ".extra_action";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f52139r = CustomTabMainActivity.class.getSimpleName() + ".extra_params";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f52138o = CustomTabMainActivity.class.getSimpleName() + ".extra_chromePackage";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f52136Z = CustomTabMainActivity.class.getSimpleName() + ".extra_url";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f52135S = CustomTabMainActivity.class.getSimpleName() + ".extra_targetApp";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52137g = CustomTabMainActivity.class.getSimpleName() + ".action_refresh";
    public static final String E2 = CustomTabMainActivity.class.getSimpleName() + ".no_activity_exception";

    /* JADX INFO: renamed from: com.facebook.CustomTabMainActivity$j, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle rl(String str) {
            Uri uri = Uri.parse(str);
            Bundle bundlePJg = vd.pJg(uri.getQuery());
            bundlePJg.putAll(vd.pJg(uri.getFragment()));
            return bundlePJg;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.login.r.values().length];
            try {
                iArr[com.facebook.login.r.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class w6 extends BroadcastReceiver {
        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p1, "com.facebook");
            p0.startActivity(p1);
        }

        public w6() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intent intent2 = new Intent(CustomTabMainActivity.this, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f52137g);
            String str = CustomTabMainActivity.f52136Z;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(CustomTabMainActivity.this, intent2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch("com.facebook", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        String str = CustomTabActivity.f52130O;
        if (Intrinsics.areEqual(str, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (savedInstanceState != null || (stringExtra = getIntent().getStringExtra(J2)) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra(f52139r);
        boolean zN = (n.$EnumSwitchMapping$0[com.facebook.login.r.f52984t.n(getIntent().getStringExtra(f52135S)).ordinal()] == 1 ? new com.facebook.internal.r(stringExtra, bundleExtra) : new com.facebook.internal.I28(stringExtra, bundleExtra)).n(this, getIntent().getStringExtra(f52138o));
        this.shouldCloseCustomTab = false;
        if (!zN) {
            setResult(0, getIntent().putExtra(E2, true));
            finish();
        } else {
            w6 w6Var = new w6();
            this.redirectReceiver = w6Var;
            LocalBroadcastManager.rl(this).t(w6Var, new IntentFilter(str));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (Intrinsics.areEqual(f52137g, intent.getAction())) {
            LocalBroadcastManager.rl(this).nr(new Intent(CustomTabActivity.J2));
            n(-1, intent);
        } else if (Intrinsics.areEqual(CustomTabActivity.f52130O, intent.getAction())) {
            n(-1, intent);
        }
    }

    private final void n(int resultCode, Intent resultIntent) {
        BroadcastReceiver broadcastReceiver = this.redirectReceiver;
        if (broadcastReceiver != null) {
            LocalBroadcastManager.rl(this).O(broadcastReceiver);
        }
        if (resultIntent != null) {
            String stringExtra = resultIntent.getStringExtra(f52136Z);
            Bundle bundleRl = stringExtra != null ? INSTANCE.rl(stringExtra) : new Bundle();
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            Intent intentAz = com.facebook.internal.nKK.az(intent, bundleRl, null);
            if (intentAz != null) {
                resultIntent = intentAz;
            }
            setResult(resultCode, resultIntent);
        } else {
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            setResult(resultCode, com.facebook.internal.nKK.az(intent2, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.shouldCloseCustomTab) {
            n(0, null);
        }
        this.shouldCloseCustomTab = true;
    }
}
