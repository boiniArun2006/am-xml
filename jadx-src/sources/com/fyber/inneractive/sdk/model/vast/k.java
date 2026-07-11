package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum k {
    Jpeg("image/jpeg", "jpeg"),
    Jpg("image/jpg", "jpg"),
    Gif("image/gif", "gif"),
    Png(MimeTypes.IMAGE_PNG, "png");

    private static final Map<String, k> sCreativeTypeMap = new HashMap();
    public final String extension;
    public final String mimeType;

    static {
        for (k kVar : values()) {
            sCreativeTypeMap.put(kVar.mimeType, kVar);
        }
    }

    k(String str, String str2) {
        this.mimeType = str;
        this.extension = str2;
    }

    public static k a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return sCreativeTypeMap.get(str.toLowerCase(Locale.US));
        }
        return null;
    }
}
