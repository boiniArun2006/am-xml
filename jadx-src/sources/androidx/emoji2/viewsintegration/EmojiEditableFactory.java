package androidx.emoji2.viewsintegration;

import android.text.Editable;
import androidx.emoji2.text.SpannableBuilder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class EmojiEditableFactory extends Editable.Factory {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f38399n = new Object();
    private static volatile Editable.Factory rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Class f38400t;

    public static Editable.Factory getInstance() {
        if (rl == null) {
            synchronized (f38399n) {
                try {
                    if (rl == null) {
                        rl = new EmojiEditableFactory();
                    }
                } finally {
                }
            }
        }
        return rl;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f38400t;
        return cls != null ? SpannableBuilder.t(cls, charSequence) : super.newEditable(charSequence);
    }

    private EmojiEditableFactory() {
        try {
            f38400t = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, EmojiEditableFactory.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }
}
