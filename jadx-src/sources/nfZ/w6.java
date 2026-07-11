package nfZ;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import cS.Zv.SzFNXybiSxdx;
import com.caoccao.javet.values.primitive.V8ValueNull;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class w6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nr(String str) {
        return str;
    }

    public static final void t(WebView webView, String functionName, String... arguments) {
        Intrinsics.checkNotNullParameter(webView, SzFNXybiSxdx.nAHBtAdTsuXMhj);
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        StringBuilder sb = new StringBuilder();
        sb.append(functionName);
        sb.append('(');
        int length = arguments.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = arguments[i2];
            int i5 = i3 + 1;
            if (i3 > 0) {
                sb.append(',');
            }
            if (str == null) {
                sb.append(V8ValueNull.NULL);
            } else if (StringsKt.startsWith$default((CharSequence) str, '{', false, 2, (Object) null) || TextUtils.isDigitsOnly(str)) {
                sb.append(str);
            } else {
                sb.append("'" + str + "'");
            }
            i2++;
            i3 = i5;
        }
        sb.append(')');
        sb.append(';');
        final String string = sb.toString();
        KW9.j.f5464n.n("executeJsFunction", new Function0() { // from class: nfZ.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.nr(string);
            }
        });
        webView.evaluateJavascript(string, new ValueCallback() { // from class: nfZ.n
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                w6.O((String) obj);
            }
        });
    }
}
