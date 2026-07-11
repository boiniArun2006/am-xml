package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public class ContentCaptureSessionCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f33180n;
    private final View rl;

    @RequiresApi
    private static class Api23Impl {
    }

    @RequiresApi
    private static class Api34Impl {
    }

    @RequiresApi
    private static class Api29Impl {
        static void J2(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }

        public static void O(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static AutofillId n(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j2) {
            return contentCaptureSession.newAutofillId(autofillId, j2);
        }

        static void nr(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        static ViewStructure rl(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j2) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j2);
        }

        static void t(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }
    }

    public static ContentCaptureSessionCompat Uo(ContentCaptureSession contentCaptureSession, View view) {
        return new ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    public void J2(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.O(n.n(this.f33180n), autofillId, charSequence);
        }
    }

    public void O(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.nr(n.n(this.f33180n), autofillId);
        }
    }

    public void n() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionN = n.n(this.f33180n);
            AutofillIdCompat autofillIdCompatN = ViewCompatShims.n(this.rl);
            Objects.requireNonNull(autofillIdCompatN);
            Api29Impl.J2(contentCaptureSessionN, autofillIdCompatN.n(), new long[]{Long.MIN_VALUE});
        }
    }

    public void nr(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.t(n.n(this.f33180n), viewStructure);
        }
    }

    public AutofillId rl(long j2) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionN = n.n(this.f33180n);
        AutofillIdCompat autofillIdCompatN = ViewCompatShims.n(this.rl);
        Objects.requireNonNull(autofillIdCompatN);
        return Api29Impl.n(contentCaptureSessionN, autofillIdCompatN.n(), j2);
    }

    public ViewStructureCompat t(AutofillId autofillId, long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ViewStructureCompat.xMQ(Api29Impl.rl(n.n(this.f33180n), autofillId, j2));
        }
        return null;
    }

    private ContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        this.f33180n = contentCaptureSession;
        this.rl = view;
    }
}
