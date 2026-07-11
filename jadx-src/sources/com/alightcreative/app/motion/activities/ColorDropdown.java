package com.alightcreative.app.motion.activities;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.alightcreative.app.motion.activities.xuv;
import com.alightcreative.app.motion.scene.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/alightcreative/app/motion/activities/ColorDropdown;", "Lcom/alightcreative/app/motion/activities/kO4;", "Lcom/alightcreative/app/motion/activities/FKk;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "setSelectedIndex", "(I)V", "index", "item", "Lcom/alightcreative/app/motion/activities/xuv$n;", "s7N", "(ILcom/alightcreative/app/motion/activities/FKk;)Lcom/alightcreative/app/motion/activities/xuv$n;", "pJg", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorDropdown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorDropdown.kt\ncom/alightcreative/app/motion/activities/ColorDropdown\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,47:1\n257#2,2:48\n299#2,2:50\n*S KotlinDebug\n*F\n+ 1 ColorDropdown.kt\ncom/alightcreative/app/motion/activities/ColorDropdown\n*L\n20#1:48,2\n32#1:50,2\n*E\n"})
public final class ColorDropdown extends kO4 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ColorDropdown(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, GDEJgAYrPQHfw.ZyVLujXNXOi);
    }

    public /* synthetic */ ColorDropdown(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    @Override // com.alightcreative.app.motion.activities.kO4
    /* JADX INFO: renamed from: s7N, reason: merged with bridge method [inline-methods] */
    public xuv.n T(final int index, final FKk item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new xuv.n(null, false, item.rl(), item.n(), false, null, new Function0() { // from class: com.alightcreative.app.motion.activities.l4Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ColorDropdown.wTp(this.f45320n, index, item);
            }
        }, 51, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorDropdown(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wTp(ColorDropdown colorDropdown, int i2, FKk fKk) {
        colorDropdown.setSelectedIndex(i2);
        colorDropdown.getOnItemSelected().invoke(fKk);
        return Unit.INSTANCE;
    }

    @Override // com.alightcreative.app.motion.activities.kO4
    public void setSelectedIndex(int value) {
        super.setSelectedIndex(value);
        FKk fKk = (FKk) CollectionsKt.getOrNull(getItems(), value);
        if (fKk != null) {
            ImageView icon = getBinding().J2;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            icon.setVisibility(0);
            getBinding().J2.setImageBitmap(ColorKt.makeSwatch$default(fKk.n(), 60, 60, 0.0f, 8.0f, 3, 1140850688, 4, null));
            getSelectionText().setText(fKk.rl());
            return;
        }
        ImageView icon2 = getBinding().J2;
        Intrinsics.checkNotNullExpressionValue(icon2, "icon");
        icon2.setVisibility(8);
        getSelectionText().setText(kO4.getDEFAULT_LABEL());
    }
}
