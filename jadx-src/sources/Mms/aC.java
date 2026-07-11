package Mms;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f6719n;

    static {
        Object objM313constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM313constructorimpl = Result.m313constructorimpl(property != null ? StringsKt.toIntOrNull(property) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        Integer num = (Integer) (Result.m319isFailureimpl(objM313constructorimpl) ? null : objM313constructorimpl);
        f6719n = num != null ? num.intValue() : 2097152;
    }
}
