package DSG;

import DSG.fuX;
import TFv.rv6;
import fb.AbstractC2109j;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f1456n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Dsr nr() {
            return new Dsr();
        }

        public final fuX t() {
            return (fuX) n(new Function0() { // from class: DSG.CN3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fuX.j.nr();
                }
            });
        }

        private j() {
        }
    }

    void n(List list);

    Wre rl(String str);

    rv6 t();
}
