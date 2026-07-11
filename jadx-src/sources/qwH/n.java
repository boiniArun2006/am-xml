package qwH;

import co4.C1685c;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public interface n extends Xo {

    public static final class j {
        public static void n(n nVar, Function1[] otherFormats, Function1 mainFormat) {
            Intrinsics.checkNotNullParameter(otherFormats, "otherFormats");
            Intrinsics.checkNotNullParameter(mainFormat, "mainFormat");
            ArrayList arrayList = new ArrayList(otherFormats.length);
            for (Function1 function1 : otherFormats) {
                n nVarTy = nVar.ty();
                function1.invoke(nVarTy);
                arrayList.add(nVarTy.n().rl());
            }
            n nVarTy2 = nVar.ty();
            mainFormat.invoke(nVarTy2);
            nVar.n().n(new co4.w6(nVarTy2.n().rl(), arrayList));
        }

        public static void nr(n nVar, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            nVar.n().n(new co4.aC(value));
        }

        public static void rl(n nVar, String onZero, Function1 format) {
            Intrinsics.checkNotNullParameter(onZero, "onZero");
            Intrinsics.checkNotNullParameter(format, "format");
            co4.Ml mlN = nVar.n();
            n nVarTy = nVar.ty();
            format.invoke(nVarTy);
            Unit unit = Unit.INSTANCE;
            mlN.n(new C1685c(onZero, nVarTy.n().rl()));
        }

        public static co4.Wre t(n nVar) {
            return new co4.Wre(nVar.n().rl().t());
        }
    }

    void mUb(Function1[] function1Arr, Function1 function1);

    co4.Ml n();

    void rl(String str, Function1 function1);

    n ty();
}
