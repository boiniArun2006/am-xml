package androidx.credentials.provider;

import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B#\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest;", "", "", "Landroidx/credentials/provider/BeginGetCredentialOption;", "beginGetCredentialOptions", "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "<init>", "(Ljava/util/List;Landroidx/credentials/provider/CallingAppInfo;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/util/List;", "()Ljava/util/List;", "rl", "Landroidx/credentials/provider/CallingAppInfo;", "()Landroidx/credentials/provider/CallingAppInfo;", "t", "Api34Impl", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BeginGetCredentialRequest {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List beginGetCredentialOptions;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final CallingAppInfo callingAppInfo;

    @RequiresApi
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest$Api34Impl;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/BeginGetCredentialRequest;", AdActivity.REQUEST_KEY_EXTRA, "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginGetCredentialRequest;)V", "rl", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginGetCredentialRequest;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api34Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api34Impl f37241n = new Api34Impl();

        @JvmStatic
        @DoNotInline
        public static final void n(Bundle bundle, BeginGetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(request, "request");
            bundle.putParcelable("androidx.credentials.provider.BeginGetCredentialRequest", BeginGetCredentialUtil.INSTANCE.qie(request));
        }

        @JvmStatic
        @DoNotInline
        public static final BeginGetCredentialRequest rl(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest = (android.service.credentials.BeginGetCredentialRequest) bundle.getParcelable("androidx.credentials.provider.BeginGetCredentialRequest", android.service.credentials.BeginGetCredentialRequest.class);
            if (beginGetCredentialRequest != null) {
                return BeginGetCredentialUtil.INSTANCE.ck(beginGetCredentialRequest);
            }
            return null;
        }

        private Api34Impl() {
        }
    }

    public BeginGetCredentialRequest(List beginGetCredentialOptions, CallingAppInfo callingAppInfo) {
        Intrinsics.checkNotNullParameter(beginGetCredentialOptions, "beginGetCredentialOptions");
        this.beginGetCredentialOptions = beginGetCredentialOptions;
        this.callingAppInfo = callingAppInfo;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final List getBeginGetCredentialOptions() {
        return this.beginGetCredentialOptions;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }
}
