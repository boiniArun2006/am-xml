package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class FontsContractCompat {

    public static final class Columns implements BaseColumns {
    }

    public static class FontFamilyResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f36574n;
        private final List rl;

        public FontFamilyResult(int i2, FontInfo[] fontInfoArr) {
            this.f36574n = i2;
            this.rl = Collections.singletonList(fontInfoArr);
        }

        static FontFamilyResult n(int i2, List list) {
            return new FontFamilyResult(i2, list);
        }

        static FontFamilyResult rl(int i2, FontInfo[] fontInfoArr) {
            return new FontFamilyResult(i2, fontInfoArr);
        }

        boolean J2() {
            return this.rl.size() > 1;
        }

        public int O() {
            return this.f36574n;
        }

        public List nr() {
            return this.rl;
        }

        public FontInfo[] t() {
            return (FontInfo[]) this.rl.get(0);
        }

        FontFamilyResult(int i2, List list) {
            this.f36574n = i2;
            this.rl = list;
        }
    }

    public static class FontInfo {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f36575O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f36576n;
        private final boolean nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f36577t;

        static FontInfo n(Uri uri, int i2, int i3, boolean z2, int i5) {
            return new FontInfo(uri, i2, i3, z2, i5);
        }

        public boolean J2() {
            return this.nr;
        }

        public int O() {
            return this.f36577t;
        }

        public Uri nr() {
            return this.f36576n;
        }

        public int rl() {
            return this.f36575O;
        }

        public int t() {
            return this.rl;
        }

        public FontInfo(Uri uri, int i2, int i3, boolean z2, int i5) {
            this.f36576n = (Uri) Preconditions.Uo(uri);
            this.rl = i2;
            this.f36577t = i3;
            this.nr = z2;
            this.f36575O = i5;
        }
    }

    public static class FontRequestCallback {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface FontRequestFailReason {
        }

        public void n(int i2) {
        }

        public void rl(Typeface typeface) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TypefaceStyle {
    }

    public static Typeface n(Context context, CancellationSignal cancellationSignal, FontInfo[] fontInfoArr) {
        return TypefaceCompat.rl(context, cancellationSignal, fontInfoArr, 0);
    }

    public static void nr(Context context, FontRequest fontRequest, FontRequestCallback fontRequestCallback, Handler handler) {
        CallbackWrapper callbackWrapper = new CallbackWrapper(fontRequestCallback);
        FontRequestWorker.nr(context.getApplicationContext(), androidx.core.graphics.w6.n(new Object[]{fontRequest}), 0, RequestExecutor.rl(handler), callbackWrapper);
    }

    public static Typeface t(Context context, List list, int i2, boolean z2, int i3, Handler handler, FontRequestCallback fontRequestCallback) {
        CallbackWrapper callbackWrapper = new CallbackWrapper(fontRequestCallback, RequestExecutor.rl(handler));
        if (!z2) {
            return FontRequestWorker.nr(context, list, i2, null, callbackWrapper);
        }
        if (list.size() <= 1) {
            return FontRequestWorker.O(context, (FontRequest) list.get(0), callbackWrapper, i2, i3);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static FontFamilyResult rl(Context context, CancellationSignal cancellationSignal, FontRequest fontRequest) {
        return FontProvider.O(context, androidx.core.graphics.w6.n(new Object[]{fontRequest}), cancellationSignal);
    }
}
