package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Internal;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class ListFieldSchemaLite implements ListFieldSchema {
    ListFieldSchemaLite() {
    }

    static Internal.ProtobufList nr(Object obj, long j2) {
        return (Internal.ProtobufList) UnsafeUtil.T(obj, j2);
    }

    @Override // androidx.content.preferences.protobuf.ListFieldSchema
    public void n(Object obj, long j2) {
        nr(obj, j2).makeImmutable();
    }

    @Override // androidx.content.preferences.protobuf.ListFieldSchema
    public void rl(Object obj, Object obj2, long j2) {
        Internal.ProtobufList protobufListNr = nr(obj, j2);
        Internal.ProtobufList protobufListNr2 = nr(obj2, j2);
        int size = protobufListNr.size();
        int size2 = protobufListNr2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufListNr.isModifiable()) {
                protobufListNr = protobufListNr.mutableCopyWithCapacity(size2 + size);
            }
            protobufListNr.addAll(protobufListNr2);
        }
        if (size > 0) {
            protobufListNr2 = protobufListNr;
        }
        UnsafeUtil.FX(obj, j2, protobufListNr2);
    }

    @Override // androidx.content.preferences.protobuf.ListFieldSchema
    public List t(Object obj, long j2) {
        int i2;
        Internal.ProtobufList protobufListNr = nr(obj, j2);
        if (!protobufListNr.isModifiable()) {
            int size = protobufListNr.size();
            if (size == 0) {
                i2 = 10;
            } else {
                i2 = size * 2;
            }
            Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufListNr.mutableCopyWithCapacity(i2);
            UnsafeUtil.FX(obj, j2, protobufListMutableCopyWithCapacity);
            return protobufListMutableCopyWithCapacity;
        }
        return protobufListNr;
    }
}
