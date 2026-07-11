package com.alightcreative.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rRT\u0010\u0017\u001a4\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/alightcreative/widget/EditTextEx;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "selStart", "selEnd", "", "onSelectionChanged", "(II)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Lkotlin/jvm/functions/Function2;", "getOnSelectionChangeListener", "()Lkotlin/jvm/functions/Function2;", "setOnSelectionChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "onSelectionChangeListener", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EditTextEx extends AppCompatEditText {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Function2 onSelectionChangeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditTextEx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Function2<Integer, Integer, Unit> getOnSelectionChangeListener() {
        return this.onSelectionChangeListener;
    }

    public final void setOnSelectionChangeListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.onSelectionChangeListener = function2;
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int selStart, int selEnd) {
        super.onSelectionChanged(selStart, selEnd);
        Function2 function2 = this.onSelectionChangeListener;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(selStart), Integer.valueOf(selEnd));
        }
    }
}
