package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public final class SpannableBuilder extends SpannableStringBuilder {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f38357n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f38358t;

    private static class WatcherWrapper implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f38359n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final AtomicInteger f38360t = new AtomicInteger(0);

        private boolean rl(Object obj) {
            return obj instanceof EmojiSpan;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f38359n).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
            ((TextWatcher) this.f38359n).beforeTextChanged(charSequence, i2, i3, i5);
        }

        final void n() {
            this.f38360t.incrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f38360t.get() <= 0 || !rl(obj)) {
                ((SpanWatcher) this.f38359n).onSpanAdded(spannable, obj, i2, i3);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[PHI: r11
          0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i5, int i7) {
            int i8;
            int i9;
            if (this.f38360t.get() <= 0 || !rl(obj)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i8 = i2;
                    i9 = i5;
                } else {
                    if (i2 > i3) {
                        i2 = 0;
                    }
                    if (i5 > i7) {
                        i8 = i2;
                        i9 = 0;
                    }
                }
                ((SpanWatcher) this.f38359n).onSpanChanged(spannable, obj, i8, i3, i9, i7);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f38360t.get() <= 0 || !rl(obj)) {
                ((SpanWatcher) this.f38359n).onSpanRemoved(spannable, obj, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
            ((TextWatcher) this.f38359n).onTextChanged(charSequence, i2, i3, i5);
        }

        final void t() {
            this.f38360t.decrementAndGet();
        }

        WatcherWrapper(Object obj) {
            this.f38359n = obj;
        }
    }

    SpannableBuilder(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f38358t = new ArrayList();
        Preconditions.KN(cls, "watcherClass cannot be null");
        this.f38357n = cls;
    }

    private WatcherWrapper J2(Object obj) {
        for (int i2 = 0; i2 < this.f38358t.size(); i2++) {
            WatcherWrapper watcherWrapper = (WatcherWrapper) this.f38358t.get(i2);
            if (watcherWrapper.f38359n == obj) {
                return watcherWrapper;
            }
        }
        return null;
    }

    private void O() {
        for (int i2 = 0; i2 < this.f38358t.size(); i2++) {
            ((WatcherWrapper) this.f38358t.get(i2)).onTextChanged(this, 0, length(), length());
        }
    }

    private void rl() {
        for (int i2 = 0; i2 < this.f38358t.size(); i2++) {
            ((WatcherWrapper) this.f38358t.get(i2)).n();
        }
    }

    private void xMQ() {
        for (int i2 = 0; i2 < this.f38358t.size(); i2++) {
            ((WatcherWrapper) this.f38358t.get(i2)).t();
        }
    }

    private boolean KN(Object obj) {
        return obj != null && Uo(obj.getClass());
    }

    private boolean Uo(Class cls) {
        return this.f38357n == cls;
    }

    public static SpannableBuilder t(Class cls, CharSequence charSequence) {
        return new SpannableBuilder(cls, charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        if (cls == null || Uo(cls)) {
            cls = WatcherWrapper.class;
        }
        return super.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return new SpannableBuilder(this.f38357n, this, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        WatcherWrapper watcherWrapperJ2;
        if (KN(obj) && (watcherWrapperJ2 = J2(obj)) != null) {
            obj = watcherWrapperJ2;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        WatcherWrapper watcherWrapperJ2;
        if (KN(obj) && (watcherWrapperJ2 = J2(obj)) != null) {
            obj = watcherWrapperJ2;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        WatcherWrapper watcherWrapperJ2;
        if (KN(obj) && (watcherWrapperJ2 = J2(obj)) != null) {
            obj = watcherWrapperJ2;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i2, int i3, Class cls) {
        if (Uo(cls)) {
            WatcherWrapper[] watcherWrapperArr = (WatcherWrapper[]) super.getSpans(i2, i3, WatcherWrapper.class);
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, watcherWrapperArr.length);
            for (int i5 = 0; i5 < watcherWrapperArr.length; i5++) {
                objArr[i5] = watcherWrapperArr[i5].f38359n;
            }
            return objArr;
        }
        return super.getSpans(i2, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    public void n() {
        rl();
    }

    public void nr() {
        xMQ();
        O();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        WatcherWrapper watcherWrapperJ2;
        if (KN(obj)) {
            watcherWrapperJ2 = J2(obj);
            if (watcherWrapperJ2 != null) {
                obj = watcherWrapperJ2;
            }
        } else {
            watcherWrapperJ2 = null;
        }
        super.removeSpan(obj);
        if (watcherWrapperJ2 != null) {
            this.f38358t.remove(watcherWrapperJ2);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        rl();
        super.replace(i2, i3, charSequence);
        xMQ();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i5) {
        if (KN(obj)) {
            WatcherWrapper watcherWrapper = new WatcherWrapper(obj);
            this.f38358t.add(watcherWrapper);
            obj = watcherWrapper;
        }
        super.setSpan(obj, i2, i3, i5);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i5) {
        super.insert(i2, charSequence, i3, i5);
        return this;
    }

    SpannableBuilder(Class cls, CharSequence charSequence, int i2, int i3) {
        super(charSequence, i2, i3);
        this.f38358t = new ArrayList();
        Preconditions.KN(cls, "watcherClass cannot be null");
        this.f38357n = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i5, int i7) {
        rl();
        super.replace(i2, i3, charSequence, i5, i7);
        xMQ();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }
}
