package androidx.content.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@CheckReturnValue
final class Protobuf {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Protobuf f38111t = new Protobuf();
    static boolean nr = false;
    private final ConcurrentMap rl = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SchemaFactory f38112n = new ManifestSchemaFactory();

    public static Protobuf n() {
        return f38111t;
    }

    public Schema rl(Class cls, Schema schema) {
        Internal.rl(cls, "messageType");
        Internal.rl(schema, "schema");
        return (Schema) this.rl.putIfAbsent(cls, schema);
    }

    public Schema t(Class cls) {
        Schema schemaRl;
        Internal.rl(cls, "messageType");
        Schema schemaCreateSchema = (Schema) this.rl.get(cls);
        return (schemaCreateSchema != null || (schemaRl = rl(cls, (schemaCreateSchema = this.f38112n.createSchema(cls)))) == null) ? schemaCreateSchema : schemaRl;
    }

    private Protobuf() {
    }

    public void O(Object obj, Writer writer) {
        nr(obj).rl(obj, writer);
    }

    public Schema nr(Object obj) {
        return t(obj.getClass());
    }
}
