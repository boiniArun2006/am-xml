package androidx.credentials;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\bJ'\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00068G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010#R.\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00068G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b%\u0010\b\"\u0004\b&\u0010#¨\u0006)"}, d2 = {"Landroidx/credentials/CredentialProviderFactory;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/credentials/CredentialProvider;", "J2", "()Landroidx/credentials/CredentialProvider;", "O", "", "", "classNames", "nr", "(Ljava/util/List;Landroid/content/Context;)Landroidx/credentials/CredentialProvider;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/content/Context;)Ljava/util/List;", "", "shouldFallbackToPreU", "rl", "(Z)Landroidx/credentials/CredentialProvider;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<set-?>", "Z", "getTestMode", "()Z", "setTestMode", "(Z)V", "testMode", "t", "Landroidx/credentials/CredentialProvider;", "getTestPostUProvider", "setTestPostUProvider", "(Landroidx/credentials/CredentialProvider;)V", "testPostUProvider", "getTestPreUProvider", "setTestPreUProvider", "testPreUProvider", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialProviderFactory {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private CredentialProvider testPreUProvider;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean testMode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private CredentialProvider testPostUProvider;

    public static /* synthetic */ CredentialProvider t(CredentialProviderFactory credentialProviderFactory, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return credentialProviderFactory.rl(z2);
    }

    public CredentialProviderFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final CredentialProvider J2() throws PackageManager.NameNotFoundException {
        if (!this.testMode) {
            List listN = n(this.context);
            if (listN.isEmpty()) {
                return null;
            }
            return nr(listN, this.context);
        }
        CredentialProvider credentialProvider = this.testPreUProvider;
        if (credentialProvider == null) {
            return null;
        }
        Intrinsics.checkNotNull(credentialProvider);
        if (credentialProvider.isAvailableOnDevice()) {
            return this.testPreUProvider;
        }
        return null;
    }

    private final CredentialProvider O() {
        if (!this.testMode) {
            CredentialProviderFrameworkImpl credentialProviderFrameworkImpl = new CredentialProviderFrameworkImpl(this.context);
            if (credentialProviderFrameworkImpl.isAvailableOnDevice()) {
                return credentialProviderFrameworkImpl;
            }
            return null;
        }
        CredentialProvider credentialProvider = this.testPostUProvider;
        if (credentialProvider == null) {
            return null;
        }
        Intrinsics.checkNotNull(credentialProvider);
        if (credentialProvider.isAvailableOnDevice()) {
            return this.testPostUProvider;
        }
        return null;
    }

    public final CredentialProvider rl(boolean shouldFallbackToPreU) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            CredentialProvider credentialProviderO = O();
            return (credentialProviderO == null && shouldFallbackToPreU) ? J2() : credentialProviderO;
        }
        if (i2 <= 33) {
            return J2();
        }
        return null;
    }

    private final List n(Context context) throws PackageManager.NameNotFoundException {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            Intrinsics.checkNotNullExpressionValue(serviceInfoArr, "packageInfo.services");
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    private final CredentialProvider nr(List classNames, Context context) {
        Iterator it = classNames.iterator();
        CredentialProvider credentialProvider = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                CredentialProvider credentialProvider2 = (CredentialProvider) objNewInstance;
                if (!credentialProvider2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (credentialProvider != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    credentialProvider = credentialProvider2;
                }
            } catch (Throwable unused) {
            }
        }
        return credentialProvider;
    }
}
