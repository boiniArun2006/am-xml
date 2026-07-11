package r53;

import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import r53.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface aC {

    public static final class j {
        /* JADX INFO: Access modifiers changed from: private */
        public static Unit J2(int i2) {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Object O(aC aCVar, Uri uri, Function1 function1, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: importXMLsInZip");
            }
            if ((i2 & 2) != 0) {
                function1 = new Function1() { // from class: r53.Dsr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return aC.j.J2(((Integer) obj2).intValue());
                    }
                };
            }
            return aCVar.rl(uri, function1, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit nr(int i2) {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Object t(aC aCVar, Uri uri, Function1 function1, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: importXML");
            }
            if ((i2 & 2) != 0) {
                function1 = new Function1() { // from class: r53.fuX
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return aC.j.nr(((Integer) obj2).intValue());
                    }
                };
            }
            return aCVar.n(uri, function1, continuation);
        }
    }

    Object n(Uri uri, Function1 function1, Continuation continuation);

    Object rl(Uri uri, Function1 function1, Continuation continuation);
}
