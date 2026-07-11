package Wzh;

import GJW.Lu;
import GJW.N;
import GJW.P;
import GJW.vd;
import GJW.xuv;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class w6 {
    public static final P t(j jVar, Object obj, Function2 replace) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(replace, "replace");
        P pTy = jVar.ty(obj, replace);
        if (pTy != null) {
            return pTy;
        }
        throw new NoSuchElementException("The map doesn't contain the key: " + obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vd rl(vd vdVar) {
        return Lu.xMQ(vdVar, N.n((xuv) vdVar.getCoroutineContext().get(xuv.nr)));
    }
}
