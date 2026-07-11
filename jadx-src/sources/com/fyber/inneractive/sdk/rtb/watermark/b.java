package com.fyber.inneractive.sdk.rtb.watermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f56910a;

    public b(Context context, String str) {
        ImageView imageView = null;
        try {
            ImageView imageView2 = new ImageView(context);
            byte[] bArrDecode = Base64.decode(str, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (bitmapDecodeByteArray == null) {
                IAlog.a("Failed to decode watermark: Invalid image data", new Object[0]);
            } else {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapDecodeByteArray);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                bitmapDrawable.setTileModeXY(tileMode, tileMode);
                bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
                imageView2.setBackground(bitmapDrawable);
                imageView2.setId(R.id.ia_ext_watermark);
                imageView = imageView2;
            }
        } catch (Throwable th) {
            IAlog.a("%s Error occurred when trying to create external watermark", th, "InneractiveWatermark");
        }
        this.f56910a = imageView;
    }
}
