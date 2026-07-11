package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class ViewCompatShims {

    @RequiresApi
    static class Api26Impl {
        public static AutofillId n(View view) {
            return view.getAutofillId();
        }
    }

    @RequiresApi
    private static class Api29Impl {
        static ContentCaptureSession n(View view) {
            return view.getContentCaptureSession();
        }
    }

    @RequiresApi
    private static class Api30Impl {
        static void n(View view, int i2) {
            view.setImportantForContentCapture(i2);
        }
    }

    public static AutofillIdCompat n(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AutofillIdCompat.rl(Api26Impl.n(view));
        }
        return null;
    }

    public static ContentCaptureSessionCompat rl(View view) {
        ContentCaptureSession contentCaptureSessionN;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionN = Api29Impl.n(view)) == null) {
            return null;
        }
        return ContentCaptureSessionCompat.Uo(contentCaptureSessionN, view);
    }

    public static void t(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.n(view, i2);
        }
    }
}
