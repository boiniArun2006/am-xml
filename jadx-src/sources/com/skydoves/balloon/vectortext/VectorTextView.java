package com.skydoves.balloon.vectortext;

import YQ.Ml;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import hz.C2163j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import rH.Dsr;
import rH.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007R.\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/skydoves/balloon/vectortext/VectorTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "o", "Lhz/j;", "value", "g", "Lhz/j;", "getDrawableTextViewParams", "()Lhz/j;", "setDrawableTextViewParams", "(Lhz/j;)V", "drawableTextViewParams", "balloon_release"}, k = 1, mv = {1, 4, 1})
public final class VectorTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C2163j drawableTextViewParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VectorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        o(context, attributeSet);
    }

    private final void o(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, s4.rV9);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…styleable.VectorTextView)");
            setDrawableTextViewParams(new C2163j(Dsr.n(typedArrayObtainStyledAttributes.getResourceId(s4.jB, Integer.MIN_VALUE)), Dsr.n(typedArrayObtainStyledAttributes.getResourceId(s4.P5, Integer.MIN_VALUE)), Dsr.n(typedArrayObtainStyledAttributes.getResourceId(s4.bzg, Integer.MIN_VALUE)), Dsr.n(typedArrayObtainStyledAttributes.getResourceId(s4.eF, Integer.MIN_VALUE)), null, null, null, null, null, null, null, Dsr.n(typedArrayObtainStyledAttributes.getResourceId(s4.f72996U, Integer.MIN_VALUE)), Dsr.n(typedArrayObtainStyledAttributes.getResourceId(s4.p5, Integer.MIN_VALUE)), Dsr.n(typedArrayObtainStyledAttributes.getResourceId(s4.f72989E, Integer.MIN_VALUE)), Dsr.n(typedArrayObtainStyledAttributes.getResourceId(s4.Xw, Integer.MIN_VALUE)), Dsr.n(typedArrayObtainStyledAttributes.getResourceId(s4.M7, Integer.MIN_VALUE)), 2032, null));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final C2163j getDrawableTextViewParams() {
        return this.drawableTextViewParams;
    }

    public final void setDrawableTextViewParams(C2163j c2163j) {
        if (c2163j != null) {
            Ml.n(this, c2163j);
            Unit unit = Unit.INSTANCE;
        } else {
            c2163j = null;
        }
        this.drawableTextViewParams = c2163j;
    }
}
