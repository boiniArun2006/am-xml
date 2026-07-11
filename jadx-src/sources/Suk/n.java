package Suk;

import com.applovin.sdk.AppLovinEventParameters;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public enum n {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    f10080v("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA(AppLovinEventParameters.IN_APP_PURCHASE_DATA),
    URL_SCHEMES("url_schemes");


    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f10079t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f10081n;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final n n(String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            for (n nVar : n.values()) {
                if (Intrinsics.areEqual(nVar.rl(), rawValue)) {
                    return nVar;
                }
            }
            return null;
        }
    }

    public final String rl() {
        return this.f10081n;
    }

    n(String str) {
        this.f10081n = str;
    }
}
