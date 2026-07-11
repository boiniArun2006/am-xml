package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class InputContentInfoCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InputContentInfoCompatImpl f36875n;

    @RequiresApi
    private static final class InputContentInfoCompatApi25Impl implements InputContentInfoCompatImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final InputContentInfo f36876n;

        InputContentInfoCompatApi25Impl(Object obj) {
            this.f36876n = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public ClipDescription getDescription() {
            return this.f36876n.getDescription();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public Object n() {
            return this.f36876n;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public Uri nr() {
            return this.f36876n.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public Uri rl() {
            return this.f36876n.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void t() {
            this.f36876n.requestPermission();
        }

        InputContentInfoCompatApi25Impl(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f36876n = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private static final class InputContentInfoCompatBaseImpl implements InputContentInfoCompatImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f36877n;
        private final ClipDescription rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Uri f36878t;

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public Object n() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public void t() {
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public ClipDescription getDescription() {
            return this.rl;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public Uri nr() {
            return this.f36878t;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public Uri rl() {
            return this.f36877n;
        }

        InputContentInfoCompatBaseImpl(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f36877n = uri;
            this.rl = clipDescription;
            this.f36878t = uri2;
        }
    }

    private interface InputContentInfoCompatImpl {
        ClipDescription getDescription();

        Object n();

        Uri nr();

        Uri rl();

        void t();
    }

    public InputContentInfoCompat(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f36875n = new InputContentInfoCompatApi25Impl(uri, clipDescription, uri2);
        } else {
            this.f36875n = new InputContentInfoCompatBaseImpl(uri, clipDescription, uri2);
        }
    }

    public static InputContentInfoCompat J2(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new InputContentInfoCompat(new InputContentInfoCompatApi25Impl(obj));
        }
        return null;
    }

    public Object O() {
        return this.f36875n.n();
    }

    public Uri n() {
        return this.f36875n.rl();
    }

    public void nr() {
        this.f36875n.t();
    }

    public ClipDescription rl() {
        return this.f36875n.getDescription();
    }

    public Uri t() {
        return this.f36875n.nr();
    }

    private InputContentInfoCompat(InputContentInfoCompatImpl inputContentInfoCompatImpl) {
        this.f36875n = inputContentInfoCompatImpl;
    }
}
