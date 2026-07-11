package androidx.core.view.inputmethod;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class EditorInfoCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f36872n = new String[0];

    private static boolean t(int i2) {
        int i3 = i2 & 4095;
        return i3 == 129 || i3 == 225 || i3 == 18;
    }

    private static void xMQ(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        int i5 = i3 - i2;
        int i7 = i5 > 1024 ? 0 : i5;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i3, i8 - Math.min(i2, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i2, i8 - iMin);
        int i9 = i2 - iMin2;
        if (rl(charSequence, i9, 0)) {
            i9++;
            iMin2--;
        }
        if (rl(charSequence, (i3 + iMin) - 1, 1)) {
            iMin--;
        }
        KN(editorInfo, i7 != i5 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i3, iMin + i3)) : charSequence.subSequence(i9, iMin2 + i7 + iMin + i9), iMin2, i7 + iMin2);
    }

    @RequiresApi
    private static class Api30Impl {
        static void n(EditorInfo editorInfo, CharSequence charSequence, int i2) {
            editorInfo.setInitialSurroundingSubText(charSequence, i2);
        }
    }

    @RequiresApi
    private static class Api35Impl {
        static void n(EditorInfo editorInfo, boolean z2) {
            editorInfo.setStylusHandwritingEnabled(z2);
        }
    }

    public static void J2(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.n(editorInfo, charSequence, 0);
        } else {
            O(editorInfo, charSequence, 0);
        }
    }

    private static void KN(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static void Uo(EditorInfo editorInfo, boolean z2) {
        if (Build.VERSION.SDK_INT >= 35) {
            Api35Impl.n(editorInfo, z2);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z2);
    }

    public static String[] n(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f36872n;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f36872n;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f36872n;
    }

    public static void nr(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    private static boolean rl(CharSequence charSequence, int i2, int i3) {
        if (i3 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i2));
        }
        if (i3 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i2));
    }

    public static void O(EditorInfo editorInfo, CharSequence charSequence, int i2) {
        int i3;
        int i5;
        Preconditions.Uo(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.n(editorInfo, charSequence, i2);
            return;
        }
        int i7 = editorInfo.initialSelStart;
        int i8 = editorInfo.initialSelEnd;
        if (i7 > i8) {
            i3 = i8 - i2;
        } else {
            i3 = i7 - i2;
        }
        if (i7 > i8) {
            i5 = i7 - i2;
        } else {
            i5 = i8 - i2;
        }
        int length = charSequence.length();
        if (i2 >= 0 && i3 >= 0 && i5 <= length) {
            if (t(editorInfo.inputType)) {
                KN(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                KN(editorInfo, charSequence, i3, i5);
                return;
            } else {
                xMQ(editorInfo, charSequence, i3, i5);
                return;
            }
        }
        KN(editorInfo, null, 0, 0);
    }
}
