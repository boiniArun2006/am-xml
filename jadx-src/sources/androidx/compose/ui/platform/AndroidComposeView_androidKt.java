package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.text.input.PlatformTextInputService;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\t\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\".\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", InneractiveMediationNameConsts.OTHER, "", "xMQ", "([F[F)V", "", "x", "y", "tmpMatrix", "mUb", "([FFF[F)V", "m1", "", "row", "m2", "column", "J2", "([FI[FI)F", "Landroid/view/View;", "", "O", "(Landroid/view/View;Landroid/view/View;)Z", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "Uo", "(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Lkotlin/jvm/functions/Function1;", "KN", "()Lkotlin/jvm/functions/Function1;", "setPlatformTextInputServiceInterceptor", "(Lkotlin/jvm/functions/Function1;)V", "platformTextInputServiceInterceptor", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,3125:1\n52#2,2:3126\n52#2,2:3128\n52#2,2:3130\n52#2,2:3132\n52#2,2:3134\n52#2,2:3136\n52#2,2:3138\n52#2,2:3140\n52#2,2:3142\n52#2,2:3144\n52#2,2:3146\n52#2,2:3148\n52#2,2:3150\n52#2,2:3152\n52#2,2:3154\n52#2,2:3156\n49#2:3158\n49#2:3159\n49#2:3160\n49#2:3161\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n2949#1:3126,2\n2950#1:3128,2\n2951#1:3130,2\n2952#1:3132,2\n2953#1:3134,2\n2954#1:3136,2\n2955#1:3138,2\n2956#1:3140,2\n2957#1:3142,2\n2958#1:3144,2\n2959#1:3146,2\n2960#1:3148,2\n2961#1:3150,2\n2962#1:3152,2\n2963#1:3154,2\n2964#1:3156,2\n2976#1:3158\n2977#1:3159\n2978#1:3160\n2979#1:3161\n*E\n"})
public final class AndroidComposeView_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Function1 f32787n = new Function1<PlatformTextInputService, PlatformTextInputService>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final PlatformTextInputService invoke(PlatformTextInputService platformTextInputService) {
            return platformTextInputService;
        }
    };

    private static final float J2(float[] fArr, int i2, float[] fArr2, int i3) {
        int i5 = i2 * 4;
        return (fArr[i5] * fArr2[i3]) + (fArr[i5 + 1] * fArr2[4 + i3]) + (fArr[i5 + 2] * fArr2[8 + i3]) + (fArr[i5 + 3] * fArr2[12 + i3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentCaptureSessionCompat Uo(View view) {
        ViewCompatShims.t(view, 1);
        return ViewCompatShims.rl(view);
    }

    public static final Function1 KN() {
        return f32787n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(float[] fArr, float[] fArr2) {
        float fJ2 = J2(fArr2, 0, fArr, 0);
        float fJ22 = J2(fArr2, 0, fArr, 1);
        float fJ23 = J2(fArr2, 0, fArr, 2);
        float fJ24 = J2(fArr2, 0, fArr, 3);
        float fJ25 = J2(fArr2, 1, fArr, 0);
        float fJ26 = J2(fArr2, 1, fArr, 1);
        float fJ27 = J2(fArr2, 1, fArr, 2);
        float fJ28 = J2(fArr2, 1, fArr, 3);
        float fJ29 = J2(fArr2, 2, fArr, 0);
        float fJ210 = J2(fArr2, 2, fArr, 1);
        float fJ211 = J2(fArr2, 2, fArr, 2);
        float fJ212 = J2(fArr2, 2, fArr, 3);
        float fJ213 = J2(fArr2, 3, fArr, 0);
        float fJ214 = J2(fArr2, 3, fArr, 1);
        float fJ215 = J2(fArr2, 3, fArr, 2);
        float fJ216 = J2(fArr2, 3, fArr, 3);
        fArr[0] = fJ2;
        fArr[1] = fJ22;
        fArr[2] = fJ23;
        fArr[3] = fJ24;
        fArr[4] = fJ25;
        fArr[5] = fJ26;
        fArr[6] = fJ27;
        fArr[7] = fJ28;
        fArr[8] = fJ29;
        fArr[9] = fJ210;
        fArr[10] = fJ211;
        fArr[11] = fJ212;
        fArr[12] = fJ213;
        fArr[13] = fJ214;
        fArr[14] = fJ215;
        fArr[15] = fJ216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(View view, View view2) {
        if (Intrinsics.areEqual(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(float[] fArr, float f3, float f4, float[] fArr2) {
        Matrix.KN(fArr2);
        Matrix.HI(fArr2, f3, f4, 0.0f, 4, null);
        xMQ(fArr, fArr2);
    }
}
