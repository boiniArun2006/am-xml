package hOy;

import android.content.Context;
import androidx.content.core.DataStoreFactory;
import hOy.n;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pxd.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f67957n = j.f67958n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f67958n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final File t(Context context) {
            return new File(context.getFilesDir(), "sessionInfo.pb");
        }

        public final n rl(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Ml(DataStoreFactory.t(DataStoreFactory.f37387n, Z5Y.j.f12283n, null, null, null, new Function0() { // from class: hOy.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.j.t(context);
                }
            }, 14, null));
        }

        private j() {
        }
    }

    Object n(String str, Continuation continuation);

    Object nr(Continuation continuation);

    Object rl(Continuation continuation);

    Object t(double d2, Continuation continuation);
}
