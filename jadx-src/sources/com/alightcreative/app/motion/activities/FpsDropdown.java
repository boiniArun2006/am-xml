package com.alightcreative.app.motion.activities;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.activities.xuv;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/alightcreative/app/motion/activities/FpsDropdown;", "Lcom/alightcreative/app/motion/activities/kO4;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "index", "item", "Lcom/alightcreative/app/motion/activities/xuv$n;", "s7N", "(II)Lcom/alightcreative/app/motion/activities/xuv$n;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FpsDropdown extends kO4 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FpsDropdown(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FpsDropdown(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    @Override // com.alightcreative.app.motion.activities.kO4
    public /* bridge */ /* synthetic */ xuv.n T(int i2, Object obj) {
        return s7N(i2, ((Number) obj).intValue());
    }

    public xuv.n s7N(final int index, final int item) {
        return new xuv.n(null, false, item + " fps", null, false, null, new Function0() { // from class: com.alightcreative.app.motion.activities.pFX
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FpsDropdown.wTp(this.f45572n, index, item);
            }
        }, 59, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpsDropdown(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wTp(FpsDropdown fpsDropdown, int i2, int i3) {
        fpsDropdown.setSelectedIndex(i2);
        fpsDropdown.getOnItemSelected().invoke(Integer.valueOf(i3));
        return Unit.INSTANCE;
    }
}
