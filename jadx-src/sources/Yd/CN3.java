package Yd;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Annotation;
import android.text.SpannedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class CN3 {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static final AnnotatedString n(int i2, TextStyle linkStyle, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(linkStyle, "linkStyle");
        composer.eF(943648701);
        if (ComposerKt.v()) {
            ComposerKt.p5(943648701, i3, -1, "com.bendingspoons.legal.privacy.ui.internal.getStringWithLinks (Utils.kt:25)");
        }
        SpannedString spannedString = new SpannedString(((Context) composer.ty(AndroidCompositionLocals_androidKt.Uo())).getResources().getText(i2));
        Object[] spans = spannedString.getSpans(0, spannedString.length(), Annotation.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        ArrayList<Annotation> arrayList = new ArrayList();
        for (Object obj : spans) {
            if (Intrinsics.areEqual(((Annotation) obj).getKey(), "url")) {
                arrayList.add(obj);
            }
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        String string = spannedString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        builder.KN(string);
        for (Annotation annotation : arrayList) {
            int spanStart = spannedString.getSpanStart(annotation);
            int spanEnd = spannedString.getSpanEnd(annotation);
            builder.rl(linkStyle.rV9(), spanStart, spanEnd);
            String value = annotation.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            builder.n("url", value, spanStart, spanEnd);
        }
        AnnotatedString annotatedStringTy = builder.ty();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return annotatedStringTy;
    }

    public static final void rl(String url, Context context) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
        intent.setFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }
}
