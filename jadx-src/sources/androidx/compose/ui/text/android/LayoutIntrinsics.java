package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0013R\u0014\u0010%\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010&R\u0011\u0010)\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u0011\u0010+\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010\f¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "", "charSequence", "Landroid/text/TextPaint;", "textPaint", "", "textDirectionHeuristic", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "", "t", "()F", "rl", TtmlNode.START, TtmlNode.END, "Uo", "(II)F", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/lang/CharSequence;", "Landroid/text/TextPaint;", "I", "nr", "F", "_maxIntrinsicWidth", "O", "_minIntrinsicWidth", "Landroid/text/BoringLayout$Metrics;", "J2", "Landroid/text/BoringLayout$Metrics;", "_boringMetrics", "", "Z", "boringMetricsIsInit", "KN", "_charSequenceForIntrinsicWidth", "()Ljava/lang/CharSequence;", "charSequenceForIntrinsicWidth", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics", "mUb", "minIntrinsicWidth", "xMQ", "maxIntrinsicWidth", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutIntrinsics.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.android.kt\nandroidx/compose/ui/text/android/LayoutIntrinsics\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n1#2:228\n*E\n"})
public final class LayoutIntrinsics {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private BoringLayout.Metrics _boringMetrics;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private CharSequence _charSequenceForIntrinsicWidth;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean boringMetricsIsInit;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final TextPaint textPaint;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int textDirectionHeuristic;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private float _maxIntrinsicWidth = Float.NaN;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private float _minIntrinsicWidth = Float.NaN;

    private final CharSequence J2() {
        CharSequence charSequence = this._charSequenceForIntrinsicWidth;
        if (charSequence != null) {
            Intrinsics.checkNotNull(charSequence);
            return charSequence;
        }
        if (!LayoutIntrinsics_androidKt.f33546n) {
            return this.charSequence;
        }
        CharSequence charSequenceO = LayoutIntrinsics_androidKt.O(this.charSequence);
        this._charSequenceForIntrinsicWidth = charSequenceO;
        return charSequenceO;
    }

    static /* synthetic */ float KN(LayoutIntrinsics layoutIntrinsics, int i2, int i3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = layoutIntrinsics.J2().length();
        }
        return layoutIntrinsics.Uo(i2, i3);
    }

    private final float t() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.textPaint.getTextLocale());
        CharSequence charSequence = this.charSequence;
        int i2 = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: androidx.compose.ui.text.android.ci
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return LayoutIntrinsics.nr((Pair) obj, (Pair) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i3 = i2;
            i2 = next;
            if (i2 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i3), Integer.valueOf(i2)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue() < i2 - i3) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i3), Integer.valueOf(i2)));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Pair pair2 = (Pair) it.next();
        float fUo = Uo(((Number) pair2.component1()).intValue(), ((Number) pair2.component2()).intValue());
        while (it.hasNext()) {
            Pair pair3 = (Pair) it.next();
            fUo = Math.max(fUo, Uo(((Number) pair3.component1()).intValue(), ((Number) pair3.component2()).intValue()));
        }
        return fUo;
    }

    public final BoringLayout.Metrics O() {
        if (!this.boringMetricsIsInit) {
            this._boringMetrics = BoringLayoutFactory.f33522n.t(this.charSequence, this.textPaint, TextLayout_androidKt.gh(this.textDirectionHeuristic));
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    public final float mUb() {
        if (!Float.isNaN(this._minIntrinsicWidth)) {
            return this._minIntrinsicWidth;
        }
        float fT = t();
        this._minIntrinsicWidth = fT;
        return fT;
    }

    public final float xMQ() {
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        float fRl = rl();
        this._maxIntrinsicWidth = fRl;
        return fRl;
    }

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = i2;
    }

    private final float Uo(int start, int end) {
        return Layout.getDesiredWidth(J2(), start, end, this.textPaint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nr(Pair pair, Pair pair2) {
        return (((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue()) - (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue());
    }

    private final float rl() {
        int i2;
        BoringLayout.Metrics metricsO = O();
        if (metricsO != null) {
            i2 = metricsO.width;
        } else {
            i2 = -1;
        }
        float fCeil = i2;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(KN(this, 0, 0, 3, null));
        }
        if (LayoutIntrinsics_androidKt.nr(fCeil, this.charSequence, this.textPaint)) {
            return fCeil + 0.5f;
        }
        return fCeil;
    }
}
