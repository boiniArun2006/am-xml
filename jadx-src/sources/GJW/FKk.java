package GJW;

import GJW.FKk;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class FKk extends lej implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f3395t = new j(null);

    public static final class j extends AbstractCoroutineContextKey {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
            super(lej.f3495n, new Function1() { // from class: GJW.QaP
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FKk.j.rl((CoroutineContext.Element) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FKk rl(CoroutineContext.Element element) {
            if (element instanceof FKk) {
                return (FKk) element;
            }
            return null;
        }
    }

    public abstract Executor T3L();
}
