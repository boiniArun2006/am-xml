package kYF;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class QJ implements Callback, Function1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Call f69931n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GJW.Pl f69932t;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return Unit.INSTANCE;
    }

    public void n(Throwable th) {
        try {
            this.f69931n.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        this.f69932t.resumeWith(Result.m313constructorimpl(response));
    }

    public QJ(Call call, GJW.Pl pl) {
        this.f69931n = call;
        this.f69932t = pl;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        if (!call.getCanceled()) {
            GJW.Pl pl = this.f69932t;
            Result.Companion companion = Result.INSTANCE;
            pl.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(iOException)));
        }
    }
}
