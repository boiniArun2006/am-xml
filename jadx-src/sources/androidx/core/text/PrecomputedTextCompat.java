package androidx.core.text;

import android.os.Build;
import android.os.Trace;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class PrecomputedTextCompat implements Spannable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f36632r = new Object();
    private final PrecomputedText J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int[] f36633O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Spannable f36634n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Params f36635t;

    @RequiresApi
    static class Api28Impl {
        static Spannable n(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    public static final class Params {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final PrecomputedText.Params f36636O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final TextPaint f36637n;
        private final int nr;
        private final TextDirectionHeuristic rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f36638t;

        public static class Builder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final TextPaint f36639n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private int f36640t = 1;
            private int nr = 1;
            private TextDirectionHeuristic rl = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public Params n() {
                return new Params(this.f36639n, this.rl, this.f36640t, this.nr);
            }

            public Builder nr(TextDirectionHeuristic textDirectionHeuristic) {
                this.rl = textDirectionHeuristic;
                return this;
            }

            public Builder rl(int i2) {
                this.f36640t = i2;
                return this;
            }

            public Builder t(int i2) {
                this.nr = i2;
                return this;
            }

            public Builder(TextPaint textPaint) {
                this.f36639n = textPaint;
            }
        }

        Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f36636O = eO.n(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f36636O = null;
            }
            this.f36637n = textPaint;
            this.rl = textDirectionHeuristic;
            this.f36638t = i2;
            this.nr = i3;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return n(params) && this.rl == params.nr();
        }

        public TextPaint O() {
            return this.f36637n;
        }

        public int hashCode() {
            return ObjectsCompat.rl(Float.valueOf(this.f36637n.getTextSize()), Float.valueOf(this.f36637n.getTextScaleX()), Float.valueOf(this.f36637n.getTextSkewX()), Float.valueOf(this.f36637n.getLetterSpacing()), Integer.valueOf(this.f36637n.getFlags()), this.f36637n.getTextLocales(), this.f36637n.getTypeface(), Boolean.valueOf(this.f36637n.isElegantTextHeight()), this.rl, Integer.valueOf(this.f36638t), Integer.valueOf(this.nr));
        }

        public boolean n(Params params) {
            if (this.f36638t == params.rl() && this.nr == params.t() && this.f36637n.getTextSize() == params.O().getTextSize() && this.f36637n.getTextScaleX() == params.O().getTextScaleX() && this.f36637n.getTextSkewX() == params.O().getTextSkewX() && this.f36637n.getLetterSpacing() == params.O().getLetterSpacing() && TextUtils.equals(this.f36637n.getFontFeatureSettings(), params.O().getFontFeatureSettings()) && this.f36637n.getFlags() == params.O().getFlags() && this.f36637n.getTextLocales().equals(params.O().getTextLocales())) {
                return this.f36637n.getTypeface() == null ? params.O().getTypeface() == null : this.f36637n.getTypeface().equals(params.O().getTypeface());
            }
            return false;
        }

        public TextDirectionHeuristic nr() {
            return this.rl;
        }

        public int rl() {
            return this.f36638t;
        }

        public int t() {
            return this.nr;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f36637n.getTextSize());
            sb.append(", textScaleX=" + this.f36637n.getTextScaleX());
            sb.append(", textSkewX=" + this.f36637n.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f36637n.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f36637n.isElegantTextHeight());
            sb.append(", textLocale=" + this.f36637n.getTextLocales());
            sb.append(", typeface=" + this.f36637n.getTypeface());
            if (i2 >= 26) {
                sb.append(", variationSettings=" + this.f36637n.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.rl);
            sb.append(", breakStrategy=" + this.f36638t);
            sb.append(", hyphenationFrequency=" + this.nr);
            sb.append("}");
            return sb.toString();
        }

        public Params(PrecomputedText.Params params) {
            this.f36637n = params.getTextPaint();
            this.rl = params.getTextDirection();
            this.f36638t = params.getBreakStrategy();
            this.nr = params.getHyphenationFrequency();
            this.f36636O = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }

    private static class PrecomputedTextFutureTask extends FutureTask<PrecomputedTextCompat> {

        private static class PrecomputedTextCallback implements Callable<PrecomputedTextCompat> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private Params f36641n;
            private CharSequence rl;

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public PrecomputedTextCompat call() {
                return PrecomputedTextCompat.n(this.rl, this.f36641n);
            }
        }
    }

    private PrecomputedTextCompat(CharSequence charSequence, Params params, int[] iArr) {
        this.f36634n = new SpannableString(charSequence);
        this.f36635t = params;
        this.f36633O = iArr;
        this.J2 = null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f36634n.charAt(i2);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f36634n.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f36634n.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f36634n.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i2, int i3, Class cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.J2.getSpans(i2, i3, cls) : this.f36634n.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f36634n.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f36634n.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.J2.removeSpan(obj);
        } else {
            this.f36634n.removeSpan(obj);
        }
    }

    public Params rl() {
        return this.f36635t;
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i5) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.J2.setSpan(obj, i2, i3, i5);
        } else {
            this.f36634n.setSpan(obj, i2, i3, i5);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f36634n.subSequence(i2, i3);
    }

    public PrecomputedText t() {
        if (n.n(this.f36634n)) {
            return w6.n(this.f36634n);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f36634n.toString();
    }

    public static PrecomputedTextCompat n(CharSequence charSequence, Params params) {
        PrecomputedText.Params params2;
        Preconditions.Uo(charSequence);
        Preconditions.Uo(params);
        try {
            Trace.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params2 = params.f36636O) != null) {
                return new PrecomputedTextCompat(PrecomputedText.create(charSequence, params2), params);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i2 = 0;
            while (i2 < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', i2, length);
                if (iIndexOf < 0) {
                    i2 = length;
                } else {
                    i2 = iIndexOf + 1;
                }
                arrayList.add(Integer.valueOf(i2));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), params.O(), Integer.MAX_VALUE).setBreakStrategy(params.rl()).setHyphenationFrequency(params.t()).setTextDirection(params.nr()).build();
            return new PrecomputedTextCompat(charSequence, params, iArr);
        } finally {
            Trace.endSection();
        }
    }

    private PrecomputedTextCompat(PrecomputedText precomputedText, Params params) {
        this.f36634n = Api28Impl.n(precomputedText);
        this.f36635t = params;
        this.f36633O = null;
        this.J2 = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }
}
