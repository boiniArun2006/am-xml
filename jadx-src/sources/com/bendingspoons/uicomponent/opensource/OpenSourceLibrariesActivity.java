package com.bendingspoons.uicomponent.opensource;

import a8R.j;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.bendingspoons.uicomponent.opensource.OpenSourceLibrariesActivity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.utils.Logger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0003R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/bendingspoons/uicomponent/opensource/OpenSourceLibrariesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "G7", "ofS", "Mx", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "La8R/j;", c.f62177j, "La8R/j;", "_binding", "", "t", "Lkotlin/Lazy;", "xg", "()Ljava/lang/String;", "attributionFileUrl", "pJg", "()La8R/j;", "binding", "O", "j", "open-source_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOpenSourceLibrariesActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenSourceLibrariesActivity.kt\ncom/bendingspoons/uicomponent/opensource/OpenSourceLibrariesActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,82:1\n161#2,8:83\n*S KotlinDebug\n*F\n+ 1 OpenSourceLibrariesActivity.kt\ncom/bendingspoons/uicomponent/opensource/OpenSourceLibrariesActivity\n*L\n38#1:83,8\n*E\n"})
public final class OpenSourceLibrariesActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private j _binding;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy attributionFileUrl = LazyKt.lazy(new Function0() { // from class: tl.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OpenSourceLibrariesActivity.eTf(this.f73670n);
        }
    });

    /* JADX INFO: renamed from: com.bendingspoons.uicomponent.opensource.OpenSourceLibrariesActivity$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        private Companion() {
        }

        public static /* synthetic */ void rl(Companion companion, Context context, String str, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = "file:///android_asset/licenses/licenseAttribution.html";
            }
            companion.n(context, str);
        }

        public final void n(Context context, String attributionFileUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attributionFileUrl, "attributionFileUrl");
            Intent intent = new Intent(context, (Class<?>) OpenSourceLibrariesActivity.class);
            intent.putExtra("url", attributionFileUrl);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat fcU(View v2, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(v2, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insetsJ2 = windowInsets.J2(WindowInsetsCompat.Type.xMQ());
        Intrinsics.checkNotNullExpressionValue(insetsJ2, "getInsets(...)");
        v2.setPadding(v2.getPaddingLeft(), insetsJ2.rl, v2.getPaddingRight(), v2.getPaddingBottom());
        return WindowInsetsCompat.rl;
    }

    private final j pJg() {
        j jVar = this._binding;
        Intrinsics.checkNotNull(jVar);
        return jVar;
    }

    private final String xg() {
        return (String) this.attributionFileUrl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(OpenSourceLibrariesActivity openSourceLibrariesActivity, View view) {
        openSourceLibrariesActivity.finish();
    }

    private final void G7() {
        ViewCompat.Org(pJg().getRoot(), new OnApplyWindowInsetsListener() { // from class: tl.w6
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                return OpenSourceLibrariesActivity.fcU(view, windowInsetsCompat);
            }
        });
    }

    private final void Mx() {
        WebView webView = pJg().nr;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(xg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String eTf(OpenSourceLibrariesActivity openSourceLibrariesActivity) {
        String stringExtra = openSourceLibrariesActivity.getIntent().getStringExtra("url");
        if (stringExtra == null) {
            return "file:///android_asset/licenses/licenseAttribution.html";
        }
        return stringExtra;
    }

    private final void ofS() {
        pJg().rl.setOnClickListener(new View.OnClickListener() { // from class: tl.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OpenSourceLibrariesActivity.C(this.f73669n, view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this._binding = j.t(getLayoutInflater());
        setContentView(pJg().getRoot());
        G7();
        ofS();
        Mx();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this._binding = null;
    }
}
