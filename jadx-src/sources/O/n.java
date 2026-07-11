package O;

import FQq.UGc;
import FQq.w6;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;
import x0.CN3;
import x0.eO;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class n {
    private static final Object nr = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f7233n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f7234t;

    public void nr(w6 w6Var) {
    }

    public boolean rl(Context context) {
        if (context == null) {
            return this.f7233n == null;
        }
        if (this.f7233n instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f7233n;
    }

    private Bitmap t(String str, Bitmap bitmap) {
        synchronized (nr) {
            ((UGc) this.f7234t.get(str)).Uo(bitmap);
        }
        return bitmap;
    }

    public Bitmap n(String str) {
        UGc uGc = (UGc) this.f7234t.get(str);
        if (uGc == null) {
            return null;
        }
        Bitmap bitmapRl = uGc.rl();
        if (bitmapRl != null) {
            return bitmapRl;
        }
        Context context = this.f7233n;
        if (context == null) {
            return null;
        }
        String strT = uGc.t();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strT.startsWith("data:") && strT.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strT.substring(strT.indexOf(44) + 1), 0);
                return t(str, eO.az(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), uGc.J2(), uGc.nr()));
            } catch (IllegalArgumentException e2) {
                CN3.nr("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.rl)) {
                throw new IllegalStateException(dpcnwfoVOnrtRA.cWWw);
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.rl + strT), null, options);
                if (bitmapDecodeStream != null) {
                    return t(str, eO.az(bitmapDecodeStream, uGc.J2(), uGc.nr()));
                }
                CN3.t("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e3) {
                CN3.nr("Unable to decode image `" + str + "`.", e3);
                return null;
            }
        } catch (IOException e4) {
            CN3.nr("Unable to open asset.", e4);
            return null;
        }
    }

    public n(Drawable.Callback callback, String str, w6 w6Var, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.rl = str + '/';
        } else {
            this.rl = str;
        }
        this.f7234t = map;
        nr(w6Var);
        if (!(callback instanceof View)) {
            this.f7233n = null;
        } else {
            this.f7233n = ((View) callback).getContext().getApplicationContext();
        }
    }
}
