package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.ArrayDecoders;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@CheckReturnValue
interface Schema<T> {
    boolean equals(Object obj, Object obj2);

    int getSerializedSize(Object obj);

    int hashCode(Object obj);

    boolean isInitialized(Object obj);

    void makeImmutable(Object obj);

    void mergeFrom(Object obj, Object obj2);

    void n(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    Object newInstance();

    void rl(Object obj, Writer writer);

    void t(Object obj, byte[] bArr, int i2, int i3, ArrayDecoders.Registers registers);
}
