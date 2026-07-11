package Q;

import androidx.view.ComponentActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface fuX {

    public static final class j {
        public static /* synthetic */ void n(fuX fux, ComponentActivity componentActivity, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            fux.rl(componentActivity, str);
        }
    }

    boolean J2();

    boolean KN();

    boolean O();

    void Uo(ComponentActivity componentActivity, Function0 function0);

    void mUb(ComponentActivity componentActivity, String str, Function0 function0);

    void n(ComponentActivity componentActivity, Function0 function0);

    void nr(ComponentActivity componentActivity, Function0 function0);

    void rl(ComponentActivity componentActivity, String str);

    boolean t(String str);

    void xMQ(ComponentActivity componentActivity, Function0 function0);
}
