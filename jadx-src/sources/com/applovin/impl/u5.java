package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.b0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class u5 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f50579g;

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, C1802k c1802k) {
            super(aVar, c1802k);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, String str2, int i2) {
            if (TextUtils.isEmpty(str2)) {
                if (C1804o.a()) {
                    this.f48735c.b(this.f48734b, "No developer URI found - response from the Play Store is empty");
                }
                u5.this.f50579g.a(b0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (C1804o.a()) {
                    this.f48735c.b(this.f48734b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                u5.this.f50579g.a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String strGroup = matcher.group();
            if (!URLUtil.isValidUrl(strGroup)) {
                if (C1804o.a()) {
                    this.f48735c.b(this.f48734b, "Developer URI (" + strGroup + ") is not valid");
                }
                u5.this.f50579g.a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Found developer URI: " + strGroup);
            }
            u5.this.f50579g.a(strGroup);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, String str3) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i2);
            }
            u5.this.f50579g.a(b0.b.APP_DETAILS_NOT_FOUND);
        }
    }

    public interface b {
        void a(b0.b bVar);

        void a(String str);
    }

    public u5(C1802k c1802k, b bVar) {
        super("TaskFetchDeveloperUri", c1802k);
        this.f50579g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf = String.valueOf(this.f48733a.A().G().get("package_name"));
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Looking up developer URI for package name: " + strValueOf);
        }
        this.f48733a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.f48733a).c("GET").b("https://play.google.com/store/apps/details?id=" + strValueOf).a((Object) "").a(false).a(), this.f48733a));
    }
}
