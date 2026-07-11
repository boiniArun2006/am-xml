package androidx.privacysandbox.ads.adservices.internal;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo;", "", "<init>", "()V", "", c.f62177j, "()I", "rl", "Extensions30ExtImpl", "Extensions30Impl", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdServicesInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AdServicesInfo f40807n = new AdServicesInfo();

    @RequiresApi
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo$Extensions30ExtImpl;", "", "<init>", "()V", "", c.f62177j, "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Extensions30ExtImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Extensions30ExtImpl f40808n = new Extensions30ExtImpl();

        @DoNotInline
        public final int n() {
            return SdkExtensions.getExtensionVersion(31);
        }

        private Extensions30ExtImpl() {
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo$Extensions30Impl;", "", "<init>", "()V", "", c.f62177j, "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Extensions30Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Extensions30Impl f40809n = new Extensions30Impl();

        private Extensions30Impl() {
        }

        @DoNotInline
        public final int n() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public final int n() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Extensions30Impl.f40809n.n();
        }
        return 0;
    }

    public final int rl() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 31 || i2 == 32) {
            return Extensions30ExtImpl.f40808n.n();
        }
        return 0;
    }

    private AdServicesInfo() {
    }
}
