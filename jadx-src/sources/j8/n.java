package j8;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import nfZ.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class n {

    /* synthetic */ class j extends FunctionReferenceImpl implements Function2 {
        j(Object obj) {
            super(2, obj, CN3.class, "registerNativeFunction", "registerNativeFunction(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((String) obj, (Function2) obj2);
            return Unit.INSTANCE;
        }

        public final void n(String p0, Function2 p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((CN3) this.receiver).xMQ(p0, p1);
        }
    }

    public static final void n(j8.j jVar, CN3 webView) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(webView, "webView");
        jVar.n(com.bendingspoons.injet.webbridge.I28.f51376n.n(jVar.rl(), new j(webView)));
    }

    public static final void rl(List list, CN3 webView) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n((j8.j) it.next(), webView);
        }
    }
}
