package com.firebase.ui.auth.util.data;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class EmailLinkParser {
    private static String LINK = "link";
    private Map<String, String> mParams;

    private Map<String, String> parseUri(Uri uri) {
        HashMap map = new HashMap();
        try {
            for (String str : uri.getQueryParameterNames()) {
                if (str.equalsIgnoreCase(LINK) || str.equalsIgnoreCase("continueUrl")) {
                    Map<String, String> uri2 = parseUri(Uri.parse(uri.getQueryParameter(str)));
                    if (uri2 != null) {
                        map.putAll(uri2);
                    }
                } else {
                    String queryParameter = uri.getQueryParameter(str);
                    if (queryParameter != null) {
                        map.put(str, queryParameter);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    public String getAnonymousUserId() {
        return this.mParams.get("ui_auid");
    }

    public boolean getForceSameDeviceBit() {
        String str = this.mParams.get("ui_sd");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("1");
    }

    public String getOobCode() {
        return this.mParams.get("oobCode");
    }

    public String getProviderId() {
        return this.mParams.get("ui_pid");
    }

    public String getSessionId() {
        return this.mParams.get("ui_sid");
    }

    public EmailLinkParser(@NonNull String str) {
        Preconditions.checkNotEmpty(str);
        Map<String, String> uri = parseUri(Uri.parse(str));
        this.mParams = uri;
        if (!uri.isEmpty()) {
        } else {
            throw new IllegalArgumentException("Invalid link: no parameters found");
        }
    }
}
