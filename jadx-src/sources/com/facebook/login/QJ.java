package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.facebook.login.LoginClient;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 I2\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0003J-\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0003J)\u0010*\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010\u0017J\u000f\u0010.\u001a\u00020\bH\u0014¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\bH\u0014¢\u0006\u0004\b/\u0010\u0003R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u0010<\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00188\u0006@BX\u0086.¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001aR0\u0010B\u001a\b\u0012\u0004\u0012\u00020(0=2\f\u00108\u001a\b\u0012\u0004\u0012\u00020(0=8\u0006@BX\u0086.¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020%8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/facebook/login/QJ;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResult;", "", "E2", "(Landroidx/fragment/app/FragmentActivity;)Lkotlin/jvm/functions/Function1;", "Lcom/facebook/login/LoginClient$Result;", "outcome", "nHg", "(Lcom/facebook/login/LoginClient$Result;)V", "v", "e", "Landroid/app/Activity;", "X", "(Landroid/app/Activity;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/facebook/login/LoginClient;", "g", "()Lcom/facebook/login/LoginClient;", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "outState", "onSaveInstanceState", "wTp", "s7N", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/lang/String;", "callingPackage", "Lcom/facebook/login/LoginClient$Request;", "t", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "<set-?>", "O", "Lcom/facebook/login/LoginClient;", "fD", "loginClient", "Landroidx/activity/result/ActivityResultLauncher;", "J2", "Landroidx/activity/result/ActivityResultLauncher;", "te", "()Landroidx/activity/result/ActivityResultLauncher;", "launcher", "r", "Landroid/view/View;", "progressBar", "iF", "()I", "layoutResId", "o", "j", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class QJ extends Fragment {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private ActivityResultLauncher launcher;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private LoginClient loginClient;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String callingPackage;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private View progressBar;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private LoginClient.Request request;

    static final class n extends Lambda implements Function1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f52946t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(FragmentActivity fragmentActivity) {
            super(1);
            this.f52946t = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((ActivityResult) obj);
            return Unit.INSTANCE;
        }

        public final void n(ActivityResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (result.getResultCode() == -1) {
                QJ.this.fD().XQ(LoginClient.INSTANCE.rl(), result.getResultCode(), result.getData());
            } else {
                this.f52946t.finish();
            }
        }
    }

    public static final class w6 implements LoginClient.j {
        w6() {
        }

        @Override // com.facebook.login.LoginClient.j
        public void n() {
            QJ.this.v();
        }

        @Override // com.facebook.login.LoginClient.j
        public void rl() {
            QJ.this.e();
        }
    }

    private final void nHg(LoginClient.Result outcome) {
        this.request = null;
        int i2 = outcome.code == LoginClient.Result.j.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        FragmentActivity activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i2, intent);
        activity.finish();
    }

    protected void s7N() {
    }

    protected void wTp() {
    }

    private final Function1 E2(FragmentActivity activity) {
        return new n(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(Function1 tmp0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(activityResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(QJ this$0, LoginClient.Result outcome) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        this$0.nHg(outcome);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            view = null;
        }
        view.setVisibility(8);
        s7N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            view = null;
        }
        view.setVisibility(0);
        wTp();
    }

    public final LoginClient fD() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        return null;
    }

    protected LoginClient g() {
        return new LoginClient(this);
    }

    protected int iF() {
        return com.facebook.common.w6.f52366t;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(iF(), container, false);
        View viewFindViewById = viewInflate.findViewById(com.facebook.common.n.nr);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById<View>(…in_fragment_progress_bar)");
        this.progressBar = viewFindViewById;
        fD().S(new w6());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", fD());
    }

    public final ActivityResultLauncher te() {
        ActivityResultLauncher activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            return activityResultLauncher;
        }
        Intrinsics.throwUninitializedPropertyAccessException("launcher");
        return null;
    }

    private final void X(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.callingPackage = callingActivity.getPackageName();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        fD().XQ(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        LoginClient loginClientG;
        Bundle bundleExtra;
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            loginClientG = (LoginClient) savedInstanceState.getParcelable("loginClient");
        } else {
            loginClientG = null;
        }
        if (loginClientG != null) {
            loginClientG.WPU(this);
        } else {
            loginClientG = g();
        }
        this.loginClient = loginClientG;
        fD().aYN(new LoginClient.Ml() { // from class: com.facebook.login.eO
            @Override // com.facebook.login.LoginClient.Ml
            public final void n(LoginClient.Result result) {
                QJ.T(this.f52970n, result);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        X(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.request = (LoginClient.Request) bundleExtra.getParcelable(AdActivity.REQUEST_KEY_EXTRA);
        }
        ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
        final Function1 function1E2 = E2(activity);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(startActivityForResult, new ActivityResultCallback() { // from class: com.facebook.login.z
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                QJ.N(function1E2, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…andlerCallback(activity))");
        this.launcher = activityResultLauncherRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        fD().t();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        View viewFindViewById;
        super.onPause();
        View view = getView();
        if (view != null) {
            viewFindViewById = view.findViewById(com.facebook.common.n.nr);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.callingPackage == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        fD().ViF(this.request);
    }
}
