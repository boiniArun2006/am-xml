package I3c;

import I3c.Ml;
import android.content.Context;
import androidx.content.core.DataStoreFactory;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface Ml extends I28 {
    public static final j rl = j.f4011n;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f4011n = new j();

        /* JADX INFO: Access modifiers changed from: private */
        public static final File t(Context context) {
            return new File(context.getNoBackupFilesDir(), "internal_non_backup_persistent_ids.pb");
        }

        public final Ml rl(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new nvL.Ml(DataStoreFactory.t(DataStoreFactory.f37387n, YyP.n.f12230n, null, WUJ.Ml.f11513n.mUb(context), null, new Function0() { // from class: I3c.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ml.j.t(context);
                }
            }, 10, null));
        }

        private j() {
        }
    }
}
