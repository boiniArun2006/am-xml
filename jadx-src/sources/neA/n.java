package neA;

import com.alightcreative.app.motion.error.AppErrorException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    public static final AppErrorException n(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new AppErrorException(jVar);
    }
}
