package com.alightcreative.app.motion.activities;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.activities.xuv;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/alightcreative/app/motion/activities/ResolutionDropdown;", "Lcom/alightcreative/app/motion/activities/kO4;", "Lcom/alightcreative/app/motion/activities/w6O;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "setSelectedIndex", "(I)V", "index", "item", "Lcom/alightcreative/app/motion/activities/xuv$n;", "s7N", "(ILcom/alightcreative/app/motion/activities/w6O;)Lcom/alightcreative/app/motion/activities/xuv$n;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResolutionDropdown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolutionDropdown.kt\ncom/alightcreative/app/motion/activities/ResolutionDropdown\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,37:1\n257#2,2:38\n299#2,2:40\n299#2,2:42\n*S KotlinDebug\n*F\n+ 1 ResolutionDropdown.kt\ncom/alightcreative/app/motion/activities/ResolutionDropdown\n*L\n22#1:38,2\n24#1:40,2\n27#1:42,2\n*E\n"})
public final class ResolutionDropdown extends kO4 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ResolutionDropdown(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ResolutionDropdown(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    @Override // com.alightcreative.app.motion.activities.kO4
    /* JADX INFO: renamed from: s7N, reason: merged with bridge method [inline-methods] */
    public xuv.n T(final int index, final w6O item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new xuv.n(null, false, item.rl(), null, false, item.n(), new Function0() { // from class: com.alightcreative.app.motion.activities.tC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ResolutionDropdown.wTp(this.f45676n, index, item);
            }
        }, 27, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolutionDropdown(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wTp(ResolutionDropdown resolutionDropdown, int i2, w6O w6o) {
        resolutionDropdown.setSelectedIndex(i2);
        resolutionDropdown.getOnItemSelected().invoke(w6o);
        return Unit.INSTANCE;
    }

    @Override // com.alightcreative.app.motion.activities.kO4
    public void setSelectedIndex(int value) {
        super.setSelectedIndex(value);
        w6O w6o = (w6O) CollectionsKt.getOrNull(getItems(), value);
        if (w6o != null) {
            getSelectionText().setText(w6o.rl());
            if (w6o.n() != null) {
                getBinding().Uo.setImageResource(w6o.n().rl());
                ImageView premiumBadge = getBinding().Uo;
                Intrinsics.checkNotNullExpressionValue(premiumBadge, "premiumBadge");
                premiumBadge.setVisibility(0);
                return;
            }
            ImageView premiumBadge2 = getBinding().Uo;
            Intrinsics.checkNotNullExpressionValue(premiumBadge2, "premiumBadge");
            premiumBadge2.setVisibility(8);
            return;
        }
        ImageView premiumBadge3 = getBinding().Uo;
        Intrinsics.checkNotNullExpressionValue(premiumBadge3, "premiumBadge");
        premiumBadge3.setVisibility(8);
    }
}
