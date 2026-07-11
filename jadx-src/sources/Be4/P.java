package Be4;

import Be4.psW;
import android.content.Context;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.functions.Function0;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class P {
    public static final psW J2(BufferedSource bufferedSource, final Context context, psW.j jVar) {
        return new iF(bufferedSource, new Function0() { // from class: Be4.Md
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.nr(context);
            }
        }, jVar);
    }

    public static /* synthetic */ psW KN(Path path, FileSystem fileSystem, String str, Closeable closeable, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fileSystem = FileSystem.SYSTEM;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            closeable = null;
        }
        return Uo(path, fileSystem, str, closeable);
    }

    public static final psW O(BufferedSource bufferedSource, final Context context) {
        return new iF(bufferedSource, new Function0() { // from class: Be4.Zs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.t(context);
            }
        }, null);
    }

    public static final psW Uo(Path path, FileSystem fileSystem, String str, Closeable closeable) {
        return new eO(path, fileSystem, str, closeable, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File nr(Context context) {
        return kYF.C.qie(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File t(Context context) {
        return kYF.C.qie(context);
    }
}
