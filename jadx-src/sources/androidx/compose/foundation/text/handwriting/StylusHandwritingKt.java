package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.TouchBoundsExpansionKt;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0010\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u000f\u0010\r\"\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\n\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "showHoverIcon", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "rl", "(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", c.f62177j, "F", "getHandwritingBoundsVerticalOffset", "()F", "HandwritingBoundsVerticalOffset", "getHandwritingBoundsHorizontalOffset", "HandwritingBoundsHorizontalOffset", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "t", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "()Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "HandwritingBoundsExpansion", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStylusHandwriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,215:1\n113#2:216\n113#2:217\n*S KotlinDebug\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingKt\n*L\n206#1:216\n207#1:217\n*E\n"})
public final class StylusHandwritingKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f19963n;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final DpTouchBoundsExpansion f19964t;

    static {
        float fKN = Dp.KN(40);
        f19963n = fKN;
        float fKN2 = Dp.KN(10);
        rl = fKN2;
        f19964t = TouchBoundsExpansionKt.n(fKN2, fKN, fKN2, fKN);
    }

    public static final DpTouchBoundsExpansion n() {
        return f19964t;
    }

    public static final Modifier rl(Modifier modifier, boolean z2, boolean z3, Function0 function0) {
        if (!z2 || !StylusHandwriting_androidKt.n()) {
            return modifier;
        }
        if (z3) {
            modifier = PointerIconKt.t(modifier, TextPointerIcon_androidKt.n(), false, f19964t);
        }
        return modifier.Zmq(new StylusHandwritingElement(function0));
    }
}
