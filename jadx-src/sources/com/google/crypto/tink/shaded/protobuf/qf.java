package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.DAz;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
interface qf {
    Map forMapData(Object obj);

    DAz.j forMapMetadata(Object obj);

    Map forMutableMapData(Object obj);

    int getSerializedSize(int i2, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
