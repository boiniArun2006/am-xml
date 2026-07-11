package fE;

import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class QJ implements Function0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ foC.j f66645n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ String f66646t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            String string = this.f66645n.J2().getString(this.f66646t, "");
            if (string != null) {
                return this.f66645n.nr().adapter(String.class).fromJson(string);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public QJ(foC.j jVar, String str) {
        this.f66645n = jVar;
        this.f66646t = str;
    }
}
