package I3c;

import I3c.n;
import android.content.Context;
import androidx.content.core.DataStoreFactory;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface n extends I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f4013n = j.f4014n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f4014n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final File t(Context context) {
            return new File(context.getFilesDir(), "internal_backup_persistent_ids.pb");
        }

        public final n rl(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new nvL.j(DataStoreFactory.t(DataStoreFactory.f37387n, YyP.j.f12229n, null, WUJ.Ml.f11513n.Uo(context), null, new Function0() { // from class: I3c.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.j.t(context);
                }
            }, 10, null));
        }

        private j() {
        }
    }
}
