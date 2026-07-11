package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@CheckReturnValue
abstract class ExtensionSchema<T extends FieldSet.FieldDescriptorLite<T>> {
    abstract void J2(Object obj);

    abstract void KN(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet);

    abstract boolean O(MessageLite messageLite);

    abstract Object Uo(Object obj, Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, UnknownFieldSchema unknownFieldSchema);

    abstract void mUb(Writer writer, Map.Entry entry);

    abstract int n(Map.Entry entry);

    abstract FieldSet nr(Object obj);

    abstract Object rl(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i2);

    abstract FieldSet t(Object obj);

    abstract void xMQ(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet);

    ExtensionSchema() {
    }
}
