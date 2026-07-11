package wa;

import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class fuX extends j8.w6 {
    @Override // j8.w6
    public Object t(Continuation continuation) {
        return x0X.w6.n(new Function0() { // from class: wa.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.O();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O() {
        return Locale.getDefault().getLanguage();
    }
}
