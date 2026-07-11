package com.fyber.inneractive.sdk.util;

import android.graphics.BitmapFactory;
import android.net.Uri;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class u {
    public static Float a(Uri uri) {
        InputStream inputStreamOpenInputStream;
        int i2;
        try {
            inputStreamOpenInputStream = IAConfigManager.f53260M.f53295u.f53389a.getApplicationContext().getContentResolver().openInputStream(uri);
        } catch (Exception e2) {
            IAlog.b("%sFailed to retrieve image aspect ratio. Reason: %s", IAlog.a(u.class), e2.getMessage());
        }
        if (inputStreamOpenInputStream == null) {
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            inputStreamOpenInputStream.close();
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            int i3 = options.outHeight;
            if (i3 > 0 && (i2 = options.outWidth) > 0) {
                Float fValueOf = Float.valueOf(i2 / i3);
                inputStreamOpenInputStream.close();
                return fValueOf;
            }
            inputStreamOpenInputStream.close();
        } finally {
        }
        IAlog.b("%sFailed to retrieve image aspect ratio. Reason: %s", IAlog.a(u.class), e2.getMessage());
        return null;
    }

    public static String b(Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = IAConfigManager.f53260M.f53295u.f53389a.getApplicationContext().getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                if (inputStreamOpenInputStream == null) {
                    return null;
                }
                inputStreamOpenInputStream.close();
                return null;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                String str = options.outMimeType;
                inputStreamOpenInputStream.close();
                return str;
            } finally {
            }
        } catch (Exception e2) {
            IAlog.b("%sFailed to retrieve image mime type. Reason: %s", IAlog.a(u.class), e2.getMessage());
            return null;
        }
    }
}
