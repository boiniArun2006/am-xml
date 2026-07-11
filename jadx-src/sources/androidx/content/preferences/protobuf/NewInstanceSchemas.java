package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@CheckReturnValue
final class NewInstanceSchemas {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final NewInstanceSchema f38100n = t();
    private static final NewInstanceSchema rl = new NewInstanceSchemaLite();

    static NewInstanceSchema n() {
        return f38100n;
    }

    static NewInstanceSchema rl() {
        return rl;
    }

    private static NewInstanceSchema t() {
        if (Protobuf.nr) {
            return null;
        }
        try {
            return (NewInstanceSchema) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
